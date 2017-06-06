/*
 * Code used in the "Software Engineering" course.
 *
 * Copyright 2017 by Claudio Cusano (claudio.cusano@unipv.it)
 * Dept of Electrical, Computer and Biomedical Engineering,
 * University of Pavia.
 */
package coindispenser;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test of the CoinDispenser class.
 *  * 
 * @author Claudio Cusano <claudio.cusano@unipv.it>
 */
public class CoinDispenserTest {
    
    @Test
    public void testCoinDispenser() {
        CoinDispenser cd = new CoinDispenser(10);
        assertEquals(10, cd.countCoins(200));
    }
    
    @Test
    public void testAddCoins() {
        CoinDispenser cd = new CoinDispenser(2);
        cd.addCoins(10, 2);
        assertEquals(4, cd.countCoins(10));
    }
    
    @Test
    public void testCountCoins() {
        CoinDispenser cd = new CoinDispenser(5);
        assertEquals(5, cd.countCoins(50));
    }
    
    @Test
    public void testDispenseCoin() throws DispenserError {
        CoinDispenser cd = new CoinDispenser(10);
        ArrayList<Integer> coin = new ArrayList<>();
        coin.add(1);
        coin.add(2);
        coin.add(5);
        cd.dispenseCoins(coin);
        assertEquals(9, cd.countCoins(1));
        assertEquals(9, cd.countCoins(2));
        assertEquals(9, cd.countCoins(5));
    }
    
    @Test
    public void testComposeChange() {
        CoinDispenser cd = new CoinDispenser(10);
        cd.composeChange(107, 5, 0);
        assertEquals(8, cd.countCoins(50));
//        assertEquals(9, cd.countCoins(5));
        assertEquals(9, cd.countCoins(2));
//        assertEquals(5, cd.countCoins(1));
        // Non so cosa usa oltre due 50cent ed uno 2cent
    }
   
}
   
