package cn.lixinjiang.iterator;

import java.util.ArrayList;

/**
 * @Author lxj
 */
public class Project implements IProject {

    private ArrayList<IProject> projectList = new ArrayList<>();

    private String name = "";
    private int num = 0;
    private int cost = 0;

    public Project() {

    }

    private Project(String name, int num, int cost) {
        this.name = name;
        this.num = num;
        this.cost = cost;
    }

    @Override
    public void add(String name, int num, int cost) {
        Project project = new Project(name, num, cost);


        //        this.projectList.add(new Project(name, num, cost));
    }

    @Override
    public String getProjectInfo() {
        String info = "";
        info = info + "项目名称：" + this.name;
        info = info + "\t项目人数：" + this.num;
        info = info + "\t项目费用：" + this.cost;
        return info;
    }

    @Override
    public IProjectIterator iterator() {
        return new ProjectIterator(this.projectList);
    }

}
