package com.tdn.therapydog;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;

public class AndroidApplication extends Application  {

    private boolean backgrounded;

    public static AndroidApplication instance;


    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG) {
        }

        instance = this;
    }

    public static Context getContext() {
        return instance.getApplicationContext();
    }

    @Override
    public void onTrimMemory(int level) {
        if (level == ComponentCallbacks2.TRIM_MEMORY_UI_HIDDEN) {
            this.backgrounded = true;
        }
        super.onTrimMemory(level);
    }

    public boolean wasBackgrounded()
    {
        return this.backgrounded;
    }

    public void flagForegrounded()
    {
        this.backgrounded = false;
    }

    public static AndroidApplication get(Context context) {
        return (AndroidApplication) context.getApplicationContext();
    }
    public boolean question1=false;
    public boolean question2=false;
    public boolean question3=false;
    public boolean question4=false;

    public boolean isAllQuestionAnswered() {
        return question1 && question2 && question3 && question4;
    }
}
