package gamedevelopers.funcandi.episode;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import gamedevelopers.funcandi.episode.ui.MainActivity;
import gamedevelopers.funcandi.episode.ui.StoryActivity;

public class LaunchActivity extends AppCompatActivity implements View.OnClickListener {

    TextView t1, t2, t3, t4;
    Typeface t;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);

        int x=getResources().getDisplayMetrics().widthPixels;
        int y=getResources().getDisplayMetrics().heightPixels;

        t1 = (TextView) findViewById(R.id.textView3);
        t2 = (TextView) findViewById(R.id.textView4);
        t3 = (TextView) findViewById(R.id.textView5);
        t4 = (TextView) findViewById(R.id.textView6);

        b = (Button) findViewById(R.id.button2);

        t = Typeface.createFromAsset(getAssets(), "raleway.ttf");


        t1.setTypeface(t);
        t2.setTypeface(t);
        t3.setTypeface(t);
        t4.setTypeface(t);
        b.setTypeface(t);

        t1.setY(y/2+y/70);
        t2.setY(y/2+y/60);
        t3.setY(y/2+y/50);
        t4.setY(y/2+y/40);


        b.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
