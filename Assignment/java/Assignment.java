package Assignment.java;

import java.util.Scanner;

public class Assignment {
    
    public static void main(String[] args) {
        //fibonnaci();
        //armstrong();
        palindrome();
    }

    @SuppressWarnings("resource")
	public static void fibonnaci() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scan.nextInt();

        int num1 = 0;
        int num2 = 1;

        for(int i = 0; i < num; i++) {
            System.out.print(num1 + " ");

            int num3 = num1 + num2;

            num1 = num2;
            num2 = num3;
        }
    }
    
    public static void armstrong() {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        // Holds the value of the original number
        int orgNum = 0;
        int currNum = 0;
        int sum = 0;

        orgNum = num;

        while (num != 0) {
            currNum = num % 10;
            num = num / 10;
            sum += Math.pow(currNum, 3);
        }

        if(orgNum == sum) {
            System.out.println(orgNum + " is an Armstrong number");
        } else {
            System.out.println(orgNum + " is not an Armstrong number");
        }
    }

    @SuppressWarnings("resource")
	public static void palindrome() {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a phrase: ");
        String input = scan.next();

        StringBuilder temp = new StringBuilder();
        temp.append(input);
        temp.reverse();

        if(input.toLowerCase().equals(temp.toString().toLowerCase())) {
            System.out.println( input + " is a palidrome");
        } else {
            System.out.println( input + " is not a palidrome");
        }
    }
}