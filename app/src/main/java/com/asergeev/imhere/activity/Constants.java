package com.asergeev.imhere.activity;

import com.google.android.gms.maps.model.LatLng;

import java.util.HashMap;

/**
 * Created by Andrey on 8/7/2017.
 */

public class Constants {

    private Constants() {
    }



    public static final String GEOFENCE_ID_STAN_UNI = "STAN_UNI";

    public static final float GEOFENCE_RADIUS_IN_METERS = 100;



    /**

     * Map for storing information about stanford university in the Stanford.

     */

    public static final HashMap<String, LatLng> AREA_LANDMARKS = new HashMap<String, LatLng>();




}
