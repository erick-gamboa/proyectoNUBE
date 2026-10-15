package mx.desarrollo.persistence.dao;

import jakarta.persistence.EntityManager;
import mx.desarrollo.entity.Vinilo;
import mx.desarrollo.entity.Usuario;
import mx.desarrollo.persistence.persistence.AbstractDAO;
import java.util.Optional;

public class ViniloDAO extends AbstractDAO<Vinilo> {

    private final EntityManager entityManager;

    public ViniloDAO(EntityManager em) {
        super(Vinilo.class);
        this.entityManager = em;
    }

    @Override
    public EntityManager getEntityManager() {
        return entityManager;
    }
}