enum menu {
    PRINT_STATUS(1),
    ADD_OBJECT(2),
    LAND_OBJECT(3),
    LAND_ALL(4),
    EXIT(999);

    private int value;

    private menu(int Value) {
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