/*
 * File: MainController.java
 * Created Date: 2021-09-24 22:21:42
 * Authors:Szűcs Norbert, Rohrbacher Marcel János
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

package controllers;

import java.util.ArrayList;
import models.LoadVehicle;
import models.Vehicle;
import views.MainWindow;

public class MainController {
    MainWindow mainWindow;
    LoadVehicle loadVehicle;

    public MainController(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
        this.loadVehicle = new LoadVehicle();

        initLoad();
        initText();
        initDelete();
        initSave();   
    }
    
    private void initText(){
        //TODO A névtelen metódus tartalmát ki kell szervezni
        //TODO A függvény tartalmát is több részre bontani

        this.mainWindow.addButton.addActionListener(event -> {
            System.out.println("Hozzáadás...");
            String ordinal = this.mainWindow.ordinalField.getText();
            String brand = this.mainWindow.brandField.getText();
            String year = this.mainWindow.yearField.getText();
            this.mainWindow.ordinalField.setText("");
            this.mainWindow.brandField.setText("");
            this.mainWindow.yearField.setText("");
            this.mainWindow.vehicleModel.addRow(new Object[] {ordinal, brand, year});
        });
    }

    private void initLoad(){
        ArrayList<Vehicle> vehicleList = this.loadVehicle.load();
        for(Vehicle vehicle : vehicleList) {
            this.mainWindow.vehicleModel.addRow(
                new Object[] {vehicle.ordinal, vehicle.brand, vehicle.year}
            );
        }
    }

    private void initDelete(){
        //TODO: Törlés megvalósítása
        this.mainWindow.delButton.addActionListener(event -> {
            System.out.println("Törlés...");
        });
    }

    private void initSave(){
        //TODO: Mentés megvalósítása
        this.mainWindow.saveButton.addActionListener(event -> {
            System.out.println("Mentés...");
        });
    }
}
