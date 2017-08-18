package com.example.structure.facade;

import com.example.structure.repo.Repository;

import javax.inject.Inject;

public class FacadeImpl implements Facade {
    private Repository repository;

    @Inject
    public FacadeImpl(Repository repository) {
        this.repository = repository;
    }

    @Override
    public String getValue() {
        return "Facade is " + this + "\n" + repository.getValue();
    }
}
