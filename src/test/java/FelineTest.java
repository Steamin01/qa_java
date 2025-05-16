import com.example.Feline;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class FelineTest {

    Feline feline = new Feline();

    @Test
    public void eatMeatReturnsMeatList() throws Exception {
        List<String> food = feline.eatMeat();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), food);
    }

    @Test
    public void getFamilyReturnsCatsFamily() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensDefaultReturnsOne() {
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittensReturnsCustomCount() {
        assertEquals(3, feline.getKittens(3));
    }
}





