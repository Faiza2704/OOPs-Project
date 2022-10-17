
    import java.util.Scanner;

    public class Palindrome {
        public static void main(String[] args) {
            System.out.println("Enter Strings");
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            System.out.println(palindrome(str,0,str.length()-1));
        }

        private  static boolean palindrome(String str, int start , int end){
            if(start == end){
                return true;
            }

            if(str.charAt(start)==str.charAt(end)){
                return palindrome(str,start+1,end-1);
            }
                        return false;


        }
    }

