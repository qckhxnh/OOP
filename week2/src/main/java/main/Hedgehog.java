package main;

class Hedgehog {
    String name;
    int age;

    Hedgehog() {
        this.name = "Pikseli";
        this.age = 5;
    }
    Hedgehog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void speak(String words) {
        if (words.isEmpty()) {
            System.out.println("I am " + this.name + " and my age is " + this.age + ", but could you still give me input values?");
        } else {
            System.out.println(this.name + ": " + words);
        }
    }

    void run(int laps) {
        for (int i = 0; i < laps; i++) {
            System.out.println(this.name + " runs really fast!");
        }
    }
}