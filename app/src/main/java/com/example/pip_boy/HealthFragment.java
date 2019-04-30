package com.example.pip_boy;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.fitness.FitnessOptions;

public class HealthFragment extends Fragment {
    public class HistoryClient extends GoogleApi<FitnessOptions> {
        public HistoryClient() { }
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_health, container, false);

    }
}
