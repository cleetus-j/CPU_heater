import java.util.Random;
/*
* This is a small program, that will run the CPU 100%. This is for a small heater device to dry out leaves. It runs on an old Pentium 4\Celeron D system with minimal setup.
* As the CPU heats up, the warm air goes up, and gets rid of the water in the leaves. You could use something else, but why not do something silly like this. It does two types
* or useless things to make sure the usage is always high:
* -Generates 128Mb of random numbers in RAM.
* -Sleeps for an amount if time and does some code-golfy things.
* */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] dummyWork=new int[32192];//Make a 128Mb array to store junk. Since this is a sizeable piece of memory, the CPU can work on it all it wants.
        System.out.println("Celeron D goes \" brrrrrrrrr!\"");
        for (;;) {
            spin(10);
            dummyWork=makeupNumbers(dummyWork);

        }


    }
    public static int[] makeupNumbers(int[]input){ //Generate and return an array of random numbers. Return size is the same as the input.
        int[]result=new int[input.length];
        Random rand=new Random();
        for (int i = 0; i < result.length; i++) {
            result[i]=rand.nextInt();
        }

        return result;
    }
    private static void spin(int milliseconds) {
        long sleepTime = milliseconds*1000000L; // convert to nanoseconds
        long startTime = System.nanoTime();
        while ((System.nanoTime() - startTime) < sleepTime) {}
    }

}