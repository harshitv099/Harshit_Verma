import java.util.Scanner;
class Operators  {
    public static void main(String[]args){
        String a;
        a = 5+"xyz";
        System.out.print(a); 
    }

     static void wap_five_point_one  (){
        int dividend = 17;
        int divisor = 3;
        int quotient = (dividend/divisor);
        int remainder = (dividend %divisor);
        System.out.println(quotient);
        System.out.println(remainder );
    }

    static void ArithmeticAssignmentOperator(){
        int five1= 5, five2 = 10, five3 = 15;
        int six1= 6, six2=12, six3 = 18;
        five1+= 10;
        five2+=10;
        five3+=10;
        System.out.print("first 3 multiples of 5 after adding 10 are : " );
        System.out.print(five1);
        System.out.print(", "+five2);
        System.out.print(", "+ five3); 
        six1-= 5;
        six2 -= 5;
        six3-=5;
        System.out.println("first 3 multiples after subtracting 5 are : ");
        System.out.print(six1); 
        System.out.print(", "+ six2);
        System.out.print(", "+six3);        
    }   

    static void areaOfTriangle(){
        double side1 = 10.5;
        double side2 = 15.5;
        double side3 = 20;
        double area, semip = 0;
        semip = (side1+side2+side3)/2;
        area = Math.sqrt(semip*(semip-side1)*(semip-side2)*(semip-side3));
        System.out.print("Area of triangle with sides - "+side1+ ", "+side2 +" and "+ side3+ " is "+ area+".");
    }

    static void tiling(){
        double length = 500;
        double width = 200;
        double area = 0;
        area = length*width;
        double costOfTiling = area*80/100;
        System.out.print("The cost of tiling for 500*200m plot is Rs. " + costOfTiling);
    }

    static void squareside(){
        double area = 240.25;
        double side = Math.sqrt(240.25);
        System.out.println("The length of each side = "+side+"m.");
    }

    static void sum(){
        double n1=7.9, n2=2.3 ,n3=8.8 ,n4=13.5;
        double sum = (n1+n2+n3+n4);
        System.out.println("The sum of the four numbers - "+n1+", "+n2+", "+n3+" and "+n4 +" is "+ sum);;
    }

    static void average(){
        Scanner hv = new Scanner(System.in);
        System.out.print("Enter the first number");
        double n1 = hv.nextDouble();
        System.out.print("Enter the second number");
        double n2 = hv. nextDouble();
        System.out.print("Enter the third number");
        double n3 = hv. nextDouble();
        double average = (n1+n2+n3)/3;
        System.out.print("The average of the four numbers - "+n1+", "+n2+", "+n3+" is - " + average);
    }

    static void area_Of_Sphere(){
        int radius = 7;
        double area;
        double pi = 3.14159;
        area = 4*pi*radius*radius;
        System.out.print("The area of sphere is "+area+"cm.");
    }

    static void conversion(){
        //i yard = 3feet. 1 feet = 12 inches. 1 inch = 2,54 cm
        int yard = 3, feet = 11, inches = 7;
        double totalcentimeters = yard*3*12*2.54;
        double meters = totalcentimeters/100;
        System.out.print("The Distance is meters = "+ meters);
    }

    static void denominations(){
        int amount = 1782;
        int t1000, f500, h100, f50, t20, t10, f5, t2, o1;
        int balance = amount;

        t1000 = balance /1000;
        balance = balance%1000;

        f500 = balance /500;
        balance = balance%500;

        h100 = balance /100;
        balance = balance%100;

        f50 = balance /50;
        balance = balance%50;

        t20 = balance /20;
        balance = balance%20;

        t10 = balance /10;
        balance = balance%10;

        f5 = balance /5;
        balance = balance%5;

        t2 = balance /2;
        balance = balance%2;

        o1 = balance /1;
        balance = balance%1;

        System.out.println("The guven Amount is Rs. "+amount);
        System.out.println("The number of 1000 rupee notes = "+ t1000);
        System.out.println("The number of 500 rupee notes = "+ f500);        
        System.out.println("The number of 100 rupee notes = "+ h100);
        System.out.println("The number of 50 rupee notes = "+ f50);
        System.out.println("The number of 20 rupee notes = "+ t20);
        System.out.println("The number of 10 rupee notes = "+ t10);
        System.out.println("The number of 5 rupee notes = "+ f5);
        System.out.println("The number of 2 rupee notes = "+ t2);
        System.out.println("The number of 1 rupee notes = " + o1);
    }

