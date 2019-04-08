package com.exercise.raynard.kursusera;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ExploreFragment extends Fragment {
    private List<CourseData> courses;


    public ExploreFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_explore, container, false);
        courses = new ArrayList<>();
        RecyclerView rv = (RecyclerView) view.findViewById(R.id.rv_certification);
        LinearLayoutManager llm = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);

        RVAdapter adapter = new RVAdapter(courses,getContext());
        rv.setLayoutManager(llm);
        rv.setAdapter(adapter);
        //cardview index 0
        //cardview content
        courses.add(new CourseData(R.drawable.aws,"title","description"));
        courses.add(new CourseData(R.drawable.aws,"title","description"));
        courses.add(new CourseData(R.drawable.oracle,"Oracle Certification","Oracle"));
        adapter.notifyDataSetChanged();
        return view;
    }

}
