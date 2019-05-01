package com.example.pip_boy;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class HealthFragment extends Fragment {

    Button quest = (Button)

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_health, container, false);

        Button quest = (Button) rootView.findViewById(R.id.quest);
        quest.setOnClickListener((v) -> {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://prairielearn.engr.illinois.edu/pl/course_instance/20716/assessments"));
            startActivity(browserIntent);
        });

        return rootView;


    }

    /*public void goQuest(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://prairielearn.engr.illinois.edu/pl/course_instance/20716/assessments"));
        startActivity(browserIntent);*/
    }
}


