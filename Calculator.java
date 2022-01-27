import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner Harshit = new Scanner(System.in);
        int Continue = 1;
        while (Continue == 1) {
            System.out.println("Choose among the following calculators:- \n1. Calculator \t2. Unit Converter \t3. Scientific Calculator \t4. Physics Calculator");
            int module = Harshit.nextInt();

            switch (module) {
                case 1: 
                System.out.println("Enter The 1st number");
                Scanner harshit = new Scanner(System.in);
                double firstno = harshit.nextDouble();
                System.out.println("Enter The 2nd number");
                double secondno = harshit.nextDouble();
                System.out.println("Enter 1 for +, 2 for -, 3 for *, 4 for /");
                int operator = harshit.nextInt();
                double sol = 0;
                switch(operator){
                    case 1 : sol = firstno+secondno;    
                    System.out.println ("The solution = "+ sol);
                    break;
                    case 2 : sol = firstno-secondno;
                    System.out.println ("The solution = "+ sol);
                    break;
                    case 3: sol = firstno*secondno;
                    System.out.println ("The solution = "+ sol);
                    break;
                    case 4 : sol = firstno/secondno;
                    System.out.println ("The solution = "+ sol);
                    break;
                }
                break; 
                case 2:
                System.out.println("Choose among the following quantities :- \n1. Length \t2. Mass \t3. Temperature \t4. Time ");
                int choice = Harshit.nextInt();
                switch (choice) {
                    case 1:
                    System.out.println("Tell us length (in Metre only)");
                    double lengthInMetre = Harshit.nextDouble();
                    System.out.println("Choose the unit in which you want to convert it to :- \nFor ex - Enter 1 to convert " + lengthInMetre + "m into Inches. \n1. Inch \t2. Miles \t3. Yards \n4. Feet \t5. Microns \t6. Nanometre \n7. Parsec \t8. AstUnit \t9. Light Years");
                    double toLengthUnit = Harshit.nextInt();
                    if (toLengthUnit == 1) {
                        System.out.println(lengthInMetre + "m = " + (lengthInMetre * 39.37008) + " inches");
                        break;
                    } else if (toLengthUnit == 2) {
                        System.out.println(lengthInMetre + "m = " + (lengthInMetre * 0.000621) + " miles");
                        break;
                    } else if (toLengthUnit == 3) {
                        System.out.println(lengthInMetre + "m = " + (lengthInMetre * 1.093613) + " yards");
                        break;
                    } else if (toLengthUnit == 4) {
                        System.out.println(lengthInMetre + "m = " + (lengthInMetre * 3.28084) + " feet");
                        break;
                    } else if (toLengthUnit == 5) {
                        System.out.println(lengthInMetre + "m = " + (lengthInMetre * 10_00_000) + " µm");
                        break;
                    } else if (toLengthUnit == 6) {
                        System.out.println(lengthInMetre + "m = " + (lengthInMetre * 1_00_00_00_000) + " nm");
                        break;
                    } else if (toLengthUnit == 7) {
                        System.out.println(lengthInMetre + "m = " + (lengthInMetre * 3.2407792896664E-17) + " parsec");
                        break;
                    } else if (toLengthUnit == 8) {
                        System.out.println(lengthInMetre + "m = " + (lengthInMetre * 6.6845871226706E-12) + " AU");
                    } else if (toLengthUnit == 9) {
                        System.out.println(lengthInMetre + "m = " + (lengthInMetre * 1.0570008340247E-16) + " ly");
                        break;
                    }
                    break;
                    case 2:
                    System.out.println("Tell us the mass (in Grams only)");
                    double massInGrams = Harshit.nextDouble();
                    System.out.println("Choose the unit in which you want to convert it to among the following :- \nFor ex - Enter 1 to convert " + massInGrams + "g it to Carats. \n1. Carat \t2. Tonnes \t3. Quintals \n4. Ounces \t5. Pounds \t6. Atomic Mass Unit (amu)");
                    int toMassUnit = Harshit.nextInt();
                    if (toMassUnit == 1) {
                        System.out.println(massInGrams + "g = " + (massInGrams * 5) + " Carats");
                        break;
                    } else if (toMassUnit == 2) {
                        System.out.println(massInGrams + "g = " + (massInGrams * 0.000001) + " Metric Tonnes");
                        break;
                    } else if (toMassUnit == 3) {
                        System.out.println(massInGrams + "g = " + (massInGrams * 0.00001) + " Quintals");
                        break;
                    } else if (toMassUnit == 4) {
                        System.out.println(massInGrams + "g = " + (massInGrams * 0.035274) + " Ounces");
                        break;
                    } else if (toMassUnit == 5) {
                        System.out.println(massInGrams + "g = " + (massInGrams * 0.002205) + " pounds");
                        break;
                    } else if (toMassUnit == 6) {
                        System.out.println(massInGrams + "g = " + (massInGrams * 6.0229552894949E+23) + " amu");
                        break;
                    }
                    break;
                    case 3:
                    System.out.println("Tell us the temperature (in °C)");
                    double temperatureInCelsius = Harshit.nextDouble();
                    System.out.println("Tell us the unit in which you want to convert it :-\nFor ex - Enter 1 to convert " + temperatureInCelsius + "°C to Fahrenheit \n1. Fahrenheit \t2. Kelvin \t3. Rankine");
                    int toTempUnit = Harshit.nextInt();
                    if (toTempUnit == 1) {
                        System.out.println(temperatureInCelsius + "°C = " + ((temperatureInCelsius * 9 / 5) + 32) + "°F");
                        break;
                    } else if (toTempUnit == 2) {
                        System.out.println(temperatureInCelsius + "°C = " + (temperatureInCelsius + 273) + " K");
                        break;
                    } else if (toTempUnit == 3) {
                        System.out.println((temperatureInCelsius + "°C = " + (temperatureInCelsius + 273.15) * 9 / 5) + "°R");
                        break;
                    }
                    break;
                    case 4:
                    Scanner nk = new Scanner(System.in);
                    System.out.println("Choose the unit with what you want to work: \n 1 for Year \t 2 for Month \t 3 for Days \t 4 for Hours \t 5 for Minutes");
                    choice = nk.nextInt();
                    switch (choice) {
                        case 1:
                        System.out.println("Enter Year");
                        double Year = nk.nextDouble();
                        System.out.println("Now tell us to what you want to convert " + Year + " years to:");
                        System.out.println("Choose:\n 1 for Month \t 2 for days  \t 3 for hours \t 4 for minutes \t 5 for seconds");
                        int time = nk.nextInt();
                        if (time == 1)
                            System.out.println(Year + "=" + Year * 12 + " months");
                        else if (time == 2)
                            System.out.println(Year + "=" + Year * 365 + " days");
                        else if (time == 3)
                            System.out.println(Year + "=" + Year * 8760 + " hours");
                        else if (time == 4)
                            System.out.println(Year + "=" + Year * 525960 + " minutes");
                        else if (time == 5)
                            System.out.println(Year + "=" + Year * 3.15E+7 + " seconds");

                        break;
                        case 2:
                        System.out.println("Enter Month");
                        double Month = nk.nextDouble();
                        System.out.println("Now tell us to what you want to convert " + Month + " months to:");
                        System.out.println("Choose:\n 1 for days  \t 2 for hours \t 3 for minutes \t 4 for seconds");
                        int tim = nk.nextInt();
                        if (tim == 1)
                            System.out.println(Month + "=" + Month * 30 + " days \n approx in 30");
                        else if (tim == 2)
                            System.out.println(Month + "=" + Month * 730 + " hours");
                        else if (tim == 3)
                            System.out.println(Month + "=" + Month * 43800 + " minutes");
                        else if (tim == 4)
                            System.out.println(Month + "=" + Month * 2.628e+6 + " second");

                        break;
                        case 3:
                        System.out.println("Enter Days");
                        double Days = nk.nextDouble();
                        System.out.println("Now tell us to what you want to convert " + Days + " days");
                        System.out.println("Choose \n 1 for hours \t 2 for minutes \t 3 for seconds");
                        int ti = nk.nextInt();

                        if (ti == 1)
                            System.out.println(Days + "=" + Days * 24 + " hours");
                        else if (ti == 2)
                            System.out.println(Days + "=" + Days * 1440 + " minutes");
                        else if (ti == 3)
                            System.out.println(Days + "=" + Days * 86400 + " second");

                        break;
                        case 4:
                        System.out.println("Enter Hours");
                        double hour = nk.nextDouble();
                        System.out.println("Now tell us to what you want to convert " + hour + " hours to");
                        System.out.println("Choose: \n 1 for minutes \t 2 for seconds");
                        int t = nk.nextInt();

                        if (t == 1)
                            System.out.println(hour + "=" + hour * 60 + " minutes");
                        else if (t == 2)
                            System.out.println(hour + "=" + hour * 3600 + " seconds");

                        break;
                        case 5: 
                        System.out.println("Enter Minutes");
                        double m = nk.nextDouble();

                        System.out.println("Only can be converted to seconds");
                        System.out.println(m + "=" + m * 60 + " seconds");

                        break;
                        default:
                        System.out.println("Not a valid unit of time or your unit is not in our program");
                    }
                    default:
                    System.out.println("Choose a valid quantity.");
                }
                break;
                case 3:
                System.out.println("Choose an operation among the following:- \n1. Square \n2. Cube \n3. X^n \n4. Square root \n5. Cube Root  \n6. Round-Off \n8. Random Number Generator \n9. π \n10. log \n11. !x \n12. ABS");
                int ScientificChoice = Harshit.nextInt();
                if (ScientificChoice == 1) {
                    System.out.println("Enter the number");
                    int n = Harshit.nextInt();
                    System.out.println(n + "² = " + Math.pow(n, 2));
                    break;
                } else if (ScientificChoice == 2) {
                    System.out.println("Enter the number");
                    int n = Harshit.nextInt();
                    System.out.println(n + "³ = " + Math.pow(n, 3));
                    break;
                } else if (ScientificChoice == 3) {
                    System.out.println("Enter the number and the desired power you want to raise it to you");
                    int n = Harshit.nextInt();
                    int power = Harshit.nextInt();
                    System.out.println(n + "^" + power + " = " + Math.pow(n, power));
                    break;
                } else if (ScientificChoice == 4) {
                    System.out.println("Enter the number");
                    int n = Harshit.nextInt();
                    System.out.println("√" + n + " = " + Math.sqrt(n));
                    break;
                } else if (ScientificChoice == 5) {
                    System.out.println("Enter the number");
                    int n = Harshit.nextInt();
                    System.out.println("₃√" + n + " = " + Math.cbrt(n));
                    break;
                } else if (ScientificChoice == 6) {
                    System.out.println("Enter the number");
                    double n = Harshit.nextInt();
                    System.out.println(n + " = " + Math.round(n));
                    break;
                } else if (ScientificChoice == 7) {
                    System.out.println(Math.random());
                    break;
                } else if (ScientificChoice == 8) {
                    System.out.println(Math.PI);
                    break;
                } else if (ScientificChoice == 9) {
                    System.out.println("Enter a number");
                    int n = Harshit.nextInt();
                    System.out.println("log" + n + " = " + Math.log(n));
                    break;
                } else if (ScientificChoice == 10) {
                    System.out.println("Enter a number");
                    int n = Harshit.nextInt();
                    int factorial = 1;
                    for (int j = 1; j <= n; j++) {
                        factorial *= j;
                    }
                    System.out.println("!" + n + " = " + factorial);
                    break;
                } else if (ScientificChoice == 11) {
                    System.out.println("Enter a number");
                    int n = Harshit.nextInt();
                    System.out.println("|" + n + "|" + " = " + Math.abs(n));
                    break;
                }

                case 4:
                Scanner nk = new Scanner(System.in);
                System.out.println("Enter \n 1 for momentum \t 2 for pressure on fluid \t 3 for upthrust \t 4 for gravitational attraction");
                int count = nk.nextInt();
                switch (count) {

                    case 1:
                    System.out.println("Enter Mass in kg");
                    double mass = nk.nextInt();
                    System.out.println("Enter velocity in m/s");
                    double velocity = nk.nextInt();
                    double momentum = mass * velocity;
                    System.out.println("Momentum of the body =" + momentum + "kgm/s");
                    break;

                    case 2:
                    System.out.println("Enter Depth from the surface in m");
                    double hei = nk.nextInt();
                    System.out.println("Enter Density of fluid kg/m³");
                    double den = nk.nextInt();
                    double pre = hei * den * 9.8;
                    System.out.println("Pressure in fluid = " + pre);
                    break;

                    case 3:
                    System.out.println("Volume of the body in m³");
                    double vol = nk.nextInt();
                    System.out.println("Density of fluid kg/m³");
                    double density = nk.nextInt();
                    double upthrust = vol * density * 9.8;
                    System.out.println("Upthrust =" + upthrust + "N");
                    break;
                    case 4:

                    System.out.println("Enter of mass of first body in kg");
                    double mass1 = nk.nextInt();
                    System.out.println("Enter of mass of second body in kg ");
                    double mass2 = nk.nextInt();
                    System.out.println("Enter distance between two bodies in m");
                    double r = nk.nextInt();
                    double Gf = (6.67) * (mass1 * mass2 / r * r);
                    System.out.println("Gravitational Force =" + Gf + "N");
                    break;
                }
                break;
            }
            System.out.println("Enter 1 to restart and 0 to exit the program.");
            Continue = Harshit.nextInt();
            if (Continue != 1 && Continue != 0) {
                System.out.println("Enter 1 to restart and 0 to exit the program.");
                Continue = Harshit.nextInt();
            }
            if (Continue == 0) {
                System.out.println("Thank you ! \nThe Program is terminated.");
                System.exit(0);
            }
        }
    }
}

