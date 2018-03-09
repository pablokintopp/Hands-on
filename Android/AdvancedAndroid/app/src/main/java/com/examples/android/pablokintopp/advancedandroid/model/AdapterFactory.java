package com.examples.android.pablokintopp.advancedandroid.model;

import com.ryanharter.auto.value.moshi.MoshiAdapterFactory;
import com.squareup.moshi.JsonAdapter;

/**
 * Created by Pablo on 08/03/2018.
 */
@MoshiAdapterFactory
public abstract class AdapterFactory implements JsonAdapter.Factory {

    public static JsonAdapter.Factory create(){
        return new AutoValueMoshi_AdapterFactory();
    }
}