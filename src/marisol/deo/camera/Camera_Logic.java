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
class Camera_Logic extends Camera_DAO
{
    /**
     * It return a different canera object, but with the sale values of the current object.
     * @return It is  copy of the current object.
     */
    public Camera copy()
    {
        Camera res = new Camera();
        res.setId( this.getId());
        res.setName(this.getName());
        res.setFullName( this.getFullName() );
        
        res.setRoverId(this.getRoverId());
        return res;
    }
}
