package com.teacher;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
@Stateless
public class LeaveFacade extends AbstractFacade<Leave> {
@PersistenceContext(unitName = "teacherleavePU")
    private EntityManager em;
@Override
    protected EntityManager getEntityManager() {
        return em;
    } public LeaveFacade() {
        super(Leave.class);
    }
    }
