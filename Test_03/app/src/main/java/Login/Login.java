package Login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import fcmexample.dowellcomputer.test_03.MainActivity;
import fcmexample.dowellcomputer.test_03.R;

public class Login extends AppCompatActivity {

    Button GoMainActivityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        GoMainActivityButton = findViewById(R.id.GOMainActivity);
        GoMainActivityButton.setOnClickListener(GoMainMenu);
    }

    public View.OnClickListener GoMainMenu = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //Intent MainIntent = new Intent(Login.this,MainActivity.class);
            //startActivity(MainIntent);
            Intent MenuHomeIntent = new Intent(Login.this, MainActivity.class);
            startActivity(MenuHomeIntent);
            finish();
        }
    };


    public void SendRegister(View view) {
        Intent RegisterIntent = new Intent(Login.this, Register.class);
        startActivity(RegisterIntent);
    }
}