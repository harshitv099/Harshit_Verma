import java.util.Scanner; 
public class Iteration_Constructs_In_Java  {
    public static void cubing(){
        Scanner s = new Scanner(System.in); 
        System.out.println("Enter two integers"); 
        int a = s.nextInt(); 
        int b = s.nextInt();
        for(int i=a; i<=b; i++){
            System.out.println(Math.pow(i,3));
        }
    }

    public static void loop5(){
        for (int i =0; i<=i++; i++)
            System.out.println("Mummy Bhoook Lag rha hai");
    }

    public static void table(){
        System.out.println("Enter any number"); 
        for(int i = 1; i<=100000; i++){
            for (int j = 1; j<=10; j++)
                System.out.println(i+" * "+j+" = "+ i*j);
        }
    }

    public static void squares(){
        Scanner hv = new Scanner(System.in);
        int co =1;
        while (co ==1){
            System.out.println("Enter 1 to continue and 2 to quit"); 
            co = hv.nextInt(); 
            if(co==2)
                break; 
            System.out.println("Press 1 for squares and 2 for cubes"); 
            int Choice = hv.nextInt(); 
            System.out.println("Now enter the last number till which you want it to be printed"); 
            int last = hv.nextInt(); 
            if(Choice ==1){
                for(int i = 1; i <=last; i++){
                    System.out.println("Square of "+i+" = "+Math.pow(i,2)); 

                }
            }
            else if (Choice ==2){
                for (int i = 1; i <=last; i++)
                    System.out.println("Cube of "+i+" = "+Math.pow(i,3)); 
            }
        }
        System.out.println("Thank you for using this program. \n Terminated !"); 
    }

    public static void Temp_LOOP(){
        Scanner h = new Scanner(System.in); 
        int co = 3;
        while (co ==3){
            System.out.println("Enter 3 to continue and 4 to quit"); 
            co = h.nextInt();
            if (co ==4)
                break;
            System.out.println("C to F = 1 \nF to C = 2"); 
            int choice = h.nextInt(); 

            if (choice ==1){
                System.out.println("Enter Temperature in Celsius "); 
                double C = h.nextDouble(); 
                double C_F = ((9*C)/5)+32; 
                System.out.println(C+" in Fahrenheit = "+C_F); 
            }
            else if(choice ==2){
                System.out.println("Enter temperature in Fahrenheit"); 
                double F = h.nextDouble(); 
                double F_C = (F-32)*5/9; 
                System.out.println(F+" in Celsius = "+ F_C); 
            }
        }
        System.out.println("Thank for using this program. \nTHE PROGRAM IS TERMINATED"); 
    }

    public static void p2(){
        for (int i = 0; i<20; i +=3)
            System.out.print(i+" "); 
    }

    public static void p3(){
        for (int i=1; i<=5; i++)
            System.out.println(i*i); 
    }

    public static void p4 (){
        for (int i = 1; i<=15; i++)
            System.out.print(i+" ");
    }

    public static void p5(){
        for (int i = 2; i <=14; i +=2)
            System.out.println(i); 
    }

    public static void p6 (){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the number whose table is to be printed"); 
        int i =sc.nextInt(); 
        for(int j = 0; j<=10; j++)
            System.out.println(i +" * "+j +" = "+i*j); 
    }

    public static void p7(){
        for (int i =20; i>=1; i--)
            System.out.println(i); 
    }

    public static void p8(){
        for(int i = 1; i<=31; i++)
            System.out.println("2^"+i +" = "+(int)Math.pow(2,i));  
    } 

    public static void p9(){
        String j = "";
        for(int i = 1; i<5; i++){
            j = "A"+j; 
            System.out.println(j); 
        }
    }

    public static void factorial(){
        //I don't know what is factorial. I haven't learnt it yet. Skipping on to the next !
        //Its 28 nov today. Now i know what is factorial. 
        Scanner v = new Scanner(System.in); 
        System.out.println("Enter a number"); 
        double n = v.nextInt(); 
        double factorial = 1; 
        for(double  i =1; i<=n; i++)
            factorial *=i; 
        System.out.println("!"+ n +" = "+ factorial); 
    }

    public static void p11(){
        int i,j; 
        for( i = 0,j = 10; i<5; i++, j--)
            System.out.println(i+ " "+j); 
    }

    public static void p12(){
        for(int i = 46_656; i>0; i/=6)
            System.out.println(i); 
    }

