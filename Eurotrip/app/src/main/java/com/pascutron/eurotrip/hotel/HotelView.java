package com.pascutron.eurotrip.hotel;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.pascutron.eurotrip.utils.Constants;

import pascutron.eurotrip.R;

/**
 * Created by spascual on 07/01/2015.
 */
public class HotelView extends Fragment {

    private static final String COUNTRY = "country";

    public static HotelView newInstance(int country){

        HotelView fragment = new HotelView();
        Bundle b = fragment.getArguments();
        if (b == null)
            b = new Bundle();

        b.putInt(COUNTRY, country);
        fragment.setArguments(b);

        return fragment;

    }

    public HotelView(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_hotel, container, false);
        TextView hotel = (TextView) rootView.findViewById(R.id.hotel);

        switch (getArguments().getInt(COUNTRY)){

            case Constants.MADRID:
                hotel.setText(getResources().getString(R.string.hotel_madrid));
                break;
            case Constants.BARCELONA:
                hotel.setText(getResources().getString(R.string.hotel_barce));
                break;
            case Constants.PARIS:
                hotel.setText(getResources().getString(R.string.hotel_paris));
                break;
            case Constants.LONDON:
                hotel.setText(getResources().getString(R.string.hotel_london));
                break;
        }

        return rootView;
    }



};



