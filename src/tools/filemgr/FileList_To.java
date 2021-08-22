/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools.filemgr;

/**
 *
 * @author Augusto Flores
 */
class FileList_To extends FileList_Logic
{
    /**
     * It return the content of thje file in a single string
     * @return 
     */
    @Override
    public String toString()
    {
        if( this.mLines == null )
        {
            return "";
        }
        String res = "";
        for( String line : this.mLines )
        {
            res = res + line +"\n";
        }
        return res;
    }
}
