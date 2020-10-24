package com.example.parstagram;


import com.parse.Parse;
import com.parse.ParseObject;

import android.app.Application;

public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        //Register your parse models
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("IFtB9OsDWcbOi85jKpQSqWaqzfudRp93AiwStPqT")
                .clientKey("oSVgmzhY7vKwYBbZXjWUDBdas4iPdOwyzlpSc94Q")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
