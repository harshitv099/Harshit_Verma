import java.util.Scanner; 
public class WinterAssign{

    static void WAP1(){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter three numbers one by one"); 
        int n1 = sc.nextInt(); 
        int n2 = sc.nextInt(); 
        int n3 = sc.nextInt(); 
        if(n1>n2&&n1>n3)
            System.out.println(n1 +" is the largest"); 
        if(n2>n1&&n2>n3)
            System.out.println(n2+ " is the largest"); 
        if (n3>n1&&n3>n2)
            System.out.println(n3+ " is the largest"); 
    }

    static void WAP_1(){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter three numbers one by one"); 
        int n1 = sc.nextInt(); 
        int n2 = sc.nextInt(); 
        int n3 = sc.nextInt(); 
        int greatest = 0; 
        if(n1>n2){
            if(n1>n3)
                greatest = n1; 
            else 
                greatest = n3; 
        }
        else{
            if(n2>n3)
                greatest = n2; 
            else 
                greatest = n3; 
        }
        System.out.println(greatest+" is the greatest"); 
    }

    public static void WAP2(){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a number"); 
        int N = sc.nextInt(); int factorial = 1; 
        for(int i = 1; i<=N; i++){
            factorial*=i; 
        }
        System.out.println("!"+N +" = " + factorial); 
    }

    public static void WAP3(){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a number"); 
        int M = sc.nextInt(); 
        if(M==1) {
            System.out.println(M+" is neither prime nor composite");
            System.exit(0);
        }
        if(M==2){
            System.out.println(M+" is a prime number"); 
            System.exit(0); 
        }
        boolean Prime = true; 
        for(int i = 2; i<M; i++){
            if(M%i==0)
                Prime = false; 
        }
        if(Prime==true)
            System.out.println(M+" is a prime number"); 
        else 
            System.out.println(M+" is not a prime number"); 
    }

    public static void WAP4(){
        Scanner hv = new Scanner(System.in); 
        System.out.println("Enter 2 numbers (ONE BY ONE)"); 
        int m = hv.nextInt(); int n = hv.nextInt(); int x=0;int hcf=0, lcm;  
        if (m>n)
            x =m; 
        else 
            x = n; 
        for(int i = 1; i<=x; i++){
            if(m%i==0&&n%i==0)
                hcf = i; 
        }
        lcm = (m*n)/hcf;  
        System.out.println("The numbers entered are :- \n"+m+"\n"+n); 
        System.out.println("HCF = "+ hcf+"\nLCM = "+lcm); 
    }

    public static void WAP5(){
        int sum =0; 
        for(int i = 2; i<=35; i+=3){
            System.out.println(i); 
            sum+=i; 

        } System.out.println("The sum of the series = "+sum); 
    }
}

