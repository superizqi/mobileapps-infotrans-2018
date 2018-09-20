package id.ceolabs.superizqi.infotrans;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class pilih_layanan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilih_layanan);
    }

    public void to_lihat_informasi(View v){
        Toast.makeText(this, "Lihat Rute Yang Dilewati Oleh Angkutan umum", Toast.LENGTH_SHORT).show();
    }

    public void to_order_transportasi(View v){
        Toast.makeText(this, "Saatnya Order Transportasi", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(this,order_activity.class);
        startActivity(i);
    }
}
