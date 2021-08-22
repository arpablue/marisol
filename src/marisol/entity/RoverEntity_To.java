/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marisol.entity;

/**
 *
 * @author Augusto Flores
 */
class RoverEntity_To  extends RoverEntity_Logic
{
    /**
     * It return the data of teh rover in JSON format ina string.
     * @return 
     */
    @Override
    public String toString()
    {
        String res = "{";
        res = res  + "\"rover_name\":";
        if( this.getName() == null ){
            res = res + "null,";
        }else{
            res = res + "\""+this.getName()+"\",";
        }
        res = res +"\"photos\":";
        if( this.mPhotos == null)
        {
            res =res + "null,";
        }else{
            res = res + this.mPhotos.toString();
        }
        res = res + "}";
        return res;
    }
}
