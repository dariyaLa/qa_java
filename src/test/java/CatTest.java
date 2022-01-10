import com.example.Cat;
import com.example.Feline;
import com.example.Predator;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CatTest {

    @Before
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void getSoundTest (){
        Cat cat = new Cat(new Feline());
        String expectedSound = "Мяу";
        String actualSound = cat.getSound();
        assertEquals(expectedSound, actualSound);
    }

    @Mock
    Predator predator;

    @Test
    public void getFoodTest () throws Exception {
        Cat cat = new Cat(new Feline());
        List<String> expectedFoodCat = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(predator.eatMeat()).thenReturn(expectedFoodCat);
        List<String> actualFoodCat = cat.getFood();
        assertEquals(expectedFoodCat, actualFoodCat);

    }




}
