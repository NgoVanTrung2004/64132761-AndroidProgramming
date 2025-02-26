package com.example.ex3_simplesumapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;

import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        // Gắn layout tương ứng file này
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    // đây là bộ lắng nghe và xử lý sự kiện click lên nút tính tổng
    public void XuLyCong(View view) {
        // tìm, tham chiếu đến điều khiển trên XLT, mapping sang java
       EditText editTextSoA =  findViewById(R.id.edtA);
       EditText editTextSoB =  findViewById(R.id.edtB);
       EditText editTextKetQua =  findViewById(R.id.edtKQ);
       // lấy dữ liệu về ở điều kiện số a
        String strA= editTextSoA.getText().toString();
        // lấy dữ liệu về ở điều kiện số b
        String strB= editTextSoB.getText().toString();

        // chuyển dữ liệu sang dạng số
       int So_A= Integer.parseInt(strA);
       int So_B= Integer.parseInt(strB);

        // tính toán theo yêu cầu
        int tong = So_A + So_B;
        String strTong = String.valueOf(tong);
        // hiện ra màn hình
        editTextKetQua.setText(strTong);
    }
}