package com.mind.loginregisterapps;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

import com.mind.loginregisterapps.API.BodyApi;
import com.mind.loginregisterapps.API.ResponseApi;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {


    private Button btnSubmit;
    private EditText etFitur_1;
    private EditText etFitur_2;
    private EditText etFitur_3;
    private String hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSubmit = findViewById(R.id.submit);
        etFitur_1 = findViewById(R.id.fitur_1);
        etFitur_2 = findViewById(R.id.fitur_2);
        etFitur_3 = findViewById(R.id.fitur_3);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BodyApi bodyApi = new BodyApi();
                bodyApi.setFitur1(etFitur_1.getText().toString());
                bodyApi.setFitur2(etFitur_2.getText().toString());
                bodyApi.setFitur3(etFitur_3.getText().toString());

                RestClient.getService().postNb(bodyApi).enqueue(new Callback<ResponseApi>() {
                    @Override
                    public void onResponse(Call<ResponseApi> call, Response<ResponseApi> response) {

                        Toast.makeText(MainActivity.this, response.body().getPrediksi(), Toast.LENGTH_SHORT).show();
                        //hasil = response.body().getPrediksi();

                    }

                    @Override
                    public void onFailure(Call<ResponseApi> call, Throwable t) {
                        hasil = "Error";
                    }
                });

                //alertDialog();
            }
        });
    }

    private void alertDialog() {
        AlertDialog.Builder Peringatan = new AlertDialog.Builder(this);
        Peringatan.setTitle("Hasil Prediksi");
        Peringatan
                .setMessage(hasil)
                .setCancelable(false)
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface Peringatan, int id) {
                        Peringatan.dismiss();
                    }
                }).show();
    }
}
