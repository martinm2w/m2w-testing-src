/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing.FileIO;

import java.io.*;
/**
 *
 * @author ruobo
 * @date Jun 30, 2011
 */
public class FileAndDir {

    public static void main(String[] args){
        File newdir = new File("/home/ruobo/Desktop/nb1");
        File newfile = new File("/home/ruobo/Desktop/nb1/file1");

        try{
            boolean dir = newdir.mkdir();
            System.out.println("dir created: " + dir);
            if(newdir.isDirectory()){
                boolean fileok = newfile.createNewFile();
                System.out.println("file created: " + fileok);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }




}