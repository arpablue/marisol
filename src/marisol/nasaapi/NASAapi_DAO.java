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
class NASAapi_DAO extends NASAapi_Base
{
   /**
     * It is the api key used foir the request to NASA api
     */
    protected String mApiKey;
    /**
     * It containt the rover to get  the data.
     */
    protected String mRover;
    /**
     * It specify the API Key to be used for the resquest to the NASA API.
     * @param apikey It is the api key.
     */
    public void setApiKey( String apikey )
    {
        this.mApiKey = apikey;
    }
    /**
     * It return the API Key used for the request of the API..
     * @return It is the API key.
     */
    public String getApiKey(){
        return this.mApiKey;
    }
    /**
     * It retyr the Api field uset for a get request.
     * @return It is the API KEY field.
     */
    protected String getKeyApiField()
    {
        return "api_key="+this.getApiKey();
    }
    /**
     * It specify the rover used to get the data from the NASA API.
     * @param rover 
     */
    public void setRover(String rover )
    {
        this.mRover = rover;
        
    }
    /**
     * It return tthe current rover used to get information form the NASA API.
     * @return It is the curernt rover used.
     */
    public String getRover()
    {
        return mRover;
    }
    /**
     * It return the Rover to be used in a GET request.
     * @return It is the rover field.
     */
    protected String getRoverField()
    {
        return "rover="+this.getRover();
    }
    /**
     * It return the query used to get photos in base of the Martian Sol.
     * @return It return the query to get the list of photos from Martian Sol.
     */
    protected String getPhotosByMartianSol_query(int sol)
    {
        if( this.getRover() == null ){
            warning("( ApiClient - getPhotosByMartianSol_query ) It is necesary specify a Rover.");
            return null;
        }
        if( this.getApiKey() == null ){
            warning("(ApiClient - getPhotosByMartianSol_query ) the pai key it is not specified.");
            return null;
        }
        if( sol < 1l ){
            sol = 1000;
        }
        String params = "sol="+sol +"&" + this.getKeyApiField();
        String endpoint ="/mars-photos/api/v1/rovers/"+this.getRover()+"/photos";
        String query = endpoint+"?"+params;
        return query;
    }
    /**
     * It return the query used to get photos in base of the Martian Sol.
     * @return It return the query to get the list of photos from Martian Sol.
     */
    protected String getPhotosByEarthDate_query(String earthDate)
    {
        if( this.getRover() == null ){
            return null;
        }
        if( this.getApiKey() == null ){
            return null;
        }
        if( earthDate == null ){
            return null;
        }
        String params = "earth_date="+earthDate +"&" + this.getKeyApiField();
        String endpoint ="/mars-photos/api/v1/rovers/"+this.getRover()+"/photos";
        String query = endpoint+"?"+params;
        return query;
    }
    
}
