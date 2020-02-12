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
    String Mketqua = "";
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

                Log.d("BBB", textSmax);
                Log.d("BBB", textSmin);

                if (textSmax.isEmpty() || textSmin.isEmpty()) {
                    Toast.makeText(MainActivity.this, " bạn chưa nhập đủ thông tin", Toast.LENGTH_SHORT).show();
                    return;
                }
                int soMax = Integer.parseInt(textSmax);
                int soMin = Integer.parseInt(textSmin);
                if (soMax <= soMin){
                    soMax = soMin + 1;
                    mEdtSomax.setText(soMax + "");
                }
                Random random = new Random();
                int value = random.nextInt(soMax - soMin +1) + soMin;
                Mketqua += value + "-";
                mTvKetqua.setText(Mketqua + "");
            }
        });
    }
}
