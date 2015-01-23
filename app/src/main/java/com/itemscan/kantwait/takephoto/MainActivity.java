package com.itemscan.kantwait.takephoto;


 import android.app.Activity;
 import android.content.Intent;
 import android.os.Bundle;
 import android.view.View;
 import android.view.View.OnClickListener;
 import android.widget.Button;

/**
 * 最简单的页面的跳转的实现
 *
 * @author Administrator
 *
 */
public class MainActivity extends Activity {
    private Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 获取Button按钮
        button = (Button) findViewById(R.id.button);
        // 添加Button事件，当点击此按钮，进行页面的跳转
        button.setOnClickListener(listener);
    }

    private OnClickListener listener = new OnClickListener() {

        @Override
        public void onClick(View v) {
            // 创建Intent对象
            Intent intent = new Intent();
            // 设置要跳转的页面
            intent.setClass(MainActivity.this, CameraOn.class);
            // 开始Activity
            startActivity(intent);
        }
    };
}
