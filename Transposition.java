package transposition;
import java.io.*;
import java.util.Scanner;
public class Transposition {

   
    public static void main(String[] args) 
    {
       String temp;
       String plain;
       String original;
           long startTime, endTime,end1; 
       char m='x';
       float length;
     float n=5;
             int i,j,s1;
       int key[]=new int[10];
      char a[][]=new char[20][20];
      char b[]=new char[20];
     // int c=0;
       System.out.println("Enter the plain text");
        Scanner in =new Scanner(System.in);
        plain = in.nextLine();
        original = plain;
        System.out.println("Enter the secret key:");
        s1=in.nextInt();
       // String strarray[] = plain.split(" ");
       
        length = plain.length();
         // System.out.println(length);
        float split = length/n;
        int round = Math.round(split);
          int f=(int)split; //2
        int d = (int) (round*n);//15
        int p = d - (int)length; //2
        int q = d - f;//13
         
        for(int g=0;g<p;g++)
        {
            plain=plain+m;
             
        }
        //System.out.println(plain);
        char[] arr = plain.toCharArray();
        //String h = p('m');
//        for(int g=q+1;g<=d;g++)
//        {
//          arr[g] = m;
//          System.out.println(arr[g]);
//        }
      
         // System.out.println(p);
        //float split1 = length % n;
        startTime = System.currentTimeMillis();
          System.out.println("Enter the key");
        for(i=0;i<n;i++)
        {
            key[i]=in.nextInt();
            
        }        
        int c=0,k=0;
    
        if(n<length)
        {
                 
        for(j=0;j<round;j++)
        {
       
         for(i=0;i<n;i++)
        {
            if(arr[i]!='\0')
            {
            a[j][i] = arr[c];
            c++;
           System.out.println(a[j][i]);
        }
            else
            {
                a[j][i]=m;
            }
        }
        }
        n++;
        }
       
        k++;
        
          // System.out.println(k);
         // System.out.println(a[2][2]);
          
          System.out.println("Encrypted message");
          
          
         for(i=0;i<n-1;i++)
        {
            int h=key[i];
            for(j=0;j<round;j++)
        {
          
                System.out.print(a[j][h]);
            }
            
            
        }
          

       
        System.out.println("\nEnter the sender's secret key");
        int s2=in.nextInt();
        if(s1==s2)
        {
            System.out.println("Decrypted message"+original);
        }
        else
        {
            System.out.println("Wrong key");
        }
        endTime = System.currentTimeMillis();
         System.out.println("\nIt took " + (endTime - startTime) + " milliseconds for encryption");
          
    }
}