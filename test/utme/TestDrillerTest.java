package utme;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestDrillerTest {

    @Test
    public void checkQuantityOfCopies(){

        TestDriller testDriller = new TestDriller();
       int totalBought = testDriller.quantityBought(3);
        Assertions.assertEquals(totalBought,3);

    }
    @Test
    public void checkPriceOfQuantityOfCopies(){

        TestDriller testDriller = new TestDriller();

        int priceOfCopies = testDriller.copiesBoughtAndPrice(2);

        Assertions.assertEquals(priceOfCopies,9000);
    }


}
