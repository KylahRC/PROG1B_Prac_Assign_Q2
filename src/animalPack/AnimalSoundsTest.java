package animalPack;

import org.junit.jupiter.api.Test;

class AnimalSoundsTest
{
//    test to see what the dog doin'
    @Test
    void testDogSound()
    {
        System.out.println("Test the dog sound");
        System.out.println("***************************************\n");
        Dog dog = new Dog();
        System.out.println("Expected:");
        System.out.println("The dog goes woof!");
        System.out.println("");
        System.out.println("Output:");
        dog.makeSound();
        System.out.println("\n***************************************");
    }

//    test to see if the cat noise is meow
    @Test
    void testCatSound()
    {
        System.out.println("Test the cat sound");
        System.out.println("***************************************\n");
        Cat cat = new Cat();
        System.out.println("Expected:");
        System.out.println("The cat goes meow!");
        System.out.println("");
        System.out.println("Output:");
        cat.makeSound();
        System.out.println("\n***************************************");

    }

//    test to see if the bird will tweet
//    hopefully it won't be canceled for it
    @Test
    void testBirdSound()
    {
        System.out.println("Test the bird sound");
        System.out.println("***************************************\n");
        Bird bird = new Bird();
        System.out.println("Expected:");
        System.out.println("The bird goes tweet!");
        System.out.println("");
        System.out.println("Output:");
        bird.makeSound();
        System.out.println("\n***************************************");
    }

//    test to see if the rat will squeak
    @Test
    void testRatSound()
    {
        System.out.println("Test the rat sound");
        System.out.println("***************************************\n");
        Rat rat = new Rat();
        System.out.println("Expected:");
        System.out.println("The rat goes squeak!");
        System.out.println("");
        System.out.println("Output:");
        rat.makeSound();
        System.out.println("\n***************************************");
    }

//    test to see if the fish will splash
//    it's not a very effective move either way
    @Test
    void testFishSound()
    {
        System.out.println("Test the fish sound");
        System.out.println("***************************************\n");
        Fish fish = new Fish();
        System.out.println("Expected:");
        System.out.println("The fish goes splash!");
        System.out.println("");
        System.out.println("Output:");
        fish.makeSound();
        System.out.println("\n***************************************");
    }
}
