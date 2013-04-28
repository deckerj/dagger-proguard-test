// Code generated by dagger-compiler.  Do not edit.
package com.example.dagger.sandbox;


import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ModuleAdapter;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;

/**
 * A manager of modules and provides adapters allowing for proper linking and
 * instance provision of types served by {@code @Provides} methods.
 */
public final class AndroidServicesModule$ModuleAdapter extends ModuleAdapter<AndroidServicesModule> {
  private static final String[] ENTRY_POINTS = { };
  private static final Class<?>[] STATIC_INJECTIONS = { };
  private static final Class<?>[] INCLUDES = { };

  public AndroidServicesModule$ModuleAdapter() {
    super(ENTRY_POINTS, STATIC_INJECTIONS, false /*overrides*/, INCLUDES, false /*complete*/);
  }

  @Override
  protected AndroidServicesModule newModule() {
    return new com.example.dagger.sandbox.AndroidServicesModule();
  }

  /**
   * Used internally obtain dependency information, such as for cyclical
   * graph detection.
   */
  @Override
  public void getBindings(Map<String, Binding<?>> map) {
    map.put("android.location.LocationManager", new ProvideLocationManagerProvidesAdapter(module));
    map.put("android.view.LayoutInflater", new ProvideLayoutInflaterProvidesAdapter(module));
    map.put("android.app.AlarmManager", new ProvideAlarmManagerProvidesAdapter(module));
    map.put("android.app.NotificationManager", new ProvideNotificationManagerProvidesAdapter(module));
    map.put("android.content.res.Resources", new ProvideResourcesProvidesAdapter(module));
    map.put("android.content.SharedPreferences", new ProvideSharedPreferencesProvidesAdapter(module));
  }

  /**
   * A {@code Binder<android.location.LocationManager>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   * 
   * Owning the dependency links between {@code android.location.LocationManager} and its
   * dependencies.
   * 
   * Being a {@code Provider<android.location.LocationManager>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvideLocationManagerProvidesAdapter extends Binding<android.location.LocationManager>
      implements Provider<android.location.LocationManager> {
    private final AndroidServicesModule module;
    private Binding<android.content.Context> context;

    public ProvideLocationManagerProvidesAdapter(AndroidServicesModule module) {
      super("android.location.LocationManager", null, IS_SINGLETON, com.example.dagger.sandbox.AndroidServicesModule.class);
      this.module = module;
    }

    /**
     * Used internally to link bindings/providers together at run time
     * according to their dependency graph.
     */
    @Override
    @SuppressWarnings("unchecked")
    public void attach(Linker linker) {
      context = (Binding<android.content.Context>) linker.requestBinding("android.content.Context", AndroidServicesModule.class);
    }

