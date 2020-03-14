import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MyClassTest {
    @InjectMocks
    private MyClass myClass;

    @Test
    public void sayHello_success() {
        String expectedResult = "Hello!";
        String actualResult = myClass.sayHello();

        Assert.assertEquals(expectedResult, actualResult);
    }
}
