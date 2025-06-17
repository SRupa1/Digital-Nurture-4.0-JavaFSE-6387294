public class Logger {

    private static Logger instance;
    private final String userName;
    private Logger(String userName) {
        this.userName = userName;
    }

    public static Logger getInstance(String userName){
        if(instance == null){
            instance = new Logger(userName);
        }
        return instance;
    }

    public void getUserName() {
        System.out.println("User Name: " + userName);
    }

}
