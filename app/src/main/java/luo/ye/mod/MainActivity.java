package luo.ye.mod;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
private TextView xtNum;
private TextView xueLian;
//private String [] xl;
    String TAG = "tag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        xtNum = findViewById(R.id.xt_num);
//        xl = getResources().getStringArray(R.array.My_xl);
        xueLian = findViewById(R.id.xueLian);
//xueLian.setOnClickListener(this::DianJi);

        xueLian.setOnClickListener(this::DianJi);
    }




    public void DianJi(View view) {
        Toast.makeText(this,"已设置为100",Toast.LENGTH_SHORT).show();
        xtNum.setTextSize(100);
        xtNum.setTextColor(getResources().getColor(R.color.yellow));
        xtNum.setText("100");
    }

    public void Change(View view) {
        Random random = new Random();
//        随机数字
        int number = random.nextInt(100)+1;
        //放的是第number位的句子，命名为PutStr
        String PutStr = ""+number;
        //把文本放进去，PutStr = 文本
        xtNum.setText(PutStr);
        Log.d(TAG, "--------------"+number);
        xtNum.setTextSize(number);
    }


}