    static void looppooo(){
        for(int i =1; i <=i++; i++)
            System.out.print("phuchu bhaiya ");
    }

    public static void Geometry(){
        // Author : Harshit Verma 
        // Completed At - 02/11/2021 04:55 PM
        Scanner verma = new Scanner(System.in);
        int loop =1; 
        while (loop==1){
            System.out.println("Enter :- \n 1. Continue \n 2. Quit"); 
            loop = verma.nextInt(); 
            if(loop==2){
                System.out.println("The Program is Terminated At Your Request ! \n Thank You For Using This Program !"); 
                System.exit(0); 

            }
            System.out.println("Select Figure :- \n 1. Circle \n 2. Triangle \n 3. Rectangle \n 4. Square "); 
            int figure = verma.nextInt();
            switch (figure){
                case 1 :
                System.out.println("Select Option :- \n 1. Area \n 2. Circumference"); 
                int optionC = verma.nextInt(); 
                System.out.println("Enter Radius Please."); 
                double r= verma.nextDouble(); 
                double areaC, circumC; 
                if (optionC ==1){
                    areaC = Math.PI*r*r; 
                    System.out.println("The Area = "+areaC); 
                }
                if(optionC ==2){
                    circumC = 2*Math.PI*r; 
                    System.out.println("The Circumference = "+circumC); 
                }
                break;

                case 2 : 
                System.out.println("Select Option :- \n 1. Area \n 2. Perimeter"); 
                int optionT = verma.nextInt(); 
                System.out.println("Enter the folowing :- \n 1. 1st Side \n 2. 2nd Side \n 3. 3rd Side \n Please Enter The Values One After Another"); 
                double side1 = verma.nextDouble(); 
                double side2 = verma.nextDouble(); 
                double side3 = verma.nextDouble(); 
                double areaT, semip, perimeterT; 
                if(optionT==1){
                    semip = (side1+side2+side3)/2;
                    areaT = Math.sqrt(semip*(semip-side1)*(semip-side2)*(semip-side3)); 
                    System.out.println("The Area = "+ areaT); 
                }
                if (optionT==2){
                    perimeterT= side1+side2+side3; 
                    System.out.println("The Perimeter = "+ perimeterT); 
                }
                break;

                case 3 : 
                System.out.println("Select Option :- \n 1. Area \n 2. Perimeter"); 
                int optionR = verma.nextInt(); 
                System.out.println("Enter the following : \n 1. Length \n 2. Breadth \n Please Enter The Values One After Another"); 
                double lengthR =  verma.nextDouble(); 
                double breadthR = verma.nextDouble(); 
                double areaR = (lengthR*breadthR); 
                double perimeterR =  (2*(lengthR+breadthR)); 
                if (optionR ==1){
                    System.out.println("The Area = "+ areaR); 
                }
                if(optionR==2){
                    System.out.println("The Perimeter  "+perimeterR); 
                }
                break; 

                case 4 : 
                System.out.println("Select Option :- \n 1. Area \n 2. Perimeter"); 
                int optionS = verma.nextInt(); 
                System.out.println("Enter :- \n 1. Any Side \n Please Enter The Value One After Another"); 
                double side = verma.nextDouble();  
                double areaS = side*side;
                double perimeterS = 4*side; 
                if(optionS==1)
                    System.out.println("The Area = "+ areaS); 
                if(optionS==2)
                    System.out.println("The Perimeter = "+perimeterS); 
                break; 

                default:
                System.out.println("Invalid Value"); 
                break; 
            }
        }
    }

    public static void check(){
        int input =1; 
        while(input ==1){
            Scanner verma = new Scanner(System.in);  
            System.out.println("Enter 1 to continue and 2 to quit"); 
            input = verma.nextInt(); 
            if(input==2){
                System.out.println("The program is terminated"); 
                System.exit(0); 
            }
            System.out.println("Enter a Number"); 
            double num = verma.nextDouble(); 
            if(num<0)
                System.out.println(num +" is a negative number"); 
            if(num>0)
                System.out.println(num +" is a positive number"); 
            if(num==0)
                System.out.println(num +" is zero"); 
        }
    }

    public static void tableprintf () {
        System.out.println("Enter A Number");
        Scanner harshit = new Scanner(System.in); 
        int a = harshit.nextInt(); 
        for(int i = 0; i <= 10; ++i) {
            System.out.printf("%d * %d = %d \n", a, i, a * i);
        }
    }

