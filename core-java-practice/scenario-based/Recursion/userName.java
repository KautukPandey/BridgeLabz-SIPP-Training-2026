
public class userName {
    public static boolean isValidUsername(String username, int index) {

        if (index == username.length()) {
            return true;
        }

        char ch = username.charAt(index);

        if (ch < 'a' || ch > 'z') {
            return false;
        }

        return isValidUsername(username, index + 1);
    }
    public static void main(String[] args) {
        String user1 = "kautuk";
        String user2 = "kautuk123";
        String user3 = "helloWorld";

        System.out.println(isValidUsername(user1, 0));
        System.out.println(isValidUsername(user2, 0));
        System.out.println(isValidUsername(user3, 0));
    }
}
