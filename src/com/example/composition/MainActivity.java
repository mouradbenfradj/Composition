package com.example.composition;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {
	private PlantVue maVue = null;
	private Mouvement mouv = null;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		maVue = new PlantVue(this);
		setContentView(maVue);
		
		mouv = new Mouvement(this);
		Bra bra = new Bra();
		maVue.setBra(bra);
		mouv.setBra(bra);
		

	}

	
}
