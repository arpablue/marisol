/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marisol.deo.photolist;

import java.io.File;
import java.io.RandomAccessFile;
import marisol.deo.photo.Photo;

/**
 *
 * @author Augusto Flores
 */
public class PhotoList extends PhotoList_To
{

    /**
     * It verify if a photos ecist in the current list
     * @param photo It i sthe pjoto to verify if exists.
     * @return  it is true the phot exists.
     */
    public boolean  exist( Photo photo)
    {
        if( this.mPhotos == null )
        {
            return false;
        }
        if( photo == null )
        {
            return false;
        }
        
        for( Photo target : this.mPhotos )
        {
            if( target.equalsTo(photo) ){
                return true;
            }
        }
        System.out.println("NOT ->"+photo);
        return false;
    }
    /**
     * It return a list of photos that not exists in the another list of photos. if all photos
     * exist in the another photo list then the list will be empty.
     * @param photo It is the list of photos to verify if the current photos exist.
     * @return It is the list of photos that not exist in the another list of photo.
     */
    public PhotoList getPhotosNotExist( PhotoList photos )
    {
        PhotoList res = new PhotoList();
        if( photos == null ){
            return res;
        }
        for( Photo photo: this.mPhotos )
        {
            
            if( !photos.exist( photo ) )
            {
                
                res.add(photo);
            }
        }
        return res;
    }
    
}
