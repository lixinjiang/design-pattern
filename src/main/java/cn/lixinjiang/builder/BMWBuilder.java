package cn.lixinjiang.builder;

import java.util.ArrayList;

/**
 * @Author lxj
 */
public class BMWBuilder extends CarBulder{

    BMWModel model = new BMWModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.model.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.model;
    }
}
