/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marisol.interfaces;

import org.json.JSONObject;

/**
 *
 * @author Augusto Flores
 */
public interface IJSON {
    /**
     * It collect data form a JSONObject for the current object.
     * @param data
     * @return 
     */
   boolean fromJSON( JSONObject data );
    
}
