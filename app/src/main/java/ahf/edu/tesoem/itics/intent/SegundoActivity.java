package ahf.edu.tesoem.itics.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SegundoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);
    }

    public void Anterior(View view) {
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);
    }

    public void HISTORIA(View view) {
        Intent HISTORIA = new Intent(this, TresActivity.class);
        startActivity(HISTORIA);
    }
    public void Fundador(View view) {
        Intent Fundador = new Intent(this, CuatroActivity.class);
        startActivity(Fundador);
    }
    public void Formas(View view) {
        Intent Formas = new Intent(this, CincoActivity.class);
        startActivity(Formas);
    }
    public void Equipo(View view) {
        Intent Equipo = new Intent(this, SeisActivity.class);
        startActivity(Equipo);
    }
    public void Combate(View view) {
        Intent Combate = new Intent(this, SieteActivity.class);
        startActivity(Combate);
    }
    public void Examenes(View view) {
        Intent Examenes = new Intent(this, OchoActivity.class);
        startActivity(Examenes);
    }
    public void Niveles(View view) {
        Intent Niveles = new Intent(this, NueveActivity.class);
        startActivity(Niveles);
    }
    public void Torneos(View view) {
        Intent Torneos = new Intent(this, DiezActivity.class);
        startActivity(Torneos);
    }
    public void sobre(View view) {
        Intent sobre = new Intent(this, OnceActivity.class);
        startActivity(sobre);
    }
}
