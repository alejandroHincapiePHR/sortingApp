import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SortingAppTest {

    protected SortingAppMain sortingAppMain = new SortingAppMain();

    private String input;
    private String expected;

    public SortingAppTest(String input, String expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"12 34 33", "12 33 34"},
                {"aaa", "Error"},
                {"12 34 33 2 2 2 2 2 2 2 2 2 2 2 2 2", "Error"},
                {"", "Error"},
                {" ", ""},
                {"12 -34 33 0 22 1 122222", "-34 0 1 12 22 33 122222"},



        });
    }

    @Test
    public void test(){
        Assert.assertEquals(expected,sortingAppMain.sortingFunction(input));
    }

}
