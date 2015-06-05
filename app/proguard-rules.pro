-dontobfuscate # or -keepattributes LocalVariableTable

# workaround:
# -optimizations !code/allocation/variable

-keepclasseswithmembers class org.chalup.proguardoptimizedontobfuscatebug.Kaboom {
  public *** boom(...);
}