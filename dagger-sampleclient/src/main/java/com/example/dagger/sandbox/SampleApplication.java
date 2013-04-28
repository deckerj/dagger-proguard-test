package com.example.dagger.sandbox;

import android.app.Activity;
import android.app.Application;
import dagger.ObjectGraph;

public class SampleApplication extends Application {

	private static SampleApplication instance;

	private ObjectGraph objectGraph;

	public static SampleApplication getInstance() {
		return instance;
	}

	public SampleApplication() {
		super();
	}

	@Override
	public final void onCreate() {
		super.onCreate();
		instance = this;

		objectGraph = ObjectGraph.create(new ProductionModule(this));
		objectGraph.injectStatics();
		objectGraph.inject(this);

	}

	public void inject(Activity activity) {
		objectGraph.inject(activity);
	}

}
