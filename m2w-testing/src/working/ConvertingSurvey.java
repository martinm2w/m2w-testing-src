/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package working;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ruobo
 * @date Jun 7, 2011
 */
public class ConvertingSurvey {
//	====================================Attributes=============================================
    private ArrayList<String> allList = new ArrayList<String>();
//    private ArrayList<ArrayList<String>> listForEachPerson = new ArrayList<ArrayList<String>>();
    private String surveyDir = "";
    private ArrayList<File> files = null;
    private String[] htmlNames = null;
    public final int ROWS_OF_EACH_LIST = 14; // from first name to leader. how many rows
    
//      ===================================init & const============================================    
    public ConvertingSurvey(String dir){
        super();
        surveyDir = dir;
        File[] tempFileList = new File(dir).listFiles();
        files = new ArrayList(Arrays.asList(tempFileList));
        
    }
//	====================================main method============================================
    public static void main(String[] args){
        

        String input_dir = "/home/ruobo/develop/surveys/chinese_surveys/Nov_06_10/b";
        String output_file_path = "/home/ruobo/NetBeansProjects/testing-m2w/src/working/output/nov_06_B";

        ConvertingSurvey cs = new ConvertingSurvey(input_dir);
//        String[] names = {"Hoisha","Chu","C","Jia","peng","Sining","Jiaqian","Xinyuan","Yehui","Yunfan","Sheng","Hong"}; // nov 20 a
//        cs.htmlNames = new String[] {"Aixun","Chu","Haoli","Hong","Peng","F","Xiaojuan","Xinyuan","I","Yehui","Yunfan","Zhiming","M","N","O"}; // nov 13 a 10
//        cs.htmlNames = new String[] {"Chak","Haoshi","Jiahang","Jun","Mingxi","Mingzi","Ruizhi","Shan","I","wan","Yueming","L","M","N","O"}; // nov 13 b 10
//        cs.htmlNames = new String[] {"Hoisha","Jia","C","Lingli","Sheng","f","Shiwen","Ximeng","I","Xudong","K","Zhuocao","M","N","O"}; // nov 13 c 8
//        cs.htmlNames = new String[] {"Hoisha","Chu","C","Jia","peng","Sining","Jiaqian","Xinyuan","I","Yehui","Yunfan","Sheng","Hong","N","O"}; // nov 20 a 11
//        cs.htmlNames = new String[] {"Hoisha","Chu","C","Jia","peng","Sining","Jiaqian","Xinyuan","I","Yehui","Yunfan","Sheng","Hong","N","O"}; // nov 23 a 

//        cs.htmlNames = new String[] {"Hoisha","Jia","C","Lingli","Sheng","f","Shiwen","Ximeng","I","Xudong","K","Zhuocao","M","N","O"}; // nov 13 c 8
//        cs.htmlNames = new String[] {"A","Hong","Xiaojuan","Xiaojun","Zhiming","F","Jiaqian","Xinyuan","i","Yehui","Yunfan","Sheng","M","N","O"}; // nov 23a 9
//        cs.htmlNames = new String[] {"Ximeng","b","Shingsun","Yueming","Mingxi","Mingzi","Ruizhi","Jun","Yuheng","j","Xudong","l","Chak","N","O"}; // nov 23a 10
//        cs.htmlNames = new String[] {"Aixun","Hoisha","c","d","Jiaqian","Sining","Sheng","Shingsun","Shiwen","Yehui","Yunfan","l","M","N","O"}; // nov 16a 8
//        cs.htmlNames = new String[] {"Chak","Haoshi","Ximeng","Zhuocao","Mingxi","Mingzi","Ruizhi","Jun","i","j","Yueming","l","M","N","O"}; // nov 16b 9
//        cs.htmlNames = new String[] {"Aixun","Jia","Mingxuan","Hong","Peng","Shingsun","Sining","Zhuocao","i","Yehui","Yunfan","Zhiming","M","N","O"}; // nov 09a 11
//        cs.htmlNames = new String[] {"Haoshi","b","Jiahang","Jun","Mingxi","Mingzi","Ruizhi","Hoisha","Shiwen","Ximeng","k","Yuheng","M","N","O"}; // nov 09b 10
//        cs.htmlNames = new String[] {"Aixun","Chu","Haoli","Hong","Peng","f","Sining","Xiaojuan","Xinyuan","Yehui","Yunfan","Zhiming","M","N","O"}; // nov 06a 11
        cs.htmlNames = new String[] {"Chak","b","Jiahang","Jun","Mingxi","Mingzi","Ruizhi","Shan","Wan","Xiao","Yueming","Yuheng","M","N","O"}; // nov 06b 11
        

        int filesize = cs.files.size();
        
        for(int i = 0; i < filesize; i ++){
           File file = cs.files.get(i);
           System.err.println("doing file: " + file);
           ArrayList<String> listForEachPerson = cs.buildListForEachPerson(file, cs.htmlNames);
           cs.allList.addAll(listForEachPerson);
           listForEachPerson.clear();
        }
        
//        //testing allList -- ok 6/7/11 3:26 PM
//        for(String a : cs.allList){
//            System.out.println(a);
//        }
        
        cs.writeToFile(output_file_path, cs.allList);
        
        
    }
    
//	===================================util methods============================================

    
    private ArrayList<String> buildListForEachPerson(File file, String[] names){
        //get data from file
        ArrayList<String> data = new ArrayList<String>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String tempStr = "";
            while(!(tempStr = br.readLine()).equals("")){
//                System.out.println(tempStr);
                String[] tempDataArray = tempStr.split("=");
                if(tempStr.contains("reasons")){
                    break;
                }
                if(tempDataArray.length > 1){
                    String tempData = tempDataArray[1];
                    data.add(tempData);
                }else{
                    data.add(" ");
                }
                
            }
            br.close();
        } catch (IOException ex) {
            Logger.getLogger(ConvertingSurvey.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        
        //testing data --ok 6/7/11 3:05 PM
        System.out.println("temp Data size: " + data.size());
//        for(String a : data){
//            System.out.println(a);
//        }
        
        //add data to list
        ArrayList<String> tempList = new ArrayList<String>();
//        ArrayList<String> tempSubList = new ArrayList<String>();
        int i = 0;// data index
        int j = 0;// name index
        tempList.add("First Name" + "\t" + data.get(i));
        tempList.add("Email" + "\t" + data.get(++i));
        tempList.add("Time" + "\t" + data.get(++i));
        tempList.add("Communicate" + "\t" + data.get(++i));
        tempList.add("Over" + "\t" + data.get(++i));
        tempList.add("Differ" + "\t" + data.get(++i));
        tempList.add("Disagree" + "\t" + data.get(++i));
        tempList.add("\t" + names[0] + "\t" + names[1] +"\t" + names[2] +"\t" + names[3] +"\t" + names[4] +"\t" + names[5] +"\t" + names[6] +"\t" + names[7] +"\t" + names[8] +"\t" + names[9] +"\t" + names[10] +"\t" + names[11] +"\t" + names[12] +"\t" + names[13] +"\t" + names[14]);        
//        System.out.println(tempList.get(7)); //--ok
        //15 names with 15 data on each row
        tempList.add("Influential" + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i));
//        System.out.println(tempList.get(8));//ok
        tempList.add("Affected" + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i));
        tempList.add("Helped" + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i));
        tempList.add("Involved" + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i));
        tempList.add("Focused" + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i));
        tempList.add("Leader" + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i) + "\t" + data.get(++i));
        tempList.add("");
        tempList.add("");
        //testing -- ok 6/7/11 3:23 PM
//        for(String a : tempList){
//            System.out.println(a);
//        }
        return tempList;
    }
    
    private void writeToFile(String output, ArrayList<String> list){
        try {
            PrintWriter pr = new PrintWriter(output);
            for(String str : list){
                pr.println(str);
            }
            pr.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ConvertingSurvey.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//      =================================setters & getters=========================================

    /**
     * @return the surveyDir
     */
    public String getSurveyDir() {
        return surveyDir;
    }

    /**
     * @param surveyDir the surveyDir to set
     */
    public void setSurveyDir(String surveyDir) {
        this.surveyDir = surveyDir;
    }

    /**
     * @return the files
     */
    public ArrayList<File> getFiles() {
        return files;
    }

    /**
     * @param files the files to set
     */
    public void setFiles(ArrayList<File> files) {
        this.files = files;
    }

    /**
     * @return the allList
     */
    public ArrayList<String> getAllList() {
        return allList;
    }

    /**
     * @param allList the allList to set
     */
    public void setAllList(ArrayList<String> allList) {
        this.allList = allList;
    }
}
