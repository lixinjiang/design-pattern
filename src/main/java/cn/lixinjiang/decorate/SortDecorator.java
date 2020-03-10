package cn.lixinjiang.decorate;

/**
 * @Author lxj
 */
public class SortDecorator extends Decorator{

    public SortDecorator(SchoolReport sr) {
        super(sr);
    }

    private void reportSort() {
        System.out.println();
    }

    @Override
    public void report() {
        super.report();
        this.reportSort();
    }
}
