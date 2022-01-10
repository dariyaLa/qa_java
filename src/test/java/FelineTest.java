import com.example.Animal;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class FelineTest {

    private Feline feline;

    @Before
    public void init (){
        feline = new Feline();
        MockitoAnnotations.openMocks(this);

    }

    @Test
    public void getFamilyTest() {
        String expectedFamily = "Кошачьи";
        String actualFamily = feline.getFamily();
        assertEquals(expectedFamily, actualFamily);
    }

    @Mock
    Animal animal;

    @Test
    public void eatMeatTest () throws Exception {
        List<String> expectedFoodFeline = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(animal.getFood("Хищник")).thenReturn(expectedFoodFeline);
        List<String> actualFoodFeline = feline.eatMeat();
        assertEquals(expectedFoodFeline, actualFoodFeline);
    }

    @Test
    public void getKittensTest () {
        int expectedKittensCount=1;
        int actualKittensCount = feline.getKittens(expectedKittensCount);
        assertEquals(expectedKittensCount, actualKittensCount);


    }
}