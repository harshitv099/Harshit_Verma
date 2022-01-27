import java.util.*; 
public class Nested_Loops{

    static void square () {
        for (int rows = 1; rows <= 5; rows++) {
            for (int col = 1; col <= 5; col++)
                System.out.print("* ");
            System.out.println();
        }
    }

    static void increasingTriangle () {
        for (int rows = 1; rows <= 5; rows++) {
            for (int col = 1; col <= rows; col++)
                System.out.print("* ");
            System.out.println();
        }
    }

    static void decreasingTriangle () {
        for (int rows = 1; rows <= 5; rows++) {
            for (int col = rows; col <= 5; col++)
                System.out.print("* ");
            System.out.println();
        }
    }

    static void IncreasingRightSidedTriangle () {
        for (int rows = 1; rows <= 5; rows++) {
            for (int col = rows; col <= 5; col++)//decreasing triangle of spaces
                System.out.print("  ");
            for (int col = 1; col <= rows; col++)//increasing triangle of stars
                System.out.print("* ");
            System.out.println();
        }
    }

    static void DecreasingRightSidedTriangle () {
        for (int rows = 1; rows <= 5; rows++) {
            for (int col = 1; col <= rows; col++)//Increasing triangle of spaces.
                System.out.print("  ");
            for (int col = rows; col <= 5; col++)//Decreasing Triangle of stars.
                System.out.print("* ");
            System.out.println();
        }
    }

    static void Hill () {
        for (int rows = 1; rows <= 5; rows++) {
            for (int col = rows; col <= 5; col++)
                System.out.print("  ");
            for (int col = 1; col < rows; col++)// Here col<rows is used because one column must be reduced to obtain the pattern.
                System.out.print("* ");
            for (int col = 1; col <= rows; col++)
                System.out.print("* ");
            System.out.println();
        }
    }

    static void ReverseHill () {
        for (int rows = 1; rows <= 5; rows++) {
            for (int col = 1; col <= rows; col++)
                System.out.print("  ");
            for (int col = rows; col < 5; col++)
                System.out.print("* ");
            for (int col = rows; col <= 5; col++)
                System.out.print("* ");
            System.out.println();
        }
    }

    static void diamond () {
        for (int rows = 1; rows < 5; rows++) {
            for (int col = rows; col <= 5; col++)
                System.out.print("  ");
            for (int col = 1; col < rows; col++)
                System.out.print("* ");
            for (int col = 1; col <= rows; col++)
                System.out.print("* ");
            System.out.println();
        }
        for (int rows = 1; rows <= 5; rows++) {
            for (int col = 1; col <= rows; col++)
                System.out.print("  ");
            for (int col = rows; col < 5; col++)
                System.out.print("* ");
            for (int col = rows; col <= 5; col++)
                System.out.print("* ");
            System.out.println();
        }
    }

    static void Pyramid () {
        for (int rows = 1; rows <= 5; rows++) {
            for (int col = rows; col <= 5; col++)
                System.out.print(" ");
            for (int col = 1; col <= rows; col++)
                System.out.print("* ");
            System.out.println();
        }
    }

    static void reversePyramid () {
        for (int rows = 1; rows <= 5; rows++) {
            for (int col = 1; col <= rows; col++)
                System.out.print(" ");
            for (int col = rows; col <= 5; col++)
                System.out.print("* ");
            System.out.println();
        }
    }

    static void DoubleHill () {
        for (int rows = 1; rows <= 5; rows++) {
            for (int col = rows; col <= 5; col++)
                System.out.print(" ");
            for (int col = 1; col <= rows; col++)
                System.out.print("* ");

            for (int col = rows; col < 5; col++)
                System.out.print("  ");
            for (int col = 1; col <= rows; col++)
                System.out.print("* ");
            System.out.println();
        }
    }

    static void Pattern1 () {
        for (int rows = 1, p = 1; rows <= 5; rows++, p++) {
            for (int col = 1; col <= rows; col++)
                System.out.print(p + " ");
            System.out.println();
        }
    }

    static void Pattern2 () {
        for (int rows = 1, p = 1; rows <= 5; rows++, p++) {
            for (int col = 1; col <= rows; col++)
                System.out.print("  ");
            for (int col = rows; col <= 5; col++)
                System.out.print(p + " ");
            System.out.println();
        }
    }

