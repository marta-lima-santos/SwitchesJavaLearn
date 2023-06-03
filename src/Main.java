public class Main {
    public static void main(String[] args) {
        String day = "Friday";
        switch (day){
            case "Sunday":
                System.out.println("Today is Sunday");
                break;
            case "Monday":
                System.out.println("Today is Monday");
                break;
            case "Tuesday":
                System.out.println("Today is Tuesday");
            case "Wednesday":
                System.out.println("Today is Wednesday");
                break;
            case "Thursday":
                System.out.println("Today is Thursday");
                break;
            case "Friday":
                System.out.println("Today is Friday");
                break;
            default:
                System.out.println("Please, enter the correct day");
        }
        }
    }