    public static void reverse (){
        for(int i = 20; i>=1; i--)
            System.out.println(i); 
    }

    public static void powers(){
        Scanner sc = new Scanner(System.in); 
        int cont = 1; 
        while(cont==1){
            System.out.println("Enter 1 to start and 2 to exit "); 
            cont = sc.nextInt(); 
            if (cont !=1){
                System.out.println("Terminnated!\nThank You"); 
                System.exit(0);
            }
            System.out.println("Enter a number"); 
            int no = sc.nextInt(); 
            int i = 1; 

            for( i = 1; i<=10; i++){
                int pow = (int)Math.pow(no,i); 
                System.out.printf("%d ^ %d = %d \n", no, i, pow );
            }
        }
    }

    public static void concat(){
        String s = " "; 
        for (int i = 1; i<=5; i++,s +=" Harshit")
            System.out.println(s); 
    }

    public static void endlessloop(){
        for (;;)
            System.out.println("Endless LOOP");
    }

    public static void wap10_18(){
        Scanner verma = new Scanner(System.in); 
        System.out.println("Enter starting number"); 
        int a = verma.nextInt(); 
        int output=1;
        while (output  <100){

            output = a*(a+1); 

            System.out.println(a +"x"+ (a+1)+" = "+ output);  
            a +=1; 
        }
    } 

    public static void experiment_to_find_prime_numbers(){
        for (int i  = 2; i<=100; i++){
            boolean isPrime = true ;  
            for (int j =2; j<i; j++){
                if (i%j==0){
                    isPrime =false; 
                    break; 
                }
            }

            if (isPrime)
                System.out.println(i); 

        }
    }

    public static void power2(){
        int i = 1; 
        for(; i<=10; i++)
            System.out.println("2 ^ "+ i + " = "+ Math.pow(2, i)); 

    }

    public static void concatA(){
        String a = "A"; 
        for(int i = 1; i<=4; i++, a +="A" )
            System.out.println(a); 
    }

    public static void squareTILL_n(){
        Scanner s = new Scanner(System.in); 
        System.out.println("Enter the maximum number to square"); 
        int max = s.nextInt(); 
        int i = 1; 
        while(i<=max){
            System.out.println("The square of "+ i+" = "+ (Math.pow(i, 2))); 
            i++; 
        }
    }

    public static void sum_Of_NO_TILL_100(){
        int s = 0; int i = 1;
        for(i = 1; i<=100; i++, s+=i){}
        System.out.println(s); 
        while (i<=100){
            s+=i; i++;
        }
        System.out.println("Using While loop "+ s); 
    }

    public static void WAP10_16(int n ){
        int i =1, sE = 0, sO=0; 
        while(i<=n){
            if(i%2==0)
                sE+=i; 
            else 
                sO+=i; 
            i++; 
        }
        System.out.println("Sum of Even number till "+ n+" = "+ sE);  
        System.out.println("Sum of Odd number till "+ n+" = "+ sO);  
    }

    public static void WAP10_17(){
        Scanner sc = new Scanner(System.in); 
        int s=0, n=0; 
        while (n!=-1){
            s +=n; 
            System.out.println("Enter a Positive addends (-1 to quit)"); 
            n = sc.nextInt();
        }
        System.out.println("The sum of the addends = "+ " = "+ s); 
    }

    public static void WAP10_18(){
        Scanner s = new Scanner(System.in); 
        System.out.println("Enter The Starting Number"); 
        int n = s.nextInt(); 
        int p = 1; 
        while (p <=100){
            p = n*(n+1); 
            System.out.println(n +" x "+ (n+1) + " = "+ p);  
            n++;
        }
    }

    public static void WAP10_19(){
        Scanner hv = new Scanner(System.in); 
        System.out.println("Enter a number"); 
        int n = hv.nextInt(); 
        int quotient, sum=0, digit; 
        while(n>0){
            quotient = n/10; 
            digit = n%10; 
            sum +=digit; 
            n=quotient; 
        }
        System.out.println("Sum of the digits = " + sum); 
    }

    public static void reverse(int number){
        int digit, quotient, reversedNO = 0; 
        while(number>0){
            quotient = number/10; 
            digit = number%10; 
            reversedNO = reversedNO*10+digit; 
            number = quotient; 
        }
        System.out.println("The reversed number = "+ reversedNO); 
    }

