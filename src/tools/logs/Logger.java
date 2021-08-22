/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools.logs;

import java.io.File;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Augusto Flores
 */
public class Logger extends Logger_To {
        /**
    /**
     * It sage the data of all current phots using a file JSON format.
     * @param pathFile It is the path of the file.
     * @return It is true if the data has been created without problems.
     */
    public boolean save(String pathFile){
        boolean res = false;
        if( pathFile == null){
            return res;
        }
        try{
           File file = new File( pathFile );
           String dirPath = pathFile.replace(file.getName(), "");
           Path dirs = Paths.get(dirPath );
           Files.createDirectories(dirs) ;
           if( file.exists() && file.isFile() )
           {
               if(!file.delete())
               {
                   error("(Logger - save ) It is not possible delete the previous version of the ["+pathFile+"] file");
                   return res;
               }
           }
           RandomAccessFile writer = new RandomAccessFile(file, "rw");
           writer.writeBytes(this.toString());
           writer.close();
           res = true;
           info("The ["+pathFile+"] file has been created without problems.");
        }catch(Exception e){
            error("(Logger - save ) "+e.getMessage());
        }
        finally
        {
            return res;
        }
    }
    
    
}
