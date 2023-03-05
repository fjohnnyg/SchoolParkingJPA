package Entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "teachers")
public class TeacherEntity extends Person {

    private String name;
    private String subject;

    public TeacherEntity(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    public TeacherEntity(int id, String name, String subject) {
        super(id, name);
        this.subject = subject;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
