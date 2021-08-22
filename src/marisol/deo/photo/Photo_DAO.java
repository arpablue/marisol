/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marisol.deo.photo;

import marisol.interfaces.IJSON;
import marisol.deo.camera.Camera;
import marisol.deo.rover.Rover;
import org.json.JSONObject;

/**
 *
 * @author Augusto Flores
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
     * 
     * @param id It is the new identifier.
     */
    public void setId(int id)
    {
        this.mId = id;
    }
    /**
     * It is the new sol.
     * @param sol 
     */
    public void setSol( int sol){
        this.mSol = sol;
    }
    /**
     * It is the new iamge source.
     * @param imgSrc 
     */
    public void setImgSrc(String imgSrc )
    {
        this.mImgSrc = imgSrc;
    }
    /**
     * It is the new Earth Date.
     * @param earthDate 
     */
    public void setEartDate( String earthDate)
    {
        this.mEarthDate = earthDate;
    }
    /**
     * 
     * @param camera it is the new camera.
     */
    public void setCamera( Camera camera){
        this.mCamera = camera;
    }
    /**
     * 
     * @param rover It is the new orver.
     */
    public void setRover( Rover rover)
    {
        this.mRover = rover;
    }
    /**
     * It retyurn the ID of the photo.
     * @return 
     */
    public int getId()
    {
        return this.mId;
    }
    /**
     * 
     * @return It is the quantioty of Martians sol.
     */
    public int getSol()
    {
        return mSol;
    }
    /**
     * 
     * @return It is the  image resource.
     */
    public String getImgSrc()
    {
        return  this.mImgSrc;
    }
    /**
     * It return the Earth data of the photo.
     * @return It return the Earth data of the photo.
     */
    public String getEarthDate()
    {
        return this.mEarthDate;
    }
    /**
     * It return the camera whot take the photo.
     * @return It is the camera whot take the photo.
     */
    public Camera getCamera()
    {
        return this.mCamera;
    }
    /**
     * It return teh rover who take the photo.
     * @return It is the rover whoo take the photo.
     */
    public Rover getRover()
    {
        return this.mRover;
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
