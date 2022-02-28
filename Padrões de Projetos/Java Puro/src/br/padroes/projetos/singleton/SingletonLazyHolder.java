package br.padroes.projetos.singleton;

/**
 * Singleton "Lazy Holder"
 *
 * @see <a href="https://stackoverflow.com/a/24018148">Reference</a>
 */

public class SingletonLazyHolder {
    private static class InstanceHolder {
        public static SingletonLazyHolder instace = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() { super(); }

    public static SingletonLazyHolder getInstance() { return InstanceHolder.instace; }
}
