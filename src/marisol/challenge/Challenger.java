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
        boolean res = true;
        res = challenge1() & res ;
        res = challenge2() & res ;
        res = challenge3() & res ;
        res = challenge4() & res ;
        return res;
    } 
}
