Dagger-Proguard-Test
==============

This is a sample maven-based Android project showing how dagger and Proguard work together. The main purpose of this code is to show that an obfuscated apk with dagger-compiler removed as Maven dependency still crashes.

## Test-Build with Proguard disabled
```
cd dagger-sampleclient
mvn clean install android:deploy android:run
```

**Result:**
App runs on device as expected without errors.

## "Release"-Build with Proguard enabled
```
cd dagger-sampleclient
mvn -Prelease clean install android:deploy android:run
```

**Result:**
App crashes due to looking up by class name that was obfuscated:
```
I/ActivityManager(  391): Start proc com.example.dagger.sandbox for activity com.example.dagger.sandbox/.SampleActivity: pid=4274 uid=10211 gids={50211, 1028}
D/AndroidRuntime( 4274): Shutting down VM
W/dalvikvm( 4274): threadid=1: thread exiting with uncaught exception (group=0x40f83930)
E/AndroidRuntime( 4274): FATAL EXCEPTION: main
E/AndroidRuntime( 4274): java.lang.RuntimeException: Unable to instantiate application com.example.dagger.sandbox.SampleApplication: java.lang.ClassNotFoundException: Didn't find class "com.example.dagger.sandbox.SampleApplication" on path: /data/app/com.example.dagger.sandbox-1.apk
E/AndroidRuntime( 4274):        at android.app.LoadedApk.makeApplication(LoadedApk.java:504)
E/AndroidRuntime( 4274):        at android.app.ActivityThread.handleBindApplication(ActivityThread.java:4364)
E/AndroidRuntime( 4274):        at android.app.ActivityThread.access$1300(ActivityThread.java:141)
E/AndroidRuntime( 4274):        at android.app.ActivityThread$H.handleMessage(ActivityThread.java:1294)
E/AndroidRuntime( 4274):        at android.os.Handler.dispatchMessage(Handler.java:99)
E/AndroidRuntime( 4274):        at android.os.Looper.loop(Looper.java:137)
E/AndroidRuntime( 4274):        at android.app.ActivityThread.main(ActivityThread.java:5041)
E/AndroidRuntime( 4274):        at java.lang.reflect.Method.invokeNative(Native Method)
E/AndroidRuntime( 4274):        at java.lang.reflect.Method.invoke(Method.java:511)
E/AndroidRuntime( 4274):        at com.android.internal.os.ZygoteInit$MethodAndArgsCaller.run(ZygoteInit.java:793)
E/AndroidRuntime( 4274):        at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:560)
E/AndroidRuntime( 4274):        at dalvik.system.NativeStart.main(Native Method)
E/AndroidRuntime( 4274): Caused by: java.lang.ClassNotFoundException: Didn't find class "com.example.dagger.sandbox.SampleApplication" on path: /data/app/com.example.dagger.sandbox-1.apk
E/AndroidRuntime( 4274):        at dalvik.system.BaseDexClassLoader.findClass(BaseDexClassLoader.java:65)
E/AndroidRuntime( 4274):        at java.lang.ClassLoader.loadClass(ClassLoader.java:501)
E/AndroidRuntime( 4274):        at java.lang.ClassLoader.loadClass(ClassLoader.java:461)
E/AndroidRuntime( 4274):        at android.app.Instrumentation.newApplication(Instrumentation.java:968)
E/AndroidRuntime( 4274):        at android.app.LoadedApk.makeApplication(LoadedApk.java:499)
E/AndroidRuntime( 4274):        ... 11 more
W/ActivityManager(  391):   Force finishing activity com.example.dagger.sandbox/.SampleActivity
W/ActivityManager(  391): Activity pause timeout for ActivityRecord{41836b98 u0 com.example.dagger.sandbox/.SampleActivity}
D/dalvikvm(23791): GC_CONCURRENT freed 407K, 5% free 10789K/11332K, paused 10ms+5ms, total 65ms
I/Process ( 4274): Sending signal. PID: 4274 SIG: 9
I/ActivityManager(  391): Process com.example.dagger.sandbox (pid 4274) has died.
```

## Build-Artefacts
If also checked in some [build artefacts](https://github.com/voidmachine/dagger-proguard-test/tree/master/build-artefacts) that were built depending on whether ```-Prelease``` was set and whether the dagger-compiler was commented out in the [```pom```](https://github.com/voidmachine/dagger-proguard-test/blob/master/dagger-sampleclient/pom.xml).


