/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marisol.entity;

import java.util.ArrayList;
import marisol.deo.camera.Camera;
import marisol.deo.photolist.PhotoList;
import marisol.entity.camera.CameraEntity;
import marisol.entity.camera.CameraList;
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
//    /**
//     * It verify that rovcer con load photo using the Matrtians sol.
//     */
//    @Test
//    public void test_RoverEntity_getPhotobyMarSol() 
//    {
//        System.out.println("--------------test_RoverEntity_getPhotobyMarSol");
//        RoverEntity rover = new RoverEntity("curiosity");
//        if( !rover.loadPhotoByMarsSol() ){
//            fail("The photos for ["+rover.getName()+"] rover has not been loaded");
//        }
//        if( rover.size() < 0 ){
//            fail("No antennas has been loaded for the ["+rover.getName()+"] rover");
//        }
//    }
//    
//    /**
//     * It verify that rover con load photo using the Matrtians sol.
//     */
//    @Test
//    public void test_RoverEntity_getPhotobyEarthDate() 
//    {
//        System.out.println("--------------test_RoverEntity_getPhotobyEarthDate");
//        RoverEntity rover = new RoverEntity("curiosity");
//        if( !rover.loadPhotoByEarthDate("2015-05-30") )
//        {
//            fail("The photos for ["+rover.getName()+"] rover has not been loaded");
//        }
//        if( rover.size() < 0 ){
//            fail("No antennas has been loaded for the ["+rover.getName()+"] rover");
//        }
//    }
//    @Test
//    public void test_RoverEntity_getCameras(){
//        System.out.println("--------------test_RoverEntity_getCameras");
//        ArrayList<Camera> cameras = null;
//        RoverEntity rover = new RoverEntity("curiosity");
//        if( !rover.loadPhotoByMarsSol() ){
//            fail("The photos for ["+rover.getName()+"] rover has not been loaded");
//        }
//        if( rover.size() < 0 ){
//            fail("No antennas has been loaded for the ["+rover.getName()+"] rover");
//        }
//        cameras = rover.getPhotos().getCameras();
//        if( cameras.size() < 1 ){
//            fail("It is not possible get the list of the cameras.");
//        }
//    }
//
//    @Test
//    public void test_RoverEntity_getCameras_photoAmounts(){
//        System.out.println("--------------test_RoverEntity_getCameras_photoAmounts");
//        ArrayList<Camera> cameras = null;
//        RoverEntity rover = new RoverEntity("curiosity");
//        if( !rover.loadPhotoByMarsSol() ){
//            fail("The photos for ["+rover.getName()+"] rover has not been loaded");
//        }
//        if( rover.size() < 0 ){
//            fail("No antennas has been loaded for the ["+rover.getName()+"] rover");
//        }
//        cameras = rover.getPhotos().getCameras();
//        PhotoList photos = null;
//        for( Camera camera : cameras )
//        {
//            photos = rover.getPhotos().getPhotoByCamera( camera );
//            System.out.println(rover.getName()+" - The ["+camera.getFullName()+"] camera has ["+photos.size()+"] photos.");
//        }
//        
//    }
//    @Test
//    public void test_RoverEntity_EarthDate_getCameras_photoAmounts(){
//        System.out.println("--------------test_RoverEntity_EarthDate_getCameras_photoAmounts");
//        ArrayList<Camera> cameras = null;
//        RoverEntity rover = new RoverEntity("curiosity");
//        if( !rover.loadPhotoByMarsSol() ){
//            fail("The photos for ["+rover.getName()+"] rover has not been loaded");
//        }
//        if( rover.size() < 0 ){
//            fail("No antennas has been loaded for the ["+rover.getName()+"] rover");
//        }
////        cameras = rover.getPhotos().getCameras();     
////        PhotoList photos = null;
////        for( Camera camera : cameras)
////        {
////            photos = rover.getPhotos().getPhotoByCamera(camera);
////            System.out.println( rover.getName()+" - The ["+camera.getFullName()+"] camera has ["+photos.size()+"] photos.");
////        }
//        
//        System.out.println("-------");
//        System.out.println("Quantity of photos: "+rover.getPhotos().size());
//        CameraList camlist = rover.getCameras();
//        System.out.println("Quantity of cameras: "+camlist.size());
//        System.out.println( camlist.toString() );
//        System.out.println("-------");
//        CameraEntity cam = rover.getCameraMaxPhotos();
//        System.out.println( "Camera with MAXimun number of photos is the "+cam.toString());
//        cam = rover.getCameraMinPhotos();
//        System.out.println( "Camera with MINimun number of photos is the "+cam.toString());
//        
//    }
}
