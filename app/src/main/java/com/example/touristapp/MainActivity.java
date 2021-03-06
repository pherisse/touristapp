package com.example.touristapp;
import android.content.Intent;
import com.ad4screen.sdk.activities.A4SActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends A4SActivity {

    public final static String EXTRA_MESSAGE = "com.example.touristapp.EXTRA_MESSAGE";
    public final static String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
