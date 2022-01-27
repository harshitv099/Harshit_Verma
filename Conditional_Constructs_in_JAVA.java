import java.util.Scanner;
class Conditional_Constructs_in_JAVA{
    static void comparison(){
        Scanner scan = new Scanner (System.in); 
        System.out.println("Enter a number"); 
        double a = scan.nextDouble(); 
        System.out.println("Enter another number"); 
        double b = scan.nextDouble(); 
        if (a>b){
            System.out.println("Number "+ a+" is greater"); 
        }
        if (b>a){
            System.out.println("Number " + b +" is greater"); 
        }
        if(a==b){
            System.out.println(a+"="+b);
        }
    }

    static void odd_even_checker(){ 
        Scanner harshit = new Scanner (System.in); 
        System.out.println("Enter a number"); 
        int a = harshit.nextInt(); 
        if(a%2==0){ 
            System.out.println(a+" is an even number");
        } 
        else 
            System.out.println(a+" is an odd number"); 
    } 

    static void divisibilityChecker(){
        Scanner abc = new Scanner(System.in); 
        System.out.println("Enter a number");
        int a = abc.nextInt(); 
        int lastdigit = a%10; 
        int last2digits = a%100; 
        boolean div2 = false, div4= false, div5=false; 
        if (lastdigit ==0||lastdigit == 2||lastdigit == 4||lastdigit ==6 ||lastdigit ==8)

            if (last2digits % 4 ==0)
                div4 = true;
        if (lastdigit ==0||lastdigit==5)
            div5 = true ;
        if (div2==true&&div4==true&&div5==true)
            System.out.println(a+" is divisible by all ->> 2,4 and 5"); 

        else 
            System.out.println(a+" is not divisible bb all - 2,4 and 5"); 
    }

    static void Temperature(){
        Scanner hv = new Scanner (System.in); 
        System.out.println("Enter 1 for Celsisus to Fahrenheit or 2 for the opposite"); 
        int choice = hv.nextInt(); 
        double TempC, TempF; 
        if (choice == 1){
            System.out.println("Enter Temperature in Celsius"); 
            TempC= hv.nextDouble(); 
            TempF = (TempC*1.8)+32; 
            System.out.println("The temperature -> "+TempC+" in Fahrenheit = "+TempF); 
        }
        else if (choice ==2){
            System.out.println("Enter Temperature in Fahrenheit");
            TempF = hv.nextDouble(); 
            TempC = (TempF*1.8)+32; 
            System.out.println("The temperature -> "+TempF+" in Celsisus = "+TempC); 
        }
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3 , med = 0;
        System.out.println("Enter 3 integers one after another");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt(); 
        med = median(n1,n2,n3);
        System.out.println("Median number of 3 given integers is " + med);
    }

    public static int median(int a, int b, int c){
        if(a>b){ 
            if(b>c){
                return b;
            }
            else if (a>c){
                return c;
            }
            else {
                return a;
            }
        }
        else{
            if (c>a){
                return b ;
            }
            else if (b>a){
                return a;
            }
            else {
                return c;
            }
        }
    }

    static void leapYear(){
        Scanner sc = new Scanner (System.in); 
        System.out.println("Enter the year to be tested ") ;
        int year = sc.nextInt(); 
        if (year %100==0){
            if(year%400==0){
                System.out.println("The year is a leap year"); 
            }
            else {
                System.out.println("The year isn't a leap year"); 
            }
        }
        else if  (year%4==0){
            System.out.println("The year is a leap year"); 
        }
        else {
            System.out.println("The year isn't a leap year"); 
        }
    }

    static void Triangle_Test(){
        Scanner verma = new Scanner(System.in);     
        System.out.println("Enter the 3 sides one after another "); 
        double side1 = verma.nextDouble(); 
        double side2 = verma.nextDouble(); 
        double side3 = verma.nextDouble(); 
        boolean possible = false; 
        if (side1+side2>side3&&side2+side3>side1&&side1+side3>side2){
            System.out.println("The Triangle with sides : - "); 
            System.out.println(side1+", "+side2+", "+side3+" is possible"); 
        }
        else {
            System.out.println("The Triangle with sides : - "); 
            System.out.println(side1+", "+side2+", "+side3+" is not possible"); 
        }
    }

