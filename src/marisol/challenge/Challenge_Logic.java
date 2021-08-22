/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marisol.challenge;

/**
 *
 * @author ASUS
 */
class Challenge_Logic extends Challenge_DAO
{
    /**
     * It method evaluate the first scenario.
     * 1. Retrieve the first 10 Mars photos made by "Curiosity" on 1000 Martian sol. 
     * @return It is true if the scenario can be executed without problems.
     */
    protected boolean challenge1(){
        System.out.println("-------------------1º Point challenge for ["+this.getRover()+"]--------------------------------------");
        boolean res = true;
        res =  this.mRoverMS.loadPhotoByMarsSol();
        
        System.out.println("------------------------------------------------------------------------------------------ ----------------");
        return true;
    }
    /**
     * It method evaluate the first scenario.
     * 2. Retrieve the first 10 Mars photos made by "Curiosity" on Earth date equal to 1000 Martian sol.
     * @return It is true if the scenario can be executed without problems.
     */
    protected boolean challenge2(){
        System.out.println("-------------------2º Point challenge for ["+this.getRover()+"]--------------------------------------");
        
        System.out.println("------------------------------------------------------------------------------------------ ----------------");
        return true;
    }
    /**
     * It method evaluate the first scenario.
     * 3. Retrieve and compare the first 10 Mars photos made by "Curiosity" on 1000 sol and on Earth date equal to 1000 Martian sol.
     * @return It is true if the scenario can be executed without problems.
     */
    protected boolean challenge3(){
        System.out.println("-------------------3º Point challenge for ["+this.getRover()+"]--------------------------------------");
        
        System.out.println("------------------------------------------------------------------------------------------ ----------------");
        return true;
    }
    /**
     * It method evaluate the first scenario.
     * 4. Validate that the amounts of pictures that each "Curiosity" camera took on 1000 Mars sol is not greater than 10 times the amount taken by other cameras on the same date.
     * @return It is true if the scenario can be executed without problems.
     */
    protected boolean challenge4(){
        System.out.println("-------------------4º Point challenge for ["+this.getRover()+"]--------------------------------------");
        
        System.out.println("------------------------------------------------------------------------------------------ ----------------");
        return true;
    }
}
