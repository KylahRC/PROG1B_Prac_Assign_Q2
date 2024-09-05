package animalPack;

import java.util.Scanner;

class AnimalSounds
{
    public void makeSound()
    {

    }
}

 class Dog extends AnimalSounds
{
    @Override
    public void makeSound()
    {
        super.makeSound();
        System.out.println("The dog goes woof!");
    }
}

class Cat extends AnimalSounds
{
    @Override
    public void makeSound()
    {
        super.makeSound();
        System.out.println("The cat goes meow!");
    }
}

class Bird extends AnimalSounds
{
    @Override
    public void makeSound()
    {
        super.makeSound();
        System.out.println("The bird goes tweet!");
    }
}

class Rat extends AnimalSounds
{
    @Override
    public void makeSound()
    {
        super.makeSound();
        System.out.println("The rat goes squeak!");
    }
}

class Fish extends AnimalSounds
{
    @Override
    public void makeSound()
    {
        super.makeSound();
        System.out.println("The fish goes splash!");
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an animal to hear the sound it makes:");
        System.out.println("(1) Dog");
        System.out.println("(2) Cat");
        System.out.println("(3) Bird");
        System.out.println("(4) Rat");
        System.out.println("(5) Fish");

        int mainMenuSelection = scanner.nextInt();
        scanner.nextLine();

        switch (mainMenuSelection)
        {
            case 1:
                Dog dogNoise = new Dog();
                dogNoise.makeSound();
                break;
            case 2:
                Cat catNoise = new Cat();
                catNoise.makeSound();
                break;
            case 3:
                Bird birdNoise = new Bird();
                birdNoise.makeSound();
                break;
            case 4:
                Rat ratNoise = new Rat();
                ratNoise.makeSound();
                break;
            case 5:
                Fish fishNoise = new Fish();
                fishNoise.makeSound();
                break;
            default:
                System.out.println("Invalid selection. The program will now close.");
                System.exit(0);
        }
    }
}