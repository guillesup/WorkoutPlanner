package net.ddns.starla.playlist.composite;

import net.ddns.starla.playlist.BodyParts;
import net.ddns.starla.playlist.DifficultyLevel;
import net.ddns.starla.playlist.Equipment;
import net.ddns.starla.playlist.Focus;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertNotSame;
import static junit.framework.TestCase.assertSame;

public class ExerciseTest {

    private Component exercise;

    @Before
    public void setUp() throws Exception {
        List<Focus> focus = new ArrayList<>();
        focus.addAll(Arrays.asList(Focus.CARDIO, Focus.MOBILITY));
        List<BodyParts> bodyParts = new ArrayList<>();
        bodyParts.addAll(Arrays.asList(BodyParts.ARMS, BodyParts.CALVES));
        List<Equipment> equipment = new ArrayList<>();
        equipment.addAll(Arrays.asList(Equipment.JUMP_ROPE));

        exercise = new Exercise("Jump Rope",
                focus,
                bodyParts,
                DifficultyLevel.INTERMEDIATE,
                equipment);
    }

    @Test
    public void CopyOf_ReturnsANewExerciseObject() {
        Component exerciseCopy = ((Exercise) exercise).copyOf();
        assertNotSame(exerciseCopy, exercise);
    }

    @Test
    public void withCopyOf_FieldFocus_IsTheSameObject() {
        Component exerciseCopy = ((Exercise) exercise).copyOf();
        assertSame(exerciseCopy.getFocus(), exercise.getFocus());
    }

    @Test
    public void withCopyOf_FieldBodyParts_IsTheSameObject() {
        Component exerciseCopy = ((Exercise) exercise).copyOf();
        assertSame(exerciseCopy.getBodyParts(), exercise.getBodyParts());
    }

    @Test
    public void withCopyOf_FieldEquipment_IsTheSameObject() {
        Component exerciseCopy = ((Exercise) exercise).copyOf();
        assertSame(exerciseCopy.getEquipment(), exercise.getEquipment());
    }

    @Test
    public void withCopyOf_FieldDifficultyLevel_IsTheSameObject() {
        Component exerciseCopy = ((Exercise) exercise).copyOf();
        assertSame(exerciseCopy.getDifficultyLevel(), exercise.getDifficultyLevel());
    }
}