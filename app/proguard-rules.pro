# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# pluginManagement {}
#    plugins {
#        id "com.android.application" version "8.1.0" apply false
# The ProGuard configuration files in the third party libraries.
# By default, it is empty you can add project specific ProGuard rules here.

# Keep Retrofit interfaces
-keep interface com.aivideogenerator.app.network.** { *; }

# Keep all model classes
-keep class com.aivideogenerator.app.data.** { *; }

# Keep Koin annotations
-keepclasseswithmembernames class * {
    @org.koin.core.annotation.* <methods>;
}
