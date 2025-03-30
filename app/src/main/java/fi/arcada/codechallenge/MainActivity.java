package fi.arcada.codechallenge;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Collections;

import android.widget.Button;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button button;
    private ArrayList<Double> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.hiii);
        button = findViewById(R.id.button);

        textView.setText("Min app funkar!");

        list = new ArrayList<>();
        list.add(4.0);
        list.add(16.0);
        list.add(45.0);

        button.setOnClickListener(v -> {
            Double mean = calcMean(list);
            textView.setText("" + mean);
        });
    }

    // Method to calculate the median
    public static Double calcMean(ArrayList<Double> list) {
        double sum = 0.0;
        for (Double num : list) {
            sum += num;
        }
        return sum / list.size();
    }
}