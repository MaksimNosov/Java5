import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {


    @ParameterizedTest
//    @CsvSource({
//            "3, 200, 300",
//            "0, 0, 99"
//
//    })
    @CsvFileSource(files = "src/test/resources/SQR.csv")
    public void FromTask(int expected, int intervalStart, int intervalEnd) {

        SQRService service = new SQRService();

        //int expected = 3;
        int actual = service.calculate(intervalStart, intervalEnd);

        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    public void LimitValues1() {
//
//        SQRService service = new SQRService();
//
//        int expected = 0;
//        int actual = service.calculate(0, 99);
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void LimitValues2() {
//
//        SQRService service = new SQRService();
//
//        int expected = 1;
//        int actual = service.calculate(0, 100);
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void LimitValues3() {
//
//        SQRService service = new SQRService();
//
//        int expected = 1;
//        int actual = service.calculate(9_801, 9_802);
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void LimitValues4() {
//
//        SQRService service = new SQRService();
//
//        int expected = 0;
//        int actual = service.calculate(9_802, 9_802);
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void FirstHalfInterval() {
//
//        SQRService service = new SQRService();
//
//        int expected = 35;
//        int actual = service.calculate(100, 2_000);
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void SecondHalfInterval() {
//
//        SQRService service = new SQRService();
//
//        int expected = 55;
//        int actual = service.calculate(2_000, 9_801);
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void IntervalOneNumberInclude() {
//
//        SQRService service = new SQRService();
//
//        int expected = 1;
//        int actual = service.calculate(625, 625);
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void IntervalOneNumberUnInclude() {
//
//        SQRService service = new SQRService();
//
//        int expected = 0;
//        int actual = service.calculate(626, 626);
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void Preinterval() {
//
//        SQRService service = new SQRService();
//
//        int expected = 0;
//        int actual = service.calculate(-1_000, 0);
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void Postinterval() {
//
//        SQRService service = new SQRService();
//
//        int expected = 0;
//        int actual = service.calculate(9_802, 100_000_000);
//
//        Assertions.assertEquals(expected, actual);
//    }


}

