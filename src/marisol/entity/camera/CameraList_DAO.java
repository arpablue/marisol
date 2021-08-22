/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marisol.entity.camera;

import java.util.ArrayList;
import marisol.deo.camera.Camera;
import marisol.deo.photolist.PhotoList;

/**
 *
 * @author ASUS
 */
class CameraList_DAO extends CameraList_Base
{
    protected ArrayList<CameraEntity> mCameras;
    protected PhotoList mPhotos;
    /**
     * Default Constructor.
     */
    public CameraList_DAO(){
        super();
        mCameras = new ArrayList<CameraEntity>();
        mPhotos = null;
    }
    /**
     * It added a camera zto the list, if the camera exists  then it os not added.
     * @params camera It is the camer to be added.
     */
    public void add(Camera camera)
    {
        if( camera == null)
        {
            return;
        }
        for( CameraEntity cam : this.mCameras )
        {
            if( cam.getCamera() == null )
            {
                continue;
            }
            if( camera.equalsTo(cam.getCamera()) ){
                return;
            }
        }
        CameraEntity c = new CameraEntity();
        c.setCamera(camera);
        
        if( this.mPhotos != null )
        {
            
            c.countPhotos(mPhotos);
        }
        this.mCameras.add(c);
        
    }
    /**
     * It specify a list of cameras.
     * @param cameras It is the list of camera
     */
    public void setCameraList( ArrayList<Camera> cameras)
    {
        this.mCameras = new ArrayList<CameraEntity>();
        if( cameras == null )
        {
            return;
        }
       
        for( Camera camera: cameras)
        {
            if(cameras != null )
            {
                this.add( camera );
            }
        }
    }
    /**
     * It return the current number of cameras.
     * @return 
     */
    public int size()
    {
        if( this.mCameras == null ){
            return -1;
        }
        return this.mCameras.size();
    }
    
}
