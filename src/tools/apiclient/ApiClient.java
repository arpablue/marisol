/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools.apiclient;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import marisol.deo.photolist.PhotoList;

/**
 * ApiClient
 * It class manage the host and th e request to conesume a Rest API server.
 * @author Augusto Flores
 * 
 */
public class ApiClient extends  ApiClient_To{

    public static String getCurrentDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }
       
}
