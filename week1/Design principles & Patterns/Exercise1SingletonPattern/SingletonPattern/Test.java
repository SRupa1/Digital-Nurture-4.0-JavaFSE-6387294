public class Test {
    public static void main(String[] args) {
        Logger log1 = Logger.getInstance("Alice");
        Logger log2 = Logger.getInstance("Bob");

        if(log1==log2){
            log1.getUserName();
            log2.getUserName();
        }
    }
}
