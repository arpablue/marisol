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
class PhotoList_To extends PhotoList_Logic
{
    @Override
    public String toString()
    {
        String res = "[";
        boolean flag = false;
        for( Photo photo : mPhotos )
        {
            if( flag )
            {
                res =  res + ",";
            }
            res = res + photo;
            flag = true;
        }
        res = res + "]";
        return res;
    }
}
