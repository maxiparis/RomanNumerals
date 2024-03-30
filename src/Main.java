public class Main {

    public static void main(String[] args){
        ProgramStarter programStarter = new ProgramStarter();
        printWelcomeMessage();
        programStarter.startProgram();
    }

    private static void printWelcomeMessage() {
        System.out.println(
                """
                ====================
                Welcome to the Roman/Decimal Converter!
                """);
    }


}
