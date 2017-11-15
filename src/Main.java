import java.util.Scanner;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        User[] users = new User[4];


        users[0] = new User();
        users[0].user = "ionel";
        users[0].password = "a";


        users[1] = new User();
        users[1].user = "maria";
        users[1].password = "b";

        users[2] = new User();
        users[2].user = "ioana";
        users[2].password = "c";

        // citire user si parola de la tast

        String u = citireNume("da userul:");
        String p = citireNume("da parola:");
        int counter = 1;

        while (login(users, u, p) != true && counter < 3) {

            u = citireNume("da userul:");
            p = citireNume("da parola:");
            counter++;
        }

        // sunt logat
        if(counter < 3) {
            Runtime rs = Runtime.getRuntime();

            try {
                rs.exec("notepad");
            } catch (IOException e) {
                System.out.println(e);
            }
        }

        else {
            System.out.println("Incearca peste 30 de minute.");
        }

    }

    // 

    public static boolean login(User[] a, String u, String p) {

        boolean found = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != null)
                if (u.equalsIgnoreCase(a[i].user) && p.equalsIgnoreCase(a[i].password)) {
                    System.out.println("l-a gasit");
                    found = true;
                    break;
                }
        }
        return found;
    }


    public static String citireNume(String label) {
        System.out.print(label);
        Scanner scan = new Scanner(System.in);
        String vapor = scan.nextLine();
        return vapor;
    }

}