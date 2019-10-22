package com.company;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;


public class Main {

    static Scanner in = new Scanner(System.in);

    static SecureRandom rand = new SecureRandom();

    static int count = 0;
    static int right = 0;
    static int wrong = 0;
    static int problemtype;
    static int difficulty;

    int rand_int1 = rand.nextInt(10);
    int rand_int2 = rand.nextInt(10);


    public static void main(String[] args) {

        System.out.println("Here is a list of problem types:");
        System.out.println("Option 1: Addition problems");
        System.out.println("Option 2: Multiplication problems");
        System.out.println("Option 3: Subtraction problems");
        System.out.println("Option 4: Division problems");
        System.out.println("Option 5: Random mixture of all the previously stated problem types");

        System.out.println("Here is a list of difficulty levels:");
        System.out.println("Level 1: Single-digit problems");
        System.out.println("Level 2: Numbers as large as two digits");
        System.out.println("Level 3: Numbers as large as three digits");
        System.out.println("Level 4: Numbers as large as four digits");

        System.out.printf("Select the type of problem: ");
        problemtype = in.nextInt();
        System.out.printf("Select a difficulty level: ");
        difficulty = in.nextInt();

        for (int i = 0; i < 10; i++) {
            if (problemtype == 1 && difficulty == 1) {
                addition1();
            } else if (problemtype == 1 && difficulty == 2) {
                addition2();
            } else if (problemtype == 1 && difficulty == 3) {
                addition3();
            } else if (problemtype == 1 && difficulty == 4) {
                addition4();
            }


            if (problemtype == 2 && difficulty == 1) {
                multiplication1();
            } else if (problemtype == 2 && difficulty == 2) {
                multiplication2();
            } else if (problemtype == 2 && difficulty == 3) {
                multiplication3();
            } else if (problemtype == 2 && difficulty == 4) {
                multiplication4();
            }


            if (problemtype == 3 && difficulty == 1) {
                subtraction1();
            } else if (problemtype == 3 && difficulty == 2) {
                subtraction2();
            } else if (problemtype == 3 && difficulty == 3) {
                subtraction3();
            } else if (problemtype == 3 && difficulty == 4) {
                subtraction4();
            }


            if (problemtype == 4 && difficulty == 1) {
                division1();
            } else if (problemtype == 4 && difficulty == 2) {
                division2();
            } else if (problemtype == 4 && difficulty == 3) {
                division3();
            } else if (problemtype == 4 && difficulty == 4) {
                division4();
            }

            if (problemtype == 5 && difficulty == 1) {
                addition1();
                multiplication1();
                subtraction1();
                division1();
            } else if (problemtype == 5 && difficulty == 2) {
                addition2();
                multiplication2();
                subtraction2();
                division2();
            } else if (problemtype == 5 && difficulty == 3) {
                addition3();
                multiplication3();
                subtraction3();
                division3();
            } else if (problemtype == 5 && difficulty == 4) {
                addition4();
                multiplication4();
                subtraction4();
                division4();
            }

        }

        if(right>=7.5)
        {
            System.out.println("Congratulations, you are ready to go to the next level!");
        }
        else
        {
            System.out.println("Please ask your teacher for extra help.");
        }

        System.out.println("Number of questions answered correctly: " + right);
        System.out.println("Number of questions answered incorrectly: " + wrong);

    }



    public static void multiplication1() {
        int rand_int1 = rand.nextInt(10);
        int rand_int2 = rand.nextInt(10);
        double answer;

        System.out.println("How much is " + rand_int1 + " times " + rand_int2 + "?");
        answer = in.nextInt();

        if (answer == rand_int1 * rand_int2) {
            right();
            right++;
            count++;
        }
        else {
            wrong();
            wrong++;
            count++;
        }
    }


