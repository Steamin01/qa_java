import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.List;

public class LionTest {

    @Test(expected = Exception.class)
    public void throwsExceptionIfInvalidSexProvided() throws Exception {
        new Lion("Инопланетянин", new Feline());
    }

    @Test
    public void getKittensReturnsFelineValue() throws Exception {
        Feline feline = mock(Feline.class);
        when(feline.getKittens()).thenReturn(2);
        Lion lion = new Lion("Самец", feline);
        assertEquals(2, lion.getKittens());
    }

    @Test
    public void getFoodReturnsFelineFood() throws Exception {
        Feline feline = mock(Feline.class);
        List<String> food = List.of("Животные", "Птицы");
        when(feline.getFood("Хищник")).thenReturn(food);
        Lion lion = new Lion("Самка", feline);
        assertEquals(food, lion.getFood());
    }

    @Test
    public void lionHasManeIfMale() throws Exception {
        Lion lion = new Lion("Самец", new Feline());
        assertTrue(lion.doesHaveMane());
    }

    @Test
    public void lionNoManeIfFemale() throws Exception {
        Lion lion = new Lion("Самка", new Feline());
        assertFalse(lion.doesHaveMane());
    }
}


