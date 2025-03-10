package dev.jesus.rna_transcription;

import org.junit.jupiter.api.Test;
 import static org.junit.jupiter.api.Assertions.*;

public class TranscriptionTest {
    @Test
     public void testTranscribeDNAtoRNA() {
         String dna = "ATCG";
         String expectedRNA = "UAGC";
         String actualRNA = Transcription.transcribeDNAtoRNA(dna);
         assertEquals(expectedRNA, actualRNA, "The DNA to RNA transcription failed.");
     }
}
