package com.example.dagger.sandbox;

import javax.inject.Singleton;

import android.content.Context;
import dagger.Module;
import dagger.Provides;

@Module( //
entryPoints = { SampleApplication.class, SampleActivity.class }, //
includes = { AndroidServicesModule.class })
public class ProductionModule {

	private final Context appContext;

	public ProductionModule(Context appContext) {
		this.appContext = appContext;
	}

	@Provides
	@Singleton
	Context provideContext() {
		return appContext;
	}

}
