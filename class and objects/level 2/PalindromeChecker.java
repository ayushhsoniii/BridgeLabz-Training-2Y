class PalindromeChecker {
    String text;

    PalindromeChecker(String t) {
        text = t;
    }

    boolean isPalindrome() {
        String cleaned = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    void display() {
        System.out.println("Text: " + text);
        if (isPalindrome()) {
            System.out.println("Result: It is a palindrome.");
        } else {
            System.out.println("Result: It is not a palindrome.");
        }
    }

}

