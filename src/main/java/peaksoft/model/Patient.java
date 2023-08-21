package peaksoft.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;
import peaksoft.enums.Gender;

import java.util.List;

@Entity
@Table(name = "patients")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "patient_gen")
    @SequenceGenerator(
            name = "patient_gen",
            sequenceName = "patient_seq",
            allocationSize = 1)
    private Long Id;
    @NotNull
    @Column(name = "first_name")
    private String firstName;
    @NotNull
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "phone_number")
    @Pattern(regexp = "^(?!\\+996)\\d+$“, message = “phone number mast not start with +996")
    @Size(max = 13)
    @NotNull
    private String phoneNumber;
    @NotNull
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Column(unique = true)
    private String email;
    @ManyToOne
    @ToString.Exclude
    private Hospital hospital;
    @OneToMany(mappedBy = "patient")
    @ToString.Exclude
    private List<Appointment> appointments;

}



