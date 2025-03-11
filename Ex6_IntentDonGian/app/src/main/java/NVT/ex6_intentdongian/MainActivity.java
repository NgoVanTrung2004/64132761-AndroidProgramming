package NVT.ex6_intentdongian;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Button nutMH2;
    private Button nutMH3;

    private void timDieuKhien() {
        nutMH2 = findViewById(R.id.btnMH2);
        nutMH3 = findViewById(R.id.btnMH3);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Tìm điều khiển nút bấm
        timDieuKhien();

        // Gắn bộ lắng nghe sự kiện
        nutMH2.setOnClickListener(view -> {
            // Xử lý chuyển màn hình
            // B1: Tạo một Intent với hai tham số: màn hình hiện tại (this) và màn hình chuyển tới (class)
            Intent intentMH2 = new Intent(MainActivity.this, MH2Activity.class);
            // B2: Gửi Intent
            startActivity(intentMH2);
        });

        nutMH3.setOnClickListener(view -> {
            // Xử lý chuyển màn hình
            Intent intentMH3 = new Intent(MainActivity.this, MH3Activity.class);
            startActivity(intentMH3);
        });

        // Xử lý hệ thống thanh trạng thái (System Bars) với insets
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (view, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            view.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
