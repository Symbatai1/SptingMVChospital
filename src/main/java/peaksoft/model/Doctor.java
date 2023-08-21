package peaksoft.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;
@Entity
@Table(name = "doctors")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "doctor_gen")
    @SequenceGenerator(
            name = "doctor_gen",
            sequenceName = "doctor_seq",
            allocationSize = 1)
    private Long Id;
    @NotNull
    @Column(name = "first_name")
    private String firstName;
    @NotNull
    @Column(name = "last_name")
    private String lastName;
    @NotNull
    private String position;
    @Column(unique = true)
    private String email;

    @ManyToOne
    private Hospital hospital;
    @OneToMany(mappedBy = "doctor")
    private List<Appointment>appointments;

    @ManyToMany
    private List<Department>departments;

}
