/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marisol.entity.camera;

import marisol.deo.camera.Camera;
import marisol.deo.photolist.PhotoList;

/**
 *
 * @author ASUS
 */
public class CameraList extends CameraList_To {
    /**
     * It add aphoto list.
     * @param photos 
     */
    public void addPhotoList( PhotoList photos )
    {
        this.mPhotos = photos;
        this.countPhotos();
    }
    /**
     * It return the camera with the bigger number of photos.
     * @return It i sthe camera with the bigger number of photos.
     */
    public CameraEntity getCameraMaxAmount() {
        if( this.mCameras  == null )
        {
            return null;
        }
        CameraEntity res = null;
        for( CameraEntity camera : this.mCameras){
            if( res == null )
            {
                res = camera;
            }else{
                if( camera.getAmount() > res.getAmount() ){
                    res = camera;
                }
            }
            
        }
        return res;
    }
            
    /**
     * It return the camera with the lower number of photos.
     * @return It i sthe camera with the lower number of photos.
     */
    public CameraEntity getCameraMinAmount() {
        if( this.mCameras  == null )
        {
            return null;
        }
        CameraEntity res = null;
        for( CameraEntity camera : this.mCameras){
            if( res == null )
            {
                res = camera;
            }else{
                if( camera.getAmount() < res.getAmount() ){
                    res = camera;
                }
            }
            
        }
        return res;
    }
}
