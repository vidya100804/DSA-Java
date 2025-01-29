package SEARCHINGS;

public class linearinstring {
    public static void main(String[] args) {
        String name = "Vidya Prasuna";
        char target = 'x';
        boolean result = search(name, target);
        System.out.println("Result: " + result);
    }

    // Method to search for a character in a string
    static boolean search(String name, char target) {
        if (name.length() == 0) {
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            if (target == name.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
