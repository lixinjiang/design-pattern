package cn.lixinjiang.singlepattern.decorate;

/**
 * @Author lxj
 */
public class SugarFouthGradeSchoolReprot extends FouthGradeSchoolReport {
    private void reportHighScore() {
        System.out.println();
    }

    private void reportSort() {
        System.out.println();
    }

    @Override
    public void report() {
        this.reportHighScore();
        super.report();
        this.reportSort();
    }
}
