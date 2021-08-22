/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marisol.entity;

import java.util.ArrayList;
import marisol.deo.photolist.PhotoList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tools.ArrayTools;

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
        System.out.println("--------------test_RoverEntity_getPhotobyMarSol");
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
        System.out.println("--------------test_RoverEntity_getPhotobyEarthDate");
        RoverEntity rover = new RoverEntity("curiosity");
        if( !rover.loadPhotoByEarthDate("2015-05-30") )
        {
            fail("The photos for ["+rover.getName()+"] rover has not been loaded");
        }
        if( rover.size() < 0 ){
            fail("No antennas has been loaded for the ["+rover.getName()+"] rover");
        }
    }
    @Test
    public void test_RoverEntity_getCameras(){
        System.out.println("--------------test_RoverEntity_getCameras");
        ArrayList<String> cameras = null;
        RoverEntity rover = new RoverEntity("curiosity");
        if( !rover.loadPhotoByMarsSol() ){
            fail("The photos for ["+rover.getName()+"] rover has not been loaded");
        }
        if( rover.size() < 0 ){
            fail("No antennas has been loaded for the ["+rover.getName()+"] rover");
        }
        cameras = rover.getPhotos().getCameras();
        if( cameras.size() < 1 ){
            fail("It is not possible get the list of the cameras.");
        }
    }

    @Test
    public void test_RoverEntity_getCameras_photoAmounts(){
        System.out.println("--------------test_RoverEntity_getCameras_photoAmounts");
        ArrayList<String> cameras = null;
        RoverEntity rover = new RoverEntity("curiosity");
        if( !rover.loadPhotoByMarsSol() ){
            fail("The photos for ["+rover.getName()+"] rover has not been loaded");
        }
        if( rover.size() < 0 ){
            fail("No antennas has been loaded for the ["+rover.getName()+"] rover");
        }
        cameras = rover.getPhotos().getCameras();
        PhotoList photos = null;
        for( String camera : cameras)
        {
            photos = rover.getPhotos().getPhotoByCameraName(camera);
            System.out.println("The ["+camera+"] camera has ["+photos.size()+"] photos.");
        }
        
    }
    @Test
    public void test_RoverEntity_EarthDate_getCameras_photoAmounts(){
        System.out.println("--------------test_RoverEntity_getCameras_photoAmounts");
        ArrayList<String> cameras = null;
        RoverEntity rover = new RoverEntity("curiosity");
        if( !rover.loadPhotoByEarthDate("2015-05-30")){
            fail("The photos for ["+rover.getName()+"] rover has not been loaded");
        }
        if( rover.size() < 0 ){
            fail("No antennas has been loaded for the ["+rover.getName()+"] rover");
        }
        cameras = rover.getPhotos().getCameras();
        PhotoList photos = null;
        for( String camera : cameras)
        {
            photos = rover.getPhotos().getPhotoByCameraName(camera);
            System.out.println("The ["+camera+"] camera has ["+photos.size()+"] photos.");
        }
        
    }
    
}
