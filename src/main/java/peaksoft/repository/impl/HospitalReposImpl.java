package peaksoft.repository.impl;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.*;
import org.springframework.stereotype.Repository;
import peaksoft.model.*;
import peaksoft.repository.HospitalRepos;

import java.util.List;

@Repository
@Transactional
public class HospitalReposImpl implements HospitalRepos {
    @PersistenceContext

    private EntityManager entityManager;

    @Override
    public void saveHospital(Hospital hospital) {
        entityManager.persist(hospital);

    }

    @Override
    public List<Hospital> getAllHospitals() {
        return entityManager.createQuery("select h from Hospital h",Hospital.class).getResultList();
    }

    @Override
    public Hospital getHospitalById(Long id) {
        return entityManager.find(Hospital.class, id);
    }

    @Override
    public void deleteHospitalById(Long id) {
        hospitalRepos.deleteHospitalById(id);
    }



    @Override
    public void updateHospitalById(Long id, Hospital hospital) {
        Hospital oldHospital= entityManager.find(Hospital.class, id);
        oldHospital.setName(new Hospital.getName());
        oldHospital.setAddress(new Hospital.getAddress());
        entityManager.merge(getAllHospitals());

    }
}
