package com.example.demo.rest;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@ApplicationScoped
public class Resources {
    @PersistenceContext
    private EntityManager em;

    @Produces
    public EntityManager getEntityManager() {
        return em;
    }
}