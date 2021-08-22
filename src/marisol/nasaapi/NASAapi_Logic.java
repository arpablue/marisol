/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marisol.nasaapi;

import marisol.core.Core;
import marisol.deo.photolist.PhotoList;
import tools.apiclient.ApiClient;

/**
 *
 * @author Augusto Flores
 */
class NASAapi_Logic extends NASAapi_DAO
{
    protected ApiClient mApi;
    /**
     * Defautl consructor.
     */
    public NASAapi_Logic()
    {
        super();
        mApi = new ApiClient();
        mApi.setHost(NASA_HOST);
        this.setApiKey( Core.getKeyApi() );
    }
    /**
     * It return a list of Photos accroding the number of sols used.
     * @param sol It is the number of Martian sol used.
     * @return It is hte List of Photo objects.
     */
    public PhotoList getPhotos_MartialSol(int sol)
    {
        mApi.setEndPoint( this.getPhotosByMartianSol_query( sol ) );
        String res =mApi.get();
        
        PhotoList photos = new PhotoList();
        photos.parser(res);
        
        return photos;
    }
    /**
     * It return a list of Photos using a 100 Martian sol by default.
     * @return It is hte List of Photo objects.
     */
    public PhotoList getPhotos_MartialSol()
    {
        return getPhotos_MartialSol(1000);
    }
    
    public PhotoList getPhotos_EarthDate( String earthDate )
    {
        mApi.setEndPoint( this.getPhotosByEarthDate_query( earthDate ) );
        String res =mApi.get();
        
        PhotoList photos = new PhotoList();
        photos.parser(res);
        
        return photos;
    }
    public PhotoList getPhotos_EarthDate()
    {
        String date = ApiClient.getCurrentDate();
        return getPhotos_EarthDate( date );
    }
}
