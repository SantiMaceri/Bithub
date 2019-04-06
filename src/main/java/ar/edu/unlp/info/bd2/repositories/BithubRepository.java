package ar.edu.unlp.info.bd2.repositories;

import ar.edu.unlp.info.bd2.model.*;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class BithubRepository {

    @Autowired
    private SessionFactory sessionFactory;


    public User persistUser(User user){
        this.sessionFactory.getCurrentSession().save(user);
        return user;

    }




}
