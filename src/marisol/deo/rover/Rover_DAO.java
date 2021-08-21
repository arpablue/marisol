/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marisol.deo.rover;

import org.json.JSONObject;

/**
 *
 * @author ASUS
 */
class Rover_DAO extends Rover_Base
{
    /**
     * It contains the identifier of the rover
     */
    protected int mId;
    /**
     * It contiant the name of the rover
     */
    protected String mName;
    /**
     * It contiant the Rover identificator.
     */
    protected int mRoverId;
    /**
     * It contains the status of the reover.
     */
    protected String mStatus;
    /**
     * It contiant the Landing date.
     */
    protected String mLandingDate;
    /**
     * It contiant the Landing date.
     */
    protected String mLaunchDate;
    public Rover_DAO(){
        super();
        mRoverId = -1;
        mId = -1;
    }
    /**
     * It load the data form a JSONObject
     * @param data
     * @return 
     */
    public boolean fromJSON( JSONObject data )
    {
        boolean res = false;
        if( data == null ){
            return false;
        }
        try{
            mId = data.getInt("id");
            mRoverId = data.getInt("rover_id");
            mName = data.getString("name");
            mStatus = data.getString("status");
            mLandingDate = data.getString("landing_date");
            mLaunchDate = data.getString("launch_date");
            res = true;
        }catch( Exception e){
            error("( Rover_DAO - fromJSON ) "+e.getMessage() );
        }
        finally
        {
            return res;
        }
    }
}
