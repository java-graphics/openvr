package vr;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;

/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class VREvent_PerformanceTest_t extends Structure {

    public int m_nFidelityLevel;

    public VREvent_PerformanceTest_t() {
        super();
    }

    @Override
    protected List<?> getFieldOrder() {
        return Arrays.asList("m_nFidelityLevel");
    }

    public VREvent_PerformanceTest_t(int m_nFidelityLevel) {
        super();
        this.m_nFidelityLevel = m_nFidelityLevel;
    }

    public VREvent_PerformanceTest_t(Pointer peer) {
        super(peer);
    }

    public static class ByReference extends VREvent_PerformanceTest_t implements Structure.ByReference {
    };

    public static class ByValue extends VREvent_PerformanceTest_t implements Structure.ByValue {
    };
}
