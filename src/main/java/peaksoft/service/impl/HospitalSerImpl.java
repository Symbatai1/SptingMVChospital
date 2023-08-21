package peaksoft.service.impl;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Service;
import peaksoft.model.*;
import peaksoft.repository.HospitalRepos;
import peaksoft.service.HospitalSer;

import java.util.List;

@Service
@RequiredArgsConstructor

public class HospitalSerImpl implements HospitalSer {

    private final HospitalRepos hospitalRepos;

    @Override
    public void saveHospital(Hospital hospital) {
        hospitalRepos.saveHospital(hospital);

    }

    @Override
    public List<Hospital> getAllHospitals() {
        return hospitalRepos.getAllHospitals();
    }

    @Override
    public Hospital getHospitalById(Long id) {

        return hospitalRepos.getHospitalById(id);
    }

    @Override
    public void deleteHospitalById(Long id) {

    }

    @Override
    public void updateHospitalById(Long id, Hospital hospital) {

            hospitalRepos.updateHospitalById(id,hospital);
    }
}
