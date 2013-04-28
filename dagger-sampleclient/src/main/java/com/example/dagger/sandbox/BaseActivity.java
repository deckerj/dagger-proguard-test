package com.example.dagger.sandbox;

import android.app.Activity;
import android.os.Bundle;

/**
 * All activities should extend this for dependency injection.
 */
public class BaseActivity extends Activity {

	@Override
	protected void onCreate(Bundle state) {
		super.onCreate(state);

		SampleApplication.getInstance().inject(this);
	}

}
