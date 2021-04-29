/*Given a binary string S . Perform R iterations on string S, where in each iteration 0 becomes 01 and 1 becomes 10. Find the Nth character of the string after performing R iterations.
Example

Input:
S = 101
R = 2 
N = 3
Output:
1
Explanation : 
Expand S 2 times and get 1 at third position
*/

// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    int n=sc.nextInt();
                    int r=sc.nextInt();
                    Solution obj = new Solution();
                    System.out.println(obj.solve(s,n,r));
                }
                
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public char solve(String s, int n, int r)
    {
        s="101";  r=2;  n=3;
        char[] chars = new char[s.length()];
        s.getChars(0, s.length(), chars, 0);
        
        for(int i=0; i<r; i++){
            
            List<Character> list = new ArrayList<>();
            
            for(int j=0; j<chars.length; j++){
            
                if(Character.valueOf(chars[j]).equals('0')){
                    list.add('0'); list.add('1');
                }
                else if(Character.valueOf(chars[j]).equals('1')){
                    list.add('1'); list.add('0');
                }    
                else{
                    list.add(chars[j]);
                }
            }
            StringBuilder evalString = new StringBuilder();
            for(Character c: list){
                evalString.append(c);
            }
            chars = new char[evalString.length()];
            evalString.getChars(0, evalString.length(), chars, 0);
        }
        
        
        
        System.out.println("char at "+n+"th position "+chars[n]);
        return 'e';
    }
}
