/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jopenvr;

import com.sun.jna.Callback;
import com.sun.jna.Structure;
import java.util.List;

/**
 *
 * @author GBarbieri
 */
public class IVRSystem extends Structure {

    public IVRSystem.GetProjectionMatrix_callback GetProjectionMatrix;

    public interface GetProjectionMatrix_callback extends Callback {

        jopenvr.HmdMatrix44_t.ByValue apply(int eEye, float fNearZ, float fFarZ, int eProjType);
    };

    @Override
    protected List getFieldOrder() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
