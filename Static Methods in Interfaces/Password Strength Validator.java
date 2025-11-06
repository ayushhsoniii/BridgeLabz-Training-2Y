public interface SecurityUtils {
    static boolean isStrongPassword(String pwd){
        if(pwd == null || pwd.length() < 8) return false;
        boolean upper=false, lower=false, digit=false, special=false;
        for(char c: pwd.toCharArray()){
            if(Character.isUpperCase(c)) upper=true;
            else if(Character.isLowerCase(c)) lower=true;
            else if(Character.isDigit(c)) digit=true;
            else special=true;
        }
        return upper && lower && digit && special;
    }
}

// Demo
public class PasswordDemo {
    public static void main(String[] args){
        System.out.println(SecurityUtils.isStrongPassword("Weak123")); // false
        System.out.println(SecurityUtils.isStrongPassword("Str0ng@Pass")); // true
    }
}
