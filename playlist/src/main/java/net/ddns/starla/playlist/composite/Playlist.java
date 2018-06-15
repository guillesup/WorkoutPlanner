package net.ddns.starla.playlist.composite;

import java.time.LocalTime;
import java.util.List;

/**
 * This class represent a exerciseList of exercises that you perform in order. If an exercise has multiple sets,
 * make sure  to perform them all before moving to the next exercise.
 * This is the best option for most traditional strength workouts.
 * <p>
 * As an example:
 * <p>
 * Exercise 1 (2 sets)      Exercise 2 (3 sets)
 * Set 1        Set 2       Set 1       Set 2       Set 3
 * Pushups ->   Pushups ->  Squats  ->  Squats  ->  Squats
 */
public class Playlist extends Component {

    private List<Component> exerciseList;
    private int rounds;

    /**
     * List: complete all sets for each exercise before progressing to the next exercise
     *
     * @param name         Name of the section. i.e. "Warmup", "Workout" or "Cooldown"
     * @param exerciseList List of exercises
     */
    public Playlist(String name, List<Component> exerciseList) {
        super();
        setName(name);
        this.exerciseList = exerciseList;
        this.rounds = 1;
    }

    /**
     * Circuit: complete each exercise in order, repeat for the prescribed number of rounds
     *
     * @param name         Name of the section. i.e. "Warmup", "Workout" or "Cooldown"
     * @param exerciseList List of exercises
     * @param rounds       Number of rounds
     */
    public Playlist(String name, List<Component> exerciseList, int rounds) {
        super();
        setName(name);
        this.exerciseList = exerciseList;
        this.rounds = rounds;
    }

    /**
     * Circuit: Complete each exercise in order, repeat for many rounds as possible in the
     * prescribed amount of time
     *
     * @param name         Name of the section. i.e. "Warmup", "Workout" or "Cooldown"
     * @param exerciseList List of exercises
     * @param duration     amount of time. i.e. 3 min 0 sec
     */
    public Playlist(String name, List<Component> exerciseList, LocalTime duration) {
        super();
        setName(name);
        this.exerciseList = exerciseList;
        setDuration(duration);
    }

    /**
     * Choose your own path: Select a duration and we will keep track of your time while you
     * warm up or cool down.
     *
     * @param name     Name of the section. i.e. "Warmup", "Workout" or "Cooldown"
     * @param duration amount of time. i.e. 3 min 0 sec
     */
    public Playlist(String name, LocalTime duration) {
        super();
        setName(name);
        setDuration(duration);
    }

    /**
     * @return The exercise list
     */
    public List<Component> getExerciseList() {
        return exerciseList;
    }

    /**
     * @param exercise An Exercise object
     */
    public void addExerciseToList(Component exercise) {
        exerciseList.add(exercise);
    }

    /**
     * @param exercise An Exercise object
     */
    public void removeExerciseFromList(Component exercise) {
        exerciseList.remove(exercise);
    }

    /**
     * @param index int value from 0 to size() - 1
     * @return An Exercise object
     */
    public Component getExerciseFromList(int index) {
        return exerciseList.get(index);
    }

    /**
     * This is how it plays the exercises in the right order and time
     */
    public void play() {
        for (Component exercise : exerciseList) {
            exercise.play();
        }
    }

    /**
     * @return The number of rounds
     */
    public int getRounds() {
        return rounds;
    }

    /**
     * @param rounds The number of rounds
     */
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

}
