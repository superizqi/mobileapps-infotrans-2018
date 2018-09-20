package id.ceolabs.superizqi.infotrans;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class pilih_kota extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilih_kota);
    }

    public void to_jakarta(View v){
        Toast.makeText(pilih_kota.this,
                "Selamat Datang di Jakarta", Toast.LENGTH_LONG).show();
    }

    public void to_bogor(View v){
        Toast.makeText(pilih_kota.this,
                "Selamat Datang di Bogor", Toast.LENGTH_LONG).show();
    }

    public void to_depok(View v){
        Toast.makeText(pilih_kota.this,
                "Selamat Datang di Depok", Toast.LENGTH_LONG).show();
    }

    public void to_bandung(View v){
        Toast.makeText(pilih_kota.this,
                "Selamat Datang di Bandung", Toast.LENGTH_LONG).show();
                Intent i = new Intent(pilih_kota.this,pilih_transportasi.class);
                startActivity(i);
    }

//    public void to_pilih_transportasi(View v){
//        Intent i = new Intent(pilih_kota.this,pilih_transportasi.class);
//        startActivity(i);
//    }
//
//    public void to_google_maps(View v){
//        Intent i = new Intent(pilih_kota.this,google_maps.class);
//        startActivity(i);
//    }
}