    static void triangle_angle(){
        Scanner Harshit = new Scanner (System.in); 
        System.out.println("Enter 3 angles one after another "); 
        int a1 = Harshit.nextInt(); 
        int a2 = Harshit.nextInt(); 
        int a3 = Harshit.nextInt(); 
        if (a1+a2+a3 ==180){
            if(a1<90&&a2<90&&a3<90){
                System.out.println("The triangle is an acute-angled triangle"); 
            }
            else if (a1>90||a2>90||a3>90){
                System.out.println("The triangle is  an obtuse-angled triangle");
            }
            else if (a1==90||a2==90||a3==90){
                System.out.println("The triangle is an right-angled triangle"); 
            }
        }
        else {
            System.out.println("The triangle isn't possible"); 
        }
    }

    static void right_angled_triangle(){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter base"); 
        int base = sc.nextInt(); 
        System.out.println("Enter hypotenuse"); 
        int hypo = sc.nextInt(); 
        System.out.println("Enter height"); 
        int height = sc.nextInt(); 
        if (base*base + height*height == hypo*hypo){
            System.out.println("The triangle is a right angled triangle"); 
        }
        else {
            System.out.println("The triangle is not a right angled triangle"); 
        }
    } 

    static void polygons(){
        Scanner sc = new Scanner (System.in); 
        System.out.println("Enter the number of sides from 1-6"); 
        int sides = sc.nextInt(); 
        System.out.println("The triangle with "+sides +" sides is a : - "); 
        switch(sides) {
            case 6 : System.out.println("Hexagon");
            break;
            case 5 : System.out.println("Pentagon"); 
            break; 
            case 4 : System.out.println("Rectangle"); 
            break; 
            case 3 : System.out.println("Triangle"); 
            break; 
            case 2 : System.out.println("No polygon possible"); 
            break; 
            case 1 : System.out.println("No polygon possible"); 
            break; 
            default: System.out.println ("Enter valid no. of sides, i.e, 1-6"); 
        }
    } 

    static void weeks(){
        Scanner verma = new Scanner (System.in); 
        System.out.println("Enter the number from 1-7 to be converted to day's name"); 
        int number = verma.nextInt(); 
        System.out.println("The day no. "+number+" is :- "); 
        switch(number) {
            case 1 : System.out.println("Its sunday"); 
            break; 
            case 2 : System.out.println("Its monday"); 
            break; 
            case 3 : System.out.println("Its tuesday"); 
            break; 
            case 4 : System.out.println("Its wednesday"); 
            break ; 
            case 5 : System.out.println("Its thrusday"); 
            break; 
            case 6 : System.out.println("Its Friday"); 
            break; 
            case 7 : System.out.println("Its saturday"); 
            break; 
            default: System.out.println("Enter a valid day number from 1-7"); 
        }
    }

    static void Weekend(){
        Scanner harshit = new Scanner(System.in); 
        System.out.println("Enter the day number"); 
        int daynum = harshit.nextInt(); 
        switch(daynum){
            case 1 : 
            case 7 : 
            System.out.println("It is a weekend"); 
            break; 
            case 2 :
            case 3 : 
            case 4 :
            case 5 :
            case 6 : 
            System.out.println("It is a weekday"); 
            break; 
            default : System.out.println("Invalid day number"); 
        }
    }

    static void noOfDays(){
        Scanner s = new Scanner (System.in); 
        System.out.println("Enter the month number in "+"MM"+" 1 -12"); 
        int month = s.nextInt(); 
        System.out.println("Enter the year in yyyy"); 
        int year = s.nextInt(); 
        switch (month){
            case 1 : 
            case 3 : 
            case 5 :
            case 7 :
            case 8:
            case 10:   
            case 12 :
            System.out.println("No of days in month "+month+" are 31 "); 
            break; 
            case 4 :
            case 6 :
            case 9 :
            case 11: 
            System.out.println("No of days in month " +month+" are 30"); 
            break;
            case 2 : 
            if ((year%4==0)&& !(year%100==0) || (year%400==0)){ 
                System.out.println("No of days in month " +month + "-"+year+" are 29");
            } 
            else {
                System.out.println("No of days in month "+month +"-"+year+" are 28"); 
            }
            break;
            default : System.out.println("Enter valid month number"); 
            break;
        }
    }

