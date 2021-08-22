/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marisol.entity;

import marisol.deo.photolist.PhotoList;

/**
 *
 * @author Augusto Flores
 */
class RoverEntity_DAO  extends RoverEntity_Base
{
    public PhotoList mPhotos;
    /**
     * It is the name of the Rover.
     */
    protected String mName ;
    /**
     * It specify the name of the rovert.
     * @param name It is the name of the rover.
     */
    public void setName( String name )
    {
        mName = name;
    }
    /**
     * It return the name of the current name.
     * @return It is the current name.
     */
    public String getName()
    {
        return mName;
    }
    /**
     * It return all photos of the current rovert.
     * @return it is the list of photos.
     */
    public PhotoList getPhotos(){
        return mPhotos;
    }
    /**
     * It return an list with the quantity of photos specified.
     * @param qty It is the quntity to photos to be collected.
     * @return It is list of photos specified.
     */
    public PhotoList getPhoto( int qty){
        PhotoList res = new PhotoList();
        if( qty  < 1)
        {
            return res;
        }
        if( mPhotos == null )
        {
            return res;
        }
        if( mPhotos.size() <= qty )
        {
            return mPhotos.copy();
        }
        for( int i=0; i < qty; i++)
        {
            res.add( this.mPhotos.get(i) );
        }
        return res;
    }
    /**
     *  REturn the number of photos loades.
     * @return It i sthe quantity of photos.
     */
    public int size()
    {
        if( this.mPhotos == null )
        {
            return 0;
        }
        return this.mPhotos.size();
    }
    
}
