package ar.edu.unlp.info.bd2.model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "User")

public class User {
    @Id
    private Integer id;
    private String name;
    private String email;


    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String emai) {
        this.email = emai;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public User(){

    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