    static void Pattern3 () {
        for (int rows = 1, p = 1; rows <= 5; rows++, p++) {
            for (int col = rows; col <= 5; col++)
                System.out.print("  ");
            for (int col = 1; col <= rows; col++)
                System.out.print(p + " ");
            for (int col = 1; col < rows; col++)
                System.out.print(p + " ");
            System.out.println();
        }
    }

    static void Pattern4 () {
        for (int rows = 1, p = 1; rows <= 5; rows++, p++) {
            for (int col = 1; col <= rows; col++)
                System.out.print("  ");
            for (int col = rows; col <= 5; col++)
                System.out.print(p + " ");
            for (int col = rows; col < 5; col++)
                System.out.print(p + " ");
            System.out.println();
        }
    }

    static void Pattern5 () {//Pattern 4,(A/c to copy.
        for (int rows = 1, p = 5; rows <= 5; rows++, p--) {
            for (int col = 1; col <= rows; col++)
                System.out.print("  ");
            for (int col = rows; col < 5; col++)
                System.out.print(p + " ");
            for (int col = rows; col <= 5; col++)
                System.out.print(p + " ");
            System.out.println();
        }
    }

    static void Pattern6 () {
        for (int rows = 1; rows <= 5; rows++) {
            for (int col = 1, p = 1; col <= rows; col++, p++)
                System.out.print(p + " ");
            System.out.println();
        }
    }

    static void Pattern7 () {
        for (int rows = 1; rows <= 5; rows++) {
            for (int col = rows; col <= 5; col++)
                System.out.print("  ");
            for (int col = 1, p = 1; col <= rows; col++, p++)
                System.out.print(p + " ");
            System.out.println();
        }
    }

    static void Pattern8 () {
        for (int rows = 1; rows <= 5; rows++) {
            for (int col = 1, p = rows; col <= rows; col++, p--)
                System.out.print(p + " ");
            System.out.println();
        }
    }

    static void Pattern9 () {
        for (int rows = 1; rows <= 5; rows++) {
            for (int col = rows; col <= 5; col++)
                System.out.print("  ");
            for (int col = 1, p = 1; col < rows; col++, p++)
                System.out.print(p + " ");
            for (int col = 1, p = rows; col <= rows; col++, p--)
                System.out.print(p + " ");
            System.out.println();
        }
    }

    static void Pattern10 () {
        for (int rows = 1, rowCounter = 5; rows <= 5; rows++, rowCounter--) {
            for (int col = rows, p = rowCounter; col <= 5; col++, p--)
                System.out.print(p);
            System.out.println();
        }
    }

    static void Pattern11 () {
        for (int rows = 1, q = 5; rows <= 5; rows++, q--) {
            for (int col = 1; col <= rows; col++)
                System.out.print("  ");
            for (int col = rows, p = 1; col < 5; col++, p++)
                System.out.print(p + " ");
            for (int col = rows, p = q; col <= 5; col++, p--)
                System.out.print(p + " ");
            System.out.println();
        }
    }

    static void PatternA () {
        for (int rows = 1, p = 1; rows <= 5; rows++, p++) {
            for (int col = 1; col <= rows; col++)
                System.out.print(p + " ");
            System.out.println();
        }
    }

    static void PatternB () {
        for (int rows = 1; rows <= 5; rows++) {
            for (int col = 1, p = 1; col <= rows; col++, p++)
                System.out.print(p + " ");
            System.out.println();
        }
    }

    static void PatternC () {
        for (int rows = 1; rows <= 5; rows++) {
            for (int col = rows; col <= 5; col++)
                System.out.print("* ");
            System.out.println();
        }
    }

    static void PatternD () {
        for (int rows = 1; rows <= 5; rows++) {
            for (int col = rows, p = 1; col <= 5; col++, p++)
                System.out.print(p + " ");
            System.out.println();
        }
    }

    static void PatternE () {
        for (int rows = 1; rows <= 5; rows++) {
            for (int col = rows, p = 5; col <= 5; col++, p--)
                System.out.print(p + " ");
            System.out.println();
        }
    }

