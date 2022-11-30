package com.teacher;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
@Stateless
public class TeacherFacade extends AbstractFacade<Teacher> {
@PersistenceContext(unitName = "teacherleavePU")
    private EntityManager em;
@Override
    protected EntityManager getEntityManager() {
        return em;
    } public TeacherFacade() {
        super(Teacher.class);
    }
    }
