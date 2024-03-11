import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import org.json.simple.JSONObject;
public class writeData {

        public static void main(String[] args) throws IOException  {
            /*JSONObject obj = new JSONObject();
            obj.put("name","danu");
            obj.put("age","20");
            obj.put("hobby","watch");

            FileWriter file = new FileWriter("data.json", true);
            file.write(obj.toJSONString());
            file.close();

            System.out.println("json created");*/

           Scanner scan = new Scanner(System.in);
            String uName;
            String age;
            String hobby;

            //input
            System.out.println("nama");
            uName = scan.nextLine();

            System.out.println("umur");
            age = scan.nextLine();

            System.out.println("hobi");
            hobby = scan.nextLine();

            JSONObject obj = new JSONObject();
            obj.put("name",uName);
            obj.put("age",age);
            obj.put("hobby",hobby);

            FileWriter file = new FileWriter("data2.json", true);
            file.write(obj.toJSONString());
            file.close();

            System.out.println("json created");

            /*System.out.println("uname = " + uName);
            System.out.println("age = " + age);
            System.out.println("hobi = " + hobby);*/
        }
    }

