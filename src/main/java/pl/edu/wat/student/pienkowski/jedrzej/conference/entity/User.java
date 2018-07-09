package pl.edu.wat.student.pienkowski.jedrzej.conference.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Set;

@Entity
public class User {
    @Id
    private String username;

    private String password;

    private String role;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
