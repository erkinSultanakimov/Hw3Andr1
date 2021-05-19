package com.geekchtech.hw3android;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class secondFragment extends Fragment {
    private Button button;
    private  String title;





    public secondFragment() {

    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        title = getArguments().getString("key");
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        button = view.findViewById(R.id.second_fragment_btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new ThirdFragment();
                Bundle bundle = new Bundle();
                bundle.putString("key2", title);
                fragment.setArguments(bundle);
                getActivity().getSupportFragmentManager()
                        .beginTransaction().replace(R.id.container, fragment ).addToBackStack(null).commit();

            }
        });
    }
}