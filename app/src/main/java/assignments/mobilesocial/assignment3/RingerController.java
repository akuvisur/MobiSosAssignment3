package assignments.mobilesocial.assignment3;

import android.util.Log;
import android.widget.Toast;

/**
 * Created by aku on 21/01/16.
 */
public class RingerController {
    private static final String LOG = "RingerController";

    public static void DeviceToSilent() {
        Log.d(LOG, "Setting device to silent");
        Toast.makeText(MainActivity.context, "Setting device to silent", Toast.LENGTH_SHORT).show();
        // store previous ringermode

        // set device to silent

    }

    public static void returnRingMode() {
        Log.d(LOG, "Returning ringer mode to previous");
        Toast.makeText(MainActivity.context, "Returning ringer mode", Toast.LENGTH_SHORT).show();
        // set ringermode back to what it was before silencing
    }

}
