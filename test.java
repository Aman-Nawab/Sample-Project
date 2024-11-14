import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number");
        int a,b,c;
        a=sc.nextInt();//here we consider data type as interger but if we will provide float then it will give error 
        b=sc.nextInt();
        c=a+b;
        System.out.println("sum of the "+a+" and "+b+" is "+c);


    }
    
}
