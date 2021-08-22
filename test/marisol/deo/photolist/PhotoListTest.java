/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marisol.deo.photolist;

import marisol.deo.photo.Photo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tools.apiclient.ApiClient;

/**
 *
 * @author ASUS
 */
public class PhotoListTest {
    String mApiKey ="";
    int mSol;
    String mHost = "" ;
    String mEndPoint = "";
    
    public PhotoListTest() {
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

   // @Test
    public void test_PhotoList_parser() {
        
        String json ="{" +
"\"photos\":[" +
"{" +
"\"id\":102693," +
"\"sol\":1000," +
"\"camera\":{" +
"\"id\":20," +
"\"name\":\"FHAZ\"," +
"\"rover_id\":5," +
"\"full_name\":\"Front Hazard Avoidance Camera\"" +
"}," +
"\"img_src\":\"http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/01000/opgs/edr/fcam/FLB_486265257EDR_F0481570FHAZ00323M_.JPG\"," +
"\"earth_date\":\"2015-05-30\"," +
"\"rover\":{" +
"\"id\":5," +
"\"name\":\"Curiosity\"," +
"\"landing_date\":\"2012-08-06\"," +
"\"launch_date\":\"2011-11-26\"," +
"\"status\":\"active\"" +
"}" +
"}," +
"{" +
"\"id\":102694," +
"\"sol\":1000," +
"\"camera\":{" +
"\"id\":20," +
"\"name\":\"FHAZ\"," +
"\"rover_id\":5," +
"\"full_name\":\"Front Hazard Avoidance Camera\"" +
"}," +
"\"img_src\":\"http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/01000/opgs/edr/fcam/FRB_486265257EDR_F0481570FHAZ00323M_.JPG\"," +
"\"earth_date\":\"2015-05-30\"," +
"\"rover\":{" +
"\"id\":5," +
"\"name\":\"Curiosity\"," +
"\"landing_date\":\"2012-08-06\"," +
"\"launch_date\":\"2011-11-26\"," +
"\"status\":\"active\"" +
"}" +
"}," +
"{" +
"\"id\":102850," +
"\"sol\":1000," +
"\"camera\":{" +
"\"id\":21," +
"\"name\":\"RHAZ\"," +
"\"rover_id\":5," +
"\"full_name\":\"Rear Hazard Avoidance Camera\"" +
"}," +
"\"img_src\":\"http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/01000/opgs/edr/rcam/RLB_486265291EDR_F0481570RHAZ00323M_.JPG\"," +
"\"earth_date\":\"2015-05-30\"," +
"\"rover\":{" +
"\"id\":5," +
"\"name\":\"Curiosity\"," +
"\"landing_date\":\"2012-08-06\"," +
"\"launch_date\":\"2011-11-26\"," +
"\"status\":\"active\"" +
"}" +
"}"+
"]"+
"}";
        System.out.println( json );
        PhotoList photos = new PhotoList();
        photos.parser(json);
        System.out.println( photos.toString() );
        
    }
    //@Test
    public void test_PhotoList_exits() {
        
        String json ="{" +
"\"photos\":[" +
"{" +
"\"id\":102693," +
"\"sol\":1000," +
"\"camera\":{" +
"\"id\":20," +
"\"name\":\"FHAZ\"," +
"\"rover_id\":5," +
"\"full_name\":\"Front Hazard Avoidance Camera\"" +
"}," +
"\"img_src\":\"http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/01000/opgs/edr/fcam/FLB_486265257EDR_F0481570FHAZ00323M_.JPG\"," +
"\"earth_date\":\"2015-05-30\"," +
"\"rover\":{" +
"\"id\":5," +
"\"name\":\"Curiosity\"," +
"\"landing_date\":\"2012-08-06\"," +
"\"launch_date\":\"2011-11-26\"," +
"\"status\":\"active\"" +
"}" +
"}," +
"{" +
"\"id\":102694," +
"\"sol\":1000," +
"\"camera\":{" +
"\"id\":20," +
"\"name\":\"FHAZ\"," +
"\"rover_id\":5," +
"\"full_name\":\"Front Hazard Avoidance Camera\"" +
"}," +
"\"img_src\":\"http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/01000/opgs/edr/fcam/FRB_486265257EDR_F0481570FHAZ00323M_.JPG\"," +
"\"earth_date\":\"2015-05-30\"," +
"\"rover\":{" +
"\"id\":5," +
"\"name\":\"Curiosity\"," +
"\"landing_date\":\"2012-08-06\"," +
"\"launch_date\":\"2011-11-26\"," +
"\"status\":\"active\"" +
"}" +
"}," +
"{" +
"\"id\":102850," +
"\"sol\":1000," +
"\"camera\":{" +
"\"id\":21," +
"\"name\":\"RHAZ\"," +
"\"rover_id\":5," +
"\"full_name\":\"Rear Hazard Avoidance Camera\"" +
"}," +
"\"img_src\":\"http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/01000/opgs/edr/rcam/RLB_486265291EDR_F0481570RHAZ00323M_.JPG\"," +
"\"earth_date\":\"2015-05-30\"," +
"\"rover\":{" +
"\"id\":5," +
"\"name\":\"Curiosity\"," +
"\"landing_date\":\"2012-08-06\"," +
"\"launch_date\":\"2011-11-26\"," +
"\"status\":\"active\"" +
"}" +
"}"+
"]"+
"}";
        PhotoList a = new PhotoList();
        a.parser(json);
        Photo b = a.get(2).copy();
       if( !a.exist(b) ){
           System.out.println( "List: "+a.toString());
           System.out.println("phot to search: "+b.toString());
           fail("the photo not exists.");
       }
    }
   @Test
    public void test_PhotoList_compare() {
        System.out.println("----------------test_PhotoList_compare");
        String json ="{" +
"\"photos\":[" +
"{" +
"\"id\":102693," +
"\"sol\":1000," +
"\"camera\":{" +
"\"id\":20," +
"\"name\":\"FHAZ\"," +
"\"rover_id\":5," +
"\"full_name\":\"Front Hazard Avoidance Camera\"" +
"}," +
"\"img_src\":\"http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/01000/opgs/edr/fcam/FLB_486265257EDR_F0481570FHAZ00323M_.JPG\"," +
"\"earth_date\":\"2015-05-30\"," +
"\"rover\":{" +
"\"id\":5," +
"\"name\":\"Curiosity\"," +
"\"landing_date\":\"2012-08-06\"," +
"\"launch_date\":\"2011-11-26\"," +
"\"status\":\"active\"" +
"}" +
"}," +
"{" +
"\"id\":102694," +
"\"sol\":1000," +
"\"camera\":{" +
"\"id\":20," +
"\"name\":\"FHAZ\"," +
"\"rover_id\":5," +
"\"full_name\":\"Front Hazard Avoidance Camera\"" +
"}," +
"\"img_src\":\"http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/01000/opgs/edr/fcam/FRB_486265257EDR_F0481570FHAZ00323M_.JPG\"," +
"\"earth_date\":\"2015-05-30\"," +
"\"rover\":{" +
"\"id\":5," +
"\"name\":\"Curiosity\"," +
"\"landing_date\":\"2012-08-06\"," +
"\"launch_date\":\"2011-11-26\"," +
"\"status\":\"active\"" +
"}" +
"}," +
"{" +
"\"id\":102850," +
"\"sol\":1000," +
"\"camera\":{" +
"\"id\":21," +
"\"name\":\"RHAZ\"," +
"\"rover_id\":5," +
"\"full_name\":\"Rear Hazard Avoidance Camera\"" +
"}," +
"\"img_src\":\"http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/01000/opgs/edr/rcam/RLB_486265291EDR_F0481570RHAZ00323M_.JPG\"," +
"\"earth_date\":\"2015-05-30\"," +
"\"rover\":{" +
"\"id\":5," +
"\"name\":\"Curiosity\"," +
"\"landing_date\":\"2012-08-06\"," +
"\"launch_date\":\"2011-11-26\"," +
"\"status\":\"active\"" +
"}" +
"}"+
"]"+
"}";
        PhotoList a = new PhotoList();
        PhotoList b = new PhotoList();
        a.parser(json);
        b = a.copy();
         PhotoList c = a.getPhotosNotExist( b );
        if( c.size()> 0){
            System.out.println("List: ");
            System.out.println(a.toString());
            System.out.println("List of no present: ");
            System.out.println(c.toString());
            fail("We have photos that are not presetn["+c.size()+"] ");
        }
    }
    
}
