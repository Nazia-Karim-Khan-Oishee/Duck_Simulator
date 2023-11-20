package org.example;


public class DuckSimulator {

    void simulate(AbstractDuckFactory duckFactory) {

        System.out.println("Duck Simulator: With Composite - Flocks");

        System.out.println("\nDuck Simulator: Whole Flock Simulation");
        System.out.println("Duck Simulator: With Observer\n");
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());


        Flock flockOfDucks = new Flock();

        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);


        Quackologist quackologist1 = new Quackologist();
        flockOfDucks.registerObserver(quackologist1);
        simulate(flockOfDucks);

        System.out.println("\nDuck Simulator: Mallard Flock Simulation");
        System.out.println("Duck Simulator: With Observer\n");

        Quackable mallardOne = duckFactory.createMallardDuck();
        Quackable mallardTwo = duckFactory.createMallardDuck();
        Quackable mallardThree = duckFactory.createMallardDuck();
        Quackable mallardFour = duckFactory.createMallardDuck();

        Flock flockOfMallards = new Flock();
        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);
        flockOfMallards.add(mallardFour);
        flockOfDucks.add(flockOfMallards);


        Quackologist quackologist2 = new Quackologist();
        flockOfMallards.registerObserver(quackologist2);
        simulate(flockOfMallards);



        System.out.println("\nThe ducks quacked "+
                QuackCounter.getQuacks() + " times");
    }
    void simulate(Quackable duck) {
        duck.quack();
    }

}