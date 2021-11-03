package SignInSignUp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.pinterest.R;

public class SignupLayout4Activity extends AppCompatActivity {

    private Button btn_Next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_layout4);
        btn_Next = (Button) findViewById(R.id.btn_hoantat);
        btn_Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignupLayout4Activity.this, SignupLayout5Activity.class);
                startActivity(intent);
            }
        });
    }
}