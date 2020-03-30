package cn.lixinjiang.singlepattern.state.eg1;

/**
 * @Author lxj
 */
public class RunningState extends LiftState{

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void run() {
        System.out.println("电梯上下运行");
    }

    @Override
    public void stop() {
        super.context.setLiftState(Context.STOPPING_STATE);
        super.context.getLiftState().stop();
    }
}
