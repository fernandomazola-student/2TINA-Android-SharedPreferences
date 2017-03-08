package br.com.fiap.a2tina_android_sharedpreferences;

import android.content.SharedPreferences;
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
    SharedPreferences sp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUsuario = (EditText)findViewById(R.id.edtusuario);
        edtSenha = (EditText)findViewById(R.id.edtsenha);
        chkSalvar = (CheckBox)findViewById(R.id.chkSalvar);

        //Inicializa o shared preferences no modo privado
        sp = getPreferences(MODE_PRIVATE);

        //Quando inicializar utilizar o shared , para preencher os valores que foram salvos
        edtUsuario.setText(sp.getString("usuario", ""));
        edtSenha.setText(sp.getString("senha", ""));
    }

    public void login(View view) {
        String usuario = edtUsuario.getText().toString();
        String senha = edtSenha.getText().toString();

        if (usuario.trim().equals("fiap") && senha.trim().equals("123")){

            SharedPreferences.Editor e = sp.edit();

            if(chkSalvar.isChecked()){
                //SharedPreferences.Editor e = sp.edit();
                e.putString("usuario", usuario);
                e.putString("senha", senha);
                e.commit();
            }else{
                e.remove("usuario");
                e.remove("senha");
            }
            //Lógica para abrir outra activity
            return;
        }

        Toast.makeText(this, R.string.usuario_incorreto, Toast.LENGTH_SHORT).show();
    }
}
