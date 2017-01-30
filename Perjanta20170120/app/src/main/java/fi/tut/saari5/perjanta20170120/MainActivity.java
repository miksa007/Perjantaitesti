package fi.tut.saari5.perjanta20170120;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public final static String TAG="LaskukoneEsimerkki";
    // Uusi kommentti
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void summaLasku(View view){
        Log.d(TAG, "Laske-nappulaa painettiin");
        EditText editTextNumero1 =(EditText)findViewById(R.id.numero1);
        EditText editTextNumero2 =(EditText)findViewById(R.id.numero2);
        EditText editTextTulos =(EditText)findViewById(R.id.tulos);

        //luetaan arvo ruudusta
        String arvo1=editTextNumero1.getText().toString();
        //muunnetaan arvo kokonaisluvuksi
        int luku1=Integer.parseInt(arvo1);

        Log.d(TAG, "numero1="+luku1);

        //kirjoitetaan luku1 nayttoon
        editTextTulos.setText(""+luku1);


    }
}
