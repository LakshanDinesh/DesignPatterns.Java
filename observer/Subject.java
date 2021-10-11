package com.company.observer;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Subject {

    List<Observer> observers = new ArrayList<>();

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    //Using WatchService API, detecting the file changes
    public void sendNotification() throws IOException, InterruptedException {
        WatchService watchService = FileSystems.getDefault().newWatchService();
        Path path = Paths.get("C:\\Users\\User\\Desktop\\News");
        path.register(watchService, StandardWatchEventKinds.ENTRY_MODIFY);
        while(true){
            WatchKey key = watchService.take();
            for (WatchEvent<?> event : key.pollEvents()) {
                notifyObservers("WAIT FOR NEWS JUST IN...");
                Thread.sleep(3000);
                //if modified the file, then call the readNews() method
                readNews();
            }
            key.reset();
        }

    }

    //If modified read the lines
    public void readNews() throws IOException{
        File file = new File("C:\\Users\\User\\Desktop\\News\\News.txt");
        Scanner scanner = new Scanner(file);

        String next = scanner.nextLine();
        notifyObservers(next);
    }


    public void notifyObservers(String news) {
        for (Observer observer : observers) {
            observer.notifyObserver(news);
        }
    }

}
