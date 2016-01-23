package com.android.settings.minimal;

import com.android.internal.logging.MetricsLogger;

import android.os.Bundle;

import com.android.settings.R;
import com.android.settings.SettingsPreferenceFragment;

public class MinimalSettings extends SettingsPreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.minimal_settings);
    }

    @Override
    protected int getMetricsCategory() {
        return MetricsLogger.MINIMAL_SETTINGS;
    }
}
