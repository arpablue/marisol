/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools.apiclient;

/**
 * It class manage the request to the EndPoint.
 *
 * @author Augusto Flores
 */
class ApiClient_DAO extends ApiClient_Base {
    
    /**
     * It is the host of the API.
     */
    protected String mHost;
    /**
     * It is the endPoint of the API.
     */
    protected String mEndPoint;
    /**
     * It is the comunication port.
     */
    protected int mPort = 80;
    protected int mStatus = -1;
    /**
     * Default constructor.
     */
    public ApiClient_DAO()
    {        
        this( null, null );
    }
    /**
     * @param host It is the host of the REST API.
     */
    public ApiClient_DAO( String host ){
        this( host, null );
    }
    /**
     * @param host It is the host of the REST API.
     * @param endPoint It is the End Point for the request.
     */
    public ApiClient_DAO( String host , String endPoint ){
        this.setHost(host);
        this.setEndPoint(endPoint);
    }
    /**
     * It specify the RESP API server,
     *
     * @param host It is the host of the REST API server.
     */
    public void setHost(String host) {
        mHost = host;
    }

    /**
     * It return the host of the REST API
     *
     * @return
     */
    public String getHost() {
        return mHost;
    }

    /**
     * It specify the comunication pórt with the REST API HOST.
     *
     * @param endPoint It is the EndPoint to be request.
     */
    public void setEndPoint(String endPoint) {
        this.mEndPoint = endPoint;
    }

    /**
     * It returnthe current EndPoint.
     *
     * @return
     */
    public String getEndPoint() {
        return this.mEndPoint;
    }

    /**
     * It specify the current comunication port.
     *
     * @param port
     */
    public void setPort(int port) {
        this.mPort = port;
    }

    /**
     * It return the current cominication port.
     *
     * @return
     */
    public int getPort() {
        return this.mPort;
    }
    /**
     * It specify the id for the status of the request. 
     * @param status It is the id of the status of the request.
     */
    protected void setStatus( int status )
    {
        info("Request status("+status+").");
        mStatus = status;
    }
    /**
     * It returnt the current status. A -1 value means that no request has not been executed.
     * The Status vallue are the same of the statue of the HTTP commands.
     *     200 - Success
     *     300 - 
     *     400- 
     *     500 -
     * @return It is the id of the current status
     */
    public int getStatus()
    {
        return mStatus;
    }
    /**
     * It return the corresponding url related to the EndPoint and Host.
     * @return It is the URL to execute a request.
     */
    public String getURL()
    {
        if( this.getHost() == null )
        {
            return null;
        }
        String url = this.getHost();
        info( "Request URL: " + url );
        if( this.getEndPoint() != null )
        {
            url = url + this.getEndPoint();
        }
        return url;
    }
}
