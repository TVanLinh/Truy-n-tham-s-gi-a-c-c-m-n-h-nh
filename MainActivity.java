package com.linhtran.vnua.truyenthamsogiuahaimanhinh;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edtHoten;
    Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtHoten=(EditText)findViewById(R.id.edtHoten);
        btnSend=(Button)findViewById(R.id.btnSend);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mh2=new Intent(MainActivity.this,MaHinh2.class);
                mh2.putExtra("hoten",edtHoten.getText().toString());
                startActivity(mh2);
            }
        });
    }
}
