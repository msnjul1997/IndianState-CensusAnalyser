package com.censustest;

import com.census.CensusException;
import com.census.ReadFromCSV;
import org.junit.Assert;
import org.junit.Test;

public class CensusAnalyserTest {
    private static final String csvFilePath = "./src/test/resources/IndiaStateCensusData.csv";
    @Test
    public void checkTheNumberOfDataFromCSVFile(){
        try {
            int expected = ReadFromCSV.loadCSVFile(csvFilePath);
            Assert.assertEquals(expected,29);

        }
        catch (CensusException c){
        }
    }
}