    /**
     * Used internally obtain dependency information, such as for cyclical
     * graph detection.
     */
    @Override
    public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
      getBindings.add(context);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<android.location.LocationManager>}.
     */
    @Override
    public android.location.LocationManager get() {
      return module.provideLocationManager(context.get());
    }
  }

  /**
   * A {@code Binder<android.view.LayoutInflater>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   * 
   * Owning the dependency links between {@code android.view.LayoutInflater} and its
   * dependencies.
   * 
   * Being a {@code Provider<android.view.LayoutInflater>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvideLayoutInflaterProvidesAdapter extends Binding<android.view.LayoutInflater>
      implements Provider<android.view.LayoutInflater> {
    private final AndroidServicesModule module;
    private Binding<android.content.Context> context;

    public ProvideLayoutInflaterProvidesAdapter(AndroidServicesModule module) {
      super("android.view.LayoutInflater", null, IS_SINGLETON, com.example.dagger.sandbox.AndroidServicesModule.class);
      this.module = module;
    }

    /**
     * Used internally to link bindings/providers together at run time
     * according to their dependency graph.
     */
    @Override
    @SuppressWarnings("unchecked")
    public void attach(Linker linker) {
      context = (Binding<android.content.Context>) linker.requestBinding("android.content.Context", AndroidServicesModule.class);
    }

    /**
     * Used internally obtain dependency information, such as for cyclical
     * graph detection.
     */
    @Override
    public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
      getBindings.add(context);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<android.view.LayoutInflater>}.
     */
    @Override
    public android.view.LayoutInflater get() {
      return module.provideLayoutInflater(context.get());
    }
  }

  /**
   * A {@code Binder<android.app.AlarmManager>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   * 
   * Owning the dependency links between {@code android.app.AlarmManager} and its
   * dependencies.
   * 
   * Being a {@code Provider<android.app.AlarmManager>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvideAlarmManagerProvidesAdapter extends Binding<android.app.AlarmManager>
      implements Provider<android.app.AlarmManager> {
    private final AndroidServicesModule module;
    private Binding<android.content.Context> context;

    public ProvideAlarmManagerProvidesAdapter(AndroidServicesModule module) {
      super("android.app.AlarmManager", null, IS_SINGLETON, com.example.dagger.sandbox.AndroidServicesModule.class);
      this.module = module;
    }

    /**
     * Used internally to link bindings/providers together at run time
     * according to their dependency graph.
     */
    @Override
    @SuppressWarnings("unchecked")
    public void attach(Linker linker) {
      context = (Binding<android.content.Context>) linker.requestBinding("android.content.Context", AndroidServicesModule.class);
    }

    /**
     * Used internally obtain dependency information, such as for cyclical
     * graph detection.
     */
    @Override
    public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
      getBindings.add(context);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<android.app.AlarmManager>}.
     */
    @Override
    public android.app.AlarmManager get() {
      return module.provideAlarmManager(context.get());
    }
  }

  /**
   * A {@code Binder<android.app.NotificationManager>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   * 
   * Owning the dependency links between {@code android.app.NotificationManager} and its
   * dependencies.
   * 
   * Being a {@code Provider<android.app.NotificationManager>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvideNotificationManagerProvidesAdapter extends Binding<android.app.NotificationManager>
      implements Provider<android.app.NotificationManager> {
    private final AndroidServicesModule module;
    private Binding<android.content.Context> context;

    public ProvideNotificationManagerProvidesAdapter(AndroidServicesModule module) {
      super("android.app.NotificationManager", null, IS_SINGLETON, com.example.dagger.sandbox.AndroidServicesModule.class);
      this.module = module;
    }

    /**
     * Used internally to link bindings/providers together at run time
     * according to their dependency graph.
     */
    @Override
    @SuppressWarnings("unchecked")
    public void attach(Linker linker) {
      context = (Binding<android.content.Context>) linker.requestBinding("android.content.Context", AndroidServicesModule.class);
    }

    /**
     * Used internally obtain dependency information, such as for cyclical
     * graph detection.
     */
    @Override
    public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
      getBindings.add(context);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<android.app.NotificationManager>}.
     */
    @Override
    public android.app.NotificationManager get() {
      return module.provideNotificationManager(context.get());
    }
  }

  /**
   * A {@code Binder<android.content.res.Resources>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   * 
   * Owning the dependency links between {@code android.content.res.Resources} and its
   * dependencies.
   * 
   * Being a {@code Provider<android.content.res.Resources>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvideResourcesProvidesAdapter extends Binding<android.content.res.Resources>
      implements Provider<android.content.res.Resources> {
    private final AndroidServicesModule module;
    private Binding<android.content.Context> context;

    public ProvideResourcesProvidesAdapter(AndroidServicesModule module) {
      super("android.content.res.Resources", null, IS_SINGLETON, com.example.dagger.sandbox.AndroidServicesModule.class);
      this.module = module;
    }

    /**
     * Used internally to link bindings/providers together at run time
     * according to their dependency graph.
     */
    @Override
    @SuppressWarnings("unchecked")
    public void attach(Linker linker) {
      context = (Binding<android.content.Context>) linker.requestBinding("android.content.Context", AndroidServicesModule.class);
    }

    /**
     * Used internally obtain dependency information, such as for cyclical
     * graph detection.
     */
    @Override
    public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
      getBindings.add(context);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<android.content.res.Resources>}.
     */
    @Override
    public android.content.res.Resources get() {
      return module.provideResources(context.get());
    }
  }

  /**
   * A {@code Binder<android.content.SharedPreferences>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   * 
   * Owning the dependency links between {@code android.content.SharedPreferences} and its
   * dependencies.
   * 
   * Being a {@code Provider<android.content.SharedPreferences>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvideSharedPreferencesProvidesAdapter extends Binding<android.content.SharedPreferences>
      implements Provider<android.content.SharedPreferences> {
    private final AndroidServicesModule module;
    private Binding<android.content.Context> context;

    public ProvideSharedPreferencesProvidesAdapter(AndroidServicesModule module) {
      super("android.content.SharedPreferences", null, IS_SINGLETON, com.example.dagger.sandbox.AndroidServicesModule.class);
      this.module = module;
    }

    /**
     * Used internally to link bindings/providers together at run time
     * according to their dependency graph.
     */
    @Override
    @SuppressWarnings("unchecked")
    public void attach(Linker linker) {
      context = (Binding<android.content.Context>) linker.requestBinding("android.content.Context", AndroidServicesModule.class);
    }

    /**
     * Used internally obtain dependency information, such as for cyclical
     * graph detection.
     */
    @Override
    public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
      getBindings.add(context);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<android.content.SharedPreferences>}.
     */
    @Override
    public android.content.SharedPreferences get() {
      return module.provideSharedPreferences(context.get());
    }
  }
}
