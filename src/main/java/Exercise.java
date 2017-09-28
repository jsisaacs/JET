//Joshua Isaacson

public class Exercise {
    //variables
    String exerciseName;
    //weightUsed is in pounds
    int weightUsed = 0;
    int sets;
    int repetitions;
    String day;
    String notes;

    //constructor for an Exercise object
    public Exercise() {
        weightUsed = 0;
    }

    //setExercise() changes value of exerciseName
    public void setExercise(String exerciseName) {
        this.exerciseName = exerciseName;
    }

    //getExercise() returns the exerciseName for the Exercise
    public String getExercise() {
        return exerciseName;
    }

    //getWeight() returns current weightUsed for the Exercise
    public int getWeight() {
        return weightUsed;
    }

    //setWeight() changes value of weightUsed
    public void setWeight(int newWeight) {
        this.weightUsed = newWeight;
    }

    //changeSets() takes an Exercise object and sets
    //the number of sets
    public void changeSets(int sets) {
        this.sets = sets;
    }

    //chanceReps() takes an Exercise object and sets
    //the number of reps
    public void changeReps(int reps) {
        this.repetitions = reps;
    }

    //getSets() returns current number of sets
    public int getSets() {
        return sets;
    }

    //getReps() returns current number of reps
    public int getReps() {
        return repetitions;
    }

    //setDate() in string form, e.g., "Sept 12, 2017"
    public void setDate(String day) {
        this.day = day;
    }

    //getDate() returns day
    public String getDate() {
        return day;
    }

    //setNotes() lets you add a String of brief text about how the specific Exercise went
    public void setNotes(String notes) {
        this.notes = notes;
    }

    //getNotes() returns notes
    public String getNotes() {
        return notes;
    }

}
