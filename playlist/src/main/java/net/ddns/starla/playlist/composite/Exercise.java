package net.ddns.starla.playlist.composite;

import net.ddns.starla.playlist.BodyParts;
import net.ddns.starla.playlist.DifficultyLevel;
import net.ddns.starla.playlist.Equipment;
import net.ddns.starla.playlist.Focus;

import java.time.LocalTime;
import java.util.List;

public class Exercise extends Component {
    private int reps;
    private int sets;
    private LocalTime restBetweenSets;

    public Exercise(String name, List<Focus> focus, List<BodyParts> bodyParts, DifficultyLevel difficultyLevel,
                    List<Equipment> equipment) {
        super();
        this.setName(name);
        this.setFocus(focus);
        this.setBodyParts(bodyParts);
        this.setDifficultyLevel(difficultyLevel);
        this.setEquipment(equipment);
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public LocalTime getRestBetweenSets() {
        return restBetweenSets;
    }

    public void setRestBetweenSets(LocalTime restBetweenSets) {
        this.restBetweenSets = restBetweenSets;
    }

    @Override
    protected void play() {

    }

    public Exercise copyOf() {
        return new Exercise(this.getName(), this.getFocus(), this.getBodyParts(), this.getDifficultyLevel(),
                this.getEquipment());
    }
}
