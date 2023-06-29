package org.matematicasfacil.disenobotones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import com.google.android.material.snackbar.Snackbar;
import org.matematicasfacil.disenobotones.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(binding.getRoot());

        binding.btnAvion.setOnClickListener(v -> Snackbar.make(view, "Modo avión Activado", Snackbar.LENGTH_LONG).show());
        binding.btnGaleria.setOnClickListener(v -> Snackbar.make(view, "Imagen guardada en galería", Snackbar.LENGTH_LONG).show());
        binding.btnCompletado.setOnClickListener(v -> Snackbar.make(view, "Nivel 4 completado", Snackbar.LENGTH_LONG).show());
        binding.btnPerfil.setOnClickListener(v -> Snackbar.make(view, "Actualizar perfi", Snackbar.LENGTH_LONG).show());
        binding.btnDesbloqueo.setOnClickListener(v -> Snackbar.make(view, "Nivel 5 desbloqueado", Snackbar.LENGTH_LONG).show());
        binding.btnMusica.setOnClickListener(v -> Snackbar.make(view,"Música pausada", Snackbar.LENGTH_LONG).show());
    }
}