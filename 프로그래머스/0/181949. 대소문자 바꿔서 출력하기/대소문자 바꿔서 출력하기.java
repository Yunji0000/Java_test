import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        String result = ""; //문자열 초기화
        
        for(int i = 0; i<a.length(); i++){
            char ch = a.charAt(i); 
            if(Character.isUpperCase(ch)){ //is면 불리안
                result += Character.toLowerCase(ch);
            } else {
                result += Character.toUpperCase(ch);
            }
        }
        System.out.println(result);
    }
}