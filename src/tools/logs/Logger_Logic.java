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
     * @param msg  It iks the message to the raised.
     */
    protected void write( String msg )
    {
        System.out.println( msg );
    }
    /**
     * 
     * @param msg  It iks the message to the raised.
     */
    public void log( String msg )
    {
        this.write( msg );
    }
    /**
     * 
     * @param msg  It iks the message to the raised.
     */
    public void error( String msg )
    {
        this.log( "ERROR: "+msg );
    }
    /**
     * 
     * @param msg  It iks the message to the raised. 
     */
    public void warning( String msg )
    {
        this.log( "warning: "+msg );
    }
    /**
     * Raise an info message
     * @param msg It iks the message to the raised.
     */
    public void info( String msg )
    {
        this.log( "INFO: "+msg );
    }
    /**
     * Raise an success message
     * @param msg It iks the message to the raised.
     */
    public void success( String msg )
    {
        this.log( "SUCCESS: "+msg );
    }
    /**
     * Raise an pass message
     * @param msg It iks the message to the raised.
     */
    public void pass( String msg )
    {
        this.log( "PASS: "+msg );
    }
    /**
     * Raise an info message
     * @param fail It iks the message to the raised.
     */
    public void fail( String msg )
    {
        this.log( "FAIL: "+msg );
    }
}
