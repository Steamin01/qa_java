import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class AnimalTest {

    private final String kind;
    private final List<String> expected;

    public AnimalTest(String kind, List<String> expected) {
        this.kind = kind;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")}
        });
    }

    @Test
    public void testGetFoodForValidTypes() throws Exception {
        Animal animal = new Animal();
        assertEquals(expected, animal.getFood(kind));
    }

    @Test
    public void testGetFamily() {
        Animal animal = new Animal();
        assertTrue(animal.getFamily().contains("семейств"));
    }

    @Test(expected = Exception.class)
    public void testGetFoodThrowsForUnknownKind() throws Exception {
        Animal animal = new Animal();
        animal.getFood("Амфибия");
    }
}
