/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marisol.core;

/**
 *
 * @author ASUS
 */
class Core_To extends Core_DAO{
    /**
     * It returnt the data of the object in a JSON  format.
     * @return It the JOSN format of the data of the object.
     */
    @Override
    public String toString()
    {
        String res = "{";
        
        res = res + "\"api_key\":";
        
        if( this.mApiKey == null ){
            res = res + "null,";
        }else{
            res = res +"\"" + this.mApiKey +"\",";
        }
        
        res = res + "\"noe\":";
        if( this.mNoe < 1 ){
            res = res + "1,";
        }else{
            res = res +"\"" + this.mApiKey +"\",";
        }
        
        res = res + "\"noe\":[";
        boolean flag = false;
        for( String rover : this.mRovers )
        {
            if( flag )
            {
                res = res + ",";
            }
            res = res + "\""+rover+"\"";
            flag = true;
        }
        res = res + "]";
        
        res = res + "}";
        return res;
    }
    
}
