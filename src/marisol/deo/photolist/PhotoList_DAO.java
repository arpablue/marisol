/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marisol.deo.photolist;

import java.util.ArrayList;
import marisol.interfaces.IJSON;
import marisol.deo.photo.Photo;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author Augusto Flores
 */
class PhotoList_DAO extends PhotoList_Base 
{
    /**
     * It ist he gour of photost fromt he 
     */
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
    /**
     * It return the number photos.
     * @return It is the number of photos.
     */
    public int size(){
        return this.mPhotos.size();
    }
    /**
     * It add a photo.
     * @param photo it is the phot to be added. 
     */
    public void add( Photo photo )
    {
        if( this.mPhotos == null )
        {
            mPhotos = new ArrayList<Photo>();
        }
        mPhotos.add(photo);
    }
    /**
     * It return the potho specified by the index, if the photo not exists in the position specified then return 
     * null.
     * @param index It is the position of the photo.
     * @return It is the photo of the pósition specified.
     */
    public Photo get( int index )
    {
        if( index < 0 )
        {
            return null;
        }
        if( index >= this.size() )
        {
            return null;
        }
        return mPhotos.get(index);
    }
}
