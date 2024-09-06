package animalPack;

import java.util.Scanner;

//hey it may be simple but it sure does work

//the superclass purely so I can override it
//what a sad existence
class AnimalSounds
{
    public void makeSound()
    {

    }
}

//makes the sound be for a dog specifically
 class Dog extends AnimalSounds
{
    @Override
    public void makeSound()
    {
        super.makeSound();
        System.out.println("The dog goes woof!");
    }
}


//makes the sound be for a cat specifically
class Cat extends AnimalSounds
{
    @Override
    public void makeSound()
    {
        super.makeSound();
        System.out.println("The cat goes meow!");
    }
}


//makes the sound be for a bird specifically
class Bird extends AnimalSounds
{
    @Override
    public void makeSound()
    {
        super.makeSound();
        System.out.println("The bird goes tweet!");
    }
}


//makes the sound be for a rat specifically
class Rat extends AnimalSounds
{
    @Override
    public void makeSound()
    {
        super.makeSound();
        System.out.println("The rat goes squeak!");
    }
}


//makes the sound be for a fish specifically
//it took a while to decide what a fish should say
//so I decided it shouldn't
class Fish extends AnimalSounds
{
    @Override
    public void makeSound()
    {
        super.makeSound();
        System.out.println("The fish goes splash!");
    }
}

//part that runs the program
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

//        menu
        System.out.println("---------------------------------------");
        System.out.println("Choose an animal to hear the sound it makes:");
        System.out.println("(1) Dog");
        System.out.println("(2) Cat");
        System.out.println("(3) Bird");
        System.out.println("(4) Rat");
        System.out.println("(5) Fish");
        System.out.println("---------------------------------------");

        int mainMenuSelection = scanner.nextInt();
        scanner.nextLine();

//        switch to select animal noise
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