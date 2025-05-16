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
    public void setUp() {
        felineMock = mock(Feline.class);
        cat = new Cat(felineMock);
    }

    @Test
    public void getSoundReturnsMeow() {
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getFoodReturnsFelineFood() throws Exception {
        List<String> mockFood = List.of("Мясо");
        when(felineMock.eatMeat()).thenReturn(mockFood);
        assertEquals(mockFood, cat.getFood());
        verify(felineMock, times(1)).eatMeat();
    }
}









