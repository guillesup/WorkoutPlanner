package net.ddns.starla.playlist;

public enum BodyParts {
    ABS("Abs"),
    ARMS("Arms"),
    BACK("Back"),
    BICEPS("Biceps"),
    CALVES("Calves"),
    CORE("Core"),
    CHEST("Chest"),
    FOREARMS("Forearms"),
    GLUTES("Glutes"),
    HAMSTRINGS("Hamstrings"),
    HIPS("Hips"),
    LATS("Lats"),
    LEGS("Legs"),
    LOWER_BODY("Lower Body"),
    QUADS("Quads"),
    SHOULDERS("Shoulders"),
    SPINAL_ERECTORS("Spinal Erectors"),
    THIGHS("Thighs"),
    TOTAL_BODY("Total Body"),
    TRAPS("Traps"),
    TRICEPS("Triceps");

    private String name;

    BodyParts(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
