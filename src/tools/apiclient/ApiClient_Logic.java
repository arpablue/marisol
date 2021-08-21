/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools.apiclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.HttpURLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
class ApiClient_Logic extends ApiClient_DAO 
{

    private HttpURLConnection mCon;
    private int mTimeOut = 5000;
    

    /**
     * It send a GET request tot he endPoint,
     */
    public String get()
    {
        String res = null;
        try
        {
            
            if( this.getURL() == null )
            {
                error("( ApiClient - get ) The URL is not valid: "+this.getURL() );
                return null;
            }
            URL url = new URL( this.getURL() );
            //URL url = new URL("https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?sol=1000&api_key=frQqOQu97qbR1QblbP8VhMlDTlRYSHI2ydPo0Nqz");
            
            mCon = (HttpURLConnection) url.openConnection();
            
            mCon.setRequestMethod("GET");
            mCon.setConnectTimeout( mTimeOut );
            mCon.setReadTimeout(mTimeOut);
            
            int status =  mCon.getResponseCode();
            this.setStatus( status );
            if( status > 299 )
            {
                error("Status: "+status+" - Connection fails.");
                res = processError();
                
                if( res == null )
                {
                    error(  "( ApiClient_Logic - get ) Unknow error.");
                }else{
                    error(  "( ApiClient_Logic - get ) "+ res );
                }
                
                
            }else{
            
                info("Status: "+status+" - Connection success.");
                res = processResponse();
            }
        }catch(Exception e){
            this.error( "( ApiClient_Logic - get ) "+e.getMessage());
        }
        finally
        {
            if( mCon != null )
            {
                mCon.disconnect();
            }
            return res;
        }
    }
    /**
     * It process tthe response of the connection and return a string of this response.
     * @return It is the string that content the response.
     */
    protected String processResponse()
    {
        String res = null;
        try {
            res =  processInputStream( mCon.getInputStream() );
        } catch ( Exception e ) {
            error( "( ApiClient_Logic - processResponse ): "+ e.getMessage());
        }
        finally
        {
            return res;
        }
    }
    /**
     * It process the error from the connec-tio and return a single string with the errors.
     * @return It is the error of the connection.
     */
    protected String processError()
    {
        return processInputStream( mCon.getErrorStream() );
    }
    /**
     * It read the data from any InputStrream.
     * @param in It is the InputStream to be read.
     * @return It is the string that contents the data from the  inputStream.
     */
    protected String processInputStream( InputStream in)
    {
        String res = null;
        try
        {
            
            BufferedReader reader;
            StringBuffer content = new StringBuffer();

            reader = new BufferedReader( new InputStreamReader( in ) );
            String line = reader.readLine();
            while(  line   != null )
            {
                content.append( line );
                line = reader.readLine();
            }
            reader.close();
            res = content.toString();
        }catch( Exception e){
            error("( processError - processError ) "+e.getMessage());
        }
        finally{
            return res;
        }
    }
    
}
