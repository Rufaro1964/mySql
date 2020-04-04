package android.example.mysql;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
 EditText UsernameEt,PasswordET;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UsernameEt =(EditText) findViewById(R.id.etusername);
        PasswordET=(EditText) findViewById(R.id.etpassword);
    }
    public void onLogin(View view){
        String username=UsernameEt.getText().toString();
        String password=PasswordET.getText().toString();
        String type="login";
        BackgroundWorker backgroundWorker=new BackgroundWorker(this);
        backgroundWorker.execute(type,username,password);
    }
}
