
package transposition;

import java.util.Scanner;

public class caeser 
{
    public static void main(String[] args) 
    {
        String plain;
        int i;
         long startTime, endTime,end1; 
         
    System.out.println("Enter the plain text");
        Scanner in =new Scanner(System.in);
            
        plain = in.nextLine();
        startTime = System.currentTimeMillis(); 
        System.out.println("Enter the secret key");
        int s1 = in.nextInt();
            
        String plain1=plain.replaceAll("\\s+","");
        
        //System.out.println(plain1);
        //String b[] = plain1.split("");
        int len = plain1.length();
        char e[] = new char[len];
        for(i=0;i<len;i++)
        {
            //System.out.println(b[i]);
            e[i]=plain1.charAt(i);
            System.out.println(e[i]);
            
        }
        //char a=97; //int a = "97" //ascii
        //System.out.println(a);
      
        
        int j=0,l,m,n;
        char k;
        char c[] = new char[26];
        for(k=97;k<=122;k++)
        {
         c[j] = k;
        //System.out.println("j:"+j+" "+"char:"+c[j]);
         j++;
        }
        
       // System.out.println(b[0]);
       System.out.println("\nEnter the key");
        int key = in.nextInt(); 
       System.out.println("Encrypted message");
        for(l=0;l<len;l++)
        {
            for(m=0;m<=25;m++)
            {
                if(e[l]==c[m])
                {
                    int sum = m+key;
                    System.out.print(c[sum]);
                }
                else
                {
                    continue;
                }
            }
        }
        
        System.out.println("\nEnter the sender's secret key:");
        int s2 = in.nextInt(); 
        if(s1==s2)
        {
            System.out.println("\nDecrypted message:"+plain);
        }
        else
        {
            System.out.println("\nWrong key");
        }
          
        endTime = System.currentTimeMillis();
         System.out.println("It took " + (endTime - startTime) + " milliseconds for encryption"); 

        
        
    }
}
