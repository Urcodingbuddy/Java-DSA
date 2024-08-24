package leetcode;

public class Q744Greatertarget {
    public static void main(String[] args) {
        char[] letters = {'c','d','f', 'j'};
        char target = 'j';
        char res = nextGreatestLetter(letters, target);
        System.out.println(res);
    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(target<letters[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}