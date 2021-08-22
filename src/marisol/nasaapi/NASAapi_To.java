/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marisol.nasaapi;

/**
 *
 * @author Augusto Flores
 */
class NASAapi_To extends NASAapi_Logic
{
    @Override
    public String toString(){
        String res = "{";
        
        res = res + "\"api_key\":";
        if( this.mApiKey == null )
        {
            res = res + "null,";
        }else{
            res = res +"\"" + this.mApiKey + "\",";
        }

        res = res + "\"rover\":";
        if( this.mRover == null )
        {
            res = res + "null";
        }else{
            res = res +"\"" + this.mRover + "\"";
        }
        
        res = res + "}";
        return res;
    }
}
