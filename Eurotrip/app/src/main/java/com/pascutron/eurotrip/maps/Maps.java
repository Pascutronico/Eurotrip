package com.pascutron.eurotrip.maps;

import android.location.Location;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.MapFragment;

/**
 * Created by spascual on 07/01/2015.
 */
public class Maps extends MapFragment {

    private static final String LOC = "loc";

    private Location location;

    public static Maps newInstance(Location l){

        Maps fragment = new Maps();
        Bundle b = fragment.getArguments();
        if (b == null)
            b = new Bundle();

        b.putParcelable(LOC, l);
        fragment.setArguments(b);

        return fragment;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        location = getArguments().getParcelable(LOC);


        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
