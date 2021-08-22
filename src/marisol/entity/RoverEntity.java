/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marisol.entity;

import marisol.nasaapi.Nasa;

/**
 *
 * @author Augusto Flores
 */
public class RoverEntity extends RoverEntity_To
{
    /**
     * Default constructor.
     */
    public RoverEntity()
    {
        
    }
    /**
     * It constructo has the name of the rove as parameter.
     * @param name It is the name of the rover.
     */
    public RoverEntity(String name)
    {
        this.setName(name);
    }
    /**
     * It load the photos of the current rover accordintg a number of Martian sol.
     * @param sol it i sthe number of Martians Sol.
     * @return It is true, the data has been loadedd without problems.
     */
    public boolean loadPhotoByMarsSol(int sol){
        if( this.getName() == null )
        {
            warning("( RoverEntity - loadPhotoByMarsSol ) It is not possible made a request if the name of the rover is not specified.");
            return false;
        }
        if( sol < 1){
            warning("( RoverEntity - loadPhotoByMarsSol ) It is not possible made a request if the quantity of sol is not specified.");
            return false;
        }
        this.mPhotos = Nasa.getPhotosByMarsSol(this.getName(), sol);
        if( this.mPhotos.size() < 1 )
        {
            error("( RoverEntity - loadPhotoByMarsSol ) No photos of the ["+this.getName()+"] rover has been loaded.");
            return false;
        }
        info("The photos for the ["+this.getName()+"] has been loaded without problems.");
        return true;
    }
    /**
     * It load the photos of the current rover accordintg a number of Martian sol, by default this quantity is 1000.
     * @return It is true, the data has been loadedd without problems.
     */
    public boolean loadPhotoByMarsSol(){
        return loadPhotoByMarsSol(1000);
    }
    /**
     * It load the photos of the current rover accordintg a number of Martian sol.
     * @param sol it i sthe number of Martians Sol.
     * @return It is true, the data has been loadedd without problems.
     */
    public boolean loadPhotoByEarthDate( String earthDate ){
        if( this.getName() == null )
        {
            warning("( RoverEntity - loadPhotoByEarthDate ) It is not possible made a request if the name of the rover is not specified.");
            return false;
        }
        if( earthDate == null ){
            warning("( RoverEntity - loadPhotoByEarthDate ) It is not possible made a request if the Earth Date  is not specified.");
            return false;
        }
        this.mPhotos = Nasa.getPhotosByEarthDate(this.getName(), earthDate);
        if( this.mPhotos.size() < 1 )
        {
            error("( RoverEntity - loadPhotoByEarthDate ) No photos of the ["+this.getName()+"] rover has been loaded.");
            return false;
        }
        info("The photos for the ["+this.getName()+"] has been loaded without problems. Total of ["+this.size()+"] photos.");
        return true;
    }
    
    
}
