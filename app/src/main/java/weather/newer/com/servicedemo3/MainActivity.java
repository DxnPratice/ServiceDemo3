package weather.newer.com.servicedemo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //启动活动

    }
    int i=1;
    public void doStart(View view) {
        Intent intent=new Intent(this,WeatherService.class);
        intent.putExtra("FILE","文件"+i++);
        //启动服务
        startService(intent );
    }
}
