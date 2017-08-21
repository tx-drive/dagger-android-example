package com.example.structure.presenter;

import com.example.structure.facade.Facade;
import com.example.structure.router.MainRouter;

import javax.inject.Inject;
import javax.inject.Named;

public class MyPresenter {
    private MyView view;
    private Facade facade;
    private MainRouter router;
    private int someId;

    @Inject
    public MyPresenter(MyView view, Facade facade, MainRouter router, @Named("someId") int someId) {
        this.view = view;
        this.facade = facade;
        this.router = router;
        this.someId = someId;
    }

    public void doSometing() {
        view.onResult(getValue());
    }

    public String getValue() {
        return "Presenter is " + this + "\n" + "SomeId: " + someId + "\nView is " + view + "\n" + facade.getValue();
    }
}
