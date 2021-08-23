/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marisol.challenge;

/**
 *
 * @author Augusto Flores
 */
public class Challenger extends Challenger_To
{
    /**
     * Default constructor.
     */
    public Challenger()
    {
        
    }
    /**
     * This contructor has as parameter the name of the rover to be evaluated.
     * @param roverName It i sthe name of the rover.
     */
    public Challenger( String roverName){
        this.setRover(roverName);
    }
    /**
     * It start hte evaluation of the rover, caver each point of the challenge.
     * @return It is true if al poijt of the evaluation pass.
     */
    public boolean evaluate(){
        String file = this.getFileName();
        
        this.setFile(this.getFolder()+"challenge");
        this.delete();
        boolean res = true;
        log("---STARTING THE EVALUATION OF ["+this.getRover()+"] ROVER ---");
        res = challenge1() ;
        if( res ){
            res = challenge2();
        }
        if( res ){
            res = challenge3();
        }
        if( res ){
            res = challenge4();
        }
        log("-------------------- FINAL RESULT -------------------");
        if( res ){
            success("THE EVALUATION CHALLENGE PASS WITHOUT PROBLEMS");
        }else{
            fail("THE EVALUATION CHALLENGE NOT PASS,some problems appears during the execution.");
        }
        log("For more detail of the activity.log, you can see the content of the activit.log in the folder execution.");
        log("-------------------- FINISH ----------------------------");
        
        this.setFile(file);
        
        return res;
    } 
}
