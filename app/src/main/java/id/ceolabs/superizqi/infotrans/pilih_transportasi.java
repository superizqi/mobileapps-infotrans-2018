package id.ceolabs.superizqi.infotrans;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class pilih_transportasi extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilih_transportasi);
    }

    public void to_angkot(View v){
        Toast.makeText(pilih_transportasi.this,"Naik Angkut Itu Keren",Toast.LENGTH_LONG).show();
        Intent i = new Intent(this,pilih_layanan.class);
        startActivity(i);
    }
    public void to_busdamri(View v){
        Toast.makeText(pilih_transportasi.this,"Naik Bus Itu Asik",Toast.LENGTH_LONG).show();
    }
    public void to_tmb(View v){
        Toast.makeText(pilih_transportasi.this,"Mau Hemat ? Naik TMB aja",Toast.LENGTH_LONG).show();
    }
    public void to_pangkalan_ojek(View v){
        Toast.makeText(pilih_transportasi.this,"Pake Ojek Itu Mudah dan Murah",Toast.LENGTH_LONG).show();
    }

}
