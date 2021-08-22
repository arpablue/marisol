/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marisol.entity.camera;

import marisol.deo.camera.Camera;

/**
 *
 * @author ASUS
 */
class CameraList_To extends CameraList_Logic
{
    @Override
    public String toString()
    {
        String res = "[";
        Camera cam;
        if( this.mCameras != null )
        {
            for( CameraEntity camera : this.mCameras )
            {
                 cam = camera.getCamera();
                res = res + "\n      "+cam.getId()+ " - "+cam.getName()+" - "+ cam.getFullName()+" - Photos("+camera.getAmount()+")";
            }
        }
        res = res + "\n]";
        return res;
    }
}
