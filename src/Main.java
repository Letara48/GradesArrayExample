import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int grade = 0;
        int sum =0;
        double avg = 0;
        int numStu = 3;
        String userInp = "";
        Scanner sc = new Scanner(System.in);
        boolean quit = false;


        for(int i = 0; i < numStu; i++){
            System.out.println("Enter a grade: ");
            grade = sc.nextInt();
            sum += grade;

            sc.nextInt();

            System.out.println("Press \"quit\" to exit or " + "any other key to continue.");
            userInp = sc.nextLine();
            if(userInp.equalsIgnoreCase("Quit")){
                quit = true;
                System.out.println("Exiting loop");
                break;
            }
        }
        if(!quit){
            avg = sum / numStu;
            System.out.println("Calculating average of grades..." + avg);

        }else {
            System.out.println("Not applicable");
        }

    }
}
