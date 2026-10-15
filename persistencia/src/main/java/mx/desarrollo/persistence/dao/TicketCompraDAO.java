package mx.desarrollo.persistence.dao;

import jakarta.persistence.EntityManager;
import mx.desarrollo.entity.TicketCompra;
import mx.desarrollo.persistence.persistence.AbstractDAO;

import java.util.List;


public class TicketCompraDAO extends AbstractDAO<TicketCompra> {
    private final EntityManager entityManager;

    public TicketCompraDAO(EntityManager em) {
        super(TicketCompra.class);
        this.entityManager = em;
    }
    @Override
    public EntityManager getEntityManager() {
        return entityManager;
    }
}
