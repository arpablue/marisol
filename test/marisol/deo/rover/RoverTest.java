/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marisol.deo.rover;

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
public class RoverTest {
    
    public RoverTest() {
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
     * It verify the data loaded from a string with JSON format, has been loaded without problems
     */
    @Test
    public void test_Rover_fromJSON() {
        String exp = "{\"id\":5,\"name\":\"Curiosity\",\"status\":\"active\",\"landing_date\":\"2012-08-06\",\"launch_date\":\"2011-11-26\"}";
         Rover rover = new Rover();
         
         JSONObject data = new JSONObject( exp );
         
         rover.fromJSON(data);
         
         String current = rover.toString();
         if( !exp.equals(current) )
         {
             System.out.println("exp-> "+exp);
             System.out.println("cur-> "+current);
             fail("The JSON string for ROVER are not equals.");
         }
    }
    
}
