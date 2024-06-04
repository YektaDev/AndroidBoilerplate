#============================================= General =============================================
# The number of optimization passes to be performed.
# (Ends if no improvements are found after an optimization pass.)
-optimizationpasses 30
-verbose
-keepattributes SourceFile,
                LineNumberTable,
                RuntimeVisibleAnnotations,
                RuntimeVisibleParameterAnnotations,
                RuntimeVisibleTypeAnnotations,
                AnnotationDefault,
                *Annotation*
# Lets the app produce stack traces that can still be deciphered later on.
-renamesourcefileattribute ''
# Multiple fields and methods can then get the same names, as long as their arguments and return
# types are different.
-overloadaggressively
-repackageclasses
# Makes optimizations like class merging and inlining more effective by allowing hidden members to
# be made public.
-allowaccessmodification
# Native methods: http://proguard.sourceforge.net/manual/examples.html#native
-keepclasseswithmembernames class * {
  native <methods>;
}
# Remove compiler safety checks. Delete if caused problems.
-assumenosideeffects class kotlin.jvm.internal.Intrinsics {
  # Removes check for method parameters being null.
  static void checkParameterIsNotNull(java.lang.Object, java.lang.String);
  # Removes the null check when a Java platform type is passed to Kotlin NonNull method.
  static void checkExpressionValueIsNotNull(java.lang.Object, java.lang.String);
  static void checkNotNullExpressionValue(java.lang.Object, java.lang.String);
  # Removes checking final value returned from method is null, if passing back a Java platform type.
  static void checkReturnedValueIsNotNull(java.lang.Object, java.lang.String, java.lang.String);
  static void checkReturnedValueIsNotNull(java.lang.Object, java.lang.String);
  # Removes the null check for accessing a field from a Java parent class.
  static void checkFieldIsNotNull(java.lang.Object, java.lang.String, java.lang.String);
  static void checkFieldIsNotNull(java.lang.Object, java.lang.String);
  # Removes the code generated from !! operator which converts Nullable type to NonNull type. These
  # would throw an NPE immediately after on access.
  static void checkNotNull(java.lang.Object, java.lang.String);
  static void checkNotNullParameter(java.lang.Object, java.lang.String);
  # Removes lateinit var check being used before being set. This check is applied to every field
  # access without this.
  static void throwUninitializedPropertyAccessException(java.lang.String);
}
#============================================== Java ===============================================
-assumenosideeffects class * implements org.slf4j.Logger {
  public *** trace(...);
  public *** debug(...);
  public *** info(...);
  public *** warn(...);
  public *** error(...);
}
-assumenosideeffects class java.io.PrintStream {
  public void println(%);
  public void println(**);
}
#============================================= Android =============================================
-dontpreverify
-dontskipnonpubliclibraryclasses
-assumenosideeffects class android.util.Log {
  public static boolean isLoggable(java.lang.String, int);
  public static int v(...);
  public static int i(...);
  public static int w(...);
  public static int d(...);
  public static int e(...);
}
# For native methods, see http://proguard.sourceforge.net/manual/examples.html#native
-keepclasseswithmembers class * {
  native <methods>;
}
-keepclasseswithmembernames class * {
  native <methods>;
}
# keep setters in Views so that animations can still work.
# see http://proguard.sourceforge.net/manual/examples.html#beans
-keepclassmembers public class * extends android.view.View {
  void set*(***);
  *** get*();
}
# Keep ComposeView
-keep public class androidx.compose.ui.platform.ComposeView {
  public <init>(android.content.Context, android.util.AttributeSet);
}
# We want to keep methods in Activity that could be used in the XML attribute onClick
-keepclassmembers class * extends android.app.Activity {
  public void *(android.view.View);
}
# For enumeration classes, see http://proguard.sourceforge.net/manual/examples.html#enumerations
-keepclassmembers enum * {
  public static **[] values();
  public static ** valueOf(java.lang.String);
}
-keepclassmembers class * implements android.os.Parcelable {
  public static final android.os.Parcelable$Creator CREATOR;
}
-keepclassmembers class **.R$* {
  public static <fields>;
}
# Understand the @Keep support annotation.
-keep class android.support.annotation.Keep
-keep @android.support.annotation.Keep class * {*;}
-keepclasseswithmembers class * {
  @android.support.annotation.Keep <methods>;
}
-keepclasseswithmembers class * {
  @android.support.annotation.Keep <fields>;
}
-keepclasseswithmembers class * {
  @android.support.annotation.Keep <init>(...);
}
#====================================== kotlinx.serialization ======================================
# Below snippet is written by me to entirely give up obfuscation AND shrinking of all Serializables.
# Both of them cause an immediate crash even in Kotlinx Serialization 1.5.0-RC that has bundled
# its `kotlinx-serialization-core-jvm` Proguard rules.
# With this, we eliminate all the headaches of obfuscation messing up with the Serializables.
-keep @kotlinx.serialization.Serializable class * {*;}
-keepclasseswithmembers class * {
  @kotlinx.serialization.Serializable <methods>;
}
-keepclasseswithmembers class * {
  @kotlinx.serialization.Serializable <fields>;
}
-keepclasseswithmembers class * {
  @kotlinx.serialization.Serializable <init>(...);
}
#========================================= sqlite-android ==========================================
# Even though https://github.com/requery/sqlite-android indicated that the consumer rules are added,
# R8 still throws error related to sqlite-android. So, I excluded sqlite-android entirely.
-keep class io.requery.android.database.** { *; }
-keepclasseswithmembernames,includedescriptorclasses class io.requery.android.database.** {
    native <methods>;
}
#============================================ Full Mode ============================================
-keepattributes Signature
# With R8 full mode generic signatures are stripped for classes that are not kept. Suspend functions
# are wrapped in continuations where the type argument is used.
-keep,allowobfuscation,allowshrinking class kotlin.coroutines.Continuation
# Prevents an immediate crash with R8 Full mode on:
# https://issuetracker.google.com/issues/190382641#comment6
-keepclassmembers class kotlin.SafePublicationLazyImpl {
  java.lang.Object _value;
}
#============================================ Warnings =============================================
# The support library contains references to newer platform versions. Don't warn about those in case
# this app is linking against an older platform version. We know about them, and they are safe.
-dontwarn android.support.**
-dontwarn androidx.**
-dontwarn org.conscrypt.**
-dontwarn okhttp3.internal.platform.Android10Platform.**
-dontwarn okhttp3.internal.platform.AndroidPlatform.**
-dontwarn okhttp3.internal.platform.android.**
-dontwarn okhttp3.internal.platform.**
-dontwarn org.slf4j.**
