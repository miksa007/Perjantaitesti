package fi.tut.saari5.perjanta20170120;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.TextView;

import static android.R.id.message;


public class DisplayMessageActivity extends AppCompatActivity {
    //Maanantai paivitys

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        Intent intent =getIntent();

        Bundle extrat=intent.getExtras();

        //String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        String message = extrat.getString("EXTRA_VIESTI") + "  "+extrat.getString("EXTRA_NIMI");
        TextView textView=new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_display_message);
        layout.addView(textView);
    }
}
