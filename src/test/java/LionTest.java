import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.List;

public class LionTest {

    @Test(expected = Exception.class)
    public void throwsExceptionIfInvalidSexProvidedTest() throws Exception {
        new Lion("Инопланетянин", new Feline());
    }

    @Test
    public void getKittensReturnsFelineValueTest() throws Exception {
        Feline feline = mock(Feline.class);
        when(feline.getKittens()).thenReturn(2);
        Lion lion = new Lion("Самец", feline);
        assertEquals(2, lion.getKittens());
    }

    @Test
    public void getFoodReturnsFelineFoodTest() throws Exception {
        Feline feline = mock(Feline.class);
        List<String> food = List.of("Животные", "Птицы");
        when(feline.getFood("Хищник")).thenReturn(food);
        Lion lion = new Lion("Самка", feline);
        assertEquals(food, lion.getFood());
    }

}