    static void marks(){
        int term1= 412, term2 = 423, term3 = 430;
        double wmarks = 0 ;
        double percentage = 0;
        wmarks = (term1*0.30+term2*0.30+term3*0.40);
        percentage = wmarks*100/500;
        System.out.print("The weighted marks = "+wmarks+" and the weighted percentage = "+percentage);
    }

    static void swap(){
        int x = 11;
        int y = 7; 
        int z =0;
        System.out.println("Before Swapping x = " +x+" and y = " +y);
        z = x;//z = 11
        x=y;//x=7
        y=z;//y=11
        System.out.println("After Swapping x = "+x+" and y = "+y);
    }

    static void res(){
        int res = 25;
        System.out.println(res--);
        System.out.println(++res);
    }

    static void display(){
        int a = 10000;
        int b = 40000;
        double z = Math.sqrt(a*a+b*b); 
        int x = 00001101 & 00011001;
        System.out.println(z+ "  " + x);
    } 

    static void booooolean(){
        boolean a;
        boolean b;
        boolean c;
        boolean d;
        short x1 = 100, x2 = 200, x3 = 300;
        a = x1*2==x2;
        System.out.println(a);
        b= x1+x2!=3*x1;
        System.out.println(b);
        c = (x3-2*x2<0)||(x3=400)<Math.pow(2,x2);
        System.out.println(c);
    }

    static void fortynine(){
        byte b;
        double d = 417.35;
        b = (byte)d;
        System.out.println(b);   
    }

    static void bowler(){
        double runs = 1153;
        double wickets = 109; 
        double bowling_average = runs/wickets;
        System.out.println("The Bowling average for player giving " + runs+ "and taking " +wickets+ " is " +bowling_average);
    }

    static void coca_cola(){
        int rate1 = 15, rate2 = 20, rate3 = 21;
        int cans1 = 50, cans2 = 30, cans3 = 40;
        int total = (rate1*cans1)+(rate2*cans2)+(rate3*cans3);
        System.out.print("The total amount to be paid = " +total ); 

    }
    public static void main(){
        double amtToBeRaised = 50000.0;
        double amtGroup1 = 5200.0;
        double amtGroup2 = 6800.0;
        double amtRemaining = amtToBeRaised - (amtGroup1+amtGroup2);
        double amtForRestFiveGroups = amtRemaining/5.0;
        System.out.println("The amount left to be raised by the five groups = " + amtForRestFiveGroups);
    }
    public static void dozens(){
        int packets = 1193;
        int noOfDozens= packets/12;
        int extra = packets%12;
        int noOfGross = noOfDozens/12;
        int ExtraPackets = packets%144;
        System.out.println("The number of packets = " + packets);
        System.out.println("The number of dozens = " +noOfDozens);
        System.out.println("The number of extra packets remaining with "+ noOfDozens+" dozens = "+extra);
        System.out.println("The number of gross = " +noOfGross);
        System.out.println("The number of extra packets remaining with "+noOfGross+" dozens = " + ExtraPackets);
    }
    static void Profit(){
        Scanner harshit = new Scanner(System.in);
        System.out.println("Enter Selling price");
        double SP = harshit.nextDouble();
        System.out.println("Enter Cost Price");
        double CP = harshit.nextDouble();
        double Profit = SP-CP;
        System.out.println("The profit gained on the article of SP -> " +SP +" and CP -> "+CP+" = " +Profit);
    }
    static void checker(){
        int a = 3, b= 3, c = -5;
        float x = 8.8F, y = 3.5F, z = -5.2F;
        int q = a%c;
        System.out.println(q);
    }
    //All the important programs have been written and compiled and tested successfully in class chapter_5. 
}