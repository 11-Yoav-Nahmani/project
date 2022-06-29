import java.util.Scanner;

enum MenuItems {
    PRINT_STATUS(1),
    ADD_OBJECT(2),
    LAND_OBJECT(3),
    LAND_ALL(4),
    EXIT(999);

    private int value;

    private MenuItems(int Value) {
        this.value = Value;
    }

    public int value() {
        return value;
    }

    public static MenuItems fromInt(int choise) {
        MenuItems ToReturn = null;

        for (MenuItems current : MenuItems.values()) {
            if (current.value() == choise) {
                ToReturn = current;
            }
        }

        return (ToReturn);
    }
}

enum FlyingType {
    PLANE(1),
    BIRD(2);

    private int value;

    private FlyingType(int value) {
        this.value = value;
    }

    public int value() {
        return (this.value);
    }

    public static FlyingType fromInt(int choise) {
        FlyingType ToReturn = null;

        for (FlyingType current : FlyingType.values()) {

            if (current.value() == choise) {
                ToReturn = current;
            }
        }

        return (ToReturn);
    }
}

public class MainAirPort {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        Airport airprt = new Airport();

        System.out.println("Welcome to the airport! \n");

        MenuItems selected = MainAirPort.showMenu();


        while (selected != MenuItems.EXIT) {
            switch (selected)
            {

                case ADD_OBJECT:
                    System.out.println("\nAdd object\n---------------");
                    System.out.println("Please insert name of the new object:");

                    String name = in.nextLine();

                    System.out.println("Please insert the object type");

                    for (FlyingType currItem : FlyingType.values())	{
                        System.out.println(currItem.value() + "." + currItem);
                    }

                    FlyingType flyType = FlyingType.fromInt(Integer.parseInt(in.nextLine()));

                    IFly flyNew = null;

                    switch (flyType)
                    {
                        case BIRD:
                            flyNew = new Bird(name);

                            break;
                        case PLANE:
                            flyNew = new Plane(name);

                            break;
                        default:
                            System.out.println("Invalid type");

                            break;
                    }

                    airprt.addFlyingObject(flyNew);

                    break;
                case PRINT_STATUS:
                    airprt.printStatus();

                    break;
                case LAND_OBJECT:
                    System.out.println("Please insert the name of the object to land:\t");
                    String objectName = in.nextLine();

                    System.out.println("Do you want superman to help the landing? Y\\N");

                    try {
                        if (in.nextLine().equals("Y")) {
                            airprt.helpFromSuperman(objectName);
                        } else {
                            airprt.landObject(objectName);
                        }
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                    }

                    break;
                case LAND_ALL:
                    while (airprt.landingCount() > 0) {
                        try	{
                            for (IFly flyCurr : airprt.airPortList()) {
                                airprt.helpFromSuperman(flyCurr.name());
                            }
                        } catch (Exception ex) {
                            System.out.println(ex.getMessage());
                        }
                    }

                    break;
                default:
                    System.out.println("Invalid choice");

                    break;
            }

            selected = MainAirPort.showMenu();
        }
    }

    static MenuItems showMenu()	{

        System.out.println("What would you like to do?");
        System.out.println("-----------------------------");

        for (int index = 0; index < MenuItems.values().length; index++) {
            System.out.println(MenuItems.values()[index].value() + " - " +
                    MenuItems.values()[index]);
        }

        return (MenuItems.fromInt(Integer.parseInt(in.nextLine())));
    }
}
