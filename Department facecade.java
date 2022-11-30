package com.teacher;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
@Stateless
public class DepartmentFacade extends AbstractFacade<Department> {
@PersistenceContext(unitName = "teacherleavePU")
    private EntityManager em;
@Override
    protected EntityManager getEntityManager() {
        return em;
    }public DepartmentFacade() {
        super(Department.class);
    }
    }
