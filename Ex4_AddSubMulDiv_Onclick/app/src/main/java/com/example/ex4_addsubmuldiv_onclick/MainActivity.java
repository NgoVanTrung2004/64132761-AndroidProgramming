package com.example.ex4_addsubmuldiv_onclick;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    //khai báo các đối tượng gắn vs dkhien tương ứng ở đây
    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextKQ;
    Button nutCong,nutTru,nutNhan,nutChia;
    void TimDieuKhien() {
        EditText editTextSo1 = (EditText)findViewById(R.id.edtSo1);
        EditText editTextSo2 = (EditText)findViewById(R.id.edtSo2);
        EditText editTextKQ = (EditText)findViewById(R.id.edtKetQua);
        nutCong = (Button) findViewById(R.id.btnCong);
        nutTru = (Button) findViewById(R.id.btnTru);
        nutNhan = (Button) findViewById(R.id.btnNhan);
        nutChia = (Button) findViewById(R.id.btnChia);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }


    // xử lý cộng
    void XuLyCong(View v) {
        // Cac bước xử lý cộng
        //b1 lấy dữ liệu 2 số
        //b1.1 tìm editText số 1 và 2
          //b1.2 lấy dữ lieeujtuwf 2 đkhiển đó

       String soThu1 =  editTextSo1.getText().toString();
        String soThu2 =  editTextSo2.getText().toString();
        //b1.3 chuyển dữ liệu từ chuỗi sang số
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);

        // b2 tính toán
        float Tong = soA + soB;
        // b3 hiện kết quả
        //b3.1
          //b3.2 chuẩn bị dữ liệu xuất, biến thành dạng chuỗi
        String chuoiKQ = String.valueOf(Tong);
        //b3.3 gắn KQ lên dkhien
        editTextKQ.setText(chuoiKQ);

    }

    // xử lý trừ
    void XuLyTru(View v) {
        // Cac bước xử lý trừ
        //b1 lấy dữ liệu 2 số
        //b1.1 tìm editText số 1 và 2

        //b1.2 lấy dữ lieeujtuwf 2 đkhiển đó

        String soThu1 =  editTextSo1.getText().toString();
        String soThu2 =  editTextSo2.getText().toString();
        //b1.3 chuyển dữ liệu từ chuỗi sang số
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);

        // b2 tính toán
        float Tong = soA - soB;
        // b3 hiện kết quả
        //b3.1

        //b3.2 chuẩn bị dữ liệu xuất, biến thành dạng chuỗi
        String chuoiKQ = String.valueOf(Tong);
        //b3.3 gắn KQ lên dkhien
        editTextKQ.setText(chuoiKQ);
    }

    // xử lý nhân
    void XuLyNhan(View v) {
        // Cac bước xử lý nhân
        //b1 lấy dữ liệu 2 số
        //b1.1 tìm editText số 1 và 2
       //b1.2 lấy dữ lieeujtuwf 2 đkhiển đó

        String soThu1 =  editTextSo1.getText().toString();
        String soThu2 =  editTextSo2.getText().toString();
        //b1.3 chuyển dữ liệu từ chuỗi sang số
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);

        // b2 tính toán
        float Tong = soA * soB;
        // b3 hiện kết quả
        //b3.1
          //b3.2 chuẩn bị dữ liệu xuất, biến thành dạng chuỗi
        String chuoiKQ = String.valueOf(Tong);
        //b3.3 gắn KQ lên dkhien
        editTextKQ.setText(chuoiKQ);
    }

    // xử lý chia
    void XuLyChia(View v) {
        // Cac bước xử lý chua
        //b1 lấy dữ liệu 2 số
        //b1.1 tìm editText số 1 và 2
          //b1.2 lấy dữ lieeujtuwf 2 đkhiển đó

        String soThu1 =  editTextSo1.getText().toString();
        String soThu2 =  editTextSo2.getText().toString();
        //b1.3 chuyển dữ liệu từ chuỗi sang số
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);

        // b2 tính toán
        float Tong = soA / soB;
        // b3 hiện kết quả
        //b3.1
          //b3.2 chuẩn bị dữ liệu xuất, biến thành dạng chuỗi
        String chuoiKQ = String.valueOf(Tong);
        //b3.3 gắn KQ lên dkhien
        editTextKQ.setText(chuoiKQ);
    }
}