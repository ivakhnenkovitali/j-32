public class Tester {
    @TestDocumented(doTestDocument = "Hello doc with annotation")
    public void doDocumented() {}

    @TestNotDocumented(doTestNotDocument = "Hello doc without annotation")
    public void doNotDocumented() {}
}
