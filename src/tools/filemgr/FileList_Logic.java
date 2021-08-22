/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools.filemgr;

import java.io.File;
import java.io.RandomAccessFile;

/**
 *
 * @author Augusto Flores
 */
class FileList_Logic extends FileList_DAO
{
    /**
     * It loadthe contne a file.
     * @param pathFile It is the paht of the file.
     * @return It is true the file has been loaded without problems.
     */
    public boolean load( String pathFile )
    {
        
        boolean res = false;
        if( pathFile == null )
        {
            return res;
        }
        try
        {
            this.setPath(mPath);
            File file = new File( pathFile );
            if( !file.exists() )
            {
                error("( FileList_DAO - load ) The ["+pathFile+"] file not exists.");
                return false;
            }
            if( !file.isFile() )
            {
                error("( FileList_DAO - load ) The ["+pathFile+"] file is not a file.");
                return false;
            }
            this.mLines.clear();
            RandomAccessFile reader = new RandomAccessFile( file, "r");
            info("Tthe ["+pathFile+"] file has been loaded without problems.");
            String line = reader.readLine();
            while( line != null )
            {
                mLines.add( line );
                line = reader.readLine();
            }
            reader.close();
            res = true;
        }catch( Exception e){
            error("( FileList_DAO - load ) "+e.getMessage());
        }
        finally
        {
            return res;
        }
    }
    
}
