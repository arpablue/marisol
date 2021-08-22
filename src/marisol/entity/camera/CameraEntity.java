/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marisol.entity.camera;

import marisol.deo.photo.Photo;
import marisol.deo.photolist.PhotoList;

/**
 *
 * @author ASUS
 */
public class CameraEntity extends CameraEntity_To
{
    /**
     * It take a list of photos and count the quantoty of photos to belong to the current camera.
     * @param photos It is the list of photos.
     */
    public void countPhotos( PhotoList photos){
        if( photos == null ){
            return;
        }
        Photo photo;
        int qty = 0;
        for( int i=0; i < photos.size(); i++){
           photo = photos.get(i);
           if( photo.getCamera() == null )
           {
               continue;
           }
           if( this.getCamera().equalsTo(photo.getCamera())){
               qty++;
           }
        }
        this.setAmount( qty );
    }
    
}
