package com.example.dagger.sandbox;

import javax.inject.Singleton;

import android.app.AlarmManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.location.LocationManager;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import dagger.Module;
import dagger.Provides;

@Module(complete = false)
public class AndroidServicesModule {

	@Provides
	@Singleton
	LocationManager provideLocationManager(Context context) {
		return (LocationManager) context
				.getSystemService(Context.LOCATION_SERVICE);
	}

	@Provides
	@Singleton
	LayoutInflater provideLayoutInflater(Context context) {
		return (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	@Provides
	@Singleton
	public AlarmManager provideAlarmManager(Context context) {
		return (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
	}

	@Provides
	@Singleton
	public NotificationManager provideNotificationManager(Context context) {
		return (NotificationManager) context
				.getSystemService(Context.NOTIFICATION_SERVICE);
	}

	@Provides
	@Singleton
	Resources provideResources(Context context) {
		return context.getResources();
	}

	@Provides
	@Singleton
	public SharedPreferences provideSharedPreferences(Context context) {
		return PreferenceManager.getDefaultSharedPreferences(context);
	}
}