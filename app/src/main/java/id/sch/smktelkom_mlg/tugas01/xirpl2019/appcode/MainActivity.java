package id.sch.smktelkom_mlg.tugas01.xirpl2019.appcode;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int pencet = 1;
    int maxpress = 2;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button home = (Button) findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(getApplicationContext(),home.class);
                startActivity(i);
            }
        });
        Button exit = (Button) findViewById(R.id.exit);
        exit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(pencet == maxpress){
                    finishAndRemoveTask();
                }else{
                    Toast.makeText(MainActivity.this, "Press Once Again to Exit", Toast.LENGTH_SHORT).show();
                    pencet++;
                }
            }
        });
    }
}