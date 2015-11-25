package prak.travelerapp;

import android.support.v7.app.AppCompatActivity;


import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;


import prak.travelerapp.WeatherAPI.WeatherTask;
import prak.travelerapp.WeatherAPI.model.Weather;

public class MainActivity extends AppCompatActivity implements AsyncResponse {

    private Button newTrip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("dsd", "dchih");
        Log.d("dsd","dchdjskdskjih");


        prepareViews();
        prepareListeners();
        setUpFragment();

        //weatherAPItest();

    }

    private void prepareListeners() {
        newTrip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MainActivity", "Clicked Started new Trip");
            }
        });
    }

    private void prepareViews() {
        newTrip = (Button) findViewById(R.id.newTrip);
    }

    private void setUpFragment() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        PlacePickerFragment fragment = new PlacePickerFragment();
        fragmentTransaction.add(R.id.ll, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    public void weatherAPItest(){

        boolean isOnline = Utils.isOnline(this);
        if(isOnline) {

            WeatherTask weathertask = new WeatherTask();
            weathertask.delegate = this;
            weathertask.execute(new String[]{"Berlin"});

        }else{
            //TODO tell user to get internet connection
        }

    }

    @Override
    public void weatherProcessFinish(Weather output) {

        Log.d("dcw", output.toString());

    }

    @Override
    public void weatherProcessFailed() {

        Log.d("ERROR", "WeatherAPIcall failed");
        //TODO -> handle exception
    }
}
