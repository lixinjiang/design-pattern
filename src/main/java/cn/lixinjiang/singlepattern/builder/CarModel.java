package cn.lixinjiang.singlepattern.builder;

import java.util.ArrayList;

/**
 * @Author lxj
 */
public abstract class CarModel {
    private ArrayList<String> sequence = new ArrayList<String>();

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    final public void run() {
        for (int i = 0; i < this.sequence.size(); i++) {
            String actionName = this.sequence.get(i);
            if (actionName.equals("start")) {
                this.start();
            } else if (actionName.equals("stop")) {
                this.stop();
            } else if (actionName.equals("alarm")) {
                this.alarm();
            } else if (actionName.equalsIgnoreCase("engine boom")) {
                this.engineBoom();
            }
        }
    }

    /**
     * 允许客户自己设定一个顺序
     *
     * @param sequence
     */
    public final void setSequence(ArrayList sequence) {
        this.sequence = sequence;
    }

}
