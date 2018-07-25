package br.com.dn.movevr;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MoveVRService extends Service {
    public MoveVRService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
