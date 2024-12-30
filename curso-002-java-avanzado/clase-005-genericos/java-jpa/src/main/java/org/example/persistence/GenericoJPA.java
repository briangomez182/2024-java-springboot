package org.example.persistence;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

import java.util.List;
import java.util.Optional;

public class GenericoJPA<T> { // Le digo que en esta clase voy a usar genericos con el <T>

    // crear un atributo generico con Class<T> entityClass
    private Class<T> entidadGenerica;

    public GenericoJPA(Class<T> entidadGenerica) {
        this.entidadGenerica = entidadGenerica;
    }

    public void createGenerico(T nuevaEntidad) {
        EntityManager em = ConfigJPA.getEntityManager();

        try{
            // guardar algo en la DB
            em.getTransaction().begin(); // Iniciar una transaccion
            em.persist(nuevaEntidad);
            em.getTransaction().commit();

        }finally {
            em.close();
        }
    }

    public Optional<T> findOneGenerico(Integer idBuscado) {
        EntityManager em = ConfigJPA.getEntityManager();
        try{
            return Optional.ofNullable(em.find(this.entidadGenerica, idBuscado));
        }finally {
            em.close();
        }

    }

    public List<T> findAllGenerico() {
        EntityManager em = ConfigJPA.getEntityManager();

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<T> cq = cb.createQuery(this.entidadGenerica);
        Root<T> rootEntry = cq.from(this.entidadGenerica);
        CriteriaQuery<T> all = cq.select(rootEntry);
        TypedQuery<T> allQuery = em.createQuery(all);
        return allQuery.getResultList();
    }

    public void updateGenerico(T actualizarElemento) {
        EntityManager em = ConfigJPA.getEntityManager();
        try{
            em.getTransaction().begin(); // Iniciar una transaccion
            em.merge(actualizarElemento);
            em.getTransaction().commit();
        }finally {
            em.close();
        }
    }

    public void deleteGenerico(Integer idEliminar) {
        EntityManager em = ConfigJPA.getEntityManager();
        try{
            em.getTransaction().begin(); // Iniciar una transaccion
            Optional<T> elementoEncontrado = Optional.ofNullable(em.find(this.entidadGenerica, idEliminar));
            if (elementoEncontrado.isPresent()){
                em.remove( elementoEncontrado.get() );
            }else{
                System.err.println("El id " + idEliminar + " de la tabla " + this.entidadGenerica.getSimpleName() + " no existe");
            }
            em.getTransaction().commit();
        }finally {
            em.close();
        }
    }
}