    public static void multiplication2() {
        int min = 10;
        int max = 99;
        int rand_int1 = rand.nextInt(max - min) + min;
        int rand_int2 = rand.nextInt(max - min) + min;
        double answer;

        System.out.println("How much is " + rand_int1 + " times " + rand_int2 + "?");
        answer = in.nextInt();

        if (answer == rand_int1 * rand_int2) {
            right();
            right++;
            count++;
        }
        else {
            wrong();
            wrong++;
            count++;
        }
    }


    public static void multiplication3() {
        int min = 100;
        int max = 999;
        int rand_int1 = rand.nextInt(max - min) + min;
        int rand_int2 = rand.nextInt(max - min) + min;
        double answer;

        System.out.println("How much is " + rand_int1 + " times " + rand_int2 + "?");
        answer = in.nextInt();

        if (answer == rand_int1 * rand_int2) {
            right();
            right++;
            count++;
        }
        else {
            wrong();
            wrong++;
            count++;
        }
    }


    public static void multiplication4() {
        int min = 1000;
        int max = 9999;
        int rand_int1 = rand.nextInt(max - min) + min;
        int rand_int2 = rand.nextInt(max - min) + min;
        double answer;

        System.out.println("How much is " + rand_int1 + " times " + rand_int2 + "?");
        answer = in.nextInt();

        if (answer == rand_int1 * rand_int2) {
            right();
            right++;
            count++;
        }
        else {
            wrong();
            wrong++;
            count++;
        }
    }

    public static void addition1() {
        int rand_int1 = rand.nextInt(10);
        int rand_int2 = rand.nextInt(10);
        double answer;

        System.out.println("What " + rand_int1 + " plus " + rand_int2 + "?");
        answer = in.nextInt();

        if (answer == rand_int1 + rand_int2) {
            right();
            right++;
            count++;
        }
        else {
            wrong();
            wrong++;
            count++;
        }
    }


    public static void addition2() {
        int min = 10;
        int max = 99;
        int rand_int1 = rand.nextInt(max - min) + min;
        int rand_int2 = rand.nextInt(max - min) + min;
        double answer;

        System.out.println("What " + rand_int1 + " plus " + rand_int2 + "?");
        answer = in.nextInt();

        if (answer == rand_int1 + rand_int2) {
            right();
            right++;
            count++;
        }
        else {
            wrong();
            wrong++;
            count++;
        }
    }


    public static void addition3() {
        int min = 100;
        int max = 999;
        int rand_int1 = rand.nextInt(max - min) + min;
        int rand_int2 = rand.nextInt(max - min) + min;
        double answer;

        System.out.println("What " + rand_int1 + " plus " + rand_int2 + "?");
        answer = in.nextInt();

        if (answer == rand_int1 + rand_int2) {
            right();
            right++;
            count++;
        }
        else {
            wrong();
            wrong++;
            count++;
        }
    }


    public static void addition4() {
        int min = 1000;
        int max = 9999;
        int rand_int1 = rand.nextInt(max - min) + min;
        int rand_int2 = rand.nextInt(max - min) + min;
        double answer;

        System.out.println("What " + rand_int1 + " plus " + rand_int2 + "?");
        answer = in.nextInt();

        if (answer == rand_int1 - rand_int2) {
            right();
            right++;
            count++;
        }
        else {
            wrong();
            wrong++;
            count++;
        }
    }


    public static void subtraction1() {
        int rand_int1 = rand.nextInt(10);
        int rand_int2 = rand.nextInt(10);
        double answer;

        System.out.println("What is " + rand_int1 + " minus " + rand_int2 + "?");
        answer = in.nextInt();

        if (answer == rand_int1 - rand_int2) {
            right();
            right++;
            count++;
        }
        else {
            wrong();
            wrong++;
            count++;
        }
    }


    public static void subtraction2() {
        int min = 10;
        int max = 99;
        int rand_int1 = rand.nextInt(max - min) + min;
        int rand_int2 = rand.nextInt(max - min) + min;
        double answer;

        System.out.println("What is " + rand_int1 + " minus " + rand_int2 + "?");
        answer = in.nextInt();

        if (answer == rand_int1 - rand_int2) {
            right();
            right++;
            count++;
        }
        else {
            wrong();
            wrong++;
            count++;
        }
    }


