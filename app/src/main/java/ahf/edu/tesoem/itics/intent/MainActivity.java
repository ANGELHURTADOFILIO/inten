package ahf.edu.tesoem.itics.intent;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void MenuPrincipal(View view){
        Intent MenuPrincipal = new Intent ( this, SegundoActivity.class);
        startActivity(MenuPrincipal);
    }
}
