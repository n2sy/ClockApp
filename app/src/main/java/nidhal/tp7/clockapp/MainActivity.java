package nidhal.tp7.clockapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    Switch sw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sw = findViewById(R.id.switch1);
        setTime();
    }

    public void execDate(View v) {
        setTime();
    }

    public void setTime() { // Insertion du fragment
        Fragment f = new FragmentClock();
        Bundle b = new Bundle();
        b.putBoolean("Raouia", sw.isChecked());
        f.setArguments(b);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.frag_layout, f);
        ft.addToBackStack(null);
        ft.commit();

    }
}
