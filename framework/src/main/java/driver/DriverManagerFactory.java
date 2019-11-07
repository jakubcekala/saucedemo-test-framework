package driver;

public class DriverManagerFactory {

    public static DriverManager getDriverManger(DriverType type) {
        DriverManager driverManager;

        switch (type) {
            case FIREFOX:
                driverManager = new FirefoxDriverManager();
                break;
            case EDGE:
                driverManager = new EdgeDriverManager();
                break;
            case INTERNET_EXPLORER:
                driverManager = new InternetExplorerDriverManager();
                break;
            default:
                driverManager = new ChromeDriverManager();
                break;
        }

        return driverManager;
    }
}
