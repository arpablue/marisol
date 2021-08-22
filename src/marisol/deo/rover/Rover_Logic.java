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
class Rover_Logic extends Rover_DAO 
{
    /**
     * It return a differnte object but with the same values of the current object.
     * @return it is the copy of the current object.
     */
    public Rover copy()
    {
        Rover res = new Rover();
        res.setId(mId);
        res.setName(mName);
        res.setStatus(mStatus);
        res.setLandingDate(mLandingDate);
        res.setLaunchDate(mLaunchDate);
        return res;
    }
}
