package peaksoft.repository.impl;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.*;
import org.springframework.stereotype.Repository;
import peaksoft.model.Appointment;
import peaksoft.model.Department;
import peaksoft.model.Doctor;
import peaksoft.model.Hospital;
import peaksoft.repository.DoctorRepos;

import java.util.List;

@Repository
@Transactional

public class DoctorReposImpl implements DoctorRepos {
    @PersistenceContext

    private EntityManager entityManager;

    @Override
    public void saveDoctor(Doctor doctor) {
        entityManager.persist(doctor);


    }

    @Override
    public List<Doctor> getAllDoctorss() {
        return entityManager.createQuery("select d from Hospital d",Doctor.class).getResultList();

    }

    @Override
    public Doctor getDoctorById(Long id) {
        return entityManager.find(Doctor.class,id);
    }


    @Override
    public void deleteDoctorById(Long id) {

    }

    @Override
    public void updateDoctorById(Long id, Doctor doctor) {

    }
}


