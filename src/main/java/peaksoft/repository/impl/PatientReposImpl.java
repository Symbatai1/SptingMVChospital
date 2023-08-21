package peaksoft.repository.impl;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.stereotype.Repository;
import peaksoft.enums.Gender;
import peaksoft.model.Appointment;
import peaksoft.model.Hospital;

import java.util.List;
@Repository
@Transactional
public class PatientReposImpl implements  {
    @PersistenceContext

    private EntityManager entityManager;

}



