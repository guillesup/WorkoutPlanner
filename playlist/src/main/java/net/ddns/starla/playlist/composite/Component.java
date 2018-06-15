package net.ddns.starla.playlist.composite;

import net.ddns.starla.playlist.BodyParts;
import net.ddns.starla.playlist.DifficultyLevel;
import net.ddns.starla.playlist.Equipment;
import net.ddns.starla.playlist.Focus;

import java.time.LocalTime;
import java.util.List;

public abstract class Component {

    private String name;
    private List<Focus> focus;
    private LocalTime duration;
    private List<BodyParts> bodyParts;
    private DifficultyLevel difficultyLevel;
    private List<Equipment> equipment;

    protected abstract void play();

    public LocalTime getDuration() {
        return duration;
    }

    public void setDuration(LocalTime duration) {
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DifficultyLevel getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(DifficultyLevel difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public List<Focus> getFocus() {
        return focus;
    }

    public void setFocus(List<Focus> focus) {
        this.focus = focus;
    }

    public List<BodyParts> getBodyParts() {
        return bodyParts;
    }

    public void setBodyParts(List<BodyParts> bodyParts) {
        this.bodyParts = bodyParts;
    }

    public List<Equipment> getEquipment() {
        return equipment;
    }

    public void setEquipment(List<Equipment> equipment) {
        this.equipment = equipment;
    }
}
