package mathquiz2;

import java.util.Scanner;
import java.util.Random;

public class MathQuiz2 {

    public static void main(String[] args) {
       
        Scanner input = new Scanner (System.in);
        Random rand = new Random();
        
        int a,b,puan=0;

        for(int i=0;i<10;i++)
        {
            a=rand.nextInt(10);
            b=rand.nextInt(10);
        
        while (a==0)
        {
            a=rand.nextInt(10);
        }
        while (b==0)
        {
            b=rand.nextInt(10);
        }
         
        if(a>b)
        {
            System.out.println("Soru: "+a+"-"+b+" işleminin sonucu kaçtır?");
            int yanıt = input.nextInt();
            
            if(yanıt == (a-b))
            {
                puan+=20;
                System.out.println("");
            }
            else
            {
                System.err.println("Yanlış yanıt verdiniz! Puanınız: "+puan);
                break;
            }
        }
        else
        {
            System.out.println("Soru: "+b+"-"+a+" işleminin sonucu kaçtır?");
            int yanıt = input.nextInt();
            
            if(yanıt == (b-a))
            {
                puan+=20;
                System.out.println("");
            }
            else
            {
                System.err.println("Yanlış yanıt verdiniz! Puanınız: "+puan);
                break;
            }
        }
    }
        if(puan==200)
        {
        System.out.println("Tebrikler! Tüm sorulara doğru yanıt verdiniz. Puanınız: 200");
        }
}
    
}
