/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marisol.entity.camera;

/**
 *
 * @author ASUS
 */
class CameraList_Logic extends CameraList_DAO
{
    /**
     * it count the quantity of all camera with the current Photo list.
     */
    protected void countPhotos(){
        if( this.mPhotos == null)
        {
            return;
        }
        if( this.mCameras == null )
        {
            return;
        }
        for( CameraEntity camera: this.mCameras )
        {
            camera.countPhotos(mPhotos);
        }
    }
}
