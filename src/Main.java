import lab1.*;
import lab2.*;
import lab3.*;
import lab4.*;
import lab5.*;
import lab6.*;
import lab7.*;
import lab8.*;
import lab9.*;
import lab10.package1.*;
import lab10.package2.*;
import lab11.*;
import lab12.*;
import lab13.*;
import lab14.*;
import lab15.*;

import lab23.*;
import lab24.*;
import lab25.*;
import lab26.*;

import printdetails.*;

import java.io.IOException;
import java.util.Scanner;
import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws Exception {

//        //Lab 1
//        Box box1 = new Box(2,4,6);
//        Box box2 = new Box(3,6,9);
//        System.out.println("First Box Details:");
//        box1.printAll();
//        box1.calcVolume();
//        System.out.println("\n\nSecond Box Details:");
//        box2.printAll();
//        box2.calcVolume();

//        //Lab 2
//        Money m1 = new Money();
//        Money m2 = new Money();
//        m1.setMoney(5,75);
//        m2.setMoney(7,30);
//        Money m3 = new Money();
//        m3.addMoney(m1,m2);
//        m1.displayMoney();
//        m2.displayMoney();
//        System.out.println("After Adding Two:");
//        m3.displayMoney();

//        //Lab 3
//        qsnA q1 = new qsnA();
//        q1.implementation();
//
//        qsnB q2 = new qsnB();
//        q2.implementation();
//
//        qsnC q3 = new qsnC();
//        q3.implementation();
//
//        qsnD q4 = new qsnD();
//        q4.implementation();

//        //Lab 4
//        qsn4A q1 = new qsn4A();
//        System.out.println("\nNumber A");
//        System.out.println("Sum: "+q1.display(4,5));
//        System.out.println("Square: "+q1.display(4));
//        q1.display("World");
//
//        qsn4B q2 = new qsn4B();
//        System.out.println("\nNumber B");
//        System.out.println("Calling Default Constructor: "+q2.id);
//        qsn4B q2b = new qsn4B(17);
//        System.out.println("Calling Parameterized Constructor: "+q2b.id);

//        //Lab 5
//        System.out.println("\nNumber A");
//        System.out.println("Static Variables");
//        System.out.println("Id: "+qsn5A.id);
//        System.out.println("Name: "+qsn5A.name);
//        System.out.println("\nNumber B");
//        qsn5B.implementation();
//        System.out.println("\nNumber C");
//        qsn5C q3 = new qsn5C();
//        System.out.println("\nNumber D");
//        qsn5D q4 = new qsn5D();
//        q4.implementation();

//        //Lab 6
//        Result rs = new Result();
//        rs.read(10);
//        rs.readMarks(50,50);
//        rs.display();
//        rs.displayMarks();
//        rs.calculate();
//        rs.displayTotal();

//        //Lab 7
//        System.out.println("\nNumber A");
//        qsn7A_child q1 = new qsn7A_child();
//
//        System.out.println("\nNumber B");
//        qsn7B_child q2 = new qsn7B_child();
//        q2.addDisplay();
//
//        System.out.println("\nNumber C");
//        qsn7C_child_child q3 = new qsn7C_child_child();
//        q3.addDisplay();
//
//        System.out.println("\nNumber D");
//        qsn7D_child_child q4 = new qsn7D_child_child();

//        //Lab 8
//        System.out.println("\nNumber A");
//        qsn8A_child q1 = new qsn8A_child();
//        q1.display();
//
//        System.out.println("\nNumber B");
//        qsn8B_child1 q2 = new qsn8B_child1();
//        q2.display();
//        qsn8B_child2 q2b = new qsn8B_child2();
//        q2b.display();
//
//        System.out.println("\nNumber C");
//        qsn8C_child q3 = new qsn8C_child();
//        q3.display();
//
//        System.out.println("\nNumber D");
//        qsn8D_child q4 = new qsn8D_child();
//        q4.add();
//        q4.subtract();

//        //Lab 9
//        System.out.println("\nNumber A");
//        qsn9A.qsn9A_inner.implementation();
//
//        System.out.println("\nNumber B");
//        qsn9B q2a = new qsn9B();
//        qsn9B.qsn9b_inner q2b = q2a.new qsn9b_inner();
//        q2b.implementation();
//
//        System.out.println("\nNumber C");
//        qsn9C q3 =new qsn9C();
//        q3.implementation();

//        //Lab 10
//        System.out.println("First Package First Class");
//        Class1 c1 = new Class1();
//        c1.implementation();
//
//        System.out.println("\nFirst Package Second Class");
//        Class2 c2 = new Class2();
//        c2.implementation();
//
//        System.out.println("\nSecond Package First Class");
//        _Class1 _c1 = new _Class1();
//        _c1.implementation();
//
//        System.out.println("\nSecond Package Second Class");
//        _Class2 _c2 = new _Class2();
//        _c2.implementation();

//        //Lab 11
//        Rectangle r1 = new Rectangle();
//        Scanner sc1 = new Scanner(System.in);
//        System.out.print("\nEnter length of rectangle: ");
//        double l = sc1.nextDouble();
//        System.out.print("\nEnter breadth of rectangle: ");
//        double b = sc1.nextDouble();
//        double area = r1.area(l, b);
//        double perimeter = r1.perimeter(l, b);
//        System.out.println("\nArea of rectangle is "+String.format("%.2f", area)+" unit square.");
//        System.out.println("\nPerimeter of rectangle is "+String.format("%.2f", perimeter)+" unit.");

//        //Lab 12
//        qsn12a q1 = new qsn12a();
//        System.out.println("\nNumber A");
//        q1.Div();
//
//        qsn12b q2 = new qsn12b();
//        System.out.println("\nNumber B");
//        q2.Multi();
//
//        qsn12c q3 = new qsn12c();
//        System.out.println("\nNumber C");
//        q3.NestedTry();
//
//        qsn12d q4 = new qsn12d();
//        System.out.println("\nNumber D");
//        q4.ThrowTry();
//
//        qsn12e q5 = new qsn12e();
//        System.out.println("\nNumber E");
//        try {
//            q5.ThrowTry2();
//        } catch (ArithmeticException ex) {
//            System.out.println(ex.getMessage());
//        }
//
//        System.out.println("\nNumber F");
//        Scanner sc1 = new Scanner(System.in);
//        System.out.println("Enter number: ");
//        int a = sc1.nextInt();
//        try {
//            qsn12f.val(a);
//        } catch (qsn12f ex) {
//            System.out.println(ex.getMessage());
//        }

//        //Lab 13
//        System.out.println("\nNumber A");
//        qsn13a q1 = new qsn13a();
//        Thread th1=new Thread(q1);
//        th1.start();
//        for(int i=100;i>=70;--i){
//            System.out.print(i+" ");
//            if(i%30==0){
//                System.out.println();
//            }
//        }
//        sleep(100);
//
//        System.out.println("\nNumber B");
//        qsn13b q2 = new qsn13b();
//        q2.start();
//        for(int i=100;i>=70;--i){
//            System.out.print(i+" ");
//            if(i%30==0){
//                System.out.println();
//            }
//        }
//        sleep(100);
//
//        System.out.println("\nNumber C");
//        qsn13c q3 = new qsn13c();
//        qsn13c.qsn13c_second q3b = new qsn13c.qsn13c_second();
//        q3.start();
//        q3b.start();
//        System.out.println(q3.isAlive());
//        q3.join();
//        q3b.join();
//        System.out.println("\n"+q3.isAlive());
//
//        System.out.println("\nNumber D");
//        qsn13d q4a = new qsn13d("First Thread");
//        qsn13d q4b = new qsn13d("Second Thread");
//        qsn13d q4c = new qsn13d("Third Thread");
//        qsn13d q4d = new qsn13d("Fourth Thread");
//        qsn13d q4e = new qsn13d("Fifth Thread");
//        q4a.setPriority(2);
//        q4b.setPriority(Thread.MIN_PRIORITY);
//        q4c.setPriority(4);
//        q4d.setPriority(Thread.MAX_PRIORITY);
//        q4e.setPriority(3);
//        q4a.start();
//        q4b.start();
//        q4c.start();
//        q4d.start();
//        q4e.start();
//        q4a.join();
//        q4b.join();
//        q4c.join();
//        q4d.join();;
//        q4e.join();
//
//        System.out.println("\nNumber E");
//        qsn13e q5 = new qsn13e();
//        q5.start();
//        q5.join();
//
//        System.out.println("\nNumber F");
//        pre_qsn13f pre = new pre_qsn13f();
//        qsn13f q6 = new qsn13f(pre);
//        q6.start();
//        q6.join();
//
//        System.out.println("\nNumber G");
//        qsn13g q7 = new qsn13g();
//        q7.start();
//        q7.join();
//
//        System.out.println("\nNumber H");
//        qsn13h q8 = new qsn13h();
//        Thread th3 = new Thread(q8);
//        th3.start();
//        th3.join();

//        //Lab 14
//        System.out.println("\nNumber A:");
//        qsn14a.Implementation();
//
//        System.out.println("\nNumber B:");
//        qsn14b.Implementation();
//
//        System.out.println("\nNumber C:");
//        qsn14c.Implementation();
//
//        System.out.println("\nNumber D:");
//        try{
//            qsn14d_1.Implementation();
//        }catch(IOException ex){
//            System.out.println(ex.getMessage());
//        }
//
//        System.out.println("\n\nNumber D(Second):");
//        try{
//            qsn14d_2.Implementation();
//        }catch(IOException ex){
//            System.out.println(ex.getMessage());
//        }
//
//        System.out.println("\nNumber E:");
//        try{
//            qsn14e.Implementation();
//        }catch(IOException e){
//            System.out.println(e.getMessage());
//        }
//
//        System.out.println("\n\nNumber F:");
//        try{
//            qsn14f.Implementation();
//        }catch(Exception e){
//            System.out.println(e.getMessage());
//        }
//
//        System.out.println("\n\nNumber G:");
//        try{
//            qsn14g.Implementation();
//        }catch(Exception e){
//            System.out.println(e.getMessage());
//        }
//
//        System.out.println("\nNumber H:");
//        try{
//            qsn14h.Implementation();
//        }catch(Exception e){
//            System.out.println(e.getMessage());
//        }
//
//        System.out.println("\nNumber I:");
//        try{
//            qsn14i.Implementation();
//        }catch(Exception e){
//            System.out.println(e.getMessage());
//        }
        
//        //Lab 15
//        new lab15();

        //Lab 23
        new lab23();

//        //Lab 24
//        new lab24();
//
//        //Lab 25
//        new lab25();
//
//        //Lab 26
//        new lab26();


        Details details = new Details();
        details.printDetails(15);
    }
}