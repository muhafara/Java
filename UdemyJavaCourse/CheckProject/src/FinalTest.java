public class FinalTest {
    public final int TEST_VAR;

    public FinalTest(int TEST_VAR) {
        this.TEST_VAR = TEST_VAR;
        TEST_VAR ++;
    }

    public int getTEST_VAR() {
        return TEST_VAR;
    }

}
