package com.example.datasync;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class SyncService extends Service {
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        // Sync contacts, SMS, and call logs to Firebase (logic to be added)
        return START_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}