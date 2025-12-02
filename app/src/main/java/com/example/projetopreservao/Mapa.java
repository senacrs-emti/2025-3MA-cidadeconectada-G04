package com.example.projetopreservao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Mapa extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap){
        mMap = googleMap;

        LatLng lami = new LatLng(-30.235880312780477, -51.09557231830199);
        mMap.addMarker(new MarkerOptions().position(lami).title("Marker in lami"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(lami, 11));

        LatLng santo = new LatLng(-30.08689714223958, -51.09513146249145);
        mMap.addMarker(new MarkerOptions().position(santo).title("Marker in santo"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(santo, 11));

        LatLng osso = new LatLng(-30.12234563610196, -51.23188692016222);
        mMap.addMarker(new MarkerOptions().position(osso).title("Marker in osso"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(osso,11));

        LatLng pedro = new LatLng(-30.18634659605275, -51.09617026248614);
        mMap.addMarker(new MarkerOptions().position(pedro).title("Marker in pedro"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(pedro, 11));
    }
}