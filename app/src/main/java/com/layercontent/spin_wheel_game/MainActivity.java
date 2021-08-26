package com.layercontent.spin_wheel_game;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

import rubikstudio.library.LuckyWheelView;
import rubikstudio.library.model.LuckyItem;

public class MainActivity extends AppCompatActivity {
    private LuckyWheelView luckyWheelView;
    ArrayList<LuckyItem> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        luckyWheelView = findViewById(R.id.luckywheel);
        arrayList = new ArrayList<>();
        LuckyItem luckyItem1 = new LuckyItem();
        luckyItem1.topText = "100";
        luckyItem1.icon = R.drawable.test1;
        luckyItem1.color = 0xffFFF3E0;
        arrayList.add(luckyItem1);

        LuckyItem luckyItem2 = new LuckyItem();
        luckyItem2.topText = "200";
        luckyItem2.icon = R.drawable.test2;
        luckyItem2.color = 0xffFFE0B2;
        arrayList.add(luckyItem2);

        LuckyItem luckyItem3 = new LuckyItem();
        luckyItem3.topText = "300";
        luckyItem3.icon = R.drawable.test3;
        luckyItem3.color = 0xffFFCC80;
        arrayList.add(luckyItem3);

        //////////////////
        LuckyItem luckyItem4 = new LuckyItem();
        luckyItem4.topText = "400";
        luckyItem4.icon = R.drawable.test4;
        luckyItem4.color = 0xffFFF3E0;
        arrayList.add(luckyItem4);

        LuckyItem luckyItem5 = new LuckyItem();
        luckyItem5.topText = "500";
        luckyItem5.icon = R.drawable.test5;
        luckyItem5.color = 0xffFFE0B2;
        arrayList.add(luckyItem5);

        LuckyItem luckyItem6 = new LuckyItem();
        luckyItem6.topText = "600";
        luckyItem6.icon = R.drawable.test6;
        luckyItem6.color = 0xffFFCC80;
        arrayList.add(luckyItem6);
        //////////////////

        //////////////////////
        LuckyItem luckyItem7 = new LuckyItem();
        luckyItem7.topText = "700";
        luckyItem7.icon = R.drawable.test7;
        luckyItem7.color = 0xffFFF3E0;
        arrayList.add(luckyItem7);

        LuckyItem luckyItem8 = new LuckyItem();
        luckyItem8.topText = "800";
        luckyItem8.icon = R.drawable.test8;
        luckyItem8.color = 0xffFFE0B2;
        arrayList.add(luckyItem8);


        LuckyItem luckyItem9 = new LuckyItem();
        luckyItem9.topText = "900";
        luckyItem9.icon = R.drawable.test9;
        luckyItem9.color = 0xffFFCC80;
        arrayList.add(luckyItem9);
        ////////////////////////

        LuckyItem luckyItem10 = new LuckyItem();
        luckyItem10.topText = "1000";
        luckyItem10.icon = R.drawable.test10;
        luckyItem10.color = 0xffFFE0B2;
        arrayList.add(luckyItem10);

        LuckyItem luckyItem11 = new LuckyItem();
        luckyItem11.topText = "2000";
        luckyItem11.icon = R.drawable.test10;
        luckyItem11.color = 0xffFFEB2;
        arrayList.add(luckyItem11);

        LuckyItem luckyItem12 = new LuckyItem();
        luckyItem12.topText = "3000";
        luckyItem12.icon = R.drawable.test10;
        luckyItem12.color = 0xfFFE0B2;
        arrayList.add(luckyItem12);


        luckyWheelView.setData(arrayList);
        luckyWheelView.setRound(getRandomRound());

        findViewById(R.id.play).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int index = getRandomIndex();
                luckyWheelView.startLuckyWheelWithTargetIndex(index);
            }
        });
        luckyWheelView.setLuckyRoundItemSelectedListener(new LuckyWheelView.LuckyRoundItemSelectedListener() {
            @Override
            public void LuckyRoundItemSelected(int index) {
                Toast.makeText(getApplicationContext(), arrayList.get(index).topText, Toast.LENGTH_SHORT).show();
            }
        });
    }

    private int getRandomRound(){
        Random random=new Random();
        return random.nextInt(10);

    }
    private int getRandomIndex() {
        Random rand = new Random();
        return rand.nextInt(arrayList.size() - 1) + 0;
    }
}