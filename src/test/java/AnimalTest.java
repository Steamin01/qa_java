import com.example.Animal;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalTest {

    private Animal animal;

    @Before
    public void setUp() {
        animal = new Animal();
    }

    @Test(expected = Exception.class)
    public void getFoodThrowsExceptionForUnknownAnimalTest() throws Exception {
        animal.getFood("Неизвестное");
    }

    @Test
    public void getFamilyReturnsCorrectTextTest() {
        assertEquals(
                "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи",
                animal.getFamily()
        );
    }
}



