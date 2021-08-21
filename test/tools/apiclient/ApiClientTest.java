/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools.apiclient;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ASUS
 */
public class ApiClientTest {
    String mApiKey ="";
    int mSol;
    String mHost = "" ;
    String mEndPoint = "";
    
    public ApiClientTest() {
        mApiKey = "frQqOQu97qbR1QblbP8VhMlDTlRYSHI2ydPo0Nqz";
        mSol = 1000;
        mHost = "https://api.nasa.gov";
        mEndPoint = "/mars-photos/api/v1/rovers/curiosity/photos";
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
        ApiClient target = new ApiClient();
        String cur;
        target.setHost(mHost);
        target.setEndPoint( mEndPoint+"?sol="+mSol+"&api_key="+mApiKey );
        cur = target.get();
        System.out.println("Response:");
        System.out.println( cur );
        if( target.getStatus() > 299 ){
            fail("The GET request found some problems, the request status is: " + target.getStatus() );
        }
    }
    
}
