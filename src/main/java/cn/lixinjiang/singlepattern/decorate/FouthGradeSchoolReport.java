package cn.lixinjiang.singlepattern.decorate;

/**
 * @Author lxj
 */
public class FouthGradeSchoolReport extends SchoolReport{

    @Override
    public void report() {
        System.out.println();
    }

    @Override
    public void sign(String name) {
        System.out.println();
    }
}
