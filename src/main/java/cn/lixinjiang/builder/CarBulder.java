package cn.lixinjiang.builder;

import java.util.ArrayList;

/**
 * @Author lxj
 */
public abstract class CarBulder {

    public abstract void setSequence(ArrayList<String> sequence);

    public abstract CarModel getCarModel();

}
