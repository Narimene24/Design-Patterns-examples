public class App {
    public static void main(String[] args) throws Exception {

        ExpensiveObject object = new ExpensiveObjectProxy();
        
        object.process();

        System.out.println("**********************************");


        object.process();
    }
}
