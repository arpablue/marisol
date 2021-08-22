/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marisol.challenge;

import marisol.deo.camera.Camera;
import marisol.deo.photolist.PhotoList;
import marisol.entity.camera.CameraEntity;
import marisol.entity.camera.CameraList;

/**
 *
 * @author ASUS
 */
class Challenge_Logic extends Challenge_DAO
{
    protected String mPhotosPath_MS;
    protected String mPhotos10Path_MS;
    protected String mPhotosPath_ED ;
    protected String mPhotos10Path_ED ;

    public Challenge_Logic(){
        
    }
    
    /**
     * It method evaluate the first scenario.
     * 1. Retrieve the first 10 Mars photos made by "Curiosity" on 1000 Martian sol. 
     * @return It is true if the scenario can be executed without problems.
     */
    protected boolean challenge1(){
        log("-------------------1º Point challenge for ["+this.getRover()+"]--------------------------------------");
        boolean res = true;
        mPhotosPath_MS = getFolder() +"Photos_Mars_Sol.json" ;
        mPhotos10Path_MS = getFolder() +"Photos_10_First_Mars_Sol.json" ;
        res = this.mRoverMS.loadPhotoByMarsSol();
        if( res ){
            this.mRoverMS.save(mPhotosPath_MS );
            this.mPhotosMS = this.mRoverMS.getPhoto( 10 );
             this.mPhotosMS.save(mPhotos10Path_MS );
        }
        log("--------------Final Result");
        if( res )
        {
            pass( "The 1º validation pass withtout probelms. ");
            log("    - The photos for 1000 Martians SOL of ["+this.getRover()+"] rover has been requested without problems.");
            log("    - The first 10 photos for 1000 Martians SOL of ["+this.getRover()+"] rover has been been saved in the "+ mPhotos10Path_MS +" file.");
            log("    - Data of the first 10' photos: ");
            log( mPhotosMS.toString() );

        }else{
            fail( "The 1º validation have problems to obtain the data of the photos. ");
        }
        
        log("------------------------------------------------------------------------------------------ ----------------");
        return res;
    }
    /**
     * It method evaluate the first scenario.
     * 2. Retrieve the first 10 Mars photos made by "Curiosity" on Earth date equal to 1000 Martian sol.
     * @return It is true if the scenario can be executed without problems.
     */
    protected boolean challenge2(){
        log("");
        log("-------------------2º Point challenge for ["+this.getRover()+"]-----------------------------------------");
        boolean res = true;
        mPhotosPath_ED = getFolder() +"Photos_Earth_Date.json" ;
        mPhotos10Path_ED = getFolder() +"Photos_10_Earth_Date.json" ;
        String earthDate = null;
        if ( this.mPhotosMS.size() < 1 ){
            error("No photos to be loaded to execute this scenario.");
            res = false;
        }
        
        earthDate = this.mPhotosMS.get(0).getEarthDate();
        
        if(res ){
        
            res = this.mRoverED.loadPhotoByEarthDate(earthDate);
            if( res ){
                this.mRoverED.save(mPhotosPath_ED );
                this.mPhotosED = this.mRoverED.getPhoto( 10 );
                 this.mPhotosED.save(mPhotos10Path_ED );
            }
        }
        log("");
        log("");
        log("--------------Final Result");
        if( res )
        {
            pass( "The 2º validation pass withtout probelms. ");
            log("    - The photos for 1000 Earth Date of ["+this.getRover()+"] rover has been requested without problems.");
            log("    - The first 10 photos for 1000 Earth Date of ["+this.getRover()+"] rover has been been saved in the "+ mPhotos10Path_ED +" file.");
            log("    - Data of the first 10' photos: ");
            log( mPhotosMS.toString() );

        }else{
            fail( "The 2º validation have problesm to obtain the data of the photos. ");
        }
        
        log("------------------------------------------------------------------------------------------ ----------------");
        log("");
        log("");
        return res;
    }
    /**
     * It method evaluate the first scenario.
     * 3. Retrieve and compare the first 10 Mars photos made by "Curiosity" on 1000 sol and on Earth date equal to 1000 Martian sol.
     * @return It is true if the scenario can be executed without problems.
     */
    protected boolean challenge3(){
        log("");
        log("");
        log("-------------------3º validation challenge for ["+this.getRover()+"]-----------------------------------------");
        String photosNotExist_MS = getFolder()+"photosNotExist_MS.json";
        String photosNotExist_ED = getFolder()+"photosNotExist_ED.json";
        
        log("The data for this validation point can be found in:");
        log("     - The first 10 photos from 1000 Martians sol resquest is in ["+this.mPhotos10Path_MS+"] file.");
        log("     - The first 10 photos from Earth Date sol resquest is in ["+this.mPhotos10Path_ED+"] file.");
        
        log("...Starting the phtoos comparison photos.");
        
        PhotoList photos_ms_not = this.mPhotosMS.getPhotosNotExist(mPhotosED);
        PhotoList photos_ed_not = this.mPhotosED.getPhotosNotExist(mPhotosMS);
        
        photos_ed_not.save(photosNotExist_MS);
        photos_ed_not.save(photosNotExist_ED);
        
        
        boolean res = true;
        if( photos_ms_not.size() < 1){
            success("All photos collecte by the 1000 Martians sol request exist in the Earth Date request.");
        }else{
            fail("Some photos form the 1000 Martians sol request do not exist in the Earth Date request.");
            log("Theses photos can be found in the ["+photosNotExist_MS+"] file.");
            log("The data of these photos are: ");
            log( photos_ed_not.toString() );
            res = false;
        }
        if( photos_ed_not.size() < 1){
            success("All photos collecte by the Earth Date  request exist in the 1000 Martians sol request.");
        }else{
            fail("Some photos form the Earth Date sol request do not exist in the 1000 Martians sol request.");
            log("Theses photos can be found in the ["+photosNotExist_ED+"] file.");
            log("The data of these photos are: ");
            log( photos_ed_not.toString() );
            res = false;
        }
        log("");
        log("");
        log("--------------Final Result");
        if( res ){
            pass("THIS VALIDATION POINT HAS PASS WITHOUT PROBLEMS");
        }else{
           fail("THIS VALIDATION POINT NOT PASS, some photos from one request not exist in the othe request, see the previous activity for more detail."); 
            log("The 1000 Martians Sol photos that not exist  can be found in the ["+photosNotExist_MS+"] file.");
            log("The EarthDate photos that not exist  can be found in the  ["+photosNotExist_ED+"] file.");
        }
        log("------------------------------------------------------------------------------------------ ----------------");
        log("");
        log("");        
        return res;
    }
    /**
     * It method evaluate the first scenario.
     * 4. Validate that the amounts of pictures that each "Curiosity" camera took on 1000 Mars sol is not greater than 10 times the amount taken by other cameras on the same date.
     * @return It is true if the scenario can be executed without problems.
     */
    protected boolean challenge4(){
        log("-------------------4º validation challenge for ["+this.getRover()+"]-----------------------------------------");
        boolean res = false;
        CameraList cameras = this.mRoverMS.getCameras();
        log("Iit is the list of cameras:");
        log(cameras.toString());
        CameraEntity maxCamera = cameras.getCameraMaxAmount();
        CameraEntity minCamera = cameras.getCameraMinAmount();
        int margin =  maxCamera.getAmount() - minCamera.getAmount();
        float times = ((float)margin) / ((float) minCamera.getAmount()) ;
        System.out.println("The difference is "+times+" times");
        int roundTimes = ((int)times);
        System.out.println("The round difference is "+roundTimes+" times");
        log("");
        log("");
        log("--------------Final Result");
        res = ( roundTimes < 10 );
        if( res ){
            pass("THE VALIDATION POINT PASSED the difference between the amount of photos is not bigger than 10 times.");
            log("The camera with lower quantity of photos is: ");
            log("      "+minCamera.toString());
            log("The camera with max quantity of photos is: ");
            log("      "+maxCamera.toString());
        }else{
            fail("THE VALIDATION POINT PASSED the difference between the amount of photos is not bigger than 10 times.");
            log("The camera with lower quantity of photos is: ");
            log("      "+minCamera.toString());
            log("The camera with max quantity of photos is: ");
            log("      "+maxCamera.toString());
            log("The dirences between the lower and bugger quantity of photos is "+times+" times");
        }
        log("------------------------------------------------------------------------------------------ ----------------");
        log("");
        log("");
        log("");
        return res;
    }
}
