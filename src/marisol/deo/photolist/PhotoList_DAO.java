/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marisol.deo.photolist;

import java.util.ArrayList;
import marisol.IJSON;
import marisol.deo.photo.Photo;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author ASUS
 */
class PhotoList_DAO extends PhotoList_Base 
{
    protected ArrayList<Photo> mPhotos;
    /**
     * Load the json data form a string with JSON format.
     * @param json It is the string that content a JSON format.
     * @return It is true the data has been loaded without problems.
     */
    public boolean parser( String json )
    {
        boolean res = false;
        mPhotos = new ArrayList<Photo>();
        if( json == null )
        {
            return false;
        }
        try{
            
            JSONObject jobj    = new JSONObject( json );
            if( jobj == null )
            {
                error(" (PhotoList_DAO - fromJSON ) It is not possible parse the json in the string.");
                return false;
            }
            JSONArray jlist = jobj.getJSONArray("photos");
            Photo photo;
            for (int i = 0; i < jlist.length(); i++) {
                photo = new Photo();
                if( photo.fromJSON(jlist.getJSONObject(i) ) )
                {
                    mPhotos.add(photo);
                }
                
              }
            res = true;
        }catch( Exception e){
            error(" (PhotoList_DAO - fromJSON ) "+e.getMessage());
        }
        finally
        {
            return res;
        }
    }
    
}
