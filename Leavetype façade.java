package com.teacher;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
@Stateless
public class LeaveTypeFacade extends AbstractFacade<LeaveType> {
@PersistenceContext(unitName = "teacherleavePU")
    private EntityManager em;
@Override
protected EntityManager getEntityManager() {
        return em;
    } public LeaveTypeFacade() {
        super(LeaveType.class);
    }
    }
