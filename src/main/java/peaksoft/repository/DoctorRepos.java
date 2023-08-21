package peaksoft.repository;

import peaksoft.model.Doctor;
import peaksoft.model.Hospital;

import java.util.List;

public interface DoctorRepos {
    void saveDoctor(Doctor doctor);
    List<Doctor> getAllDoctorss();
    public Doctor getDoctorById(Long id);

    void deleteDoctorById(Long id);
    void updateDoctorById(Long id,Doctor doctor);

}
