/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools.filemgr;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
class FileList_DAO extends FileList_Base
{
    /**
     * It is the text of the file.
     */
    protected ArrayList<String> mLines;
    /**
     * It is the path ofthe file to loaded.
     */
    protected String mPath;
    /**
     * Default constructor
     */
    public FileList_DAO()
    {
        mLines = new ArrayList<String>();
        
    }
    /**
     * It return the content of the file.
     * @return It is the content of the file.
     */
    public ArrayList<String> getContent()
    {
        return mLines;
    }
    /**
     * It is to specify the content of the file to be loaded.
     * @param path It is the path file.
     */
    protected void setPath( String path ){
        mPath = path;
    }
}
