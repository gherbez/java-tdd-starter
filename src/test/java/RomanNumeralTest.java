import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanNumeralTest {
    @Test
    public void firstTest() {
        assertThat(RomanNumeral.convert(0)).isEqualTo("");
    }

    @Test
    public void shouldReturnIWhenArabicNumberIs1(){
        assertThat(RomanNumeral.convert(1)).isEqualTo("I");
    }

    @Test
    public void shouldReturnVWhenArabicNumberIs5(){
        assertThat(RomanNumeral.convert(5)).isEqualTo("V");
    }

    @Test
    public void shouldReturnVWhenArabicNumberIs10(){
        assertThat(RomanNumeral.convert(10)).isEqualTo("X");
    }

    @Test
    public void shouldReturnVWhenArabicNumberIs50(){
        assertThat(RomanNumeral.convert(50)).isEqualTo("L");
    }

    @Test
    public void shouldReturnVWhenArabicNumberIs100(){
        assertThat(RomanNumeral.convert(100)).isEqualTo("C");
    }

    @Test
    public void shouldReturnIIWhenArabicNumberIs2(){
        assertThat(RomanNumeral.convert(2)).isEqualTo("II");
    }

    @Test
    public void shouldReturnIIIWhenArabicNumberIs3(){
        assertThat(RomanNumeral.convert(3)).isEqualTo("III");
    }

    @Test
    public void shouldReturnXXWhenArabicNumberIs20(){
        assertThat(RomanNumeral.convert(20)).isEqualTo("XX");
    }

    @Test
    public void shouldReturnIVWhenArabicNumberIs4(){
        assertThat(RomanNumeral.convert(4)).isEqualTo("IV");
    }

    @Test
    public void shouldReturnIXWhenArabicNumberIs9(){
        assertThat(RomanNumeral.convert(9)).isEqualTo("IX");
    }

    @Test
    public void shouldReturnXLWhenArabicNumberIs40(){
        assertThat(RomanNumeral.convert(40)).isEqualTo("XL");
    }

    @Test
    public void shouldReturnXCWhenArabicNumberIs90(){
        assertThat(RomanNumeral.convert(90)).isEqualTo("XC");
    }
}