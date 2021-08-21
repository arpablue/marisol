/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marisol.deo.camera;

import marisol.deo.rover.Rover;
import org.json.JSONObject;
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
public class CameraTest {
    
    public CameraTest() {
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
    public void test_camera_fromJSON() {
        String exp = "{\"id\":20,\"name\":\"FHAZ\",\"rover_id\":5,\"full_name\":\"Front Hazard Avoidance Camera\"}";
         Camera camera = new Camera();
         
         JSONObject data = new JSONObject( exp );
         
         camera.fromJSON(data);
         
         String current = camera.toString();
         if( !exp.equals(current) )
         {
             System.out.println("exp-> "+exp);
             System.out.println("cur-> "+current);
             fail("The JSON string for Camera are not equals.");
         }
    }
    
}
