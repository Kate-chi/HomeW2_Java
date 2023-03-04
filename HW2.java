import java.util.Scanner;

public class HW2
{
    public static String TurnAround(String str)
    {
        if (str.length() <= 1) 
            return str;

        return TurnAround(str.substring(1)) + str.charAt(0);
       
    }
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // System.out.print("строка 1: ");
        // String firstStr = scanner.nextLine();
        // System.out.print("строка2: ");
        // String secondStr = scanner.nextLine();

        //проверка вхождения в строке
        // if(firstStr.contains(secondStr)) 
        //     System.out.println("mach");
        // else
        //     System.out.println("not mach");
        
        // //проверка вращения
        // String newSecond = TurnAround(secondStr);

        // if(firstStr.equals(newSecond))
        //     System.out.println("строки являются вращением друг друга");
        // else
        //     System.out.println("не вышло, строки слишком разные");

//===================================================================================================================
        //Дано два числа, например 3 и 56, 
        //необходимо составить следующие строки: 
        //3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 
        //Используем метод StringBuilder.append().

        int firstNum = 3;
        int secondNum = 56;

        StringBuilder madeEquat = new StringBuilder();
        madeEquat.append(firstNum + " + " + secondNum + " = " + (firstNum + secondNum) + "\n"
                        + firstNum + " - " + secondNum + " = " + (firstNum - secondNum) + "\n"
                        + firstNum + " * " + secondNum + " = " + (firstNum * secondNum) + "\n");
        
        System.out.println(madeEquat);

        madeEquat.deleteCharAt(7).insert(7, "равно");
        madeEquat.deleteCharAt(23).insert(23, "равно");
        madeEquat.deleteCharAt(40).insert(40, "равно");
        System.out.println(madeEquat);

        madeEquat.replace(6,13," = ");
        madeEquat.replace(18,25," = ");
        madeEquat.replace(31,38," = ");
        System.out.println(madeEquat);

    }
}