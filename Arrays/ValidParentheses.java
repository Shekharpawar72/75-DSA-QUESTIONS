package Arrays;
 
/// Valid Parentheses 20 leetcode problem
///  Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
/// An input string is valid if:    
/// Open brackets must be closed by the same type of brackets.

  // approach using stack data structure

  // time complexity O(n) and space complexity O(n)
  
  // meko algo yaad hai stack use karna hai
  // jab bhi open bracket mile to usko stack me push kar do
    // jab bhi closing bracket mile to stack se top element check karo
      // agar top element usi type ka opening bracket hai to pop kar do
      // agar nahi hai to false return kar do
    

  

import java.util.Stack;

public class ValidParentheses {
            
    public boolean isValid(String s) {


        Stack<Character> stack = new Stack<>();
      
        for ( int i =0; i< s.length(); i++){
            char ch = s.charAt(i);
           if( ch =='(' || ch =='[' || ch =='{'){
              stack.push(ch);
           }else{
             if(stack.isEmpty()){
                  return false;
             }
             if((stack.peek() == '(' && ch == ')') || 
                    (stack.peek() == '[' && ch == ']') || 
                    (stack.peek() == '{' && ch == '}')){
                        stack.pop();

             }else{
                 return false;
             }
           }
 
        }
        return stack.isEmpty();

    }


        public static void main(String[] args) {
            ValidParentheses sol = new ValidParentheses();

            String s1 = "()";
            System.out.println("Input: " + s1 + " -> " + sol.isValid(s1));

            String s2 = "()[]{}";
            System.out.println("Input: " + s2 + " -> " + sol.isValid(s2));

            String s3 = "(]";
            System.out.println("Input: " + s3 + " -> " + sol.isValid(s3));

            String s4 = "([)]";
            System.out.println("Input: " + s4 + " -> " + sol.isValid(s4));

            String s5 = "{[]}";
            System.out.println("Input: " + s5 + " -> " + sol.isValid(s5));
    }
}
