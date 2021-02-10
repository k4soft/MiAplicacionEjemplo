package co.com.miaplicaciondeejemplo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
   @BindView(R.id.txt_titulo)
   TextView txtTitulo;
   @BindView(R.id.txt_valor)
    EditText txtValor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        txtTitulo.setText(R.string.formulario);

    }


    public void mostrarNotificacion(View view){
        txtValor.setError(null);
        String valor = txtValor.getText().toString();
        if(!"".equals(valor)){
            Toast.makeText(getApplicationContext(),valor,Toast.LENGTH_LONG).show();
        }else{
            txtValor.setError(getString(R.string.requerido));
        }

    }









}