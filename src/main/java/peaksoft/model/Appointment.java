package peaksoft.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.ToString.Exclude;

import java.time.LocalDate;

import static jakarta.persistence.CascadeType.*;

@Entity
@Table(name = "appointments")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder


public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "appointment_gen")
    @SequenceGenerator(
            name = "appointment_gen",
            sequenceName = "appointment_seq",
            allocationSize = 1)

    private Long Id;
    @NotNull
    private LocalDate date;
    @ManyToOne(cascade = {REFRESH,MERGE,PERSIST,DETACH})
    @Exclude
    private Patient patient;
    @ManyToOne(cascade = {REFRESH,MERGE,PERSIST,DETACH})
    @Exclude
    private Doctor doctor;
    @ManyToOne
    private Department department;
}
