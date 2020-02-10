package khoanguyen.com.random;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText mEdtSomin, mEdtSomax;
    Button mBtnRandom;
    TextView mTvKetqua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       mEdtSomax = findViewById(R.id.editSomax);
       mEdtSomin = findViewById(R.id.editSomin);
       mBtnRandom = findViewById(R.id.btnRandom);
       mTvKetqua = findViewById(R.id.tvKetqua);
        // Task 1 : Kiểm tra có dữ liệu trong 2 Edittext hay không
        // Task 2 : Nếu số max < số min , số max = smin + 1;
        // Task 3 : Click button random trả về số trong khoản min và max
        // Task 4 : Nối chuỗi dữ liệu các giá trị random (5 - 3 - 2 - 1 -)
        mBtnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textSmin = mEdtSomin.getText().toString();
                String textSmax = mEdtSomax.getText().toString();

                Log.d("BBB",textSmax);
                Log.d("BBB",textSmin);
            }
        });
    }
}
