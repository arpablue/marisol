/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marisol.nasaapi;

import marisol.deo.photolist.PhotoList;

/**
 * It contain a single class to be refrence from any place in the application.
 * @author Augusto Flores
 */
public class Nasa {
    protected static NASAapi API;
    protected static NASAapi getAPI(){
        if( API == null )
        {
            API  = new NASAapi();
        }
        return API;
    }
    /**
     * It return the list of phot related to the number of Martian sol.
     * @param rover It is the name of the rover.
     * @param sol It is  quantity oif martians sol.
     * @return it is the number of photos related with the rover and number of Martians sol.
     */
    public static PhotoList getPhotosByMarsSol(String rover, int sol)
    {
        NASAapi api  = getAPI();
        api.setRover(rover);
        return api.getPhotos_MartialSol(sol);
        
    }
    /**
     * It return the list of phot related to the number of the Earth Date.
     * @param rover It is the name of the rover.
     * @param earthDate It is the earth date.
     * @return it is the number of photos related with the rover and number of Martians sol.
     */
    public static PhotoList getPhotosByEarthDate(String rover, String earthDate)
    {
        NASAapi api  = getAPI();
        api.setRover(rover);
        return api.getPhotos_EarthDate( earthDate);
    }
}
