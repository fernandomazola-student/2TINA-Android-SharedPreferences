package br.com.fiap.a2tina_android_sharedpreferences;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtUsuario;
    EditText edtSenha;
    CheckBox chkSalvar;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUsuario = (EditText)findViewById(R.id.edtusuario);
        edtSenha = (EditText)findViewById(R.id.edtsenha);
        chkSalvar = (CheckBox)findViewById(R.id.chkSalvar);
    }

    public void login(View view) {
        String usuario = edtUsuario.getText().toString();
        String senha = edtSenha.getText().toString();

        if (usuario.trim().equals("fiap") && senha.trim().equals("123")){
            if(chkSalvar.isChecked()){

            }
            //Lógica para abrir outra activity
            return;
        }

        Toast.makeText(this, R.string.usuario_incorreto, Toast.LENGTH_SHORT).show();
    }
}
