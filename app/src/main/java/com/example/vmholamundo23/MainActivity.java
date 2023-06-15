package com.example.vmholamundo23;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnEnviar(View view){
        EditText txtnombre = (EditText)findViewById(R.id.txtnombre);
        Toast.makeText(this, "Hola"+" " + txtnombre.getText().toString(), Toast.LENGTH_SHORT).show();
    }
}