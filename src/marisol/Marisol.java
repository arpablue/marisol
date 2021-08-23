/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marisol;

import marisol.challenge.Challenger;
import marisol.core.Core;

/**
 *
 * @author Augusto Flores
 */
public class Marisol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Challenger ch = new Challenger();
        for( String rover: Core.getRovers())
        {
            ch.setRover(rover);
            if( ch.evaluate() ){
                ch.pass("The evaluation for ["+rover+"] rover PASS without problems., Please review the data folder for more detail.");
                
            }else{
                ch.fail("The evaluation for ["+rover+"] rover FAIL,please review the data folder for more detail.");
            }
        }
    }
    
}
