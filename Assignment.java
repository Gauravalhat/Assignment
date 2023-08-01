import java.util.Scanner;

public class WeatherInformationApp {
    
    private static String getWeather(String date) {
        return "Weather for " + date + ": Sunny";
    }
    
    private static String getWindSpeed(String date) {
        return "Wind Speed for " + date + ": 10 mph";
    }
    
    private static String getPressure(String date) {
        return "Pressure for " + date + ": 1015 hPa";
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Weather Information App!");
        
        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Get weather");
            System.out.println("2. Get Wind Speed");
            System.out.println("3. Get Pressure");
            System.out.println("0. Exit");
            
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter the date: ");
                    String weatherDate = scanner.next();
                    System.out.println(getWeather(weatherDate));
                    break;
                case 2:
                    System.out.print("Enter the date: ");
                    String windSpeedDate = scanner.next();
                    System.out.println(getWindSpeed(windSpeedDate));
                    break;
                case 3:
                    System.out.print("Enter the date: ");
                    String pressureDate = scanner.next();
                    System.out.println(getPressure(pressureDate));
                    break;
                case 0:
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }
}
