import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        IOOperations ioStream = new IOOperations();
        int userChoice = MainClass.menu();
        MenuOptions menuOptions = MenuOptions.values()[userChoice - 1];

        City managedCity = new City();

        while (userChoice != MenuOptions.EXIT_OPTION.getValue()) {

            switch (menuOptions) {
                case ADD_OPTION:
               managedCity.addSite();
                    break;
                case DEL_OPTION:
                    managedCity.removeSite();
                    break;
                case CLEAR_OPTION:
                    managedCity.deleteAllSites();
                    break;
                case VIEW_OPTION:
                    managedCity.viewSitesDetails();
                    break;
                case LIMITS_OPTION:
                    managedCity.cityBorders();
                    break;
                case AREA_OPTION:
                    managedCity.area();

                    break;
                default:
                    break;
            }

            userChoice = MainClass.menu();
            menuOptions = MenuOptions.values()[userChoice - 1];
        }
    }

    private static int menu() {
        int userChoice = MenuOptions.EXIT_OPTION.getValue();
        boolean isChoiceValid = false;
        IOOperations ioStream = new IOOperations();

        while (!isChoiceValid) {

            ioStream.print("");
            ioStream.print("     ***** CityPlan Menu *****");
            ioStream.print("");
            ioStream.print(" Pick an option:");
            ioStream.print("  "
                    + MenuOptions.ADD_OPTION.getValue()
                    + ". Add a new site to the city");
            ioStream.print("  "
                    + MenuOptions.DEL_OPTION.getValue()
                    + ". Remove a site from the city");
            ioStream.print("  "
                    + MenuOptions.CLEAR_OPTION.getValue()
                    + ". Remove all the sites from the city");
            ioStream.print("  "
                    + MenuOptions.VIEW_OPTION.getValue()
                    + ". View the list of the city sites");
            ioStream.print("  "
                    + MenuOptions.LIMITS_OPTION.getValue()
                    + ". View the limits of the city");
            ioStream.print("  "
                    + MenuOptions.AREA_OPTION.getValue()
                    + ". View the area of the city");
            ioStream.print("  "
                    + MenuOptions.EXIT_OPTION.getValue()
                    + ". To Exit");

            ioStream.print("");
            ioStream.print("Your choice: ");

            userChoice = ioStream.getNumber();

            // In case the user choice is invalid, inform him
            if ((userChoice < MenuOptions.ADD_OPTION.getValue()) ||
                    (userChoice > MenuOptions.EXIT_OPTION.getValue())) {
                ioStream.print("You entered an invalid option.");
                ioStream.print("Please enter the number of your choice...");
                ioStream.print("");
            } else {
                isChoiceValid = true;
            }
        }

        return userChoice;
    }
}
