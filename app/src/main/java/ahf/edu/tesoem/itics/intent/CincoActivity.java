package ahf.edu.tesoem.itics.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CincoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cinco);
    }

    public void Anterior (View view) {
        Intent anterior = new Intent(this, SegundoActivity.class);
        startActivity(anterior);
    }
}