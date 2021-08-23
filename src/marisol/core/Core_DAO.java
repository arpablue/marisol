/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marisol.core;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import tools.filemgr.FileList;

/**
 *
 * @author Augusto Flores
 */
class Core_DAO extends Core_Base 
{
    /**
     * It is the API KEy for the connection to the NASA.
     */
    protected String mApiKey;
    /**
     * It is the current number of execution of the project.
     */
    protected int mNoe;
    /**
     * It is the list of rovers to be requested.
     */
    protected ArrayList<String> mRovers;
    /**
     * Default constuctor.
     */
    protected Core_DAO()
    {
        super();
        mRovers = new ArrayList<String>();
    }
    /**
     * It return the KEY API specified tin the settings.
     * @return It is the KEY API.
     */
    public String getKeyAPì_Settings()
    {
        return this.mApiKey;
    }
    /**
     * It return the list of rovers specified in the settings.
     * @return It is the list of rovers.
     */
    public ArrayList<String> getRovers_Settings()
    {
        return this.mRovers;
    }
    /**
     * It load the data from a file with the JSON format.
     * @param path It is the parth of the file,
     * @return It i stue the data has been loaded without problem
     */
    protected boolean loadJSONfile(String path){
        FileList file = new FileList();
        if( !file.load(path) )
        {
            return false;
        }
        assignValues( file.toString() );
        return true;
    }
    /**
     * It extract the data from the JSON object to set in the members variables of the object.
     * @param json It is the a string with the JSON format of the data.
     */
    protected void assignValues(String json) {
        JSONObject data = new JSONObject( json );
        mRovers = new ArrayList<String>();
        mApiKey = data.getString("api_key");
        log("Loading the Api Key: "+mApiKey);
        mNoe = data.getInt("noe");
        JSONArray rovers = data.getJSONArray("rovers");
        String line = null;
        for( int i = 0; i < rovers.length(); i++ )
        {
            log("Rover identified: "+rovers.get(i).toString());
            mRovers.add( rovers.get(i).toString());
        }
    }
    
}
