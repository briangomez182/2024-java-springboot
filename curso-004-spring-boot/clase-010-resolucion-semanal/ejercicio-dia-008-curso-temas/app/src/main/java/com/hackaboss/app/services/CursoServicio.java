package com.hackaboss.app.services;

import com.hackaboss.app.dtos.CursoDTO;
import com.hackaboss.app.dtos.TemaDTO;
import com.hackaboss.app.entities.Curso;
import com.hackaboss.app.entities.Tema;
import com.hackaboss.app.respositories.CursoRepositorioInterfaz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursoServicio implements CursoServicioInterfaz{

    @Autowired
    CursoRepositorioInterfaz repository;
    
    @Override
    public List<CursoDTO> buscarTodos() {
        List<Curso> listado = repository.findAll();
        return listado.stream().map(this::convertirHaciaDTO).toList();
    }

    @Override
    public CursoDTO buscarPorCurso(Long idCurso) {

        Optional<Curso> cursoEncontrado = repository.findById(idCurso);
        return cursoEncontrado.map(this::convertirHaciaDTO).orElse(new CursoDTO(null,null,null,null,null));
    }

    @Override
    public List<CursoDTO> buscarCursosPorNombre(String nombre) {
        List<Curso> listado = repository.findAll();
        if (nombre == null) {
            return listado.stream().map(this::convertirHaciaDTO).toList();
        }else{
            return listado.stream().filter(curso -> curso.getNombre().toLowerCase().contains(nombre.toLowerCase())).map(this::convertirHaciaDTO).toList();
        }
    }


    @Override
    public CursoDTO crear(CursoDTO entidad) {
          Curso cursoConvertido = this.convertirHaciaEntidad(entidad);
          repository.save(cursoConvertido);
          return this.convertirHaciaDTO(cursoConvertido);
    }

    @Override
    public CursoDTO actualizar(Long id, CursoDTO entidad) {
        Optional<Curso> cursoEncontrado = repository.findById(id);
        if (cursoEncontrado.isPresent()) {
            Curso curso = cursoEncontrado.get();

            //actualizar datos
            curso.setNombre(entidad.getNombre());
            curso.setTipoCurso(entidad.getTipoCurso());
            curso.setFechaFinalizacion(entidad.getFechaFinalizacion());


            //actualizar curso
            Curso cursoActualizado = repository.save(curso);

            //convertir a DTO
            return this.convertirHaciaDTO(cursoActualizado);
        }else{
            throw new RuntimeException("Curso no encontrado con el ID : " + id);

        }
    }

    @Override
    public CursoDTO convertirHaciaDTO(Curso curso) {
        TemaDTO temaDTO = new TemaDTO();

        if (curso.getTemas() == null) {
            temaDTO = null;
            return null;
        }else{
            List<TemaDTO> susTemasDTO = curso.getTemas().stream().map(tema -> new TemaDTO(tema.getIdTema(), tema.getNombre(), tema.getDescripccion(), null, tema.getCurso().getNombre())).toList();

            CursoDTO cursoDTO = new CursoDTO();
            cursoDTO.setIdentificador(curso.getIdCurso());
            cursoDTO.setNombre(curso.getNombre());
            cursoDTO.setTipoCurso(curso.getTipoCurso());
            cursoDTO.setFechaFinalizacion(curso.getFechaFinalizacion());
            cursoDTO.setTemas(susTemasDTO);

            return cursoDTO;

/*
            return new CursoDTO(curso.getIdCurso(), curso.getNombre(), curso.getTipoCurso(), curso.getFechaFinalizacion(), susTemasDTO);
*/
        }


    }

    @Override
    public Curso convertirHaciaEntidad(CursoDTO cursoDTO) {
        List<Tema> susTemas = cursoDTO.getTemas().stream().map(temaDTO -> new Tema(temaDTO.getIdentificador(), temaDTO.getNombre(), temaDTO.getDescripcion(), this.convertirHaciaEntidad(new CursoDTO()))).toList();
        return new Curso(cursoDTO.getIdentificador(), cursoDTO.getNombre(), cursoDTO.getTipoCurso(), cursoDTO.getFechaFinalizacion(), susTemas);
    }
}
