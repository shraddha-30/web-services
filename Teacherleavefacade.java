package com.teacher;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
@Stateless
public class TeacherLeaveFacade extends AbstractFacade<TeacherLeave> {
@PersistenceContext(unitName = "teacherleavePU")
    private EntityManager em;
@Override
    protected EntityManager getEntityManager() {
        return em;
    }
public TeacherLeaveFacade() {
        super(TeacherLeave.class);
    }
    
}
