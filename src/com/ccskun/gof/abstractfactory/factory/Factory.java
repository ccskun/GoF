package com.ccskun.gof.abstractfactory.factory;

/**
 * Created by ccskun on 2018/3/10.
 */
public abstract class Factory {
    public static Factory getFactory(String className) {
        Factory factory = null;
        try {
            factory = (Factory) Class.forName(className).newInstance();
        } catch (ClassNotFoundException e) {
            System.out.println("没有找表" + className + "类！");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }
    public abstract Link createLink(String caption, String url);
    public abstract Tray createTray(String caption);
    public abstract Page createPage(String title,String author);
}
