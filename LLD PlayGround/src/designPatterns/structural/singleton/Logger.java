package designPatterns.structural.singleton;

public class Logger {
    //static method to hold a single instance of Logger class
    private static Logger instance;

    private Logger() {
        // Private constructor to prevent instantiation
    }

    public static Logger getInstance(){
        if(instance == null){
            instance = new Logger();
        }
        return instance;
    }

    public void log(String type, String message){
        System.out.println(type + " : " +  message);
    }
}
