package com.mobileer.oboetesteradded.oboetester;

public class NativeEngine {

    static native boolean isMMapSupported();

    static native boolean isMMapExclusiveSupported();

    static native void setWorkaroundsEnabled(boolean enabled);

    static native boolean areWorkaroundsEnabled();
}
