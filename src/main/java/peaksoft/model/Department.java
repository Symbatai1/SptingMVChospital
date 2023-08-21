package peaksoft.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@Entity
@Table(name = "departments")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "doctor_gen")
    @SequenceGenerator(
            name = "doctor_gen",
            sequenceName = "doctor_seq",
            allocationSize = 1)

    private Long Id;
    @Column(unique = true)
    private String name;

   // @ManyToOne
   // private Hospital hospital;

    @OneToMany(mappedBy = "department")
    private List<Appointment>appointments;

    @ManyToMany(mappedBy = "departments")
    private List<Doctor>doctors;





}
