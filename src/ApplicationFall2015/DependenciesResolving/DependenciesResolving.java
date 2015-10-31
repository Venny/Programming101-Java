package ApplicationFall2015.DependenciesResolving;

import java.io.File;
import java.util.HashMap;

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

    public void init(){
        checkInstalled();
        checkDependencies();
    }

    private void checkInstalled(){
        File folder = new File(installedModulesPath);
        availablePackages = folder.list();
    }

    private void checkDependencies(){
        HashMap tempIndex = dependencies.getIndex();
        String[] temp = tempIndex.get("dependencies").toString().split(" ");
        checkDependenciesRecursively(temp);
        System.out.println("All done.");
    }

    private void checkDependenciesRecursively(String[] key){
        for(String dependency:key){
            if(!findInAvailablePackages(dependency)){
                checkInAllPackages(dependency);
            } else{
                System.out.println(dependency + " is already installed.");
            }
        }
    }

    private boolean findInAvailablePackages(String dependency){
        for(String avPackage:availablePackages){
            if(avPackage.equals(dependency)) return true;
        }
        return false;
    }

    private void checkInAllPackages(String packageName){
        HashMap tempIndex = all.getIndex();
        String currentDependencies = tempIndex.get(packageName).toString();
        String[] temp = currentDependencies.split(" ");

        System.out.println("Installing " + packageName);
        install(packageName);

        if(!temp[0].equals("")){
            System.out.println("In order to install " + packageName + ", we need " + currentDependencies);
            checkDependenciesRecursively(temp);
        }
    }

    private void install(String packageName){
        File dir = new File(installedModulesPath + "\\" + packageName);
        dir.mkdir();
    }
}
