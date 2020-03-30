package cn.lixinjiang.singlepattern.iterator;

/**
 * @Author lxj
 */
public class Boss {
    public static void main(String[] args) {
        IProject project = new Project();

        for (int i = 1; i < 101; i++) {
            project.add("第" + i + "个项目", i * 5, i * 1000000);
        }

        IProjectIterator projectIterator = project.iterator();
        while (projectIterator.hasNext()) {
            IProject p = (IProject) projectIterator.next();
            System.out.println(p.getProjectInfo());
        }
    }
}