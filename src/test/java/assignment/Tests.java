package assignment;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

//import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvSource;

//import java.io.*;


public class Tests {


   @Test
   public void code(){
       App.main(null);
       assertEquals(55+23, App.addTwoNumbers(55, 23), "THE TWO NUMBERS DID NOT ADD CORRECTLY");
   }

   @Test
    public void late() {
        App.main(null);
        assertTrue(DueDate.onTime(2020, 12, 17), "Submitted Late");
    }

}