    public static void divisors(int num){
        int i=1, Div = 0; 
        while(num>=i){
            if (num%i==0){
                Div++; System.out.println(i); 
            }
            i++; 
        }
        System.out.println("Total number of divisors = "+ Div); 
    }

    public static void series(){
        int i = 1, number = 1; 
        while (i<=12){
            System.out.println(number);
            number +=3; 
            i++; 
        }
    }

    public static void alphabet(){
        char letter = 'A'; 
        do {
            System.out.print(letter+" "); 
            letter++;
        } while (letter<='Z');
    }

    public static void WAP10_23(){
        Scanner hv = new Scanner(System.in); 
        int count = 0, marks=0, totalM=0; 
        do{
            System.out.println("Enter Marks in subject "+ (count+1)+" = ");
            marks = hv.nextInt(); 
            totalM+=marks; 
            count++; 
        }while (count<=4); 
        System.out.println("Total marks in "+ count+" subjects = "+ totalM); 
    }

    public static void armstrong(){
        Scanner verma = new Scanner(System.in); 
        System.out.println("Enter a 3 digit number"); 
        int n = verma.nextInt(); 
        int digit, quotient, sumCubes = 0; 
        while(n>0){
            quotient = n/10; 
            digit = n%10; 
            n = quotient; 
            sumCubes +=Math.pow(digit,3); 
        }
        if (sumCubes==n)
            System.out.println("It is an armstrong number"); 
        else 
            System.out.println("It is not an armstrong number"); 
    }

    public static void palindrome(){
        Scanner harshit = new Scanner(System.in); 
        System.out.print("Enter a number"); 
        int n = harshit.nextInt(); 
        int reversed =0, digit, quotient; 
        int number = n; 
        while(number>0){
            digit = number%10;
            quotient = number/10;  
            reversed = reversed *10+digit; 
            number = quotient; 
        }
        if(reversed==n)
            System.out.println(n+" is a palindrome."); 
        else 
            System.out.println(n+" isn't a palindrome."); 

    }

    public static void MersenneNO(){
        Scanner s = new Scanner(System.in); 
        System.out.println("Enter the maximum limit"); 
        int limit = s.nextInt(); 
        int n = 1; int num; 
        do{
            num = (int)Math.pow(2, n)-1; 
            System.out.println(num); 
            n++;
        }while(num<=limit);
        System.out.println((n-1)+"th Mersenne number exceeded "+ limit); 
    }

    public static void PrimeTest(){
        Scanner sc = new Scanner(System.in); 
        int restart = 1; 
        while(restart ==1){
            System.out.println("Enter the number to be tested"); 
            int num = sc.nextInt(); 
            if(num ==1){
                System.out.println("1 is neither prime nor composite"); 
                System.exit(0); 
            }
            boolean isPrime = true; 
            for(int i = 2; i<num; i++){
                if(num%i==0)
                    isPrime = false; 
            }
            if(isPrime==true)
                System.out.println(num+ " is a prime number"); 
            else 
                System.out.println(num+" isn't a prime number"); 
            System.out.println("Enter 1 to continue and 2 to exit");
            restart = sc.nextInt(); 
        }
        System.exit(0); 
    }

    public static void Fibonacci(){
        //0 1 1 2 3 5 8 13... 
        int firstN =0, secondN = 1, term =0; 
        System.out.println(firstN +"\n"+secondN);  
        int NoOfTerms = 2; 
        while(NoOfTerms<15){
            term = firstN+secondN; 
            firstN = secondN; 
            secondN= term; 
            System.out.println(term); 
            System.out.println ("NoOfTerms - " +NoOfTerms); 
            ++NoOfTerms;
        }
    }

    static void WAP25(){
        Scanner hv = new Scanner(System.in); 
        System.out.println("Enter a number. "); 
        int num = hv.nextInt(); 
        int digit, tensDigit=0, thousandsDigit=0; int count = 0; 
        int n = num; 
        while(n>0){
            digit = n%10; 
            count++; 
            n/=10; 
            if(count==2){
                tensDigit=digit  ;
                System.out.println("The Place Value of ten's Digit = "+ (tensDigit*10)); 
            }
            if(count == 4){
                thousandsDigit = digit;
                System.out.println("The Place Value of thoudand's Digit = "+ (thousandsDigit*1000));  
            }
            
        }
    }
}

