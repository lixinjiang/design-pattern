package cn.lixinjiang.iterator;

/**
 * @Author lxj
 */
public interface IProject {
    void add(String name, int num, int cost);

    String getProjectInfo();

    // 获得一个可以被遍历的对象
    IProjectIterator iterator();
}
