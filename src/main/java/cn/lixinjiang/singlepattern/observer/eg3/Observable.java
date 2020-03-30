package cn.lixinjiang.singlepattern.observer.eg3;

/**
 * @Author lxj
 */
public interface Observable {
    public void addObserver(Observer observer);

    public void deleteObserver(Observer observer);

    public void notifyObservers(String context);
}
