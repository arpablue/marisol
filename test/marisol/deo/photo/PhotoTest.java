/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marisol.deo.photo;

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
public class PhotoTest {
    
    public PhotoTest() {
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
    public void test_Photo_fromJSON() {
        String exp = "{\"id\":102694,\"sol\":1000,\"earth_date\":\"2015-05-30\",\"img_src\":\"http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/01000/opgs/edr/fcam/FRB_486265257EDR_F0481570FHAZ00323M_.JPG\",\"camera\":{\"id\":20,\"name\":\"FHAZ\",\"rover_id\":5,\"full_name\":\"Front Hazard Avoidance Camera\"},\"rover\":{\"id\":5,\"name\":\"Curiosity\",\"status\":\"active\",\"landing_date\":\"2012-08-06\",\"launch_date\":\"2011-11-26\"}}";
         Photo photo = new Photo();
         
         JSONObject data = new JSONObject( exp );
         
         photo.fromJSON(data);
         
         String current = photo.toString();
         if( !exp.equals(current) )
         {
             System.out.println("exp-> "+exp);
             System.out.println("cur-> "+current);
             fail("The JSON string for PHOTO are not equals.");
         }
    }
    
}
