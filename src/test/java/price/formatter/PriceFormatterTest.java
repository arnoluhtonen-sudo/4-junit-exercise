package price.formatter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

/**
 * Write your tests for the PriceFormatter here. See the specification of the
 * PriceFormatter and formatPrice method in the PriceFormatter class and the
 * readme file.
 */
public class PriceFormatterTest {

    PriceFormatter formatter = new PriceFormatter();

    @Test
    void thousandsSeparatorIsASpace() {
        String formatted = formatter.formatPrice(123456.78);

        assertEquals("123 456,78 €", formatted);
    }

    @Test
    void decimalSeparatorIsAComma() {
        String formatted = formatter.formatPrice(1.23);
        assertEquals("1,23 €", formatted);
    }

    @Test
    void decimalPartIsRoundedUp() {
        String formatted = formatter.formatPrice(4.567);
        assertEquals("4,57 €", formatted);

    }
    @Test 
    void decimalPartIsRoundedDown(){
        String formatted = formatter.formatPrice(3.14159);
        assertEquals("3,14 €", formatted);
    }
    @Test 
    void decimalPartHasTwoDigits(){
        String formatted = formatter.formatPrice(6.7);
        assertEquals("6,70 €", formatted);
    }
    
    @Test
    void ifDecimalPartIsZeroAfterRoundingThenIsLeftOut() {
        String formatted = formatter.formatPrice(123);

        assertEquals("123 €", formatted);
    }

    @Test
    void thePriceEndsWithEuroSign() {
        String formatted = formatter.formatPrice(123456.78);
        assertTrue(formatted.endsWith("€"));
    }

}
