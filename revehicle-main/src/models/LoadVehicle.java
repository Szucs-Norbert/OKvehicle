/*
 * File: LoadVehicle.java
 * Created Date: 2021-09-25 00:46:41
 * * Authors:Szűcs Norbert, Rohrbacher Marcel János
 * Original Author: Sallai Andras
 * Github: https://github.com/Szucs-Norbert
 *         https://github.com/Marci971104
 *         
 * -----
 * Last Modified: 2021-10-208
 * Modified By: Szűcs Norbert, Rohrbacher Marcel János
 * -----
 * Copyright (c) 2021 Szűcs Norbert, Rohrbacher Marcel János
 * Group: Szoft II/N
 * 
 * GNU GPL v2
 */

package models;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class LoadVehicle {
    public static ArrayList<Vehicle> load(){   
        ArrayList<Vehicle> vehicleList =new ArrayList<>();
        try {
            vehicleList= tryReadFile();
        } catch (FileNotFoundException e) {
            System.err.println("Hiba! A fájl nem található");
        }
        return vehicleList;
    }

    private static ArrayList<Vehicle> tryReadFile() throws FileNotFoundException{
        ArrayList<Vehicle> vehicleList = new ArrayList<>();
        FileReader fileReader = new FileReader("data.txt");
        Scanner scanner = new Scanner(fileReader);
        
        while(scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] lineArray = line.split(":");
            Vehicle vehicle = new Vehicle();
            vehicle.ordinal = lineArray[0];
            vehicle.brand = lineArray[1];
            vehicle.year = lineArray[2];
            vehicleList.add(vehicle);
        }
        scanner.close();
        return vehicleList;
    }
}
