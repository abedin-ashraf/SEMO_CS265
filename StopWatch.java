/*
 (Stopwatch) Design a class named StopWatch. The class contains:

Private data fields startTime and endTime with getter methods.
A no-arg constructor that initializes startTime with the current time.
A method named start() that resets the startTime to the current time.
A method named stop() that sets the endTime to the current time.
 A method named getElapsedTime() that returns the elapsed time for the stopwatch in milliseconds.


Write a test program that measures the execution time of sorting 100,000 numbers using selection sort.
 */


import java.time.Duration;
import java.time.LocalTime;
import java.util.Random;
public class StopWatch {
    private LocalTime startTime;
    private LocalTime endTime;

    StopWatch(){
        startTime = LocalTime.now();
    }

    public void start(){
        startTime = LocalTime.now();
    }
    public void stop(){
        endTime = LocalTime.now();
    }
    
    public LocalTime getStartTime(){
        return startTime;
    }
    public LocalTime getEndTime(){
        return endTime;
    }
    public long getElapsedTime(){
        return Duration.between(startTime, endTime).toMillis();
    }

    public static void selection_sort(int array[], int size){
        for(int i=0; i<size-1; i++){
            int min = i;
            for(int j=i+1; j<size; j++){
                if(array[j]<array[min]){
                    min = j;
                }
            }
            int t = array[min];
            array[min] = array[i];
            array[i] = t;
        }
    }


    public static void main(String[] args) {
        int size = 100000;

        int[] arr = new int[size];

        Random r = new Random();

        for(int i=0; i<size; i++){
            arr[i]=r.nextInt();
        }

        StopWatch exTime = new StopWatch();
        exTime.start();
        
        selection_sort(arr,size);

        exTime.stop();

        long executionTime = exTime.getElapsedTime();
        System.out.println("Execution Time for the sort is : "+executionTime+" milliseconds");
        
    }
}

