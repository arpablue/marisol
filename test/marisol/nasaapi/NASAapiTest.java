/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marisol.nasaapi;

import marisol.deo.photolist.PhotoList;
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
public class NASAapiTest {
    
    public NASAapiTest() {
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
    /**
     * This test the request to photos usin the Martians sol.
     */
    @Test
    public void test_NASAapi_get_MartialSols() {
        NASAapi nasa = new NASAapi();
        nasa.setRover("curiosity");
        PhotoList photos = nasa.getPhotos_MartialSol();
        
        if( photos.size() < 1  )
        {
            fail("No photos has been loaded.");
        }
        
    }
    /**
     * This test varify the request get the photos related to the earth date.
     */
    @Test
    public void test_NASAapi_get_EarthDate() {
        NASAapi nasa = new NASAapi();
        nasa.setRover("curiosity");
        PhotoList photos = nasa.getPhotos_EarthDate();
        
        if( photos.size() < 1  )
        {
            fail("No photos has been loaded.");
        }
        
    }
    
    
}
