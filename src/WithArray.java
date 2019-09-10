import java.util.Scanner;

public class WithArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInp = "";
        int numStu = 3;
        int[] grades = new int[numStu];

        int sum = 0;
        double avg = 0;
        boolean quit = false;

        for (int i = 0; i < grades.length; i++) { // for every integer in grades do something
            System.out.println("Enter a grade: ");
//            grades[i] = sc.nextInt();
            userInp = sc.nextLine();
            sum += grades[i];

            System.out.println("Press 'q' to quit or other key to continue.");
            userInp = sc.nextLine();
            if (userInp.equalsIgnoreCase("q")){
                break;
            }
        }
        avg = sum/numStu;
        System.out.println("Average: " + avg);
    }
}
