package net.ddns.starla.playlist;

public enum DifficultyLevel {
    BEGINNER("Beginner"),
    INTERMEDIATE("Intermediate"),
    ADVANCED("Advanced");

    private String name;

    DifficultyLevel(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
