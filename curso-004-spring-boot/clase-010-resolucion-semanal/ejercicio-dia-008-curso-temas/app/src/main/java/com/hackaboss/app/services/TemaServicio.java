package com.hackaboss.app.services;


import com.hackaboss.app.dtos.CursoDTO;
import com.hackaboss.app.dtos.TemaDTO;
import com.hackaboss.app.entities.Curso;
import com.hackaboss.app.entities.Tema;
import com.hackaboss.app.respositories.TemaRepositorioInterfaz;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

@Service
public class TemaServicio implements TemaServicioInterfaz{

    @Autowired
    TemaRepositorioInterfaz repository;

    @Override
    public List<TemaDTO> buscarTodos() {
        List<Tema> listado = repository.findAll();
        return listado.stream().map(this::convertirHaciaDTO).toList();
    }


    @Transactional
    @Override
    public TemaDTO crear(TemaDTO entidad) {
       Tema temaRecuperado = this.convertirHaciaEntidad(entidad);
       Tema temaGuardado =  repository.save(temaRecuperado);
        return this.convertirHaciaDTO(temaGuardado);

    }

    @Override
    public TemaDTO actualizar(Long id, TemaDTO entidad) {
        Optional<Tema> temaEncontrado = repository.findById(id);
        if (temaEncontrado.isPresent()) {
           Tema tema =temaEncontrado.get();

            //actualizar datos
           tema.setNombre(entidad.getNombre());
           tema.setDescripccion(entidad.getDescripcion());

            //actualizartema
           Tema temaActualizado = repository.save(tema);

            //convertir a DTO
            return this.convertirHaciaDTO(temaActualizado);
        }else{
            throw new RuntimeException("Tema no encontrado con el ID : " + id);

        }
    }


    @Override
    public TemaDTO convertirHaciaDTO(Tema tema) {
        CursoDTO cursoDTO = new CursoDTO();

        if (tema.getCurso().getTemas() == null) {
            cursoDTO =  new CursoDTO(tema.getCurso().getIdCurso(), null,null,null, null);
            return new TemaDTO(tema.getIdTema(),tema.getNombre(),tema.getDescripccion(), cursoDTO);
        }else {
            cursoDTO =  new CursoDTO(tema.getCurso().getIdCurso(), tema.getCurso().getNombre(),tema.getCurso().getTipoCurso(),tema.getCurso().getFechaFinalizacion(), null);
            return new TemaDTO(tema.getIdTema(),tema.getNombre(),tema.getDescripccion(), cursoDTO);
        }

    }

    @Override
    public Tema convertirHaciaEntidad(TemaDTO temaDTO) {
        Curso curso = new Curso(temaDTO.getIdCurso().getIdentificador(),null,null,null,null);
        return new Tema(temaDTO.getIdentificador(),temaDTO.getNombre(), temaDTO.getDescripcion(), curso);
    }
}
