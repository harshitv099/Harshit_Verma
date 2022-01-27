import java.util.Scanner;
class Mathematical_Libraray_Functions {
    static void basic(){
        Scanner hv = new Scanner(System.in);
        int num1, num2;
        double sq1, sq2;
        double sqrt1, sqrt2;
        double cb1, cb2;
        double cbrt1, cbrt2;
        System.out.print("Enter the first integer number");
        num1= hv.nextInt();
        System.out.print("Enter the second number");
        num2 = hv.nextInt();
        System.out.println("For "+num1+":-");
        System.out.println("Square = "+Math.pow(num1,2)+ ", cube = "+ Math.pow(num1,3)+", Square root = "+Math.sqrt(num1)+" and cube root = "+ Math.cbrt(num1));
        System.out.println("For "+num2+":-");
        System.out.println("Square = "+Math.pow(num2,2)+ " cube = "+ Math.pow(num2,3)+", Square root = "+Math.sqrt(num2)+" and cube root = "+ Math.cbrt(num2));
    }

    static void interm(){
        Scanner hv = new Scanner(System.in);
        double n1, n2;
        System.out.println("Enter the first number");
        n1 = hv.nextDouble();
        System.out.println("Enter the second number");
        n2= hv.nextDouble();
        System.out.println("For "+n1+" :");
        System.out.println("The absolute value = "+ Math.abs(n1)+ ", the ceiling = "+Math.ceil(n1)+ " and the floor = "+Math.floor(n1));
        System.out.println("For "+n2+" :");
        System.out.println("the absolute value = "+ Math.abs(n2)+", the ceiling = "+Math.ceil(n2)+" and the floor " + Math.floor(n2));
    } 

    static void advanced(){
        int min =1, max = 6;
        int range = max-min+1;
        int value = (int)(Math.random()*range)+min;
        System.out.println("Roll 1 = " +value);
        int value2 = (int)(Math.random()*range)+min;
        System.out.println("Roll 2 = " +value2);
        int value3 = (int)(Math.random()*range)+min;
        System.out.println("Roll 2 = " +value3);

    }

    static void tests(){
        System.out.println(Math.abs(-1e-1)+Math.abs(-2e-2));
        System.out.println(Math.sqrt(-25));
        System.out.println(Math.sqrt(Math.pow(2.7,2)));
        System.out.println(Math.ceil(4.002));
        System.out.println(Math.pow(16,0.25));
        System.out.println(Math.pow(4,-2)); 
        System.out.println(Math.round(1.49+0.1));
        System.out.println(((Math.random()*1.6)+ 0.1)); 
        System.out.println((int)(Math.random()*9)+1); 
        System.out.println((int)(Math.random()*41)+11); 
        System.out.println((int)(Math.random()*50)+50);
        System.out.println((int)(Math.random()*200)+100); 
        System.out.println(Math.ceil(Math.PI)); 
        System.out.println(Math.floor(Math.PI/3)); 
        System.out.println(Math.pow(2,3)); 
    }

    static void wap_7(){
        Scanner r= new Scanner(System.in);
        System.out.println("Enter the radius of sphere");
        double rad = r.nextDouble();
        double area_sp = 4*Math.PI*rad*rad;
        System.out.println("Enter the radius of cylinder");
        double radc = r.nextDouble();
        System.out.println("Enter the height of cylinder");
        double height = r.nextDouble();
        double area_cy = (2*Math.PI*radc*height)+(2*Math.PI*radc*radc);
        System.out.println("The area of the sphere = " + area_sp+" area of cylinder = "+ area_cy);

    }

    static void Compound_Interest(){
        Scanner h = new Scanner (System.in);
        double CI, A, P, R, T;
        int n;
        System.out.println("enter the principal");
        P = h.nextDouble(); 
        System.out.println("Enter the rate");
        R= h.nextDouble();
        System.out.println("Enter the time period in years"); 
        T = h.nextDouble();
        System.out.println("Enter the number of installments");
        n = h.nextInt();
        A = P*Math.pow((100+R)/100,T);
        CI = A-P;
        System.out.println("The compund interest = "+CI+" and the amount = "+ A);
    }
    static void wap9(){
    Scanner verma = new Scanner(System.in); 
    System.out.println("Enter a number"); 
    double a = verma.nextDouble(); 
    double a1 = Math.pow(a,1); 
    double a2 = Math.pow(a,2); 
    double a3 = Math.pow(a,3); 
    double a4 = Math.pow(a,4); 
    double a5 = Math.pow(a,5); 
    System.out.println (a1+", "+a2+", "+a3+", "+a4+", "+a5+"."); 
    }
    static void wap10(){
        Scanner scan = new Scanner(System.in); 
        System.out.println("Enter the perimeter"); 
        double peri = scan.nextDouble(); 
        double radius = peri/2*Math.PI; 
        double area = Math.PI*radius*radius; 
        System.out.println("The radius = "+radius+" the area = " + area);
        }
}


    
    
    
    
    
    
    