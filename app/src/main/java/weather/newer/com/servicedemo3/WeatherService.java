package weather.newer.com.servicedemo3;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

/**
 * 节能，当任务完成后，会自动销毁，所以生命周期比较短）
 * 带有意图的服务（自带线程）
 */

public class WeatherService extends IntentService {
    private static final String TAG ="IntentService" ;

    /**
     *
     * 创建服务
     */
    public WeatherService() {
        super("WeatherService ");
        Log.d(TAG, "WeatherService ");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate："+Thread.currentThread().getName());
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG, "onStartCommand："+Thread.currentThread().getName());
        return super.onStartCommand(intent, flags, startId);

    }

    @Override

    protected void onHandleIntent(Intent intent) {
        Log.d(TAG, "onHandleIntent："+Thread.currentThread().getName());
        String file=intent.getStringExtra("FILE");
        //模拟文件的下载
        Log.d(TAG,"下载开始"+file);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Log.d(TAG,"下载完成"+file);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy："+Thread.currentThread().getName());

    }
}
