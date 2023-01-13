package Ex2_1;
import java.io.File;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

import static Ex2_1.FileContainer.createTextFiles;

public class Test_Ex2_1 {
    public static void main(String[] args)
    {
 //       System.out.println(getNumOfLinesThreadPool(new String[]{"filename0.txt", "filename1.txt"}));
//        createTextFiles(10, 1, 10);
//        FileContainer f = new FileContainer();
//        System.out.println(f.getNumOfLinesThreads(new String[]{"filename0.txt", "filename1.txt"}));
//        System.out.println(f.getNumOfLinesThreadPool(new String[]{"filename0.txt", "filename1.txt"}));
        ////////////////////////////////////////////////
        String[]arrcheck = FileContainer.createTextFiles(1000,1,100);
        FileContainer check = new FileContainer();
        long startT = System.nanoTime();
        check.getNumberOfLines(arrcheck);
        long endT = System.nanoTime();
        long totalT= endT - startT;
        System.out.println("The Total time for getNumberOfLines function is: " + totalT/1000000000.0);
        startT = System.nanoTime();
        check.getNumOfLinesThreads(arrcheck);
        endT = System.nanoTime();
        totalT = endT - startT;
        System.out.println("The Total time for getNumOfLinesThreads function is: " + totalT/1000000000.0);

        startT = System.nanoTime();
        check.getNumOfLinesThreadPool(arrcheck);
        endT = System.nanoTime();
        totalT = endT - startT;
        System.out.println("The Total time for getNumOfLinesThreadPool function is: " + totalT/1000000000.0);

    }
}
