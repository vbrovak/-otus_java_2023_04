import ru.otus.homework.annotations.After;
import ru.otus.homework.annotations.Before;
import ru.otus.homework.annotations.Test;

import static org.assertj.core.api.Fail.fail;

public class AnnotationTest {

    @Test
    void test1() {
        System.out.println("Test_1");
    }

    @Test
    void test2() {
        System.out.println("Test_2");
    }

    @Test
    void test3() {
        fail("Test failed");
    }

    @After
    void after() {
        System.out.println("After");
    }

    @Before
    void before() {
        System.out.println("Before");
    }
}
