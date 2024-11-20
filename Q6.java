public class Q6 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Veuillez fournir le nombre d'étages du triangle.");
            return; 
        } 

        try { 
            int numRows = Integer.parseInt(args[0]); 
            for (int i = numRows; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("x");
                }
                System.out.println();
            }
        } catch (NumberFormatException e) {
            System.out.println("Le paramètre doit être un entier.");
        }
    }
}
