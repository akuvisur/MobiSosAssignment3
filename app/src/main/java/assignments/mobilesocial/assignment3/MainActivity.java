package assignments.mobilesocial.assignment3;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public static Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // you can start the service here, or include android:enabled="true" in AppManifest
        startService(new Intent(this, CalendarService.class));

        context = getApplicationContext();
    }

}
