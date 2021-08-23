/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marisol.challenge;

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
public class ChallengerTest {
    
    public ChallengerTest() {
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
     * Test of evaluate method, of class Challenger for the Curiosity rover.
     */
    @Test
    public void test_Challenger_Evaluate_curiosity() {
        Challenger target = new Challenger("curiosity");
        if( !target.evaluate() ){
            fail("The ["+target.getRover()+"] rover not pass all poijt of the challenge.");
        }
    }
    /**
     * Test of evaluate method, of class Challenger for the Opportunity rover.
     */
    @Test
    public void test_Challenger_Evaluate_Opportunity() {
        Challenger target = new Challenger("opportunity");
        if( !target.evaluate() ){
            fail("The ["+target.getRover()+"] rover not pass all poijt of the challenge.");
        }
    }
    /**
     * Test of evaluate method, of class Challenger for the Curiosity rover.
     */
    @Test
    public void test_Challenger_Evaluate_Spirit() {
        Challenger target = new Challenger("spirit");
        if( !target.evaluate() ){
            fail("The ["+target.getRover()+"] rover not pass all poijt of the challenge.");
        }
    }
    
}
