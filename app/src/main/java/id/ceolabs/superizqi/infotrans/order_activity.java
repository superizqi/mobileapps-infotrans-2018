package id.ceolabs.superizqi.infotrans;

import android.content.Intent;
import android.graphics.Bitmap;
import android.media.Image;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class order_activity extends FragmentActivity implements OnMapReadyCallback {
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_activity);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

//        ImageView backgr = (ImageView)findViewById(R.id.backgr);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        BitmapDescriptor abc = BitmapDescriptorFactory.fromResource(R.drawable.angkot_mark);
        BitmapDescriptor def = BitmapDescriptorFactory.fromResource(R.drawable.grab_mark);
        BitmapDescriptor ghi = BitmapDescriptorFactory.fromResource(R.drawable.gojek_mark);
        mMap = googleMap;
        // Add a marker in Sydney, Australia, and move the camera.
        LatLng daspro = new LatLng(-6.975002, 107.631161);
        mMap.addMarker(new MarkerOptions().position(daspro).title("Marker in Daspro Lab").icon(abc));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(daspro));


        LatLng ead = new LatLng(-6.974970, 107.631241);
        mMap.addMarker(new MarkerOptions().position(ead).title("Marker in EAD").icon(def));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ead));


        LatLng tekno = new LatLng(-6.975795, 107.631402);
        mMap.addMarker(new MarkerOptions().position(tekno).title("Marker in KEPROF. TECHNOPRENEUR").icon(ghi));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(tekno));






    }

    public void to_confirmation(View v){
        Intent intent = new Intent(this,finish_order_activity.class);
        startActivity(intent);
        Toast.makeText(this, "Konfirmasi Transaksi", Toast.LENGTH_SHORT).show();
    }
}
