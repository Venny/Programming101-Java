package ApplicationFall2015.DependenciesResolving;

/**
 * Created by Inspired Day on 10/25/2015.
 */
public class Main {
    public static void main(String[] args) {
        Packages allPackages = new Packages("modules/all_packages.json");
        Packages dependencies = new Packages("modules/dependencies.json");
        DependenciesResolving dependenciesTool = new DependenciesResolving(allPackages, dependencies);

    }
}
