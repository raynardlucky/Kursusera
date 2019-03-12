package com.exercise.raynard.kursusera;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class SignInFragment extends Fragment {


    public SignInFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sign_in, container, false);
        return view;
    }

    public void toBottomNav (View view){
        Intent i = new Intent(getActivity(), BottomNavigationActivity.class);
        startActivity(i);
        ((Activity) getActivity()).overridePendingTransition(0,0);
    }

}
