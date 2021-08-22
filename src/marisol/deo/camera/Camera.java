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
public class Camera extends Camera_To
{
    /**
     * It verify if the current camera is equals to another camera.
     * @param camera it is another cmare to verify if are the same.
     * @return it is true both cameras are the same camera.
     */
    public boolean equalsTo( Camera camera)
    {
        if( camera == null ){
            return false;
        }
        return ( this.getId() == camera.getId());
    }
}
