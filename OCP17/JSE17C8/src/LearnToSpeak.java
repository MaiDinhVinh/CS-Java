public interface LearnToSpeak {
    void speak(String sound);
}

class DuckHelper {
    public static void teacher(String name, LearnToSpeak trainer) {
        // Exercise patience (omitted)
        trainer.speak(name);
    }
}

class Duckling {
    public static void makeSound(String sound) {
        LearnToSpeak learner = s -> System.out.println(s); //?
        DuckHelper.teacher(sound, learner);

        //snippet 10
        LearnToSpeak learner2 = System.out::println;
        DuckHelper.teacher(sound, learner2);
    }
}