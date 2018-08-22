package pl.edu.wat.student.pienkowski.jedrzej.conference.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Conference {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String name;

    //@Temporal(TemporalType.TIMESTAMP)
    private Date start;

    //@Temporal(TemporalType.TIMESTAMP)
    private Date end;

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }
}
