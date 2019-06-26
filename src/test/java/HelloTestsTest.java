import org.assertj.swing.edt.FailOnThreadViolationRepaintManager;
import org.assertj.swing.edt.GuiActionRunner;
import org.assertj.swing.fixture.FrameFixture;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class HelloTestsTest {


    @Test
    public void check1() {
        HelloTests helloTests = new HelloTests();
        char[][] table = new char[][]{  {' ',' ',' ',' ',' '},
                                        {' ',' ',' ',' ',' '},
                                        {' ',' ',' ',' ',' '},
                                        {' ',' ',' ',' ',' '},
                                        {' ',' ',' ',' ',' '}};
        boolean actual = helloTests.check(table);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void check2() {
        HelloTests helloTests = new HelloTests();
        char[][] table = new char[][]{  {' ',' ',' ','O',' '},
                                        {' ','O','O',' ',' '},
                                        {' ',' ','O','O','O'},
                                        {' ',' ',' ',' ',' '},
                                        {'O',' ',' ',' ',' '},};
        boolean actual = helloTests.check(table);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void check3() {
        HelloTests helloTests = new HelloTests();
        char[][] table = new char[][]{  {'X',' ',' ',' ',' '},
                                        {'X','X','O',' ',' '},
                                        {'O','X','O','O',' '},
                                        {'O',' ',' ','X',' '},
                                        {'O','X','X','X','X'},};
        boolean actual = helloTests.check(table);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void check4() {
        HelloTests helloTests = new HelloTests();
        char[][] table = new char[][]{  {'X',' ','O',' ','O'},
                                        {'X','O','X',' ',' '},
                                        {'O','X','O','O',' '},
                                        {'X',' ',' ','X',' '},
                                        {'O','X','X','O','X'},};
        boolean actual = helloTests.check(table);
        boolean expected = false;
        assertEquals(expected, actual);
    }
/*
    @BeforeClass
    public static void setUpOnce() {
        FailOnThreadViolationRepaintManager.install();
    }

    @Test
    public void test1() {
        FrameFixture window;
        Form frame;
        frame = GuiActionRunner.execute(() -> new Form());
        window = new FrameFixture(frame);
        window.show(); // shows the frame to test
        window.button("Checking").click();
        Assert.assertEquals("No one - wins.", window.textBox("res").text());
        window.cleanUp();
    }

    @Test
    public void test2() {
        FrameFixture window;
        Form frame;
        frame = GuiActionRunner.execute(() -> new Form());
        window = new FrameFixture(frame);
        window.show(); // shows the frame to test

        window.textBox("t25").setText("o");
        window.textBox("t7").setText("o");
        window.textBox("t13").setText("o");
        window.textBox("t19").setText("o");
        window.button("Checking").click();
        Assert.assertEquals("o - wins.", window.textBox("res").text());
        window.cleanUp();
    }

*/

}