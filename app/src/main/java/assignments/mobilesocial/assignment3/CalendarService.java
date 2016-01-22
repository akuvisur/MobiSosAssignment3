package assignments.mobilesocial.assignment3;

import android.app.IntentService;
import android.content.ContentResolver;
import android.content.Intent;
import android.util.Log;

/**
 * Created by aku on 21/01/16.
 */
public class CalendarService extends IntentService {
    private static final String LOG = "CalendarService";

    private ContentResolver contentResolver;

    public CalendarService() {
        super("CalendarService");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        // this method is called when the service starts
        Log.d(LOG, "running");

        // ContentResolver is used to access the CalendarProvider
        contentResolver = getContentResolver();

        /*
            Set service to run every 5 mins to query the CalendarProvider for events.
                use e.g. Handler().postDelayed() function.

            Order them by timestamp to get the next one.
            Set your app to go to silentmode when System.getCurrentTimeMillis() hits the next
            calendar event.
                use RingerController.DeviceToSilent() and RingerController.returnRingMode()

            Don't query all calendars! (test first to see which ones you want)

        */

        // the service will be killed when the app closes
        return START_NOT_STICKY;
    }

    @Override
    protected void onHandleIntent(Intent intent) {}


}
