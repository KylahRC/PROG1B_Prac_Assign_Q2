package animalPack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AnimalSoundsTest
{

    @Test
    void testDogSound()
    {
        Dog dog = new Dog();
        String dogExpected = "The dog goes woof!";
        assertEquals(dogExpected, dog.makeSound());
    }

    @Test
    void testCatSound()
    {
        Cat cat = new Cat();
        String catExpected = "The cat goes meow!";
        assertEquals(catExpected, cat.makeSound());
    }

    @Test
    void testBirdSound()
    {
        Bird bird = new Bird();
        String birdExpected = "The bird goes tweet!";
        assertEquals(birdExpected, bird.makeSound());
    }

    @Test
    void testRatSound()
    {
        Rat rat = new Rat();
        String ratExpected = "The rat goes squeak!";
        assertEquals(ratExpected, rat.makeSound());
    }

    @Test
    void testFishSound()
    {
        Fish fish = new Fish();
        String fishExpected = "The fish goes splash!";
        assertEquals(fishExpected, fish.makeSound());
    }
}
