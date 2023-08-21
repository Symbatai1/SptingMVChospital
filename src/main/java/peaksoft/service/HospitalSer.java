package peaksoft.service;

import org.springframework.stereotype.Service;
import peaksoft.model.Hospital;

import java.util.List;

@Service
public interface HospitalSer {
    void saveHospital(Hospital hospital);
    List<Hospital> getAllHospitals();
    public Hospital getHospitalById(Long id);
    void deleteHospitalById(Long id);

    void updateHospitalById(Long id,Hospital hospital);

}
