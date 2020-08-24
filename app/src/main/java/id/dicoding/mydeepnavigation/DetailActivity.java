package id.dicoding.mydeepnavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView tvTitle, tvMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvTitle = findViewById(R.id.tv_title);
        tvMessage = findViewById(R.id.tv_message);

        String title = getIntent().getStringExtra("title");
        String message = getIntent().getStringExtra("message");

        tvTitle.setText(title);
        tvMessage.setText(message);
    }
}