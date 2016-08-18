package weather.newer.com.servicedemo3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class AppReceiver extends BroadcastReceiver {
    public AppReceiver() {
    }

    /**
     *
     * 自定义的广播接收器
     * @param context   上下文
     * @param intent    意图
     */
    @Override
    public void onReceive(Context context,
                          Intent intent) {
        //收到系统发来的广播
        //主线程

        String action=intent.getAction();
        String msg = "";
        switch (action){
            case Intent.ACTION_POWER_CONNECTED:
                msg="电源连接";
              context.startService(new Intent(context,MyService.class));
                break;
            case Intent.ACTION_POWER_DISCONNECTED:
                msg="电源断开";
                break;
            case Intent.ACTION_BATTERY_LOW:
                msg="低电量";
                break;
            case Intent.ACTION_BATTERY_CHANGED:
                msg="充电";
                break;
            case Intent.ACTION_BATTERY_OKAY:
                msg="电量Ok";
                break;


        }
       Log.d("AppReceiver", msg);
    }
}
