/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vr;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author fschaefers
 */
public class VREvent_ScreenshotProgress_t extends Structure {

    public float progress;

    public VREvent_ScreenshotProgress_t() {
        super();
    }

    public VREvent_ScreenshotProgress_t(float progress) {
        super();
        this.progress = progress;
    }

    public VREvent_ScreenshotProgress_t(Pointer peer) {
        super(peer);
        read();
    }

    @Override
    protected List getFieldOrder() {
        return Arrays.asList("progress");
    }

    public static class ByReference extends VREvent_ScreenshotProgress_t implements Structure.ByReference {
    };

    public static class ByValue extends VREvent_ScreenshotProgress_t implements Structure.ByValue {
    };

}
