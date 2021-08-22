/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools.logs;

/**
 *
 * @author Augusto Flores
 */
class Logger_Logic extends Logger_DAO{
    /**
     * 
     * @param msg 
     */
    protected void write( String msg )
    {
        System.out.println( msg );
    }
    /**
     * 
     * @param msg 
     */
    public void log( String msg )
    {
        this.write( msg );
    }
    /**
     * 
     * @param msg 
     */
    public void error( String msg )
    {
        this.log( "ERROR: "+msg );
    }
    /**
     * 
     * @param msg 
     */
    public void warning( String msg )
    {
        this.log( "warning: "+msg );
    }
    /**
     * Raise an info message
     * @param msg 
     */
    public void info( String msg )
    {
        this.log( "INFO: "+msg );
    }
}
