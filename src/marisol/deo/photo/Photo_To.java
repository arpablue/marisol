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
class Photo_To extends Photo_Logic
{
    /**
     * It return a JSON object related in a string with all the data of the camera.
     * @return 
     */
    @Override
    public String toString(){
        String res = "{";
        res = res + "\"id\":";
        if( mId < 1 )
        {
            res = res + "null";
        }else{
            res = res + mId;
        }
        
        res = res + ",\"sol\":";
        if( mSol < 0 ) 
        {
            res = res + "null";
        }else{
            res = res +mSol;
        }
        
        res = res + ",\"earth_date\":";
        if( this.mEarthDate == null ) 
        {
            res = res + "null";
        }else{
            res = res + "\""+ this.mEarthDate +"\"";
        }
        
        res = res + ",\"img_src\":";
        if( this.mImgSrc == null ) 
        {
            res = res + "null";
        }else{
            res = res + "\""+ this.mImgSrc +"\"";
        }
        
        res = res + ",\"camera\":";
        if( this.mRover == null ) 
        {
            res = res + "null";
        }else{
            res = res + this.mCamera;
        }
        
        res = res + ",\"rover\":";
        if( this.mRover == null ) 
        {
            res = res + "null";
        }else{
            res = res + this.mRover;
        }
        res = res + "}";
        return res;
    }
}
