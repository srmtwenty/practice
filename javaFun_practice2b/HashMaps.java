import java.util.HashMap;
import java.util.Set;

public class HashMaps{
    public static void main(String [] args){
        HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("Thriller", "It's close to midnight");
        userMap.put("Thriller", "It's close to midnight");
        userMap.put("Thriller", "It's close to midnight");
        userMap.put("Thriller", "It's close to midnight");

        Set<String> keys = userMap.keySet();
        for(String key: keys){
            System.out.println(key);
            System.out.println(userMap.get(key));
            System.out.println(String.format("%s: %s", key, userMap.get(key)));
        }
    }
}