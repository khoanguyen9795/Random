package khoanguyen.com.random;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // cách 1 : Dùng lớp random
//        Random random = new Random();

        // cách 2 : Math
        double numberRandom = Math.random();
        Log.d ("BBB", String.valueOf(numberRandom));
        long value = Math.round(numberRandom);
        Log.d ("BBB", String.valueOf(value));
        // 1/ phím tắt hỗ trợ fix lỗi : alt + enter
        // 2/ Xem cách fix tren stackoverload
        // 3/ coi document của object

    }
}
