package com.example.composition;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
public class PlantVue extends SurfaceView implements
SurfaceHolder.Callback {
private SurfaceHolder mHolder = null;
/**
* Utilis� pour construire la vue en Java
* @param context le contexte qui h�berge la vue
*/
public PlantVue(Context context) {
super(context);
init();
}
/**
* Utilis� pour construire la vue depuis XML sans style
* @param context le contexte qui h�berge la vue
* @param attrs les attributs d�finis en XML
*/
public PlantVue(Context context, AttributeSet attrs) {
super(context, attrs);
init();
}
/**
* Utilis� pour construire la vue depuis XML avec un style
* @param context le contexte qui h�berge la vue
* @param attrs les attributs d�finis en XML
* @param defStyle r�f�rence au style associ�
*/
public PlantVue(Context context, AttributeSet attrs, int
defStyle) {
super(context, attrs, defStyle);
init();
}
public void init() {
mHolder = getHolder();
mHolder.addCallback(this);
}
@Override
public void surfaceChanged(SurfaceHolder holder, int format, int width,
		int height) {
	// TODO Auto-generated method stub
	
}
@Override
public void surfaceCreated(SurfaceHolder holder) {
	// TODO Auto-generated method stub
	
}
@Override
public void surfaceDestroyed(SurfaceHolder holder) {
	// TODO Auto-generated method stub
	
}
}