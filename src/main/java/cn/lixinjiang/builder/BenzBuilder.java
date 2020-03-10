package cn.lixinjiang.builder;

import java.util.ArrayList;

/**
 * @Author lxj
 */
public class BenzBuilder extends CarBulder {
    private BenzModel benzModel = new BenzModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benzModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.benzModel;
    }
}
