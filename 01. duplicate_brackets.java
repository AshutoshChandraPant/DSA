import java.io.*;
import  java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        
        boolean ans = duplicate_brackets(str);
        System.out.println(ans);
    }
    
    public static boolean duplicate_brackets(String str) {
        Stack<Character>st = new Stack<>();
        
        for(int i=0; i < str.length();i++) {
            char ch = str.charAt(i);
            
            if(ch == '(') {
                st.push(ch);
            }
            else if(ch == ')') {
                int pc = 0;
                while(st.peek() != '(') {
                    pc++;
                    st.pop();
                }
                st.pop(); // opening bracket
                
                if(pc == 0) {
                    //duplicate bracket
                    return true;
                }
            }
            else {
                st.push(ch);
            }
            
        }
        
        return false;
    }

}
