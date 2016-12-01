package snowtam_ensim.snowtamreader;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Raphaël on 24/11/2016.
 */

public class SnowtamDisplayActivity extends AppCompatActivity
{
    final String EXTRA_OACI = "oaci";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snowtamdisplay);

        Intent intent = getIntent();
        TextView snowtam = (TextView) findViewById(R.id.displaySNOWTAM);

        if (intent != null) {
            snowtam.setText(intent.getStringExtra(EXTRA_OACI));
        }
    }
}
