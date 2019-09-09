package com.example.student.tqp_cau1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText tk,mk;
    CheckBox ckb;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tk = (EditText)findViewById(R.id.editText_tk);
        mk = (EditText)findViewById(R.id.editText_mk);
        ckb = (CheckBox)findViewById(R.id.checkBox_luu);
        btn = (Button)findViewById(R.id.button_submit) ;
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tk.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this,"Khong duoc de trong",Toast.LENGTH_SHORT).show();
                }
                else if(mk.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this,"Khong duoc de trong",Toast.LENGTH_SHORT).show();
                }
                else if(ckb.isChecked())
                {
                    Toast.makeText(MainActivity.this,"Chào mừng bạn đăng nhập hệ thống, thông tin của bạn đã được lưu",Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(MainActivity.this,"Chào mừng bạn đăng nhập hệ thống, thông tin của bạn khong được lưu",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
