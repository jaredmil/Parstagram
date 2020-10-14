package com.codepath.Parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("c49d31KTeKZ11cD6hWmuNr0lqBG9DEnwvl7yfzzg")
                .clientKey("PZEH23lQ087xt9ytvFOsMTZSGJgnAzyIYAomiFoq")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
