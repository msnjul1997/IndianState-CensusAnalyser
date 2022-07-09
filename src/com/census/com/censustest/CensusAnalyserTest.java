package com.census.com.censustest;

import org.junit.Test;

public class CensusAnalyserTest {
    @Test
    public void checkTheNumberOfDataFromCSVFile_CorrectTestCase(){
        try {
            int expected = ReadFromCSV.loadCSVFile(csvFilePath);
            Assertions.assertEquals(expected,29);
        }
        catch (CensusException c){
        }
    }
}