    public static void subtraction3() {
        int min = 100;
        int max = 999;
        int rand_int1 = rand.nextInt(max - min) + min;
        int rand_int2 = rand.nextInt(max - min) + min;
        double answer;

        System.out.println("What is " + rand_int1 + " minus " + rand_int2 + "?");
        answer = in.nextInt();

        if (answer == rand_int1 - rand_int2) {
            right();
            right++;
            count++;
        }
        else {
            wrong();
            wrong++;
            count++;
        }
    }


    public static void subtraction4() {
        int min = 1000;
        int max = 9999;
        int rand_int1 = rand.nextInt(max - min) + min;
        int rand_int2 = rand.nextInt(max - min) + min;
        double answer;

        System.out.println("What is " + rand_int1 + " minus " + rand_int2 + "?");
        answer = in.nextInt();

        if (answer == rand_int1 - rand_int2) {
            right();
            right++;
            count++;
        }
        else {
            wrong();
            wrong++;
            count++;
        }
    }


    public static void division1() {
        int rand_int1 = rand.nextInt(10);
        int rand_int2 = rand.nextInt(10);
        double answer;


        System.out.print("What is ");
        System.out.printf("%.2f", (double)rand_int1);
        System.out.print(" divided by ");
        System.out.printf("%.2f", (double)rand_int2);
        System.out.print("?\n");
        answer = in.nextDouble();

        double total_number = (((double)rand_int1) / rand_int2);


        if (Math.abs ((((double)rand_int1) / rand_int2) - answer) < 0.01) {
            right();
            right++;
            count++;
        }
        else {
            wrong();
            wrong++;
            count++;
        }
    }


    public static void division2() {
        int min = 10;
        int max = 99;
        int rand_int1 = rand.nextInt(max - min) + min;
        int rand_int2 = rand.nextInt(max - min) + min;
        double answer;

        System.out.print("What is ");
        System.out.printf("%.2f", (double)rand_int1);
        System.out.print(" divided by ");
        System.out.printf("%.2f", (double)rand_int2);
        System.out.print("?\n");
        answer = in.nextDouble();

        if (Math.abs ((((double)rand_int1) / rand_int2) - answer) < 0.01) {
            right();
            right++;
            count++;
        }
        else {
            wrong();
            wrong++;
            count++;
        }
    }


    public static void division3() {
        int min = 100;
        int max = 999;
        int rand_int1 = rand.nextInt(max - min) + min;
        int rand_int2 = rand.nextInt(max - min) + min;
        double answer;

        System.out.print("What is ");
        System.out.printf("%.2f", (double)rand_int1);
        System.out.print(" divided by ");
        System.out.printf("%.2f", (double)rand_int2);
        System.out.print("?\n");
        answer = in.nextDouble();

        if (Math.abs ((((double)rand_int1) / rand_int2) - answer) < 0.01) {
            right();
            right++;
            count++;
        }
        else {
            wrong();
            wrong++;
            count++;
        }
    }


    public static void division4() {
        int min = 1000;
        int max = 9999;
        int rand_int1 = rand.nextInt(max - min) + min;
        int rand_int2 = rand.nextInt(max - min) + min;
        double answer;

        System.out.print("What is ");
        System.out.printf("%.2f", (double)rand_int1);
        System.out.print(" divided by ");
        System.out.printf("%.2f", (double)rand_int2);
        System.out.print("?\n");
        answer = in.nextDouble();

        if (Math.abs ((((double)rand_int1) / rand_int2) - answer) < 0.01) {
            right();
            right++;

        }
        else {
            wrong();
            wrong++;

        }
    }






















