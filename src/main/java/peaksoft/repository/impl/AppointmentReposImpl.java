package peaksoft.repository.impl;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional

public class AppointmentReposImpl {
    @PersistenceContext

    private EntityManager entityManager;

}
