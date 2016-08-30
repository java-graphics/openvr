/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vr;

import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author GBarbieri
 */
public class CharArray extends Structure {

    public CharArray() {
        
    }
    
    @Override
    protected List<?> getFieldOrder() {
        return Arrays.asList("mDeviceToAbsoluteTracking", "vVelocity", "vAngularVelocity", "eTrackingResult", "bPoseIsValid", "bDeviceIsConnected");
    }

    public static class ByReference extends TrackedDevicePose_t implements Structure.ByReference {
    };
}
