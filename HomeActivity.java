package com.vd.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    TextView input,output;
    float val1=0;
    int val2index;
    Boolean add,sub,mul,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
        Button btn00,btndot,btnclr,btnper,btnbs,btnadd,btnsub,btndiv,btnmul,btnequ;

        btn0=findViewById(R.id.btn0);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btn00=findViewById(R.id.btn00);
        btnclr=findViewById(R.id.btnclr);
        btnper=findViewById(R.id.btnper);
        btnbs=findViewById(R.id.btnbs);
        btndot=findViewById(R.id.btndot);
        btnadd=findViewById(R.id.btnadd);
        btnsub=findViewById(R.id.btnsub);
        btnmul=findViewById(R.id.btnmul);
        btndiv=findViewById(R.id.btndiv);
        btnequ=findViewById(R.id.btnequ);

        input=findViewById(R.id.inputtxt);
        output=findViewById(R.id.outputtxt);






        btnclr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText("");
                output.setText("");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //value = input.getText().toString();
                input.setText(input.getText().toString()+"0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //value = input.getText().toString();
                input.setText(input.getText().toString()+ "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  value = input.getText().toString();
                input.setText(input.getText().toString() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // value[0] = input.getText().toString();
                input.setText(input.getText().toString() + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // value[0] = input.getText().toString();
                input.setText(input.getText().toString() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             //   value[0] = input.getText().toString();
                input.setText(input.getText().toString() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  value[0] = input.getText().toString();
                input.setText(input.getText().toString() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  value[0] = input.getText().toString();
                input.setText(input.getText().toString() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             //   value[0] = input.getText().toString();
                input.setText(input.getText().toString() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             //   value[0] = input.getText().toString();
                input.setText(input.getText().toString() + "9");
            }
        });

        btn00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  value[0] = input.getText().toString();
                input.setText(input.getText().toString() + "00");
            }
        });

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = input.getText().toString();
                val2index=s.length() + 1;
                val1 = Float.parseFloat(s);
                input.append("+");
                add=true;
            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = input.getText().toString();
                val2index=s.length() + 1;
                val1 = Float.parseFloat(s);
                input.append("-");
                sub = true;
            }
        });

        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = input.getText().toString();
                val2index=input.length() + 1;
                val1 = Float.parseFloat(s);
                input.append("×");
                mul = true;
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = input.getText().toString();
                val2index=input.length() + 1;
                val1 = Float.parseFloat(s);
                input.append("÷");
                div = true;
            }
        });

        btnbs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             //   value[0] = input.getText().toString();
                String s = input.getText().toString();
                if(s.length() != 0)
                    input.setText(s.substring(0,s.length()-1));
            }
        });

        btnper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText().toString() + "%");
            }
        });

        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText().toString() + ".");
            }
        });

        btnequ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(add==true){
                    String s= input.getText().toString();
                    String num2=s.substring(val2index,s.length());
                    float val2 = Float.parseFloat(num2);
                    val2 += val1;
                    output.setText(String.valueOf(val2));
                    add=false;
                    s=null;
                    num2=null;
//                    val2= Float.parseFloat(null);
                }
                else if(sub==true){
                    String s= input.getText().toString();
                    String num2=s.substring(val2index,s.length());
                    float val2 = Float.parseFloat(num2);
                    val2 = val1-val2;
                    output.setText(String.valueOf(val2));
                    sub=false;
                    s=null;
                    num2=null;
                }
                else if(mul==true){
                    String s= input.getText().toString();
                    String num2=s.substring(val2index,s.length());
                    float val2 = Float.parseFloat(num2);
                    val2 *= val1;
                    output.setText(String.valueOf(val2));
                    mul=false;
                    s=null;
                    num2=null;
                }
                else if(div==true){
                    String s= input.getText().toString();
                    String num2=s.substring(val2index,s.length());
                    float val2 = Float.parseFloat(num2);
                    val2 = val1/val2;
                    output.setText(String.valueOf(val2));
                    div=false;
                    s=null;
                    num2=null;
                }


                String out = output.getText().toString();
                if(out.endsWith(".0"))
                    output.setText(out.substring(0,out.length()-2));
            }
        });
    }
}