    public static void right() {
        int choose = rand.nextInt(4);
        switch (choose) {
            case 0:
                System.out.println("Very good!");
                break;
            case 1:
                System.out.println("Excellent!");
                break;
            case 2:
                System.out.println("Nice work!");
                break;
            case 3:
                System.out.println("Keep up the good work!");
                break;
        }
        for (count = 0; count == 10; count++) {
            if (problemtype == 1 && difficulty == 1) {
                addition1();
            } else if (problemtype == 1 && difficulty == 2) {
                addition2();
            } else if (problemtype == 1 && difficulty == 3) {
                addition3();
            } else if (problemtype == 1 && difficulty == 4) {
                addition4();
            }
            else if (count == 10)
            {
                break;
            }
        }
        for (count = 0; count == 10; count++) {
            if (problemtype == 2 && difficulty == 1) {
                multiplication1();
            } else if (problemtype == 2 && difficulty == 2) {
                multiplication2();
            } else if (problemtype == 2 && difficulty == 3) {
                multiplication3();
            } else if (problemtype == 2 && difficulty == 4) {
                multiplication4();
            }
        }
        for (count = 0; count == 10; count++) {
            if (problemtype == 3 && difficulty == 1) {
                subtraction1();
            } else if (problemtype == 3 && difficulty == 2) {
                subtraction2();
            } else if (problemtype == 3 && difficulty == 3) {
                subtraction3();
            } else if (problemtype == 3 && difficulty == 4) {
                subtraction4();
            }
        }
        for (count = 0; count == 10; count++) {
            if (problemtype == 4 && difficulty == 1) {
                division1();
            } else if (problemtype == 4 && difficulty == 2) {
                division2();
            } else if (problemtype == 4 && difficulty == 3) {
                division3();
            } else if (problemtype == 4 && difficulty == 4) {
                division4();
            }
        }

        /*if (count == 10 && right >= 7.5) {
            System.out.println("Congratulations, you are ready to go to the next level!");
        } else {
            System.out.println("Please ask your teacher for extra help.");
        }*/
    }


    public static void wrong() {
        int choose2 = rand.nextInt(4);
        switch (choose2) {
            case 0:
                System.out.println("No. Please try again.");
                break;
            case 1:
                System.out.println("Wrong. Try once more.");
                break;
            case 2:
                System.out.println("Don't give up!");
                break;
            case 3:
                System.out.println("No. Keep trying.");
                break;
        }
        for (count = 0; count == 10; count++) {
            if (problemtype == 1 && difficulty == 1) {
                addition1();
            } else if (problemtype == 1 && difficulty == 2) {
                addition2();
            } else if (problemtype == 1 && difficulty == 3) {
                addition3();
            } else if (problemtype == 1 && difficulty == 4) {
                addition4();
            }
        }
        for (count = 0; count == 10; count++) {
            if (problemtype == 2 && difficulty == 1) {
                multiplication1();
            } else if (problemtype == 2 && difficulty == 2) {
                multiplication2();
            } else if (problemtype == 2 && difficulty == 3) {
                multiplication3();
            } else if (problemtype == 2 && difficulty == 4) {
                multiplication4();
            }
        }
        for (count = 0; count == 10; count++) {
            if (problemtype == 3 && difficulty == 1) {
                subtraction1();
            } else if (problemtype == 3 && difficulty == 2) {
                subtraction2();
            } else if (problemtype == 3 && difficulty == 3) {
                subtraction3();
            } else if (problemtype == 3 && difficulty == 4) {
                subtraction4();
            }
        }
        for (count = 0; count == 10; count++) {
            if (problemtype == 4 && difficulty == 1) {
                division1();
            } else if (problemtype == 4 && difficulty == 2) {
                division2();
            } else if (problemtype == 4 && difficulty == 3) {
                division3();
            } else if (problemtype == 4 && difficulty == 4) {
                division4();
            }
        }


        /*if (right >= 7.5) {
                    System.out.println("Congratulations, you are ready to go to the next level!");
                } else {
                    System.out.println("Please ask your teacher for extra help.");
                }*/
    }

}
