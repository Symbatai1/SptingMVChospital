package peaksoft.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

import static jakarta.persistence.CascadeType.*;

@Entity
@Table(name = "hospitals")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Hospital {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "hospital_gen")
    @SequenceGenerator(
            name = "hospital_gen",
            sequenceName = "hospital_seq",
            allocationSize = 1)
    private Long id;
    private String name;
    private String address;
    @OneToMany(mappedBy = "hospital", cascade = {REFRESH, MERGE, DETACH, REMOVE})
    private List<Doctor> doctors;
    @OneToMany(mappedBy = "hospital", cascade = {REFRESH, MERGE, DETACH, REMOVE})
    @ToString.Exclude
    private List<Department> departments;

    @OneToMany(mappedBy = "hospital")
    private List<Patient> patients;
    @OneToMany
    private List<Appointment> appointments;
    @Column(length = 2000)
    private String image;

    public Hospital(Long id, String name, String image,String address) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.address = address;
    }

    public Hospital(String name, String image) {
        this.name = name;
        this.image = image;
    }
}



