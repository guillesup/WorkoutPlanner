package net.ddns.starla.playlist;

public enum Focus {
    ABS("Abs"),
    BALANCE("Balance"),
    BREATHING("Breathing"),
    BUILD_MUSCLE("Build Muscle"),
    CARDIO("Cardio"),
    FLEXIBILITY("Flexibility"),
    MOBILITY("Mobility"),
    MUSCLE_ENDURANCE("Muscle Endurance"),
    POWER("Power"),
    PREHAB("Prehab"),
    REHAB("Rehab"),
    STRENGTH("Strength"),
    WARMUP("Warmup");

    private String name;

    Focus(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
