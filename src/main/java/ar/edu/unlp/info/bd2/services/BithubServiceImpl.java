package ar.edu.unlp.info.bd2.services;

import ar.edu.unlp.info.bd2.model.*;


import ar.edu.unlp.info.bd2.repositories.BithubRepository;

import javax.persistence.EntityNotFoundException;
import javax.persistence.PersistenceException;
import javax.transaction.Transactional;

public class BithubServiceImpl implements BithubService {

    private BithubRepository repository;


    public BithubServiceImpl( BithubRepository repository){
        this.repository = repository;
    }

    public User createUser(String email, String name){
       User user = new User(email, name);
        return repository.persistUser(user);

    }
}
