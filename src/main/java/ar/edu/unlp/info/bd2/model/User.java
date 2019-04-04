package ar.edu.unlp.info.bd2.model;


import javax.persistence.Entity; //Esto es muy probable que este mal, lo crea el ide por las notation Entity y Id
import javax.persistence.Id;

@Entity(name = "User")

public class User {
    @Id
    private Integer id;
    private String name;
    private String email;


    private void setId(Integer id) {
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

    public User(String email, String name) {
        this.name = name;
        this.email = email;
    }
}