    static void Table () {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++)
                System.out.print(i * j + "\t");
            System.out.println();
        }
    }

    static void WAP11_2 () {
        for (int row = 1, p = 1; row <= 5; row++, p++) {
            for (int col = row; col < 5; col++) {
                System.out.print("* ");

            }
            System.out.println(row);
        }
    }

    static void WAP11_3 () {
        for (int row = 1, p = 1; row <= 5; row++, p++) {
            for (int col = row; col < 5; col++)
                System.out.print("* ");
            for (int col = 1; col <= row; col++)
                System.out.print(p + " ");
            System.out.println();
        }
    }

    static void WAP11_4 () {
        for (int rows = 1, p = 1; rows <= 5; rows++, p++) {
            for (int col = rows; col < 5; col++) {
                System.out.print("* ");
            }
            System.out.print(p + " ");
            for (int col = 1; col < rows; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void WAP11_5 () {
        for (int rows = 0; rows <= 9; rows++) {
            for (int col = 1, p = 0; col <= (rows + 1); col++, p += rows)
                System.out.print(p + " ");
            System.out.println();
        }
    }

    static void STQ5 () {
        for (int rows = 1; rows <= 5; rows++) {
            for (int col = 1; col <= rows; col++) {
                if (col == 2 || col == 4)
                    System.out.print("#");
                else
                    System.out.print("*");

            }
            System.out.println();
        }
    }

    static void STQ6 () {
        for (int rows = 1; rows <= 5; rows++) {
            for (int col = rows, p = 5; col <= 5; col++, p--)
                System.out.print(p + " ");
            System.out.println();
        }
    }

    static void STQ7 () {
        for (int rows = 1, num = 1; rows <= 5; rows++) {
            for (int col = 1; col <= rows; col++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    static void STQ8 () {
        String word = "ICSE";
        char letter = ' ';
        for (int rows = 1; rows <= 4; rows++) {
            int k = 0;
            for (int col = 1; col <= rows; col++) {
                letter = word.charAt(k);
                k++;
                System.out.print(letter);
            }
            System.out.println();
        }
    }

    static void STQ9 () {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number till which the triangle is to be printed");
        int n = s.nextInt();
        for (int row = 1, p = 1; row <= n; row++, p++) {
            for (int col = 1; col <= row; col++)
                System.out.print(p + " ");
            System.out.println();
        }
    }

    static void STQ10 () {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number till which the triangle is to be printed");
        int n = s.nextInt();
        for (int rows = 1, p = n; rows <= n; rows++, p--) {
            for (int col = rows; col <= n; col++)
                System.out.print(p + " ");
            System.out.println();
        }
    }

    static void Ques5 () {
        for (int rows = 1; rows <= 5; rows++) {
            for (int col = rows; col <= 5; col++)
                System.out.print("  ");
            for (int col = 1, p = rows; col <= rows; col++, p--)
                System.out.print(p + " ");
            System.out.println();
        }
    }

    static void Ques6 () {
        for (int rows = 1; rows <= 5; rows++) {
            for (int col = rows, p = 1; col <= 5; col++, p++)
                System.out.print(p + " ");
            System.out.println();
        }
    }

    static void Ques7 () {
        for (int rows = 1; rows <= 5; rows++) {
            for (int col = 1; col <= rows; col++)
                System.out.print("  ");
            for (int col = rows; col <= 5; col++)
                System.out.print("* ");
            System.out.println();
        }
    }

    static void Ques8 () {
        for (int rows = 1; rows <= 9; rows += 2) {
            for (int col = 1, p = rows; col <= rows && p >= 1; col++, p -= 2)
                System.out.print(p + " ");
            System.out.println();
        }
    }

    static void Ques9 () {
        for (int rows = 1; rows <= 5; rows++) {
            for (int col = 1; col <= rows; col++) {
                if (col == 2 || col == 4)
                    System.out.print("0 ");
                else
                    System.out.print("1 ");
            }
            System.out.println();
        }
    }

    static void Ques10 () {
        for (int rows = 1; rows <= 5; rows++) {
            for (int col = 1; col <= rows; col++)
                System.out.print("  ");
            for (int col = rows; col <= 5; col++)
                System.out.print("* ");
            System.out.println();
        }
        for (int rows = 2; rows <= 5; rows++) {
            for (int col = rows; col <= 5; col++)
                System.out.print("  ");
            for (int col = 1; col <= rows; col++)
                System.out.print("* ");
            System.out.println();
        }
    }

    static void Try () {
        for (int row = 1; row <= 5; row++) {
            for (int col = row; col >= 1; col--)
                System.out.print(col + " ");
            System.out.println();
        }
    }
}

//All Programs in this chapter have been covered. 
