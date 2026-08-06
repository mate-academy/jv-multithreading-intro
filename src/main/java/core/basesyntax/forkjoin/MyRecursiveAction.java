package core.basesyntax.forkjoin;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveAction;

public class MyRecursiveAction extends RecursiveAction {
    private final long workLoad;

    public MyRecursiveAction(long workLoad) {
        this.workLoad = workLoad;
    }

    @Override
    protected void compute() {
        // if work is above threshold, break tasks up into smaller tasks
        if (workLoad > 16) {
            System.out.println("RecursiveAction: Splitting task, workLoad : " + workLoad);
            List<RecursiveAction> subTasks = new ArrayList<>(createSubTasks());
            for (RecursiveAction subTask : subTasks) {
                subTask.fork();
            }
        } else {
            System.out.println("RecursiveAction: Doing task myself, workLoad : " + workLoad);
        }
    }

    private List<RecursiveAction> createSubTasks() {
        List<RecursiveAction> subTasks = new ArrayList<>();
        RecursiveAction first = new MyRecursiveAction(workLoad / 2);
        RecursiveAction second = new MyRecursiveAction(workLoad / 2);
        subTasks.add(first);
        subTasks.add(second);
        return subTasks;
    }
}
