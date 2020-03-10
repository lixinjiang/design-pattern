package cn.lixinjiang.composite.eg1;

import java.util.ArrayList;

/**
 * @Author lxj
 */
public class Composite extends Component {
    private ArrayList<Component> componentArrayList = new ArrayList<>();

    public void add(Component component) {
        this.componentArrayList.add(component);
    }

    public void remove(Component component) {
        this.componentArrayList.remove(component);
    }

    public ArrayList<Component> getChildren() {
        return this.componentArrayList;
    }
}
