/*
 * File: App.java
 * Created Date: 2021-09-24 22:13:27
 * Authors:Szűcs Norbert, Rohrbacher Marcell János
 * Original Author: Sallai Andras
 * Github: https://github.com/Szucs-Norbert
 *         https://github.com/Marci971104
 *         
 * -----
 * Last Modified: 2021-10-208
 * Modified By: Szűcs Norbert, Rohrbacher Marcell János
 * -----
 * Copyright (c) 2021 Szűcs Norbert, Rohrbacher Marcell János
 * Group: Szoft II/N
 * 
 * GNU GPL v2
 */

import controllers.MainController;
import views.MainWindow;

public class App {
    public static void main(String[] args) throws Exception {
        MainWindow mainWindow = new MainWindow();
        new MainController(mainWindow);
        mainWindow.setVisible(true);
    }
}
