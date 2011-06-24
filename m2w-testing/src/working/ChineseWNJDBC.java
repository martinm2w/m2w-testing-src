///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
package working;
//
import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;

/**
 *
 * @author ruobo
 * @date Jun 22, 2011
 */
public class ChineseWNJDBC {
//	====================================Attributes=============================================
     String dbms;
     String serverName;
     String portNumber;
     String dbName;
//      ===================================init & const============================================
    public ChineseWNJDBC(String dbms, String serverName, String portNumber, String dbName) {
        super();
        this.dbms = dbms;
        this.serverName = serverName;
        this.portNumber = portNumber;
        this.dbName = dbName;
    }
//	====================================main method============================================
    public static void main(String[] args){

        ArrayList<String> synset = new ArrayList<String>();
        ChineseWNJDBC jdbc = new ChineseWNJDBC("mysql", "localhost", "3306", "atur");
        try{
            Connection conn = jdbc.getConnection("root", "root");
            
            //manipulations here
            synset = jdbc.getChSynset("消失", conn);
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
//	===================================util methods============================================
    /**
     * m2w: this method is used to get the connection from the chinese wordnet database
     * @param username
     * @param password
     * @return
     * @throws SQLException
     * @date 6/22/11 1:08 PM
     */
    Connection getConnection(String username, String password) throws SQLException{
        Connection conn = null;
        
        Properties connectionProps = new Properties();
        connectionProps.put("user", username);
        connectionProps.put("password", password);
        System.out.println("testing props: " + connectionProps);
        
        if(this.dbms.equals("mysql")){
//            Class.forName("com.mysql.jdbc.Driver").newInstance(); //don't actually need
            conn = DriverManager.getConnection("jdbc:" + this.dbms + "://" + this.serverName + ":" + this.portNumber + "/" + this.dbName +"?useUnicode=true&amp;characterEncoding=UTF-8", connectionProps);
        }
        System.out.println("Connected to database");
        return conn;
    }

    /**
     *  m2w: this method is used to get the synsets of the chinese word.
     * 1. input chinese chars , get synset_id chiese, wn_chinese
     * 2. get english word's e_syn_id from wn_map
     * 3. look up the synset from wn_synset, 
     * 4. return the synset
     * 
     * @param word
     * @return the list of synsets
     * @date 6/22/11 1:14 PM
     */
    ArrayList<String> getChSynset(String word, Connection conn) throws SQLException{
        ArrayList<String> synset = new ArrayList<String>();
        //1. get synset_id chiese, wn_chinese
//        String sql = "SELECT synset_id, w_num, chinese FROM wn_chinese WHERE chinese = ?";
        String sql1 = "SELECT * FROM wn_chinese WHERE chinese LIKE BINARY ? ";
        PreparedStatement prest = conn.prepareStatement(sql1);
        prest.setString(1, word); //counted from 1
        ResultSet rs = prest.executeQuery();
//        System.out.println("query1 done..."); // result columns are counted from 1 
        ArrayList<ArrayList<String>> list1 = new ArrayList<ArrayList<String>>();
        while (rs.next()){
          ArrayList<String> tempList = new ArrayList<String>();
          String synset_id = rs.getString(1);
          String w_num = rs.getString(2);
          String chinese = rs.getString(3) ;
          tempList.add(synset_id);tempList.add(w_num);tempList.add(chinese);
          list1.add(tempList);
//          System.out.println(synset_id + "\t" + "- " + w_num + "-\t" + chinese);
         }
        System.out.println("list 1 is: " + list1);//ends step 1 
        
        
        //2 . looking for the english number for the chinese words
        ArrayList<ArrayList<String>> list2 = new ArrayList<ArrayList<String>>();
        for(ArrayList<String> templist : list1){
            String sql2 = "SELECT * FROM wn_map WHERE c_syn_id LIKE " + templist.get(0) + " AND c_syn_num LIKE " +  templist.get(1) ;
            ResultSet rs2 = prest.executeQuery(sql2);
//            System.out.println("query2 done..."); 
            while (rs2.next()){
              ArrayList<String> tempList = new ArrayList<String>();
              String s1 = rs2.getString(1);
              String s2 = rs2.getString(2);
              String s3 = rs2.getString(3);
              String s4 = rs2.getString(4);
              tempList.add(s1);tempList.add(s2);tempList.add(s3);tempList.add(s4);
              list2.add(tempList);
//              System.out.println(s1 + "\t" + "- " + s2 + "-\t" + s3 + "\t" + s4);
            }
        }
        System.out.println("list 2 is: " + list2);//ends step 2 for loop

        //3. get the synset from wn_synset
        ArrayList<ArrayList<String>> list3 = new ArrayList<ArrayList<String>>();
        for(ArrayList<String> templist : list2){
            String sql3 = "SELECT * FROM wn_synset WHERE synset_id LIKE " + templist.get(0) + " AND w_num LIKE " +  templist.get(1) ;
//            System.out.println(sql3);
            ResultSet rs3 = prest.executeQuery(sql3);
//            System.out.println("query3 done..."); 
            while (rs3.next()){
              ArrayList<String> tempList = new ArrayList<String>();
              String s1 = rs3.getString(1);
              String s2 = rs3.getString(2);
              String s3 = rs3.getString(3);
              String s4 = rs3.getString(4);
              String s5 = rs3.getString(5);
              String s6 = rs3.getString(6);
              String s7 = rs3.getString(7);
              String s8 = rs3.getString(8);
              tempList.add(s1);tempList.add(s2);tempList.add(s3);tempList.add(s4);tempList.add(s5);tempList.add(s6);tempList.add(s7);tempList.add(s8);
              list3.add(tempList);
//              System.out.println(s1 + "\t" + "- " + s2 + "-\t" + s3 + "\t" + s4);
            }
        }
        System.out.println("list 3 is: " + list3);
        return synset;
    }
    
    
    
    
    //    
////      =================================setters & getters=========================================
//    public static void main(String[] args) {
//      System.out.println("MySQL Connect Example.");
//      Connection conn = null;
//      String url = "jdbc:mysql://localhost:3306/";
//      String dbName = "atur";
//      String driver = "com.mysql.jdbc.Driver";
//      String userName = "root"; 
//      String password = "root";
//      try {
//      Class.forName(driver).newInstance();
//      conn = DriverManager.getConnection(url+dbName,userName,password);
//      System.out.println("Connected to the database");
//      conn.close();
//      System.out.println("Disconnected from database");
//      } catch (Exception e) {
//      e.printStackTrace();
//      }
//      }
}
