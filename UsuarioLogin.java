package com.example.conectacastellon;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.conectacastellon.databinding.LoginBinding;

public class UsuarioLogin extends AppCompatActivity {

    ImageView logo;
    LinearLayout layout;
    EditText editUsuario;
    EditText editPassword;
    Button IniciaSesion;
    Button Registrarse;
    Button EntrarSinRegistrar;

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        LoginBinding binding=LoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());






    }
}
