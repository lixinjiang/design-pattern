package cn.lixinjiang.decorate;

/**
 * @Author lxj
 */
public class HighScoreDecorator extends Decorator{

    public HighScoreDecorator(SchoolReport sr) {
        super(sr);
    }

    private void reportHighScore() {
        System.out.println();
    }

    @Override
    public void report() {
        this.reportHighScore();
        super.report();
    }
}
