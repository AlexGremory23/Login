package autonoma.com.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtIngNombre, txtIngApellido;

    Button btnIngresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtIngNombre = (EditText) findViewById(R.id.txtIngNombre);
        txtIngApellido = (EditText) findViewById(R.id.txtIngApellido);

        btnIngresar =(Button)findViewById(R.id.btnIngresar);

        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ingre();

            }
        });
    }
    public void Ingre(){
        if(txtIngNombre.getText().toString().isEmpty()){
            Toast.makeText(this,"campo Nombre vacio", Toast.LENGTH_LONG).show();
        }else{
            if(txtIngApellido.getText().toString().isEmpty()){
                Toast.makeText(this,"campo Apellido vacio", Toast.LENGTH_LONG).show();
            }
        }
        if (txtIngNombre.getText().toString().equals("Alexander")&& txtIngApellido.getText().toString().equals("Aguilar"))
        {
            Toast.makeText(this,"Ingreso corractamente",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, Menu.class);
            startActivity(intent);
        }else{
            Toast.makeText(this,"No ingreso",Toast.LENGTH_SHORT).show();
        }
    }
}
