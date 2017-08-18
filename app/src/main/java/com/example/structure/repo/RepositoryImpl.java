package com.example.structure.repo;

import javax.inject.Inject;

public class RepositoryImpl implements Repository {

    @Inject
    public RepositoryImpl() {
    }

    @Override
    public String getValue() {
        return "Repo is " + this;
    }
}
