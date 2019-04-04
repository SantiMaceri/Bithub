package ar.edu.unlp.info.bd2.services;

import ar.edu.unlp.info.bd2.repositories.BithubRepository;

public class BithubServiceImpl implements BithubService {

    private BithubRepository repository;
    public BithubServiceImpl( BithubRepository repository){
        this.repository = repository;
    }
}
