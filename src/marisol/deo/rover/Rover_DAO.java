/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marisol.deo.rover;

import marisol.interfaces.IJSON;
import org.json.JSONObject;

/**
 *
 * @author Augusto Flores
 */
class Rover_DAO extends Rover_Base implements IJSON
{
    /**
     * It contains the identifier
     */
    protected int mId;
    /**
     * It contiant the name.
     */
    protected String mName;
    /**
     * It contains the status.
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
        mId = -1;
    }
    /**
     * It load the data form a JSONObject
     * @param data It is the JSON object that content the data for the Rover.
     * @return It is true if all data has been loaded without proiblems.
     */
    @Override
    public boolean fromJSON( JSONObject data )
    {
        boolean res = false;
        if( data == null ){
            return false;
        }
        try{
            mId = data.getInt("id");
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
