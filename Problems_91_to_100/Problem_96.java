package Problems_91_to_100;

public class Problem_96 {
    public static void main(String[] args) {
     //Java program to find a character in a word string linear search
        String str = "hello";
        char ch = 'o';
        int index = findCharacter(str,ch);
        if(index==-1){
            System.out.println("The character is not found");
        }
        else {
            System.out.println("The index of the specified character: " + index);
        }
    }

    public static int findCharacter(String str, char ch){
        int i;
        for(i=0;i<str.length();i++){
            if(str.charAt(i)==ch){
                return i;
            }
        }
        return -1;
    }
}
