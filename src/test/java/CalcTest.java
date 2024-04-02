import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netlogy.javaqa.javaqamvn.services.WorkCalcService;

public class CalcTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/rest.csv")
    public void Calctest(int expected, int income, int expenses, int treshold) {
        WorkCalcService service = new WorkCalcService();

        int actual = service.calculate(income, expenses, treshold);

        Assertions.assertEquals(expected, actual);
    }
}
