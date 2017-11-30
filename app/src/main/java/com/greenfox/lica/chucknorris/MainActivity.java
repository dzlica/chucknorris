package com.greenfox.lica.chucknorris;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textChuck);
        final Button button = findViewById(R.id.button);

        getChuck();

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                getChuck();
            }
        });


    }

    private void getChuck() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ChuckApi.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ChuckApi chuckApi = retrofit.create(ChuckApi.class);

        Call<Chuck> call = chuckApi.getChuck();

        call.enqueue(new Callback<Chuck>() {
            @Override
            public void onResponse(Call<Chuck> call, Response<Chuck> response) {
                Chuck chuck = response.body();

                String joke = chuck.value.getJoke();

                textView.setText(joke);

            }

            @Override
            public void onFailure(Call<Chuck> call, Throwable t) {
                for (int i = 0; i < 10; i++) {
                    Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_LONG).show();
                }

            }

        });

    }


}
