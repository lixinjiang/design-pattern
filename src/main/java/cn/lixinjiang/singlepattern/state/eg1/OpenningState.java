package cn.lixinjiang.singlepattern.state.eg1;

/**
 * @Author lxj
 */
public class OpenningState extends LiftState{

    @Override
    public void open() {
        System.out.println("电梯门开启。。。");
    }

    @Override
    public void close() {
        super.context.setLiftState(Context.CLOSING_STATE);
        super.context.getLiftState().close();
    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}
