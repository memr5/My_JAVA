import java.util.Scanner;

public class Matrix {
        int  R1,C1,R2,C2;
        int M1[][];
        int M2[][];

        Matrix(int R1,int C1,int R2,int C2){
            this.R1 = R1;
            this.C1 = C1;
            this.R2 = R2;
            this.C2 = C2;
        }
        public int check_Matrix_Sum(){
            if(R1 == R2 && C1 == C2){
                return 1;
            }else {
                return 0;
            }
            }

         public int check_Matrix_Multipicity(){
            if((C1) == (R2)){
                return 1;
            }else
            return 0;
        }

        public int[][] take_Matrix(int row,int column){
            System.out.print("Enter Matrix : \n");
            Scanner sc = new Scanner(System.in);
            int[][] mat = new int[row][column];

            for(int i = 0 ; i < row ; i++){
                for (int j = 0 ; j < column ; j++){
                    mat[i][j] = sc.nextInt();
                }
            }
            return mat;
        }

        public int[][] matrix_Sum(){
            int[][] mat = new int[this.M1.length][this.M1[0].length];
            for(int i=0; i<this.M1.length ;i++){
                for (int j=0 ; j<this.M1[0].length ; j++){
                    mat[i][j] = this.M1[i][j] + this.M2[i][j];
                }
            }
            return mat;
        }

        public int[][] matrix_Multiply(){
            int[][] mat = new int[this.M1.length][this.M2[0].length];
            for(int i = 0; i < this.M1.length; i++) {
                for (int j = 0; j < this.M2[0].length; j++) {
                    for (int k = 0; k < this.M1[0].length ; k++) {
                        mat[i][j] += this.M1[i][k] * this.M2[k][j];
                    }
                }
            }
            return mat;
        }
        public static void print_Matrix(int mat[][]) {
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat.length; j++) {
                    System.out.print(mat[i][j] + " ");
                }
                System.out.print("\n");
            }
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter No of Rows in 1 St Matrix : ");
        int R_1 = sc.nextInt();
        System.out.print("Enter No of Column in 1 st Matrix : ");
        int C_1 = sc.nextInt();
        System.out.print("Enter No of Rows in  2 nd Matrix : ");
        int R_2 = sc.nextInt();
        System.out.print("Enter No of Column in 2 nd Matrix : ");
        int C_2 = sc.nextInt();

        Matrix matrix = new Matrix(R_1, C_1, R_2, C_2);


        if (matrix.check_Matrix_Sum() == 1){
            System.out.print("YES!!... MATRIX SUM is possible\n");
        }else {
            System.out.print("NO!!....MATRIX SUM is not possible\n"+ matrix.R1 + matrix.check_Matrix_Multipicity());
        }

        if (matrix.check_Matrix_Multipicity() == 1) {
            System.out.print("Yes!! ... MATRIX MULTIPLY is possible\n");

        } else {
            System.out.print("No!! ... MATRIX MULTIPLY is Not Possible\n");
        }
        matrix.M1 = matrix.take_Matrix(matrix.R1,matrix.C1);
        matrix.M2 = matrix.take_Matrix(matrix.R2,matrix.C2);

        if(matrix.check_Matrix_Sum() == 1){
            System.out.print("SUM of Matrix is : \n");
            int[][] temp1 = matrix.matrix_Sum();
            print_Matrix(temp1);
        }

        if(matrix.check_Matrix_Multipicity() == 1){
            System.out.print("Multiplication of matrix is : \n");
            int[][] temp2 = matrix.matrix_Multiply();
            print_Matrix(temp2);
        }



    }

}
