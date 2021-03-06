/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marisol.deo.photolist;

import java.util.ArrayList;
import marisol.deo.camera.Camera;
import marisol.deo.photo.Photo;
import tools.ArrayTools;

/**
 *
 * @author Augusto Flores
 */
class PhotoList_Logic extends PhotoList_DAO
{
    /**
     * It return a copy of the 
     * @return  It is the copy of the current object.
     */
    public PhotoList copy() {
        PhotoList res = new PhotoList();
        for( Photo photo : this.mPhotos )
        {
            res.add(photo.copy());
        }
        return res;
    }    
    /**
     * It collect all cameras of the current photos.
     * @return It is a list of the name of the cameras.
     */
    public ArrayList<Camera> getCameras(){
        ArrayList<Camera> res = new ArrayList<Camera>();
        if( mPhotos == null )
        {
            return res;
        }
        Camera camera;
        for( Photo photo : this.mPhotos )
        {
            camera =photo.getCamera();
            PhotoList.addString(res, camera);
        }
        return res;
    }
    /**
     * It search all phot take byu a camera and return t alist pf the photos.
     * @param camera It is the name of the camera.
     * @return It i sthe list ogçf photo of the camera.
     */
    public PhotoList getPhotoByCamera(Camera camera)
    {
        PhotoList res = new PhotoList();
        if( camera == null )
        {
            return res;
        }
        if( this.mPhotos == null )
        {
            return res;
        }
        for( Photo photo : this.mPhotos )
        {
            if( photo != null )
            {
                if( photo.getCamera().equalsTo( camera ) ){
                    res.add(photo);
                }
            }
        }
        return res;
    }
    /**
     * It search all photos taken in a specific earth date
     * @param name It is the earth date of the photo..
     * @return It i sthe list of photos taken in a earth date..
     */
    public PhotoList getPhotoByEarthDate(String earthDate)
    {
        PhotoList res = new PhotoList();
        if( earthDate == null )
        {
            return res;
        }
        if( this.mPhotos == null )
        {
            return res;
        }
        for( Photo photo : this.mPhotos )
        {
            if( photo != null )
            {
                if( photo.getEarthDate().equals(earthDate) ){
                    res.add(photo);
                }
            }
        }
        return res;
    }

}
