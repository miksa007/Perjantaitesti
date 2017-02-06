package fi.tut.saari5.perjanta20170120;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.sql.Timestamp;


public class MainActivity extends AppCompatActivity {

    public final static String TAG = "LaskukoneEsimerkki";

    // Uusi kommentti
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void summaLasku(View view) {
        Log.d(TAG, "Laske-nappulaa painettiin");
        EditText editTextNumero1 = (EditText) findViewById(R.id.numero1);
        EditText editTextNumero2 = (EditText) findViewById(R.id.numero2);
        EditText editTextTulos = (EditText) findViewById(R.id.tulos);

        //luetaan arvo ruudusta
        String arvo1 = editTextNumero1.getText().toString();
        //muunnetaan arvo kokonaisluvuksi
        int luku1 = Integer.parseInt(arvo1);

        //ja toiselle luvulle sama
        int luku2 = Integer.parseInt(editTextNumero2.getText().toString());

        Log.d(TAG, "numero1=" + luku1 + " ja numero2=" + luku2);
        int tulos = luku1 + luku2;

        //kirjoitetaan luku1 nayttoon
        editTextTulos.setText("" + tulos);
    }

    public void kirjoitaTiedostoon(View view) {
        //https://developer.android.com/training/basics/data-storage/files.html#WriteInternalStorage
        Log.d(TAG, "kirjoitus");
        String filename = "myfile";
        String string = "Hello world!\n";
        //https://www.mkyong.com/java/how-to-get-current-timestamps-in-java/
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        FileOutputStream outputStream;

        try {
            outputStream = openFileOutput(filename, Context.MODE_PRIVATE);
            outputStream.write(string.getBytes());
            outputStream.write(timestamp.toString().getBytes());
            outputStream.close();
            Log.d(TAG, "kirjoitus onnistui");
        } catch (Exception e) {
            e.printStackTrace();
            Log.d(TAG, "kirjoitus ei onnistunut");
        }
    }
    public void lueTiedostosta(View view) {
        //http://stackoverflow.com/questions/14768191/how-do-i-read-the-file-content-from-the-internal-storage-android-app
        String filename = "myfile";
        FileInputStream fis;
        StringBuilder sb=new StringBuilder("moi");
        try {
            fis=openFileInput(filename);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader bufferedReader = new BufferedReader(isr);
            sb = new StringBuilder();
            String line;
            while((line=bufferedReader.readLine())!=null)

            {
                sb.append(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
            Log.d(TAG, "Luku ei onnistunut");
        }
        String rivi=sb.toString();
        Log.d(TAG, rivi);
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause() - metodia kutsuttiin");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart() - metodia kutsuttiin");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart() - metodia kutsuttiin");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume() - metodia kutsuttiin");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop() - metodia kutsuttiin");

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy() - metodia kutsuttiin");
    }
}

















