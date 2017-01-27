package fi.tut.saari5.perjanta20170120;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE="fi.tut.saari5.perjantai20170120.MESSAGE";
    final String LOG_CAT=MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(LOG_CAT, "Ohjelma käynnistyy");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void laskeOnClick(View view){
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText_arvo1 =(EditText)findViewById(R.id.edit_arvo1);
        EditText editText_arvo2 =(EditText)findViewById(R.id.edit_arvo2);

        String message1 =editText_arvo1.getText().toString();
        String message2 =editText_arvo2.getText().toString();

        int luku=Integer.parseInt(message1)+Integer.parseInt(message2);

        TextView tulos=(TextView)findViewById(R.id.textView_tulos);
        Log.d(LOG_CAT, "Summa on "+luku);
        tulos.setText(""+luku);
    }
}
