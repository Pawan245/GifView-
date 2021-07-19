package siya.ram.ji;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.ram.hanumanjetpacklibrery.GifView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        GifView.settext("raw/hanumanji");
        setContentView(R.layout.activity_main);
    }
}