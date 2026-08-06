package core.basesyntax.thread.daemon;

public class DockerPsDaemon {

    public static void main(String[] args) {
        // Create a daemon thread
        Thread daemonThread = new Thread(() -> {
            try {
                while (true) {
                    ProcessBuilder builder = new ProcessBuilder("docker", "ps");
                    builder.redirectErrorStream(true); // merge error and output
                    Process process = builder.start();

                    // Read and print the output of the command
                    try (var reader = new java.io.BufferedReader(
                            new java.io.InputStreamReader(process.getInputStream()))) {
                        String line;
                        System.out.println("=== daemon thread docker ps output ===");
                        while ((line = reader.readLine()) != null) {
                            System.out.println(line);
                        }
                    }

                    process.waitFor(); // Wait for command to finish

                    // Sleep for 5 seconds before running again
                    Thread.sleep(5000);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        daemonThread.setDaemon(true); // Set as daemon
        daemonThread.start();

        // Main thread does something else
        System.out.println("Main thread doing work...");

        // Simulate main thread running for 15 seconds
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread finished.");
    }
}
