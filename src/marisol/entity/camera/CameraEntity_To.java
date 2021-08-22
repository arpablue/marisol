/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marisol.entity.camera;

/**
 *
 * @author ASUS
 */
class CameraEntity_To extends CameraEntity_Logic
{
    /**
     * It return a string oin JSON format with the data of the camara and the amount of photos by camera.
     * @return It is a string twith the data of the camara in a JSON format.
     */
    @Override
    public String toString()
    {
        String res = "{";
        
        res = res + "\"camera\":";
        if( this.getCamera() == null ){
            res = res + "null,";
        }else{
            res = res + "\"" + this.getCamera().getFullName()+"("+this.getCamera().getId()+")\"";
        }
        
        res = res + ",\"photos_qty\":"+this.getAmount();
        res = res + "}";
        return res;
    }
}
