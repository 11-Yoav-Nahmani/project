public enum MenuOptions {
    ADD_OPTION(1),
    DEL_OPTION(2),
    CLEAR_OPTION(3),
    VIEW_OPTION(4),
    LIMITS_OPTION(5),
    AREA_OPTION(6),
    EXIT_OPTION(7);
    private final int value;

    private MenuOptions(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}