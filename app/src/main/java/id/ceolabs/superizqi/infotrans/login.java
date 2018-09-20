package id.ceolabs.superizqi.infotrans;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    EditText username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = (EditText)findViewById(R.id.edt_email);
        password = (EditText)findViewById(R.id.edt_password);
    }

    public void to_daftar(View v){
        Intent i = new Intent(login.this,daftar.class);
        startActivity(i);
        finish();
    }

    public void to_pilih_kota(View v){
//        username = (EditText)findViewById(R.id.edt_email);
//        password = (EditText)findViewById(R.id.edt_password);

        Toast.makeText(login.this,
                "Login Sukses", Toast.LENGTH_LONG).show();
        Intent i = new Intent(login.this,pilih_kota.class);
        startActivity(i);
        finish();

//        if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin"))
//        {
//            Toast.makeText(login.this,
//                    "Login Sukses", Toast.LENGTH_LONG).show();
//            Intent i = new Intent(login.this,pilih_kota.class);
//            startActivity(i);
//            finish();
//        }else{
//            Toast.makeText(login.this,
//                    "Gagal Login", Toast.LENGTH_LONG).show();
//        }

//        Toast.makeText(login.this,
//                username.getText().toString(), Toast.LENGTH_LONG).show();
    }




}
