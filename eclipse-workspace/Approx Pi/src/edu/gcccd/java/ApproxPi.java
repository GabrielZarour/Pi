package edu.gcccd.java;
import java.util.Random;

public class ApproxPi {
    private static double approx(final long drops){
        final Random random = new Random();
        long inside = 0;
        for(long k = 0; k < drops; k++){
            double x = random.nextDouble();
            double y = random.nextDouble();
            if((x <= 0.78539) && (y <= 3.14159)) {
                inside++;
            }
        }
        return (double) 4 * inside / drops;
    }
    public static void main(String[] args) {
        System.out.println(approx( 100000000));
    }
}