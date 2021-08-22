/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marisol.deo.photo;

/**
 *
 * @author Augusto Flores
 */
public class Photo extends Photo_To
{
    /**
     * It compare if the current phot is the same to another photo.
     * @param photo It is the another phot o to compare.
     * @return  It is true them both phot are the same.
     */
    public boolean equalsTo( Photo photo)
    {
        if( photo == null )
        {
            return false;
        }
        return ( photo.getId() == this.getId() );
    }

}
