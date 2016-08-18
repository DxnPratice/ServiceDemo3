package weather.newer.com.servicedemo3;

import android.app.Application;
import android.content.Intent;

/**
 * Created by windows on 2016/8/17.
 */
public class App  extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //启动服务
       // startService(new Intent(this,MyService.class));
    }
     //终止
    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
