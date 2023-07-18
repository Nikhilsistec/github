public class DNA {

    public static void main(String[] args) {


        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";

        testDNA(dna1);
        testDNA(dna2);
        testDNA(dna3);
    }

    public static void testDNA(String dna) {
        
        int length = dna.length();
        System.out.println("Length: " + length);

       
        int start = dna.indexOf("ATG");
        System.out.println("Start: " + start);

       
        int stop = dna.indexOf("TGA");
        System.out.println("Stop: " + stop);

        if (start != -1) {
            
            int nextStop = dna.indexOf("TGA", start + 3);

            
            if (nextStop != -1 && (nextStop - start) % 3 == 0) {
                String protein = dna.substring(start, nextStop + 3);
                System.out.println("Protein: " + protein);
            } else {
                System.out.println("No protein.");
            }
        } else {
            System.out.println("No protein.");
        }
    }
}
