public class PalindromeChecker {
    String text;

    PalindromeChecker(String text){
        this.text = text;
    }

    public boolean isPlaindrome(){

        int length = text.length();
        String newString = "";

        for(int i = length-1; i >= 0; i--){
            newString += text.charAt(i);
        }

        for(int i = 0; i < length; i++) {
            if (text.length() != newString.length()) {
                return false;
            }
            if (text.charAt(i) != newString.charAt(i)) {
                return false;
            }
        }
     return true;
    }
    public static void main(String[] args) {
        PalindromeChecker p = new PalindromeChecker("pop");
        //p.isPlaindrome();

        if(p.isPlaindrome()){
            System.out.println("Yes string is palindrome ");
        }
        else{
            System.out.println("No string is not palindrome ");
        }
    }
}
