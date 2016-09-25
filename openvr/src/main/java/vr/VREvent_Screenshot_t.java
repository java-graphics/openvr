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
public class VREvent_Screenshot_t extends Structure {

    public int handle;
    public int type;

    public VREvent_Screenshot_t() {
        super();
    }

    public VREvent_Screenshot_t(int handle, int type) {
        super();
        this.handle = handle;
        this.type = type;
    }
    
     public VREvent_Screenshot_t(Pointer peer) {
        super(peer);
        read();
    }

    @Override
    protected List getFieldOrder() {
        return Arrays.asList("handle", "type");
    }
    
    public static class ByReference extends VREvent_Screenshot_t implements Structure.ByReference {
    };

    public static class ByValue extends VREvent_Screenshot_t implements Structure.ByValue {
    };

}
