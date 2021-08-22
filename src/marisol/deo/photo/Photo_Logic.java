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
class Photo_Logic extends Photo_DAO
{
    /**
     * It return a different object but with the same values of the current object.
     * @return It is a copy of the current object.
     */
    public Photo copy() {
        Photo res = new Photo();
        res.setId(mId);
        res.setEartDate(mEarthDate);
        res.setImgSrc(mImgSrc);
        res.setSol(mSol);
        if( this.getCamera() != null )
        {
            res.setCamera(mCamera.copy());
        }
        if( this.getRover() != null )
        {
            res.setRover(mRover.copy());
        }
        return res;
        
    }
    
}
