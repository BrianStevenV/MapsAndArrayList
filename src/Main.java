import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> myArr = new ArrayList<>();
        myArr.add(15);
        myArr.add(3);
        myArr.add(6);
        myArr.add(10);
        System.out.println(maxDiff(myArr));

        System.out.println("-------------------------------------------");
        System.out.println(" ");
        System.out.println("Exercise with Map");

        String nickname;
        String password;

        HashMap<String, String> auth = new HashMap();
        auth.put("sbriansav","b319");
        auth.put("briansav","brian");
        auth.put("colours","pink&greek");

        for (int i = 4; i >= 0; --i){
            Scanner sc = new Scanner(System.in);
            System.out.println("Join your nickname");
            nickname = sc.next();
            System.out.println("Join your password");
            password = sc.next();
            if(auth.containsKey(nickname) && auth.get(nickname).equals(password)){
                System.out.println("You're in Restricted zone");
                break;
            }   else{
                System.out.println("The app will be blocked in " + i);
            }
        }

        System.out.println("-------------------------------------------");
        System.out.println(" ");
        System.out.println("Exercise with List.");

        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(3);
        myList.add(7);

        int k = 8;

        for (int i = 0; i < myList.size() - 1; i++){
            for (int j = i + 1; j < myList.size(); j++){
                if(myList.get(i) + myList.get(j) == k) System.out.println(myList.get(i) + myList.get(j) + " es igual a: " + k );
            }
        }

    }

    public static int maxDiff(ArrayList<Integer> myArr) {
        int max = -1;
        int minor = myArr.get(0);
        for (int i = 1; i < myArr.size() - 1; i++) {
            for (int j = i + 1; j < myArr.size(); j++) {
                if (myArr.get(j) - myArr.get(i) > max) max = myArr.get(j) - myArr.get(i);
            }
        }
        return max;
    }
}
