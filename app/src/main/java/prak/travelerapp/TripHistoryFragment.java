package prak.travelerapp;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

import prak.travelerapp.TripDatabase.TripDBAdapter;
import prak.travelerapp.TripDatabase.model.Trip;

public class TripHistoryFragment extends Fragment {


    TripDBAdapter tripDBAdapter;
    private ListView listview;
    private ImageButton hamburger_button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_trip_history, container, false);


        listview = (ListView) view.findViewById(R.id.historyList);
        hamburger_button = (ImageButton) view.findViewById(R.id.button_hamburger);
        hamburger_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity) getActivity()).openDrawer();
            }
        });

        return view;
    }


    @Override
    public void onStart() {
        super.onStart();

        //get all old Trips
        tripDBAdapter = new TripDBAdapter(getActivity());
        tripDBAdapter.open();
        ArrayList<Trip> oldTrips = tripDBAdapter.getOldTrips();
        Trip[] tripArray = oldTrips.toArray(new Trip[oldTrips.size()]);

        HistoryListAdapter adapter = new HistoryListAdapter(getActivity(), R.layout.history_list_item,tripArray);
        listview.setAdapter(adapter);
    }

}