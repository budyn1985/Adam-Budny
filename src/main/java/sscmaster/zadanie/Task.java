package sscmaster.zadanie;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name =  "TASK")
public class Task {

    String ID;
    String title;
    Integer numberOfSubtasks;
    Integer priority;
    Date creationDate;
    String organizationUnit;
    String team;
    Integer minimumExperienceLevel;
    Integer maximumAgeInYears;

    @Id
    @GeneratedValue
    @NotNull
    @Column(name="ID", unique = true)
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getNumberOfSubtasks() {
        return numberOfSubtasks;
    }

    public void setNumberOfSubtasks(Integer numberOfSubtasks) {
        this.numberOfSubtasks = numberOfSubtasks;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getOrganizationUnit() {
        return organizationUnit;
    }

    public void setOrganizationUnit(String organizationUnit) {
        this.organizationUnit = organizationUnit;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public Integer getMinimumExperienceLevel() {
        return minimumExperienceLevel;
    }

    public void setMinimumExperienceLevel(Integer minimumExperienceLevel) {
        this.minimumExperienceLevel = minimumExperienceLevel;
    }

    public Integer getMaximumAgeInYears() {
        return maximumAgeInYears;
    }

    public void setMaximumAgeInYears(Integer maximumAgeInYears) {
        this.maximumAgeInYears = maximumAgeInYears;
    }
}
