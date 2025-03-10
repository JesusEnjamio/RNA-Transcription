package dev.jesus.rna_transcription;

public class Transcription {
 
    public static String transcribeDNAtoRNA(String dna) {
        StringBuilder rna = new StringBuilder();
        for (char nucleotide : dna.toUpperCase().toCharArray()) {
            switch (nucleotide) {
                case 'G':
                    rna.append('C');
                    break;
                case 'C':
                    rna.append('G');
                    break;
                case 'T':
                    rna.append('A');
                    break;
                case 'A':
                    rna.append('U');
                    break;
                default:
                    throw new IllegalArgumentException("Nucleótido de ADN inválido: " + nucleotide);
            }
        }
        return rna.toString();
    }
}