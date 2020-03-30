package cn.lixinjiang.singlepattern.visitor.eg1;

/**
 * @Author lxj
 */
public class Visitor implements IVisitor {

    @Override
    public void visit(Manager manager) {
        System.out.println(this.getManagerInfo(manager));
    }

    @Override
    public void visit(CommonEmployee employee) {
        System.out.println(this.getCommonEmployee(employee));
    }

    private String getBasicInfo(Employee employee) {
        String info = "姓名：" + employee.getName() + "\t";
        info += "性别：" + (employee.getSex() == Employee.FEMALE ? "女" : "男") + "\t";
        info += "薪水：" + employee.getSalary() + "\t";
        return info;
    }

    private String getManagerInfo(Manager manager) {
        String basicInfo = this.getBasicInfo(manager);
        String otherInfo = "业绩：" + manager.getPerformance() + "\t";
        return basicInfo + otherInfo;
    }

    private String getCommonEmployee(CommonEmployee employee) {
        String basicInfo = this.getBasicInfo(employee);
        String otherInfo = "工作：" + employee.getJob() + "\t";
        return basicInfo + otherInfo;
    }
}
