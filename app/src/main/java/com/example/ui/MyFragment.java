package com.example.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.R;
import com.example.base.BaseFragment;
import com.example.structure.presenter.MyPresenter;
import com.example.structure.presenter.MyView;

import javax.inject.Inject;


public class MyFragment extends BaseFragment implements MyView {
    private static final String ID_KEY = "ID";

    @Inject
    MyPresenter presenter;

    private TextView text;

    private int someId;

    public MyFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        someId = getArguments().getInt(ID_KEY);
        super.onCreate(savedInstanceState);
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment, container, false);

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        text = view.findViewById(R.id.text);
        presenter.doSometing();

    }

    @Override
    public void onResult(String result) {
        text.setText(result);
    }

    public int getSomeId() {
        return someId;
    }


    public static MyFragment create(int id) {
        MyFragment myFragment = new MyFragment();
        Bundle args = new Bundle();
        args.putInt(ID_KEY, id);
        myFragment.setArguments(args);
        return myFragment;
    }
}
