/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools.filemgr;

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
public class FileListTest {
    
    public FileListTest() {
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
    public void test_FileList_load() {
        String exp = "{\n" +
"    \"api_key\":\"frQqOQu97qbR1QblbP8VhMlDTlRYSHI2ydPo0Nqz\",\n" +
"    \"noe\":1,\n" +
"    \"rover\":{\n" +
"                    \"curiosity\"\n" +
"    }\n" +
"}";
        FileList file = new FileList();
        if( !file.load("./settings.json") ){
            fail("It is not possible load the file.");
        }
        if( exp.equals(file.toString()) )
        {
            fail("the content file is not the same.");
        }
    }
    
}
