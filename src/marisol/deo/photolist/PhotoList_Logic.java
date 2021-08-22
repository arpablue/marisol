/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marisol.deo.photolist;

import marisol.deo.photo.Photo;

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
            res.add(photo);
        }
        return res;
    }    
}
