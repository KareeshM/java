class Main {
    public static void main(String[] args) {
        String str = "Hello123@World!456";  
        int alphabetCount = 0;
        int digitCount = 0;
        int specialCharCount = 0;

        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            
            if (Character.isLetter(ch)) {
                alphabetCount++;
            }
                        else if (Character.isDigit(ch)) {
                digitCount++;
            }
            
            else {
                specialCharCount++;
            }
        }

        System.out.println("Number of alphabets: " + alphabetCount);
        System.out.println("Number of digits: " + digitCount);
        System.out.println("Number of special characters: " + specialCharCount);
    }
}
