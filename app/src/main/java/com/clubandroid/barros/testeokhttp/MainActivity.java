package com.clubandroid.barros.testeokhttp;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        textView = (TextView) findViewById(R.id.response_json);

        button = (Button) findViewById(R.id.get_json);

    }

    public String getMyJSON(View view) throws IOException {


        String url = "http:192.168.25.2:8080/avaliabus/user";

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder().url(url).build();

        Response respose = client.newCall(request).execute();

        String jsonDeResposta = respose.body().toString();

        return jsonDeResposta;
    }


}
