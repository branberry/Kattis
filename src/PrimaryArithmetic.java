import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class PrimaryArithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (input.hasNext()) {
            String values = input.nextLine();
            if(values.equals("0 0")) {
                break;
            }

            int firstValue = Integer.parseInt(values.split(" ")[0]);
            int secondValue = Integer.parseInt(values.split(" ")[1]);

            int carries = 0;
            int carryValue = 0;

            while (firstValue != 0 || secondValue != 0) {
                int remainderFirst = firstValue % 10;
                int remainderSecond = secondValue % 10;

                if ((remainderFirst + remainderSecond + carryValue) >= 10) {
                    carryValue = 1;
                    carries++;
                } else {
                    carryValue = 0;
                }
                firstValue = firstValue / 10;
                secondValue = secondValue / 10;
            }


            if(carries == 0) {
                System.out.println("No carry operation.");
            } else if (carries == 1) {
                System.out.println(carries + " carry operation.");
            } else {
                System.out.println(carries + " carry operations.");
            }
        }
    }
}
