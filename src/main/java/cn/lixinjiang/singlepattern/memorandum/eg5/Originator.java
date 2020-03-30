package cn.lixinjiang.singlepattern.memorandum.eg5;

/**
 * @Author lxj
 */
public class Originator {
    /**
     * 内部状态
     */
    private String state = "";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public IMemento createMemento() {
        return new Memento(this.state);
    }

    public void restoreMemento(IMemento memento) {
        this.setState(((Memento) memento).getState());
    }

    /**
     * 内置类,全部是私有权限，除了发起人，别人无法访问
     */
    private class Memento implements IMemento {
        private String state = "";

        private Memento(String state) {
            this.state = state;
        }

        private String getState() {
            return state;
        }

        private void setState(String state) {
            this.state = state;
        }
    }

}