    static void areamenu(){
        Scanner a = new Scanner(System.in); 
        System.out.println("Enter the following to find area of the following shapes"); 
        System.out.println("1 for circle"); 
        System.out.println("2 for triangle "); 
        System.out.println("3 for rectangle"); 
        System.out.println("4 for square"); 
        int menu = a.nextInt(); 
        switch (menu){
            case 1 : 

            System.out.println("Enter the radius of circle"); 
            double radius = a.nextDouble(); 
            double areaC = Math.PI*radius*radius; 
            System.out.println("The area of circle = " +areaC); 
            break; 

            case 2 : 
            System.out.println("Enter the base and height of triangle one after another"); 
            double height = a.nextDouble(); 
            double base = a.nextDouble(); 
            double areaT = (base*height)/2; 
            System.out.println("The area of triangle = " + areaT); 
            break; 

            case 3 : 
            System.out.println("Enter the length and breadth of rectangle one after another"); 
            double l = a.nextDouble(); 
            double b = a.nextDouble(); 
            double areaR = l*b; 
            System.out.println("The area of recatangle = "+areaR); 
            break; 

            case 4 : 
            System.out.println("Enter the side's length of the square"); 
            double s = a.nextDouble(); 
            double areaS = s*s; 
            System.out.println("The area of the square = "+areaS); 
            break; 

            default : System.out.println("Enter only from 1 to 4"); 
        }
    }

    static void calculator(){
        double n1, n2, result; 
        char operator; 
        Scanner s = new Scanner (System.in); 
        System.out.println("Enter the first number and second number one after another "); 
        n1 = s.nextDouble(); 
        n2 = s.nextDouble(); 
        System.out.println("Enter the operator +, -, *, / and %. "); 
        s.nextLine(); 
        String tmp = s.nextLine();
        operator = tmp.charAt(0); 
        switch(operator){
            case '+' : result = n1+n2; 
            System.out.println("Sum of "+ n1+" and "+n2 +" is " + result); 
            break; 
            case '-' : result = n1-n2; 
            System.out.println("Difference between "+n1+" and " +n2 +" is " + result); 
            break; 
            case'*' : result = n1*n2; 
            System.out.println("The product of " +n1 +" and " +n2 + " is " + result); 
            break; 
            case '/' : result = n1/n2; 
            System.out.println("The division of "+n1+" and " + n2 +" results in " + result ); 
            break ; 
            case '%' : result = n1%n2; 
            System.out.println("The remainder of "+ n1+ " and " +n2 +" is " + result ); 
            break; 
            default : System.out.println("Invalid Operator"); 
            break; 
        }
    }

    static void check(){
        int a = 5; 
        if(a==5)
            System.out.println("five");
        else 
            System.out.println("not Five"); 
    }

    static void AscendingOrder(){
        Scanner hv = new Scanner(System.in); 
        System.out.println("Enter the three numbers to be sorted ONE AFTER ANOTHER"); 
        int a = hv.nextInt(); 
        int b = hv.nextInt(); 
        int c = hv.nextInt(); 
        if(a<b){
            if(b<c){
                System.out.println(a+" "+b+" "+c); 
            }
            else if(a<c){
                System.out.println(a+" "+c+" "+b);  
            }
            else {
                System.out.println(c+" "+a+" "+b); 
            }
        }
        else{
            if (b<a){
                if (a<c){
                    System.out.println(b+" "+a+" "+c); 
                }
            }
            else if (b<c){
                System.out.println(b+" "+c+" "+a); 
            }
            else {
                System.out.println(c+" "+b+" "+a); 
            }
        }
    }

