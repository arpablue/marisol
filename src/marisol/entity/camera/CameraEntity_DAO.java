/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marisol.entity.camera;

import marisol.deo.camera.Camera;

/**
 *
 * @author ASUS
 */
class CameraEntity_DAO extends CameraEntity_Base
{
    /**
     * It is the camera.
     */
    protected Camera mCamera ;
    /**
     * It is the quantity of photos taked by a camera.
     */
    protected int mAmount;
    /**
     * it specifuy the camera.
     * @param camera It ist he camera assigned.
     */
    public void setCamera ( Camera camera ){
        mCamera = camera;
        mAmount = -1;
    }
    /**
     * 
     * @return It is the current camera.
     */
    public Camera getCamera(){
        return mCamera;
    }
    /**
     * It specify the ampount of photos taken by the camera.
     * @param amount It is the current amount of `hotos
     */
    protected  void setAmount(int amount )
    {
        mAmount = amount;
    }
    /**
     * 
     * @return It is the current amount pf photos of the camera.
     */
    public int getAmount(){
        return mAmount;
    }
}
