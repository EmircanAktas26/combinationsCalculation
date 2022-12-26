import java.util.Scanner;

/*
*@Author Emircan Aktaş - 26.Dec.2022
 */
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n, r, combination;
        int nProduct = 1, rProduct = 1;

        System.out.println("Enter the n number :");
        n = inp.nextInt();

        System.out.println("Enter the r number :");
        r = inp.nextInt();

        for (int i = 1; i<= r; i++){
            rProduct *= i;
            nProduct *= n;
            n--;
        }
        combination = nProduct / rProduct;
        System.out.println("Result :" + combination);

    }
}