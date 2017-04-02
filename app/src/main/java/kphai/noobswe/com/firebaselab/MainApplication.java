package kphai.noobswe.com.firebaselab;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by K'Phai on 02/06/2017.
 */

public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initFont();
    }

    private void initFont() {
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/phetsarath_ot.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build());
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
