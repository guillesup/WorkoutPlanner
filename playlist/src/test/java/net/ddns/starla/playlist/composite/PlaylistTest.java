package net.ddns.starla.playlist.composite;

import net.ddns.starla.playlist.*;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalTime;
import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class PlaylistTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void canCreateWarmUpList() {
        Playlist warmUp = new Playlist(Section.WARMUP.toString(), new ArrayList<Component>());
    }

    @Test
    public void canCreateWarmUpCircuitByRounds() {
        Playlist warmUp = new Playlist(Section.WARMUP.toString(), new ArrayList<Component>(), 2);
    }

    @Test
    public void canCreateWarmUpCircuitByDuration() {
        Playlist warmUp = new Playlist(Section.WARMUP.toString(), new ArrayList<Component>(),
                LocalTime.of(0,1,0));
    }

    @Test
    public void canCreateWarmUpOwnPath() {
        Playlist warmUp = new Playlist(Section.WARMUP.toString(), LocalTime.of(0, 1, 0));
    }

    @Test
    public void canAddExerciseToWarmUpList() {
        Exercise jumpRope = new Exercise("Jump Rope", new ArrayList<Focus>(), new ArrayList<BodyParts>(),
                DifficultyLevel.INTERMEDIATE, new ArrayList<Equipment>());

        Playlist warmUp = new Playlist(Section.WARMUP.toString(), new ArrayList<Component>());
        warmUp.addExerciseToList(jumpRope);

        assertEquals(jumpRope, warmUp.getExerciseList().get(0));
    }
}