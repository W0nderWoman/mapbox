package com.example.gupta.mapbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mapbox.mapboxsdk.Mapbox;
import com.mapbox.mapboxsdk.annotations.Icon;
import com.mapbox.mapboxsdk.annotations.IconFactory;
import com.mapbox.mapboxsdk.annotations.MarkerOptions;
import com.mapbox.mapboxsdk.camera.CameraUpdateFactory;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.maps.MapView;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.OnMapReadyCallback;

public class MainActivity extends AppCompatActivity {

    private MapView mapView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Mapbox.getInstance(this, "pk.eyJ1IjoibWF5dXJpZ3VwdGEiLCJhIjoiY2pseGN3azdmMDZ0eTNxcGl1eDh3N3pseCJ9.mHh7ImZ1cJQiKgVpG3yy0Q");

        setContentView(R.layout.activity_main);

        mapView = (MapView) findViewById(R.id.mapView);
        mapView.onCreate(savedInstanceState);

        //MARKER
        mapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(MapboxMap mapboxMap) {

                Icon icon1= IconFactory.getInstance(MainActivity.this).fromResource(R.drawable.pokemon);

                mapboxMap.addMarker(new MarkerOptions()
                        .position(new LatLng(48.13863, 11.57603))
                        .title("hi there")
                        .snippet("call me when free !"));
                mapboxMap.addMarker(new MarkerOptions()
                        .position(new LatLng(50.13863, 11.57603))
                        .title("hi there")
                        .snippet("call me when free !"));
                mapboxMap.addMarker(new MarkerOptions()
                        .position(new LatLng(48.13863, 15.57603))
                        .title("hi there")
                        .snippet("call me when free !"));
                mapboxMap.addMarker(new MarkerOptions()
                        .position(new LatLng(52.13863, 15.57603))
                        .title("hi there")
                        .snippet("call me when free !"));

                //mapboxMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(40.73581, -73.99155), 12), 12000);
            }
        });


    }

    @Override
    public void onStart() {
        super.onStart();
        mapView.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
        mapView.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        mapView.onPause();
    }

    @Override
    public void onStop() {
        super.onStop();
        mapView.onStop();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mapView.onLowMemory();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mapView.onDestroy();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mapView.onSaveInstanceState(outState);
    }

}
