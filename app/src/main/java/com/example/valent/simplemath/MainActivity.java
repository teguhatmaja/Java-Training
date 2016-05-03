package com.example.valent.simplemath;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnclear, btnhitung, btn0, btn1, btn2, btn3, btn4, btn5, btn6,btn7, btn8, btn9, btndelete;
    public EditText etincome, etoutcome;
    private TextView tvbalance;
    String evalue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init(){
        btnclear = (Button)findViewById(R.id.btn_clear);
        btnhitung = (Button)findViewById(R.id.btn_hitung);
        btn0 = (Button)findViewById(R.id.btn_0);
        btn1 = (Button)findViewById(R.id.btn_1);
        btn2 = (Button)findViewById(R.id.btn_2);
        btn3 = (Button)findViewById(R.id.btn_3);
        btn4 = (Button)findViewById(R.id.btn_4);
        btn5 = (Button)findViewById(R.id.btn_5);
        btn6 = (Button)findViewById(R.id.btn_6);
        btn7 = (Button)findViewById(R.id.btn_7);
        btn8 = (Button)findViewById(R.id.btn_8);
        btn9 = (Button)findViewById(R.id.btn_9);
        btndelete = (Button)findViewById(R.id.btn_delete);
        etincome = (EditText)findViewById(R.id.et_income);
        etoutcome = (EditText)findViewById(R.id.et_outcome);
        tvbalance = (TextView)findViewById(R.id.tv_balance);

        btnclear.setOnClickListener(this);
        btnhitung.setOnClickListener(this);
        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btndelete.setOnClickListener(this);

        etincome.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                evalue="1";
                return false;
            }
        });
        etoutcome.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                evalue="2";
                return false;
            }
        });

    }

    public void onClick(View view) {
        String angka1 = etincome.getText().toString();
        String angka2 = etoutcome.getText().toString();
        switch (view.getId()) {
            case R.id.btn_hitung:
                int hitung = Integer.parseInt(angka1) - Integer.parseInt(angka2);
                tvbalance.setText(String.valueOf(hitung));
                break;
            case R.id.btn_clear:
                etincome.setText(null);
                etoutcome.setText(null);
                tvbalance.setText(null);
                break;
            case R.id.btn_0:
                if (evalue=="1"){
                    etincome.setText(etincome.getText().insert(etincome.getText().length(), "0"));
                }
                if (evalue=="2"){
                    etoutcome.setText(etoutcome.getText().insert(etoutcome.getText().length(), "0"));
                }
                break;
            case R.id.btn_1:
                if (evalue=="1"){
                    etincome.setText(etincome.getText().insert(etincome.getText().length(), "1"));
                }
                if (evalue=="2"){
                    etoutcome.setText(etoutcome.getText().insert(etoutcome.getText().length(), "1"));
                }
                break;
            case R.id.btn_2:
                if (evalue=="1"){
                    etincome.setText(etincome.getText().insert(etincome.getText().length(), "2"));
                }
                if (evalue=="2"){
                    etoutcome.setText(etoutcome.getText().insert(etoutcome.getText().length(), "2"));
                }
                break;
            case R.id.btn_3:
                if (evalue=="1"){
                    etincome.setText(etincome.getText().insert(etincome.getText().length(), "3"));
                }
                if (evalue=="2"){
                    etoutcome.setText(etoutcome.getText().insert(etoutcome.getText().length(), "3"));
                }
                break;
            case R.id.btn_4:
                if (evalue=="1"){
                    etincome.setText(etincome.getText().insert(etincome.getText().length(), "4"));
                }
                if (evalue=="2"){
                    etoutcome.setText(etoutcome.getText().insert(etoutcome.getText().length(), "4"));
                }
                break;
            case R.id.btn_5:
                if (evalue=="1"){
                    etincome.setText(etincome.getText().insert(etincome.getText().length(), "5"));
                }
                if (evalue=="2"){
                    etoutcome.setText(etoutcome.getText().insert(etoutcome.getText().length(), "5"));
                }
                break;
            case R.id.btn_6:
                if (evalue=="1"){
                    etincome.setText(etincome.getText().insert(etincome.getText().length(), "6"));
                }
                if (evalue=="2"){
                    etoutcome.setText(etoutcome.getText().insert(etoutcome.getText().length(), "6"));
                }
                break;
            case R.id.btn_7:
                if (evalue=="1"){
                    etincome.setText(etincome.getText().insert(etincome.getText().length(), "7"));
                }
                if (evalue=="2"){
                    etoutcome.setText(etoutcome.getText().insert(etoutcome.getText().length(), "7"));
                }
                break;
            case R.id.btn_8:
                if (evalue=="1"){
                    etincome.setText(etincome.getText().insert(etincome.getText().length(), "8"));
                }
                if (evalue=="2"){
                    etoutcome.setText(etoutcome.getText().insert(etoutcome.getText().length(), "8"));
                }
                break;
            case R.id.btn_9:
                if (evalue=="1"){
                    etincome.setText(etincome.getText().insert(etincome.getText().length(), "9"));
                }
                if (evalue=="2"){
                    etoutcome.setText(etoutcome.getText().insert(etoutcome.getText().length(), "9"));
                }
                break;
            case R.id.btn_delete:
                if (evalue=="1"){
                    etincome.setText(etincome.getText().delete(etincome.getText().length()-1, etincome.getText().length()));
                }
                if (evalue=="2"){
                    etoutcome.setText(etoutcome.getText().delete(etoutcome.getText().length()-1, etoutcome.getText().length()));
                }
                break;

        }
    }


}
