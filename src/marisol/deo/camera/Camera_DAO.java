/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marisol.deo.camera;

import marisol.interfaces.IJSON;
import org.json.JSONObject;

/**
 *
 * @author Augusto Flores
 */
class Camera_DAO extends Camera_Base implements IJSON
{
    /**
     * It contains the identifier of the camera.
     */
    protected int mId;
    /**
     * It content the name of the camera
     */
    protected String mName;
    /**
     * It content the Rover identifier to beiong the current camera.
     */
    protected int mRoverId;
    /**
     * It is the full name of the cameras
     */
    protected String mFullName;
    /**
     * 
     * @return It is the id of the Camera.
     */
    public int getId()
    {
        return this.mId;
    }
    /**
     * 
     * @return It is the name of the camera.
     */
    public String getName()
    {
        return this.mName;
    }
    /**
     * 
     * @return It is the full name of the camera.
     */
    public String getFullName()
    {
        return this.mFullName;
    }
    /**
     * It is the rover who belong the camera.
     * @return 
     */
    public int getRoverId(){
        return this.mRoverId;
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
            mRoverId = data.getInt("rover_id");
            mName = data.getString("name");
            mFullName = data.getString("full_name");
            res = true;
        }catch( Exception e){
            error("( Camera_DAO - fromJSON ) "+e.getMessage() );
        }
        finally
        {
            return res;
        }
    }
}
