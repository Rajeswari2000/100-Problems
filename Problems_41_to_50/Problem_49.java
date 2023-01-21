package Problems_41_to_50;

public class Problem_49 {
    public static void main(String[] args) {
        //pattern

        //for n=9
        //* * * * * * * * *
        // * * * * * * * *
        //  * * * * * * *
        //   * * * * * *
        //    * * * * *
        //     * * * *
        //      * * *
        //       * *
        //        *

        int i,j,n=9,space=0,k;
        for(i=n;i>0;i--){
            for(j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
            space++;
        }
    }
}
