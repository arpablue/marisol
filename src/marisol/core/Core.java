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
import tools.logs.Logger;



/**
 *
 * @author Augusto Flores
 */
public class Core extends Core_To{
    /**
     * It contain a reference class for all application.
     */
    protected static Core CORE = null;
    /**
     * It return a unique instace of teh seting of teh applications
     * @return 
     */
    public static Core getCore()
    {
        if( CORE == null )
        {
            
            CORE = new Core();
            CORE.delete();
            CORE.loadJSONfile("settings.json");
        }
        return CORE;
    }
    /**
     * It return the KEY API to be used in the request of the application.
     * @return It is the API KEY.
     */
    public static String getKeyApi() {
        return Core.getCore().getKeyAPì_Settings();
    }
    /**
     * It return the list of rovers to e request in the system.
     * @return IOt is the list of rovers.
     */
    public static ArrayList<String> getRovers() {
        return Core.getCore().getRovers_Settings();
    }
}
