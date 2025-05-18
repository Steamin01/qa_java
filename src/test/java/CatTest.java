import com.example.Cat;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class CatTest {

    Feline felineMock;
    Cat cat;

    @Before
    public void setUp() throws Exception {
        felineMock = mock(Feline.class);
        when(felineMock.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        cat = new Cat(felineMock);
    }

    @Test
    public void getSoundReturnsMeowTest() {
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getFoodReturnsExpectedListTest() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, cat.getFood());
    }

    @Test
    public void getFoodInvokesEatMeatMethodTest() throws Exception {
        cat.getFood();
        verify(felineMock, times(1)).eatMeat();
    }
}











