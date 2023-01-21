package Problems_41_to_50;

public class Problem_50 {
    public static void main(String[] args) {
        //pattern

        // for n=9
//        9 9 9 9 9 9 9 9 9
//         8 8 8 8 8 8 8 8
//          7 7 7 7 7 7 7
//           6 6 6 6 6 6
//            5 5 5 5 5
//             4 4 4 4
//              3 3 3
//               2 2
//                1

        int i,j,n=9,space=0,k;
        for(i=n;i>0;i--){
            for(j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(j=0;j<i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
            space++;
        }


    }
}
