package com.linhtran.vnua.truyenthamsogiuahaimanhinh;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MaHinh2 extends AppCompatActivity {
    TextView txtHoten;
    Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ma_hinh2);
        txtHoten=(TextView)findViewById(R.id.txtHoten);
        btnBack=(Button) findViewById(R.id.btnBack);

            btnBack.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent mh1 = new Intent(MaHinh2.this, MainActivity.class);
                    startActivity(mh1);
                }
            });

            Bundle bd = getIntent().getExtras();
            if (bd != null) {
                String ten = bd.getString("hoten");
                txtHoten.setText(ten);
            }
    }

}
