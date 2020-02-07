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
        Random random = new Random();
        for ( int i =0; i<100; i++){
            // công thức hàm random ( max-min+1) + min)
        int value =75 +(random.nextInt(133-75+1));
        Log.d ("BBB", value+ "");}
        // dấu + có 2 chức năng nếu cùng kiểu dự liệu số sẽ là cộng
        // nếu đg trong 1 string sẽ là phép nối chuõi
        // cách 2 : Math
//        for ( int i = 0; i<100 ; i++){
//        double numberRandom = (Math.random()*4)+5;
////        Log.d ("BBB", String.valueOf(numberRandom));
//        long value = Math.round(numberRandom);
//        Log.d ("BBB", String.valueOf(value));}
        // 1/ phím tắt hỗ trợ fix lỗi : alt + enter
        // 2/ Xem cách fix tren stackoverload
        // 3/ coi document của object

    }
}
