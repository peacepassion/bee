package com.orhanobut.bee;

import android.content.Context;

import java.util.List;
import java.util.Map;

/**
 * This class should be used to provide bridge between bee and the app.
 *
 * @author Orhan Obut
 */
public abstract class BeeConfig implements ConfigListener {

    private Context context;

    @Override
    public void setContext(Context context) {
        this.context = context;
    }

    @Override
    public Context getContext() {
        return context;
    }

    @Override
    public void onClose() {

    }

    @Override
    public void onSave() {

    }

    @Override
    public void onInfoContentCreated(Map<String, String> content) {
    }

    @Override
    public void onLogContentCreated(List<String> logList) {

    }

    @Override
    public void onClipboardContentCreated(Map<String, String> content) {

    }

}
