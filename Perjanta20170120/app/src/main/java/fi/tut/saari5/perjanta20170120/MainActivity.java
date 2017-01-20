package fi.tut.saari5.perjanta20170120;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE="fi.tut.saari5.perjantai20170120.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage(View view){
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        //ensimmainen teksti
        EditText editText =(EditText)findViewById(R.id.edit_message);
        String message =editText.getText().toString();
        //toinen teksti
        EditText editNameText =(EditText)findViewById(R.id.edit_name);
        String name =editNameText.getText().toString();

        Bundle extraa=new Bundle();
        extraa.putString("EXTRA_VIESTI", message);
        extraa.putString("EXTRA_NIMI", name);
        //intent.putExtra(EXTRA_MESSAGE, message);
        intent.putExtras(extraa);

        startActivity(intent);
    }

    /*
    useampi viesti samma intenttiin
    Intent intent = new Intent(this, MyActivity.class);
Bundle extras = new Bundle();
extras.putString("EXTRA_USERNAME","my_username");
extras.putString("EXTRA_PASSWORD","my_password");
intent.putExtras(extras);
startActivity(intent);

Then in your Activity that your triggering, you can reference these like so:-

Intent intent = getIntent();
Bundle extras = intent.getExtras();
String username_string = extras.getString("EXTRA_USERNAME");
String password_string = extras.getString("EXTRA_PASSWORD");

Or (if you prefer):-

Bundle extras = getIntent().getExtras();
String username_string = extras.getString("EXTRA_USERNAME");
String password_string = extras.getString("EXTRA_PASSWORD");
     */
}
