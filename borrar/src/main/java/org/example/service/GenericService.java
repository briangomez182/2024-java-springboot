package org.example.service;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import org.example.util.JPAUtil;

import java.util.List;

public class GenericService<T> {

    private final Class<T> entityClass;

    public GenericService(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    // CREATE
    public void create(T entity) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(entity);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    // READ: Find by ID
    public T findById(Integer id) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            return em.find(entityClass, id);
        } finally {
            em.close();
        }
    }

    // READ: Find all
    public List<T> findAll() {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            return em.createQuery("SELECT e FROM " + entityClass.getSimpleName() + " e", entityClass).getResultList();
        } finally {
            em.close();
        }
    }

    // UPDATE
    public void update(T entity) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(entity);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    // DELETE
    public void delete(Integer id) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            EntityTransaction tx = em.getTransaction();
            tx.begin();
            T entity = em.find(entityClass, id);
            if (entity != null) {
                em.remove(entity);
            }
            tx.commit();
        } finally {
            em.close();
        }
    }
}
