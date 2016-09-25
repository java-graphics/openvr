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
public class VREvent_ApplicationLaunch_t extends Structure {

    public int pid;
    public int unArgsHandle;

    public VREvent_ApplicationLaunch_t() {
        super();
    }

    public VREvent_ApplicationLaunch_t(int pid, int unArgsHandle) {
        super();
        this.pid = pid;
        this.unArgsHandle = unArgsHandle;
    }

    public VREvent_ApplicationLaunch_t(Pointer peer) {
        super(peer);
        read();
    }

    @Override
    protected List getFieldOrder() {
        return Arrays.asList("pid", "unArgsHandle");
    }

    public static class ByReference extends VREvent_ApplicationLaunch_t implements Structure.ByReference {
    };

    public static class ByValue extends VREvent_ApplicationLaunch_t implements Structure.ByValue {
    };
}
