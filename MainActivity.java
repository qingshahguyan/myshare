package com.example.mycomputer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
     private EditText et_show;
    private  Button bt_undo,bt_del, bt_except, bt_Multiply, bt_7,bt_8,bt_9,bt_less,bt_4,bt_5,bt_6,bt_plus,bt_1,bt_2 ,bt_3,bt_0, bt_dot,bt_equal;
    public int flag = 0;  //为判断是加减乘除四种运算中的哪一种设定的标志位
    private String text1 = "0",  //获得输入的第一个数
            text2 = "0";         //获得输入的第二个数
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_show = (EditText) findViewById(R.id.tv1);
        bt_undo= (Button) findViewById(R.id.undo);
        bt_del= (Button) findViewById(R.id.del);
        bt_except= (Button) findViewById(R.id.except);
        bt_Multiply= (Button) findViewById(R.id.Multiply);
        bt_7= (Button) findViewById(R.id.bt_7);
        bt_8= (Button) findViewById(R.id.bt_8);
        bt_9= (Button) findViewById(R.id.bt_9);
        bt_less=(Button) findViewById(R.id.less);
        bt_4= (Button) findViewById(R.id.bt_4);
        bt_5 =(Button) findViewById(R.id.bt_5);
        bt_6= (Button) findViewById(R.id. bt_6);
        bt_plus= (Button) findViewById(R.id.plus);
        bt_1= (Button) findViewById(R.id. bt_1);
        bt_2= (Button) findViewById(R.id.bt_2);
        bt_3= (Button) findViewById(R.id.bt_3);
        bt_0= (Button) findViewById(R.id.bt_0);
        bt_dot= (Button) findViewById(R.id.dot);
        bt_equal= (Button) findViewById(R.id.equal);
        //设置监听器
        bt_1.setOnClickListener( this);
        bt_2.setOnClickListener(this);
        bt_3.setOnClickListener(this);
        bt_4.setOnClickListener(this);
        bt_5.setOnClickListener(this);
        bt_6.setOnClickListener(this);
        bt_7.setOnClickListener(this);
        bt_8.setOnClickListener(this);
        bt_9.setOnClickListener(this);
        bt_0.setOnClickListener(this);
        bt_undo.setOnClickListener(this);
        bt_del.setOnClickListener(this);
        bt_except.setOnClickListener(this);
        bt_Multiply.setOnClickListener(this);
        bt_plus.setOnClickListener(this);
        bt_dot.setOnClickListener(this);
        bt_equal.setOnClickListener(this);
        bt_less.setOnClickListener(this);


    }

    @Override
    public void onClick(View arg0) {
        switch (arg0.getId()) {
            case R.id.bt_0:
                et_show.append("0");
                break;
            case R.id.bt_1:
                et_show.append("1");
                break;
            case R.id.bt_2:
                et_show.append("2");
                break;
            case R.id.bt_3:
                et_show.append("3");
                break;
            case R.id.bt_4:
                et_show.append("4");
                break;
            case R.id.bt_5:
                et_show.append("5");
                break;
            case R.id.bt_6:
                et_show.append("6");
                break;
            case R.id.bt_7:
                et_show.append("7");
                break;
            case R.id.bt_8:
                et_show.append("8");
                break;
            case R.id.bt_9:
                et_show.append("9");
                break;

            case R.id.dot:
                et_show.append(".");
                break;
            case R.id.plus:
                flag = 1;
                text1 = et_show.getText().toString();//得到前面输入的那个数
                et_show.setText("");//setText()  把以前的内容冲掉了，
               // append()在以前的内容后面添加
                break;
            case R.id.less:
                flag = 2;
                text1 = et_show.getText().toString();
                et_show.setText("");
                break;
            case R.id.Multiply:
                flag = 3;
                text1 = et_show.getText().toString();
                et_show.setText("");
                break;
            case R.id.except:
                flag = 4;
                text1 = et_show.getText().toString();
                et_show.setText("");

                break;
            case R.id.equal:
                switch (flag) {
                    case 0:
                        // et_show.setText(text1);
                        et_show.append("0");
                        Log.d("text1", text1);
                        Log.d("text2", text2);
                        break;
                    case 1:
                        text2 = et_show.getText().toString();
                        Double res = Double.parseDouble(text1)
                                + Double.parseDouble(text2);
                        // et_show.setText("flag=1");
                        CharSequence r = res.toString();
                        et_show.setText(res + "");
                        Log.d("text1", text1);
                        Log.d("text2", text2);
                        Log.d("res", res.toString());
                        break;
                    case 2:
                        text2 = et_show.getText().toString();
                        Double res2 = (Double.parseDouble(text1) - Double
                                .parseDouble(text2));
                        CharSequence r2 = res2.toString();
                        et_show.setText(res2 + "");
                        Log.d("text1", text1);
                        Log.d("text2", text2);
                        Log.d("res", res2.toString());
                        // et_show.setText("flag=2");
                        break;
                    case 3:
                        text2 = et_show.getText().toString();
                        Double res3 = Double.parseDouble(text1)
                                * Double.parseDouble(text2);
                        // et_show.setText("flag=3");
                        CharSequence r3 = res3.toString();
                        et_show.setText(res3 + "");
                        Log.d("text1", text1);
                        Log.d("text2", text2);
                        Log.d("res", res3.toString());
                        break;
                    case 4:
                        text2 = et_show.getText().toString();
                        Double res4 = Double.parseDouble(text1)
                                / Double.parseDouble(text2);
                        // et_show.setText("flag=4");
                        CharSequence r4 = res4.toString();
                        et_show.setText(res4 + "");
                        Log.d("text1", text1);
                        Log.d("text2", text2);
                        Log.d("res", res4.toString());
                        break;

                    default:
                        break;
                }
                break;
            case R.id.undo:
                flag = 0;
                text1 = "0";
                text2 = "0";
                et_show.setText("");
                break;
            default:
                break;
        }
    }
}
