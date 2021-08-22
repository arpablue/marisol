/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marisol.deo.camera;

/**
 *
 * @author Augusto Flores
 */
class Camera_To extends Camera_Logic
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
        res = res + ",\"name\":";
        if( mName == null ) 
        {
            res = res + "null";
        }else{
            res = res + "\""+mName+"\"";
        }
        
        res = res + ",\"rover_id\":";
        if( this.mRoverId < 1 ) 
        {
            res = res + "null";
        }else{
            res = res + this.mRoverId;
        }

        res = res + ",\"full_name\":";
        if( mFullName == null ) 
        {
            res = res + "null";
        }else{
            res = res + "\""+mFullName+"\"";
        }
        res = res+"}";
        return res;
    }
    
}
