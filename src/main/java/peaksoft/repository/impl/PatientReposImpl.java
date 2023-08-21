package peaksoft.repository.impl;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;
import peaksoft.enums.Gender;
import peaksoft.model.Appointment;
import peaksoft.model.Hospital;

import java.util.List;

@Entity
@Table(name = "patients")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString

public class PatientReposImpl {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "patient_gen")
    @SequenceGenerator(
            name = "patient_gen",
            sequenceName = "patient_identity_seq",
            allocationSize = 1)
    private Long Id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "phone_number")
    @Pattern(regexp = "^(?!\\+996)\\d+$“, message = “phone number mast not start with +996")
    @Size(max = 13)
    private String phoneNumber;
    @NotNull(message = "Choose just Female or Male")
    private Gender gender;
    private String email;
    private Hospital hospital;
    private List<Appointment>appointments;

}



