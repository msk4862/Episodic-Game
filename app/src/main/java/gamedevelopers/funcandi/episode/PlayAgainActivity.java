package gamedevelopers.funcandi.episode;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import gamedevelopers.funcandi.episode.ui.EndActivity;
import gamedevelopers.funcandi.episode.ui.MainActivity;

public class PlayAgainActivity extends AppCompatActivity {

    Intent i, i1;
    Button b, b1;

    Typeface t;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_again);
        t = Typeface.createFromAsset(getAssets(), "raleway.ttf");


        text = (TextView) findViewById(R.id.textView7);
        text.setTypeface(t);

        b = (Button) findViewById(R.id.button3);
        b1 = (Button) findViewById(R.id.button4);
        b.setTypeface(t);
        b1.setTypeface(t);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i1 = new Intent(getApplicationContext(), EndActivity.class);
                startActivity(i1);
            }
        });
    }
}
