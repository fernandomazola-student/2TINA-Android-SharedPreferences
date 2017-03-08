package br.com.fiap.a2tina_android_sharedpreferences;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

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
        
    }
}
