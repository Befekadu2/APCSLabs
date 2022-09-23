import java.util.Scanner;
/**
 * simple I/o project using Scanner
 * @version 09.23.2022
 * @author Bef Steinberg
 */

public class HolyGrail {
    /**
     * Main method if class HolyGrail
     *
     * @param args anything that is answered
     */
    public static void main(String[] args) {
        String name, quest, color;
        Scanner in = new Scanner (System.in);
        System.out.println(" A chat with the bridge keeper " +
                "Who would cross the Bridge of Death must answer me these" +
                "questions three, ere the other side he see");
        System.out.print("What is your name?");
        name = in.nextLine();
        System.out.print("What is your quest?:");
        quest = in.nextLine();
        System.out.print("What is your favorit color?:");
        color = in.nextLine();
        System.out.println("You have to know these things when you're a" + "king, you know");

        System.out.println("your name is:"+ name);
        System.out.println("your quest:" + quest);
        System.out.println("your favorit color:" + color);
        System.out.println("end of program");

    }

}
