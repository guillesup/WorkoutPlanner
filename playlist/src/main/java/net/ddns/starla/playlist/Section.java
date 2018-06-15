package net.ddns.starla.playlist;

public enum Section {
    WARMUP("Warmup"),
    WORKOUT("Workout"),
    COOLDOWN("Cooldown");

    private String name;

    Section(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
