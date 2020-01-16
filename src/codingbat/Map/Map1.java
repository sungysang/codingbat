package codingbat.map;

public class Map1 {

    public static Map<String, String> mapBully (Map<String, String> map) {

        for (String key : map.keySet()) {

            if (key == "a") {

                map.get("b") = map.get("a");
                map.get("a") = "";

            }
        }

        return map;
    }    
}