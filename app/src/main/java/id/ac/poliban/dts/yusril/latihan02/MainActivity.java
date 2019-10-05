package id.ac.poliban.dts.yusril.latihan02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btRealMandrid = findViewById(R.id.btRealMadrid);
        Button btBarcelona = findViewById(R.id.btBarcelona);
        Button btLeicester = findViewById(R.id.btLeicester);
        Button btForentina = findViewById(R.id.btForentina);

        btRealMandrid.setOnClickListener(v -> {
            Toast.makeText(this, "Ente Musuh Ana", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "Gue Barcelona Fans Club", Toast.LENGTH_SHORT).show();
        });

        btBarcelona.setOnClickListener(v -> Toast.makeText(this, "ini Barca", Toast.LENGTH_SHORT).show());
        btLeicester.setOnClickListener(v -> Toast.makeText(this, "ini Leicester", Toast.LENGTH_SHORT).show());
        btForentina.setOnClickListener(v -> Toast.makeText(this, "ini Forentina", Toast.LENGTH_SHORT).show());

    }
}