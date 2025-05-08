package core.basesyntax.busywaiting;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.concurrent.locks.ReentrantLock;

public class FileCreationBusyWait {
    private static final String FILE_PATH = "file.txt";
    private static final ReentrantLock lock = new ReentrantLock();
    private static boolean isFileCreated = false;

    public static void main(String[] args) throws InterruptedException {
        // Start a background thread to create a file after some time
        Thread fileCreatorThread = new Thread(() -> {
            try {
                Thread.sleep(5000); // Simulate some processing time
                synchronized (lock) {
                    File file = new File(FILE_PATH);
                    if (file.createNewFile()) {
                        isFileCreated = true;
                        System.out.println("File created by background thread.");
                        lock.notify();
                    }
                }
            } catch (InterruptedException | IOException e) {
                throw new RuntimeException(e);
            }
        });

        fileCreatorThread.start();

        // Busy waiting for the file to be created
        while (!new File(FILE_PATH).exists()) {
            // Main thread waiting for the file to be created
            synchronized (lock) {
                while (!isFileCreated) {
                    try {
                        lock.wait(); // Main thread waits here
                        System.out.println("The main method is waiting");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }

        }

        System.out.println("File detected by main thread. Proceeding with processing.");
        // Perform operations on the file

        // Cleanup for this example
        new File(FILE_PATH).delete();
        System.out.println("File is deleted.");
    }
}

