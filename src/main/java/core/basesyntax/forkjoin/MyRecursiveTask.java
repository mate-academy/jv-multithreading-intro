package core.basesyntax.forkjoin;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveTask;

public class MyRecursiveTask extends RecursiveTask<Long> {
    private final long workLoad;

    public MyRecursiveTask(long workLoad) {
        this.workLoad = workLoad;
    }

    protected Long compute() {
        // if work is above threshold, break tasks up into smaller tasks
        if (workLoad > 16) {
            System.out.println("RecursiveTask: Splitting task, workLoad : " + workLoad);
            List<RecursiveTask<Long>> subTasks = new ArrayList<>(createSubTasks());
            for (RecursiveTask<Long> subTask : subTasks) {
                subTask.fork();
            }
            long result = 0;
            for (RecursiveTask<Long> subTask : subTasks) {
                result += subTask.join();
            }
            return result;
        } else {
            System.out.println("RecursiveTask: Doing task myself, workLoad : " + workLoad);
            return workLoad * 3;
        }
    }

    private List<RecursiveTask<Long>> createSubTasks() {
        List<RecursiveTask<Long>> subTasks = new ArrayList<>();
        RecursiveTask<Long> first = new MyRecursiveTask(workLoad / 2);
        RecursiveTask<Long> second = new MyRecursiveTask(workLoad / 2);
        subTasks.add(first);
        subTasks.add(second);
        return subTasks;
    }
}
