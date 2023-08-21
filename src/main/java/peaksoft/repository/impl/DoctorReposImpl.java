package peaksoft.repository.impl;

import jakarta.persistence.*;
import lombok.*;
import peaksoft.model.Appointment;
import peaksoft.model.Department;

import java.util.List;

@Entity
@Table(name = "doctors")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString

public class DoctorReposImpl {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "doctor_gen")
    @SequenceGenerator(
            name = "doctor_gen",
            sequenceName = "doctor_identity_seq",
            allocationSize = 1)
    private Long Id;
    private String firstName;
    private String lastName;
    private String position;
    private String email;
    private List<Department> departments;
    private List<Appointment>appointments;
}
