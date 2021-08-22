/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marisol.entity;

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
public class RoverEntityTest {
    
    public RoverEntityTest() {
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
     * It verify that rovcer con load photo using the Matrtians sol.
     */
    @Test
    public void test_RoverEntity_getPhotobyMarSol() 
    {
        RoverEntity rover = new RoverEntity("curiosity");
        if( !rover.loadPhotoByMarsSol() ){
            fail("The photos for ["+rover.getName()+"] rover has not been loaded");
        }
        if( rover.size() < 0 ){
            fail("No antennas has been loaded for the ["+rover.getName()+"] rover");
        }
    }
    
    /**
     * It verify that rover con load photo using the Matrtians sol.
     */
    @Test
    public void test_RoverEntity_getPhotobyEarthDate() 
    {
        RoverEntity rover = new RoverEntity("curiosity");
        if( !rover.loadPhotoByEarthDate("2015-05-30") )
        {
            fail("The photos for ["+rover.getName()+"] rover has not been loaded");
        }
        if( rover.size() < 0 ){
            fail("No antennas has been loaded for the ["+rover.getName()+"] rover");
        }
    }
    
}
