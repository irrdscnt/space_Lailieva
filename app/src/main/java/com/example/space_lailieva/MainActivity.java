package com.example.space_lailieva;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.example.space_lailieva.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

    }
    public void onWriteWishClicked(View view) {
        binding.editTextWish.setVisibility(View.VISIBLE);
        binding.buttonSend.setVisibility(View.VISIBLE);
    }

    public void onSendWishClicked(View view) {
        String wishText = binding.editTextWish.getText().toString();

        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, wishText);
        sendIntent.setType("text/plain");

        Intent shareIntent = Intent.createChooser(sendIntent, "Send wish to an astronaut");
        startActivity(shareIntent);
    }
}
