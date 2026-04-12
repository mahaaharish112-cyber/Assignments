package WEEK7_8.level3;

public class assign1 {

    // Method to generate 6-digit OTP
    public static int generateOTP() {
        return (int)(Math.random() * 900000) + 100000;
    }

    // Method to check if all OTPs are unique
    public static boolean areOTPsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false; // Duplicate found
                }
            }
        }
        return true; // All are unique
    }

    public static void main(String[] args) {

        int[] otpArray = new int[10];

        // Generate 10 OTPs
        System.out.println("Generated OTPs:");
        for (int i = 0; i < 10; i++) {
            otpArray[i] = generateOTP();
            System.out.println("OTP " + (i + 1) + ": " + otpArray[i]);
        }

        // Check uniqueness
        boolean result = areOTPsUnique(otpArray);

        // Display result
        if (result) {
            System.out.println("All generated OTPs are UNIQUE.");
        } else {
            System.out.println("Duplicate OTP found. OTPs are NOT unique.");
        }
    }
}