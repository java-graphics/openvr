package vr;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 *
 * right-handed system
 * +y is up
 * +x is to the right
 * -z is going away from you
 * Distance unit is meters
 */
public class HmdVector3_t extends Structure {

    public static final int SIZE = 3 * Float.BYTES;
    /**
     * float[3]<br>
     * C type : float[3]
     */
    public float[] v = new float[3];

    public HmdVector3_t() {
        super();
    }

    @Override
    protected List<?> getFieldOrder() {
        return Arrays.asList("v");
    }

    /**
     * @param v float[3]<br>
     * C type : float[3]
     */
    public HmdVector3_t(float v[]) {
        super();
        if ((v.length != this.v.length)) {
            throw new IllegalArgumentException("Wrong array size !");
        }
        this.v = v;
    }

    public HmdVector3_t(Pointer peer) {
        super(peer);
    }
    
    public void toDbb(ByteBuffer buffer, int index) {     
        IntStream.range(0, 3).forEach(i -> buffer.putFloat(index + i * Float.BYTES, v[i]));
    }

    public static class ByReference extends HmdVector3_t implements Structure.ByReference {
    };

    public static class ByValue extends HmdVector3_t implements Structure.ByValue {
    };
}
