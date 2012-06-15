/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesort;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author j.cheesman
 */
public class Main {
    
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            throw new IllegalArgumentException("Missing filename");
        }
        File f = new File(args[0]);
        if (!f.exists()) {
            throw new IllegalArgumentException("File " + args[0] + " doesn't exist");
        }
        if (f.isDirectory()) {
            throw new IllegalArgumentException("File " + args[0] + " is a directory");
        }
        
        Scanner scanner = new Scanner(f);
        List<Integer> data = new ArrayList<>();
        while (scanner.hasNextLine()) {
            if (scanner.hasNextInt()) {
                int tmp = scanner.nextInt();
                if (tmp == 91901) {
                        System.out.println("EOF!");        
                }
                data.add(tmp);
            }
            else {
                System.out.println("rfeading something else!");        

                scanner.nextLine();
            }
            
        }
        System.out.println("Read " + data.size() + " integers.");
        int[] dataToCheck = new int[data.size()];
        for (int i=0; i<dataToCheck.length; i++) {
            dataToCheck[i] = data.get(i).intValue();
        }
        System.out.println("Calling ic @" + System.currentTimeMillis());
        InversionCounter ic = new InversionCounter();
        long result = ic.countInversions(dataToCheck);
        System.out.println("Done @" + System.currentTimeMillis());
        System.out.println("Final count: " + result);
    }
    
}
