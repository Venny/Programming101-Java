package ApplicationFall2015.DependenciesResolving;


import sun.reflect.misc.FieldUtil;

import java.io.File;
import java.io.IOException;

/**
 * Created by Inspired Day on 10/24/2015.
 */
public class DependenciesResolving {
    private String[] availablePackages;
    private Packages all;
    private Packages dependencies;
    private final String installedModulesPath = "src\\ApplicationFall2015\\DependenciesResolving\\modules\\installed_modules";

    public DependenciesResolving(Packages all, Packages dependencies){
        this.all = all;
        this.dependencies = dependencies;
        init();
    }

    public  void init(){
        //String url = getClass().getClassLoader().getResource("").getPath() + "modules/installed_modules/";
        File folder = new File(installedModulesPath);
        String[] listOfDependencies = folder.list();
        System.out.println(folder.getAbsolutePath());

        if (listOfDependencies != null) {
            for(String dependency:listOfDependencies){
                System.out.println(dependency);
            }
        }
    }
}
