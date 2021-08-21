/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marisol.deo.photo;

import marisol.IJSON;
import marisol.deo.camera.Camera;
import marisol.deo.rover.Rover;
import org.json.JSONObject;

/**
 *
 * @author ASUS
 */
class Photo_DAO extends Photo_Base implements IJSON
{
    /**
     * It contains the identifier
     */
    protected int mId;
    /**
     * It contiant the Rover identificator.
     */
    protected int mSol;
    /**
     * It contains the status.
     */
    protected String mImgSrc;
    /**
     * It contiant the Landing date.
     */
    protected String mEarthDate;
    /**
     * It the camer who take the photo.
     */
    protected Camera mCamera;
    /**
     * It is the rover who belong the photo.
     */
    protected Rover mRover;
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
            mSol = data.getInt("sol");
            mImgSrc = data.getString("img_src");
            mEarthDate = data.getString("earth_date");

            JSONObject value =  data.getJSONObject("camera");
            if( value != null ){
                mCamera = new Camera();
                mCamera.fromJSON( value );
            }else{
                mCamera = null;
            }

            value =  data.getJSONObject("rover");
            if( value != null ){
                mRover = new Rover();
                mRover.fromJSON( value );
            }

            res = true;
        }catch( Exception e){
            error("( Photo_DAO - fromJSON ) "+e.getMessage() );
        }
        finally
        {
            return res;
        }
    }
}
