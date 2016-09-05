/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vr;

import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.PointerByReference;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author fschaefers
 */
public class IVRScreenshots_FnTable extends Structure {

    /*
    EVRScreenshotError (OPENVR_FNTABLE_CALLTYPE *RequestScreenshot)(ScreenshotHandle_t * pOutScreenshotHandle, EVRScreenshotType type, char * pchPreviewFilename, char * pchVRFilename);
     */
    public IVRScreenshots_FnTable.RequestScreenshot_callback RequestScreenshot;
    /*
    EVRScreenshotError (OPENVR_FNTABLE_CALLTYPE *HookScreenshot)(EVRScreenshotType * pSupportedTypes, int numTypes);

     */
    public IVRScreenshots_FnTable.HookScreenshot_callback HookScreenshot;
    /*
    EVRScreenshotType (OPENVR_FNTABLE_CALLTYPE *GetScreenshotPropertyType)(ScreenshotHandle_t screenshotHandle, EVRScreenshotError * pError);
     */
    public IVRScreenshots_FnTable.GetScreenshotPropertyType_callback GetScreenshotPropertyType;
    /*
    uint32_t (OPENVR_FNTABLE_CALLTYPE *GetScreenshotPropertyFilename)(ScreenshotHandle_t screenshotHandle, EVRScreenshotPropertyFilenames filenameType, char * pchFilename, uint32_t cchFilename, EVRScreenshotError * pError);

     */
    public IVRScreenshots_FnTable.GetScreenshotPropertyFilename_callback GetScreenshotPropertyFilename;
    /*
    EVRScreenshotError (OPENVR_FNTABLE_CALLTYPE *UpdateScreenshotProgress)(ScreenshotHandle_t screenshotHandle, float flProgress);

     */
    public IVRScreenshots_FnTable.UpdateScreenshotProgress_callback UpdateScreenshotProgress;
    /*
    EVRScreenshotError (OPENVR_FNTABLE_CALLTYPE *TakeStereoScreenshot)(ScreenshotHandle_t * pOutScreenshotHandle, char * pchPreviewFilename, char * pchVRFilename);

     */
    public IVRScreenshots_FnTable.TakeStereoScreenshot_callback TakeStereoScreenshot;
    /*
    EVRScreenshotError (OPENVR_FNTABLE_CALLTYPE *SubmitScreenshot)(ScreenshotHandle_t screenshotHandle, EVRScreenshotType type, char * pchSourcePreviewFilename, char * pchSourceVRFilename

     */
    public IVRScreenshots_FnTable.SubmitScreenshot_callback SubmitScreenshot;

    public interface RequestScreenshot_callback extends Callback {

        int apply(IntByReference pOutScreenshotHandle, int type, Pointer pchPreviewFilename, Pointer pchVRFilename);
    };

    public interface HookScreenshot_callback extends Callback {

        int apply(IntByReference pSupportedTypes, int numTypes);
    };

    public interface GetScreenshotPropertyType_callback extends Callback {

        int apply(int screenshotHandle, IntByReference pError);
    };

    public interface GetScreenshotPropertyFilename_callback extends Callback {

        int apply(int screenshotHandle, int filenameType, Pointer pchFilename, int cchFilename, IntByReference pError);
    };

    public interface UpdateScreenshotProgress_callback extends Callback {

        int apply(int screenshotHandle, float flProgress);
    };

    public interface TakeStereoScreenshot_callback extends Callback {

        int apply(IntByReference pOutScreenshotHandle, Pointer pchPreviewFilename, Pointer pchVRFilename);
    };

    public interface SubmitScreenshot_callback extends Callback {

        int apply(int screenshotHandle, int type, Pointer pchSourcePreviewFilename, Pointer pchSourceVRFilename);
    };

    public IVRScreenshots_FnTable() {
        super();
    }

    protected List<?> getFieldOrder() {
        return Arrays.asList("RequestScreenshot", "HookScreenshot", "GetScreenshotPropertyType",
                "GetScreenshotPropertyFilename", "UpdateScreenshotProgress", "TakeStereoScreenshot",
                "SubmitScreenshot");
    }

    public IVRScreenshots_FnTable(Pointer peer) {
        super(peer);
        read();
    }

    public static class ByReference extends IVRScreenshots_FnTable implements Structure.ByReference {

    };

    public static class ByValue extends IVRScreenshots_FnTable implements Structure.ByValue {

    };
}
