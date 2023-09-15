package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class FourthActivity extends Activity {
    EditText editsearch4;
    Button button4,button44,button5,button6,button7;
    TextView txt,txttime2,txtseoul2,textV,textV2,textV3;
    Integer value2;
    ImageView imageView,imageView2;
    ViewFlipper viewFlipper;

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater mInflater = getMenuInflater();
        if(v == textV2) {
            mInflater.inflate(R.menu.menu1, menu);
        }
        if(v == textV3) {
            mInflater.inflate(R.menu.menu2, menu);
        }
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.item1:
                textV2.setText("국민은행중화동지점");
                return true;
            case R.id.item2:
                textV2.setText("중랑역.동부시장(중)");
                return true;
            case R.id.item3:
                textV2.setText("중랑교(중)");
                return true;
            case R.id.item4:
                textV2.setText("삼육서울병원(중)");
                return true;
            case R.id.item5:
                textV2.setText("시조사삼거리(중)");
                return true;
            case R.id.item6:
                textV2.setText("떡전교사거리.동대문노인복지관(중)");
                return true;
            case R.id.item7:
                textV2.setText("청량리미주상가앞");
                return true;
            case R.id.item11:
                textV3.setText("국민은행중화동지점");
                return true;
            case R.id.item22:
                textV3.setText("중랑역.동부시장(중)");
                return true;
            case R.id.item33:
                textV3.setText("중랑교(중)");
                return true;
            case R.id.item44:
                textV3.setText("삼육서울병원(중)");
                return true;
            case R.id.item55:
                textV3.setText("시조사삼거리(중)");
                return true;
            case R.id.item66:
                textV3.setText("떡전교사거리.동대문노인복지관(중)");
                return true;
            case R.id.item77:
                textV3.setText("청량리미주상가앞");
                return true;
        }
        return super.onContextItemSelected(item);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourth);

        editsearch4 = (EditText)findViewById(R.id.editsearch4);
        textV2 = (TextView) findViewById(R.id.textV2);
        textV3 = (TextView) findViewById(R.id.textV3);
        txt = (TextView)findViewById(R.id.txt);
        txttime2 = (TextView)findViewById(R.id.txttime2);
        txtseoul2 = (TextView)findViewById(R.id.txtseoul2);
        textV = (TextView)findViewById(R.id.textV);
        imageView = (ImageView)findViewById(R.id.imageView);
        imageView2 = (ImageView)findViewById(R.id.imageView2);
        button4 = (Button) findViewById(R.id.button4);
        button44 = (Button) findViewById(R.id.button44);
        button5 = (Button)findViewById(R.id.button5);
        button6 = (Button)findViewById(R.id.button6);
        button7 = (Button)findViewById(R.id.button7);
        viewFlipper = (ViewFlipper) findViewById(R.id.viewFlipper);

        registerForContextMenu(textV2);
        registerForContextMenu(textV3);

        imageView.setImageResource(R.drawable.blue_bus_big);

        button44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textV.setVisibility(View.VISIBLE);
                viewFlipper.setVisibility(View.VISIBLE);
                button44.setVisibility(View.INVISIBLE);
                imageView2.setImageResource(R.drawable.change);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewFlipper.showNext();
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewFlipper.showNext();
            }
        });

        Intent intent = getIntent();
        value2 = intent.getIntExtra("Num2",0);

        editsearch4.setText(value2.toString());

    }
}
