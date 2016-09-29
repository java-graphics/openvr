/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vr;

import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author fschaefers
 */
public class IVRResources_FnTable extends Structure {

    /*
    uint32_t (OPENVR_FNTABLE_CALLTYPE *LoadSharedResource)(char * pchResourceName, char * pchBuffer, uint32_t unBufferLen);

     */
    public IVRResources_FnTable.LoadSharedResource_callback LoadSharedResource;
    /*
    uint32_t (OPENVR_FNTABLE_CALLTYPE *GetResourceFullPath)(char * pchResourceName, char * pchResourceTypeDirectory, char * pchPathBuffer, uint32_t unBufferLen);

     */
    public IVRResources_FnTable.GetResourceFullPath_callback GetResourceFullPath;

    public IVRResources_FnTable() {
        super();
    }

    public IVRResources_FnTable(Pointer peer) {
        super(peer);
        read();
    }

    public interface LoadSharedResource_callback extends Callback {

        int apply(Pointer pchResourceName, Pointer pchBuffer, int unBufferLen);
    };

    public interface GetResourceFullPath_callback extends Callback {

        int apply(Pointer pchResourceName, Pointer pchResourceTypeDirectory, Pointer pchPathBuffer, int unBufferLen);
    };

    @Override
    protected List getFieldOrder() {
        return Arrays.asList("LoadSharedResource", "GetResourceFullPath");
    }

    public static class ByReference extends IVRResources_FnTable implements Structure.ByReference {

    };

    public static class ByValue extends IVRResources_FnTable implements Structure.ByValue {

    };

}
