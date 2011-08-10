package working;

import java.util.*;
/**
 *
 * @author [Ruobo + m2w]
 * @date [Aug 10, 2011 - 11:11:44 AM]
 */
public class TestingMapAndListNullGet {
    public static void main(String[] args){
        HashMap<String, String> m = new HashMap<String, String>();
        String l = "2";
        m.put("a", "b");
        l = m.get("B");
        System.out.println(l);
    }
}
