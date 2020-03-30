package cn.lixinjiang.combination.chaincommand;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 * @Author lxj
 */
public class ClassUtils {
    public static List<Class> getSonClass(Class fatherClass) {
        List<Class> returnClassList = new ArrayList<>();
        String packageName = fatherClass.getPackage().getName();
        List<Class> packClasses = getClasses(packageName);
        for (Class c : packClasses) {
            if (fatherClass.isAssignableFrom(c) && !fatherClass.equals(c)) {
                returnClassList.add(c);
            }
        }
        return returnClassList;
    }

    public static List<Class> getClasses(String packageName) {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        String path = packageName.replace(".", "/");
        Enumeration<URL> resources = null;
        try {
            resources = classLoader.getResources(path);
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<File> dirs = new ArrayList<>();
        while (resources.hasMoreElements()) {
            URL resource = resources.nextElement();
            dirs.add(new File(resource.getFile()));
        }
        ArrayList<Class> classes = new ArrayList<>();
        for (File directory : dirs) {
            classes.addAll(findClasses(directory, packageName));
        }
        return classes;
    }

    private static List<Class> findClasses(File directory, String packageName) {
        List<Class> classes = new ArrayList<>();
        if (!directory.exists()) {
            return classes;
        }
        File[] files = directory.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                assert !file.getName().contains(".");
                classes.addAll(findClasses(file, packageName + "." + file.getName()));
            } else if (file.getName().endsWith(".class")) {
                try {
                    //TODO 需要处理截取
                    classes.add(Class.forName(packageName + "." + file.getName()));
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }
        return classes;
    }
}
