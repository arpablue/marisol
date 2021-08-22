/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marisol.challenge;

import marisol.deo.photolist.PhotoList;
import marisol.entity.RoverEntity;

/**
 *
 * @author Augusto Flores
 */
class Challenge_DAO extends Challenge_Base
{
    /**
     * This Rover contains the photos loadded fron the request for Martians Sol.
     */
    protected RoverEntity mRoverMS;
    /**
     * This Rover contains the photos loadded fron the request for Earth Date.
     */
    protected RoverEntity mRoverED;
    /**
     * It contian the name of the roiver be relize the analysis.
     */
    protected String mRoverName;
    /**
     * It contains the phot took form 1000 Martian Sol
     */
    protected PhotoList mPhotosMS;
    /**
     * It contains the phot took form 1000 EarthDatel
     */
    protected PhotoList mPhotosED;
    /**
     * It is to specify the name of treover to be evaluated.
     * @param name It is the name of the rover.
     */
    public void setRover( String name ){
        this.mRoverName = name;
        if( name == null){
            return;
        }
        this.mRoverED = new RoverEntity( name );
        this.mRoverMS = new RoverEntity( name );
    }
    /**
     * It return teh name of the rover.
     * @return it is the name of the rover
     */
    public String getRover(){
        return this.mRoverName;
    }
}
