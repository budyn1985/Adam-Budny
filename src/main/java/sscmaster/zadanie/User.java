package sscmaster.zadanie;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    String firstName;
    String lastName;
    Date dateOfBirth;
    Date creationDate;
    String organizationUnit;
    String team;
    Integer experienceLevel;
}
