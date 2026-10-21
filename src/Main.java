
public class Main {

    public static boolean isValidEmail(String email) {
        if (email == null) return false;

//      String emailRegex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{6}$";
        String emailRegex = "^[A-Za-z0-9._%+-]+@native\\.semicolon\\.africa$";

        return email.matches(emailRegex);
    }

    public static boolean isValidPassword(String password){
        if (password == null) return false;

        String passwordRegex = "^\\S[A-Za-z\\S\\d#@_+]{8,16}\\S$";

                return password.matches(passwordRegex);
    }

    public static void main(String[] args) {

        String validateEmail = "p.nwankwo@native.semicolon.africa";
        String validatePassword = "#150122Jay";


        System.out.println("Is valid email? " + isValidEmail(validateEmail));
        System.out.println("Is valid password" + isValidPassword(validatePassword));


    }

}
