    static void gradeGiver(){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter you marks one after another"); 
        System.out.println("Enter your marks in maths"); 
        System.out.println("Enter your marks in science"); 
        System.out.println("Enter your marks in english"); 
        int maths =sc. nextInt(); 
        int science = sc.nextInt(); 
        int english = sc.nextInt(); 
        double percent = ((maths+science+english)*100)/300; 
        if (percent<40.0){
            System.out.println("Grade = E");  
        }
        else if (percent>=40.0 && percent<=50.0){
            System.out.println("Grade = D"); 
        }
        else if (percent >=50.0&&percent<=60.0){
            System.out.println("Grade = C"); 
        }
        else if (percent>=60.0&&percent<=75.0){
            System.out.println("Grade = B");
        }
        else {
            System.out.println("Grade = A"); 
        }
    }

    static void exerciseAnswerChecker(){
        Scanner harshit = new Scanner(System.in); 
        System.out.println("Enter the number"); 
        int a = harshit.nextInt(); 
        if (a==0)
            System.out.println("zero");
        else if (a==1)
            System.out.println("one"); 
        else if (a==2)
            System.out.println("two");
        else if (a==3)
            System.out.println("three");
    }

    static void question18(){
        Scanner s = new Scanner(System.in); 
        System.out.println("Enter the letter"); 

        String abc = s.nextLine();  
        char code = abc.charAt(0); 
        switch(code){
            case 'A' : System.out.println("Accountant"); 
            break; 
            case 'C' :  
            case 'G' : System.out.println("Grade IV"); 
            break; 
            case 'F' : System.out.println("Advisor");
        }
    }

    static void Question21(){
        Scanner s = new Scanner(System.in); 
        System.out.println("Enter a month number"); 
        int monthn = s.nextInt(); 
        String month = "";
        switch(monthn){
            case 1 : month = "Jan"; 
            break; 
            case 2 : month = "Feb"; 
            break; 
            case 3 : month = "Mar"; 
            break; 
            case 4 : month = "Apr"; 
            break; 
            case 5 : month = "May"; 
            break; 
            case 6 : month = "Jun"; 
            break ; 
            case 7 : month = "jul"; 
            break; 
            case 8 : month = "Aug"; 
            break; 
            case 9 : month = "Sep"; 
            break; 
            case 10 : month = "Oct"; 
            break; 
            case 11 : month = "Nov"; 
            break; 
            case 12 : month = "Dec"; 
            break; 
            default: System.out.println("Enter a valid month number form 1- 12"); 
        }
        System.out.println(month); 
    }

    static void questio_22(){
        Scanner sc= new Scanner (System.in); 
        System.out.println("Enter a character - a digit or a letter"); 
        String abc = sc.nextLine(); 
        char input = abc.charAt(0); 
        if ((input >='a'&&input<='z')||(input>='A'&&input<='Z')){
            System.out.println("Its a letter"); 
        }
        else{
            System.out.println("Its a digit"); 
        }
    } 

    static void Question23(){
        Scanner scan = new Scanner(System.in); 
        System.out.println("Enter Principle");
        double  p = scan.nextInt(); 
        System.out.println("Enter Time");
        double  t = scan.nextInt(); 
        double  r=0, n=1; 
        double a , CI; 

        if(p<2000&&t>2){
            r = 5; 
        }
        else if (p>=2000&&p<6000){
            if (t>=2) 
                r = 7; 
        }
        else if (p>6000&&t>=1){
            r = 8; 
        }
        else if (t>=5){
            r = 10; 
        }

        else {
            r = 3; 
        }

        a = p*Math.pow((100+r)/100,t);
        CI = a-p; 
        System.out.println("Details :- "); 
        System.out.println("The Deposit = " +p); 
        System.out.println("The rate of interest = "+r); 
        System.out.println("The time in years = " +t); 
        System.out.println("The number of installments = " + n ); 
        System.out.println("The Compound Interest compounded on the deposit forementioned = "+ CI); 
        System.out.println("The Amount at the end = "+ a); 
        System.out.println("The Amount rounded off = " +Math.round(a));
        System.out.println("The CI rounded off = "+Math.round(CI)); 
    } 

    public static void ifElseTest(int a, int b){
        if (a<b){
            a = a*2; 
        } 
        if (a>b){
            a = a-10;
        } 
        else{
            b++; 
        } 
        System.out.println(a+" " +b); 
    }
} 
// All the programs of considerable importance have been covered and thus chapter 9 concludes here. 




