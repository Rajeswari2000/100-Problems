package Problems_21_to_30;

public class Problem_30 {
    public static void main(String[] args) {
        //Find the Largest Number Among Three Numbers

        int a=7,b=10,c=4,largest;
        largest = (a>b? a:b)>c? (a>b?a:b):c;
        System.out.println("The largest among the three number is: "+largest);
    }
}

