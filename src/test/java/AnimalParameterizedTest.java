import com.example.Animal;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AnimalParameterizedTest {

    private Animal animal;

    private final String animalKind;
    private final List<String> expectedFood;

    public AnimalParameterizedTest(String animalKind, List<String> expectedFood) {
        this.animalKind = animalKind;
        this.expectedFood = expectedFood;
    }

    @Before
    public void setUp() {
        animal = new Animal();
    }

    @Parameterized.Parameters(name = "Тестовые данные: {0}")
    public static Object[][] getFoodData() {
        return new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")}
        };
    }

    @Test
    public void getFoodReturnsCorrectListTest() throws Exception {
        assertEquals(expectedFood, animal.getFood(animalKind));
    }
}

