package peaksoft.repository;


import peaksoft.model.Hospital;

import java.util.List;

public interface HospitalRepos {
    void saveHospital(Hospital hospital);
    List<Hospital>getAllHospitals();
    public Hospital getHospitalById(Long id);

    void deleteHospitalById(Long id);
    void updateHospitalById(Long id,Hospital hospital);

}
