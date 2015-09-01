package utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;

import java.net.HttpURLConnection;

/**
 * Created by we on 9/1/15.
 */
public class SplashCheck {
    public static String getVersionName (Context context) {
        PackageManager pm = context.getPackageManager();
        try {
            PackageInfo packageInfo = pm.getPackageInfo(context.getPackageName(), 0);
            String versionName = packageInfo.versionName;
            return versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();

            Log.d("packageerror", "包名不对");
        }
        return "1.0";
    }
//联网查询版本号
   public static String getNewVersionInfo(){
//       HttpURLConnection connection=new
       return "";
   }



}
