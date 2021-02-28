package FunctionalProgramming.LearningGroups;

import java.util.ArrayList;
import java.util.List;

public class TrainerDatabase {
    public static List<Trainer> treneriuSarasas = new ArrayList<>();
    public static Trainer trainer1 = new Trainer ("Trainer1");
    public static Trainer trainer2 = new Trainer ("Trainer2");
    public static Trainer trainer3 = new Trainer ("Trainer3");

    static {

        treneriuSarasas.add(trainer1);
        treneriuSarasas.add(trainer2);
        treneriuSarasas.add(trainer3);

    }

    public static List<Trainer> getTreneriuSarasas() {
        return treneriuSarasas;
    }

    public static Trainer getTrainer1() {
        return trainer1;
    }

    public static Trainer getTrainer2() {
        return trainer2;
    }

    public static Trainer getTrainer3() {
        return trainer3;
    }


}