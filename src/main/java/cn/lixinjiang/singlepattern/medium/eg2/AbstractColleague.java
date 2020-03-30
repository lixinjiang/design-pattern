package cn.lixinjiang.singlepattern.medium.eg2;

/**
 * 同事类
 * @Author lxj
 */
public abstract class AbstractColleague {
    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator mediator) {
        this.mediator = mediator;
    }
}
