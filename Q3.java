public class Q3 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Veuillez fournir le nombre d'étoiles en paramètre.");
            return;  
        }
        
        try {
            int numberOfStars = Integer.parseInt(args[0]);
            for (int i = 0; i < numberOfStars; i++) {
                System.out.print("*"); 
            }
            System.out.println();
        } catch (NumberFormatException e) {
            System.out.println("Le paramètre doit être un entier.");
        }
    }
}
