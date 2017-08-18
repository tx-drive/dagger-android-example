package com.example.structure.presenter;

import com.example.structure.facade.Facade;
import com.example.structure.router.MainRouter;

import javax.inject.Inject;

public class MyPresenter {
    private MyView view;
    private Facade facade;
    private MainRouter router;

    @Inject
    public MyPresenter(MyView view, Facade facade, MainRouter router) {
        this.view = view;
        this.facade = facade;
        this.router = router;
    }

    public void doSometing() {
        view.onResult(getValue());
    }

    public String getValue() {
        return "Presenter is " + this + "\nView is " + view + "\n" + facade.getValue();
    }
}
