package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num1,num2,num3;

        System.out.println("Sıralamak istediğiniz 3 tam sayı giriniz");
        Scanner input = new Scanner(System.in);

        System.out.println("Sayı 1 : ");
        num1 = input.nextInt();

        System.out.println("Sayı 2 : ");
        num2 = input.nextInt();

        System.out.println("Sayı 3 : ");
        num3 = input.nextInt();

        if((num1>num2)&&(num1>num3)){
            if(num2>num3){
                System.out.println(" Sonuç : sayı1 > sayı2 > sayı3");
            }else {
                System.out.println(" Sonuç : sayı1 > sayı3 > sayı2");
            }
        } else if ((num2>num1)&&(num2>num3)) {
            if (num1>num3){
                System.out.println(" Sonuç : sayı2 > sayı1 > sayı3 ");
            }else {
                System.out.println(" Sonuç : sayı2 > sayı3 > sayı1");
            }
        } else if ((num3>num1)&&(num3>num2)) {
            if (num1>num2){
                System.out.println(" Sonuç : sayı3 > sayı1 > sayı2");
            }else {
                System.out.println(" Sonuç : sayı3 > sayı2 > sayı1");
            }
        }else {
            System.out.println("Eşit ya da anlamsız bir sayı seçimi yaptınız");
        }
    }
}