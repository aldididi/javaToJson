import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class readData {
    public static void main(String[] args) {
        String fileName = "data2.json";

        try {
            Object obj = new JSONParser().parse(new FileReader(fileName));
            JSONObject jsonObject = (JSONObject) obj;

            String name = (String) jsonObject.get("name");
            String age = (String) jsonObject.get("age");
            String hobby = (String) jsonObject.get("hobby");

            System.out.println(name);
            System.out.println(age);
            System.out.println(hobby);
        } catch (IOException | ParseException exception){
            exception.printStackTrace();
        }
    }
}
