/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marisol.deo.rover;

/**
 *
 * @author Augusto Flores
 */
public class Rover extends Rover_To
{
    /**
     * It compare another rover with the çcurrent ruver to verify if both are the same.
     * @param rover it is another rpver to compare.
     * @return  If it is truie then both rover are the same.
     */
    public boolean equalsTo( Rover rover)
    {
        if( rover == null ){
            return false;
        }
        return ( this.getId() == rover.getId() );
    }
}
