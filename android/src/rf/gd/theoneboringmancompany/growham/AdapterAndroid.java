package rf.gd.theoneboringmancompany.growham;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.os.Build;

import rf.gd.theoneboringmancompany.growham.tools.interfaces.NotificationHandler;


public class AdapterAndroid implements NotificationHandler {

    private Activity gameActivity;

    public AdapterAndroid(Activity gameActivity) {
        this.gameActivity = gameActivity;
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void showNotification(String title, String text) {

        Intent notificationIntent = new Intent(gameActivity, AdapterAndroid.class);
        notificationIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);

        PendingIntent contentIntent = PendingIntent.getActivity(gameActivity,
                0, notificationIntent,
                PendingIntent.FLAG_CANCEL_CURRENT);

        NotificationManager nm = (NotificationManager) gameActivity
                .getSystemService(Context.NOTIFICATION_SERVICE);

        Resources res = gameActivity.getResources();
        Notification.Builder builder = new Notification.Builder(gameActivity);

        builder.setContentIntent(contentIntent)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setLargeIcon(BitmapFactory.decodeResource(res, R.mipmap.ic_launcher))
                .setWhen(System.currentTimeMillis())
                .setAutoCancel(true)
                .setContentTitle(title)
                .setContentText(text);
        Notification n = builder.build();

        nm.notify(999, n);


//        Notification.Builder mBuilder = new Notification.Builder(gameActivity)
//                .setSmallIcon(R.mipmap.ic_launcher)
//                .setContentTitle(title)
//                .setContentText(text);
//
//
//        int notificationId = 999;
//
//        NotificationManager notificationManager = (NotificationManager) gameActivity.getSystemService(gameActivity.NOTIFICATION_SERVICE);
//        notificationManager.notify(notificationId, mBuilder.build());
    }
}
