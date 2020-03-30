package cn.lixinjiang.singlepattern.composite.eg2;

import java.util.ArrayList;

/**
 * @Author lxj
 */
public class Leaf extends Component{

    @Override
    @Deprecated
    public void add(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public void remove(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public ArrayList<Component> getChildren() {
        throw new UnsupportedOperationException();
    }
}
