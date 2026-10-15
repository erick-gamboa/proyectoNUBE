package mx.desarrollo.persistence.dao;

import jakarta.persistence.EntityManager;
import mx.desarrollo.entity.DetalleCarrito;
import mx.desarrollo.persistence.persistence.AbstractDAO;
import java.util.List;

public class DetalleCarritoDAO extends AbstractDAO<DetalleCarrito> {

    private final EntityManager entityManager;

    public DetalleCarritoDAO(EntityManager em) {
        super(DetalleCarrito.class);
        this.entityManager = em;
    }

    @Override
    public EntityManager getEntityManager() {
        return entityManager;
    }
}