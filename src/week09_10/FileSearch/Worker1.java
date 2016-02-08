package week09_10.FileSearch;

import java.io.File;
import java.util.concurrent.Callable;

/**
 * Created by inspired on 07.02.16.
 */
public class Worker1 implements Callable<File> {
    private String word;
    private File file;

    public Worker1(String name, File file){
        this.word = name;
        this.file = file;
    }

    @Override
    public File call() throws Exception {
        /*while(true){
            File newFile = FileFinder.findFile(word, file);
        }*/
        return null;
    }
}
