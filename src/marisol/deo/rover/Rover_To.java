/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marisol.deo.rover;

/**
 *
 * @author ASUS
 */
class Rover_To extends Rover_Logic 
{
    @Override
    public String toString(){
        String res = "{";
        res = res + "\""+this.mId +"\":";
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

        res = res + ",\"status\":";
        if( mStatus == null ) 
        {
            res = res + "null";
        }else{
            res = res + "\""+mStatus+"\"";
        }

        res = res + ",\"landing_date\":";
        if( this.mLandingDate == null ) 
        {
            res = res + "null";
        }else{
            res = res + "\""+mLandingDate+"\"";
        }
        res = res + ",\"landing_date\":";
        
        if( this.mLaunchDate == null ) 
        {
            res = res + "null";
        }else{
            res = res + "\""+mLaunchDate+"\"";
        }

        res = res + "}";
        return res;
    }
    
}
