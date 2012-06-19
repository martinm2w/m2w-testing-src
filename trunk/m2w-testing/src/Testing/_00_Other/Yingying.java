/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing._00_Other;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author ruobo
 */
public class Yingying {
    public static void main(String[] args){
        String path = "/home/ruobo/Desktop/yy";
        Yingying yy = new Yingying();
        ArrayList<Double> dblist = yy.parseFile(path);
        yy.sum_up(dblist, 1189.43);
    }
    
    private ArrayList<Double> parseFile(String path){
        ArrayList<Double> list = new ArrayList<Double>();
        try{
            BufferedReader br = new BufferedReader(new FileReader(new File(path)));
            String thisLine = null;
            while((thisLine = br.readLine()) != null){
                System.out.println("[" +thisLine + "]");
                if(thisLine.isEmpty()) break;
                list.add(Double.parseDouble(thisLine));
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }
    
//    private ArrayList<HashMap<Integer, Double>> getSum (ArrayList<Double> input, Double request){
//        ArrayList<HashMap<Integer, Double>> result = new ArrayList<HashMap<Integer, Double>>();
//        for(int i = 0; i < input.size(); i++){
//            Double di = input.get(i);
//        }
//        return result;
//    }
    
    private void sum_up_recursive(ArrayList<Double> numbers, Double target, ArrayList<Double> partial) {
       Double s = 0.0;
       for (Double x: partial) s += x;
       if (s == target)
            System.out.println("sum("+Arrays.toString(partial.toArray())+")="+target);
       if (s >= target)
            return;
       for(int i=0;i<numbers.size();i++) {
             ArrayList<Double> remaining = new ArrayList<Double>();
             Double n = numbers.get(i);
             for (int j=i+1; j<numbers.size();j++) remaining.add(numbers.get(j));
             ArrayList<Double> partial_rec = new ArrayList<Double>(partial);
             partial_rec.add(n);
             sum_up_recursive(remaining,target,partial_rec);
       }
    }
    private void sum_up(ArrayList<Double> numbers, Double target) {
        sum_up_recursive(numbers,target,new ArrayList<Double>());
    }
    
    
}
