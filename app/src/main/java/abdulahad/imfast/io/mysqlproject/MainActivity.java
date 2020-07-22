package abdulahad.imfast.io.mysqlproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText NameEdit, PassEdit;
    Button LogIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NameEdit = (EditText) findViewById(R.id.etUserName);
        PassEdit = (EditText) findViewById(R.id.etPassword);
        LogIn = (Button) findViewById(R.id.btnlogin);

    }

    public void btnlogin(View view) {

        String username = NameEdit.getText().toString();
        String password = PassEdit.getText().toString();
        String type = "login";

        BackgroundTask backgroundTask = new BackgroundTask(this);
        backgroundTask.execute(type, username, password);


    }
}