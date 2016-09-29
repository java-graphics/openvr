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
public class CameraVideoStreamFrameHeader_t extends Structure {

    public int eFrameType;
    public int nWidth;
    public int nHeight;
    public int nBytesPerPixel;
    public int nFrameSequence;
    public TrackedDevicePose_t standingTrackedDevicePose;

    public CameraVideoStreamFrameHeader_t() {
        super();
    }

    public CameraVideoStreamFrameHeader_t(int eFrameType, int nWidth, int nHeight,
            int nBytesPerPixel, int nFrameSequence, TrackedDevicePose_t standingTrackedDevicePose) {

        super();

        this.eFrameType = eFrameType;
        this.nWidth = nWidth;
        this.nHeight = nHeight;
        this.nBytesPerPixel = nBytesPerPixel;
        this.nFrameSequence = nFrameSequence;
        this.standingTrackedDevicePose = standingTrackedDevicePose;
    }

    public CameraVideoStreamFrameHeader_t(Pointer peer) {
        super(peer);
        read();
    }

    @Override
    protected List getFieldOrder() {
        return Arrays.asList("eFrameType", "nWidth", "nHeight", "nBytesPerPixel", "nFrameSequence", "standingTrackedDevicePose");
    }

    public static class ByReference extends CameraVideoStreamFrameHeader_t implements Structure.ByReference {
    };

    public static class ByValue extends CameraVideoStreamFrameHeader_t implements Structure.ByValue {
    };

}
