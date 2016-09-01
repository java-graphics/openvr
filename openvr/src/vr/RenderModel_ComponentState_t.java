package vr;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;

/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>
 *
 * Describes state information about a render-model component, including transforms and other dynamic properties.
 */
public class RenderModel_ComponentState_t extends Structure {

    /**
     * C type : HmdMatrix34_t
     *
     * Transform required when drawing the component render model.
     */
    public HmdMatrix34_t mTrackingToComponentRenderModel;
    /**
     * C type : HmdMatrix34_t
     *
     * Transform available for attaching to a local component coordinate system (-Z out from surface ).
     */
    public HmdMatrix34_t mTrackingToComponentLocal;
    /**
     * C type : VRComponentProperties
     */
    public int uProperties;

    public RenderModel_ComponentState_t() {
        super();
    }

    @Override
    protected List<?> getFieldOrder() {
        return Arrays.asList("mTrackingToComponentRenderModel", "mTrackingToComponentLocal", "uProperties");
    }

    /**
     * @param mTrackingToComponentRenderModel C type : HmdMatrix34_t<br>
     * @param mTrackingToComponentLocal C type : HmdMatrix34_t<br>
     * @param uProperties C type : VRComponentProperties
     */
    public RenderModel_ComponentState_t(HmdMatrix34_t mTrackingToComponentRenderModel, HmdMatrix34_t mTrackingToComponentLocal, int uProperties) {
        super();
        this.mTrackingToComponentRenderModel = mTrackingToComponentRenderModel;
        this.mTrackingToComponentLocal = mTrackingToComponentLocal;
        this.uProperties = uProperties;
    }

    public RenderModel_ComponentState_t(Pointer peer) {
        super(peer);
    }

    public static class ByReference extends RenderModel_ComponentState_t implements Structure.ByReference {
    };

    public static class ByValue extends RenderModel_ComponentState_t implements Structure.ByValue {
    };
}
