package arrays;

import java.util.Scanner;

public class DeciHex {
    int num;
    String hexa;

    DeciHex(){
        num = 0;
        hexa = "";
    }

    void getNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        num = sc.nextInt();
    }
    void convert(int n){
        if(n == 0) return;
        int rem = n % 16;
        String r = "";
        if(rem > 9){
            switch(rem){
                case 10: r = "A"; break;
                case 11: r = "B"; break;
                case 12: r = "C"; break;
                case 13: r = "D"; break;
                case 14: r = "E"; break;
                case 15: r = "F"; break;
            }
        } else{
            r = String.valueOf(rem);
        }
        convert(n/16);
        hexa += r;
    }
    void display(){
        convert(num);
        System.out.println("HEXA Equivalent is: "+ hexa);
    }

    public static void main(String[] args) {
        DeciHex ob = new DeciHex();
        ob.getNum();
        ob.display();
    }
}