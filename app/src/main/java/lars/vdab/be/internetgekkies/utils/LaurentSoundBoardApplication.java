package lars.vdab.be.internetgekkies.utils;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseInstallation;

/**
 * Created by Lakkedelakke on 17/09/2015.
 */
public class LaurentSoundBoardApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "z33nSThIRZXmzWtbW35Zj8aMggzg8g9q8kl9ktWB", "jKXlMx3uTqtzb5cBDySfbRRzkbKjFPVzIKzVrf4B");
        ParseInstallation.getCurrentInstallation().saveInBackground();
    }
}
