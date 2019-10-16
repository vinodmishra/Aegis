package com.beemdevelopment.aegis.helpers;

import android.content.Context;

import androidx.biometric.BiometricManager;

public class BiometricsHelper {
    private BiometricsHelper() {

    }

    public static BiometricManager getManager(Context context) {
        BiometricManager manager = BiometricManager.from(context);
        if (manager.canAuthenticate() == BiometricManager.BIOMETRIC_SUCCESS) {
            return manager;
        }
        return null;
    }

    public static boolean isAvailable(Context context) {
        return getManager(context) != null;
    }
}
