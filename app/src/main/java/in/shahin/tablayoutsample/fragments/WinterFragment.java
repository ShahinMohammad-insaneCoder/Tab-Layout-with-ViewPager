package in.shahin.tablayoutsample.fragments;


import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import in.shahin.tablayoutsample.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class WinterFragment extends Fragment {


    public WinterFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_winter, container, false);
    }

}
