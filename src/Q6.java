////public class Q6 {
public class Q6 {
    public static void main(String args[]){
        int m1[][] = {{2,2,3}, {3,2,4},{1,3,4}};
        int m2[][] = {{3,5,7}, {4,2,1},{3,2,1}};

        System.out.println("Metrix 1");
        printArray(m1);

        System.out.println("Metrix 2");
        printArray(m2);

        int result[][]={{0,0,0},{0,0,0},{0,0,0}};

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    result[i][j]= result[i][j] + m1[i][k]*m2[k][j] ;
                }
            }
        }
        System.out.println("After multiplication");
        printArray(result);
    }

    public static void printArray(int[][] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray.length; j++) {
                System.out.print(intArray[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
