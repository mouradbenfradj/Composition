package com.example.composition;

import android.app.Service;
import android.graphics.Bitmap;
import android.hardware.Sensor;
import android.hardware.SensorManager;

public class Mouvement {
	private SensorManager mManager = null;
	private Bitmap braImg;
	private Bra bra;
	
	public Mouvement(MainActivity View) {
		activity = View;
		angle = (SensorManager) mActivity.getBaseContext().getSystemService(Service.SENSOR_SERVICE);
		orientation = angle.getDefaultSensor(Sensor.TYPE_ORIENTATION);
	}
}
