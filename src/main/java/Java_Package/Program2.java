//Program about to String Method:

package Java_Package;

import java.util.Scanner;

public class Program2 {

    int rollNo;
    String name;

    public Program2(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Program2{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args)
    {
    Program2 pd = new Program2(18,"Sathiyaseelan");
    Program2 pd1 = new Program2(19,"JothiRani");

    System.out.println(pd + "."+ pd1);
                                        pd.method1(2,3,4);
                            System.out.println(pd.method2(2));
                            pd.method3();
    }

    public int method1(int a , int b, int c)
    {
        int d = a*b*c;
        return d;

    }

    public int method2(int y)
    {
        int e = method1(2,2,2)*  y  ;
        return  e;

    }

    // Accepting input from system:
    public void method3()
    {
        Scanner st = new Scanner(System.in);
        System.out.println("Hi Your name is : ");
        String a = st.next();
        System.out.println("My Name is " + a);
        System.out.println("Hi Your name wife is : ");
        String b = st.next();
        System.out.println(b + "Is her Name");

    }
}

