package com.example.jyrks.ninerhymes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView rhymeImageView;
    private EditText guessText;
    private Button guessButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rhymeImageView = (ImageView) findViewById(R.id.rhymeImage);
        guessText = (EditText) findViewById(R.id.guessText);
        guessButton = (Button) findViewById(R.id.guessButton);

        rhymeImageView.setImageResource(getResources().getIdentifier(new RhymeImage().getImageName(), "drawable", "com.example.jyrks.ninerhymes"));

        guessButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (guessText.getText().toString().toLowerCase().equals(RhymeImage.names.get(RhymeImage.number))) {
                    rhymeImageView.setImageResource(getResources().getIdentifier(new RhymeImage().getImageName(), "drawable", "com.example.jyrks.ninerhymes"));
                    Toast.makeText(getApplicationContext(), "You know dem celebs", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Nope", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
