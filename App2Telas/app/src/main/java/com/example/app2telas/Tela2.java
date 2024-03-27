package com.example.app2telas;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Tela2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
        ObterDados();
    }

    Usuario user2;
    public void ObterDados()
    {
        Intent obterDadosTela1 = getIntent();
        user2 = (Usuario)obterDadosTela1.getSerializableExtra("objeto");
        TextView campoNomeT2, campoCpfT2, campoEmailT2, campoSenhaT2;
        campoNomeT2 = findViewById(R.id.nomeT2);
        campoCpfT2 = findViewById(R.id.cpfT2);
        campoEmailT2 = findViewById(R.id.emailT2);
        campoSenhaT2 = findViewById(R.id.senhaT2);

        campoNomeT2.setText("Nome: "+user2.getNome());
        campoCpfT2.setText("CPF: "+user2.getCpf());
        campoEmailT2.setText("Email: "+user2.getEmail());
        campoSenhaT2.setText("Senha: "+user2.getSenha());
    }

    public void Voltar (View view)
    {
        Intent mudarParaTela1 = new Intent(getApplicationContext(), MainActivity.class);
        mudarParaTela1.putExtra("objetoT2", user2);
        startActivity(mudarParaTela1);
    }

    public void Confirmar(View view)
    {
        AlertDialog.Builder confirmarDados = new AlertDialog.Builder(Tela2.this);
        confirmarDados.setTitle("Cadastro Concluído");
        confirmarDados.setMessage("Obrigado pelo seu cadastro!");
        confirmarDados.create().show();
    }
}