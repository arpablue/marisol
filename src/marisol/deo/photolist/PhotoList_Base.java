/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marisol.deo.photolist;

import java.util.ArrayList;
import marisol.deo.camera.Camera;
import tools.logs.Logger;

/**
 *
 * @author Augusto Flores
 */
class PhotoList_Base extends Logger
{
        /**
     * It add a camera to a list of cameras, if the another string equalt to the string to be added then
     * the string the new string is not added.
     * @param list it is the list of string.
     * @param camera Itis the camera to be added.
     */
    public static void addString( ArrayList<Camera> list, Camera camera )
    {
        if( list == null )
        {
            return;
        }
        if( camera == null )
        {
            return;
        }
        for( Camera e : list )
        {
            if( e.equalsTo(camera) )
            {
                return;
            }
        }
        list.add(camera);
    } 

}
