package com.example.richardrodulfo.quiz2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cancelButton(View v){
        Toast toast = Toast.makeText(this,"Cancel Button was clicked...",Toast.LENGTH_LONG);
        toast.show();
    }

    public void proceedButton(View buton){
        Snackbar sbar = Snackbar.make(buton, "Proceed Button was clicked...", Snackbar.LENGTH_LONG);
        sbar.show();
    }
}
