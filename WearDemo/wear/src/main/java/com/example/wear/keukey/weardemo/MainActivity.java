package com.example.wear.keukey.weardemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.wearable.view.WatchViewStub;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.keukey.apps.CorrectorClient;
import com.keukey.apps.GoogleSpeechRecognizer;

public class MainActivity extends Activity {

    private TextView mOriginal;
    private TextView mCorrect;
    private Button mCorrectButton;

    private CorrectorClient mCorrectorClient;
    private GoogleSpeechRecognizer mGoogleSpeech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final WatchViewStub stub = (WatchViewStub) findViewById(R.id.watch_view_stub);
        stub.setOnLayoutInflatedListener(new WatchViewStub.OnLayoutInflatedListener() {
            @Override
            public void onLayoutInflated(WatchViewStub stub) {
                mOriginal = (TextView) stub.findViewById(R.id.original);
                mCorrect = (TextView) stub.findViewById(R.id.correct);
                mCorrectButton = (Button) stub.findViewById(R.id.correctButton);
            }
        });


    }

    //CorrectButtonClick Event
    public void CorrectClickListener(View view){

    }
}
