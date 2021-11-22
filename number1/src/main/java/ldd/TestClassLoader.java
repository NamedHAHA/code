package main.java.ldd;




/**
 * TODO
 *
 * @author lidongdong
 * @version 1.0
 * @date 2021/9/18 16:34
 */
public class TestClassLoader {



    public static void main(String[] args) {

        ClassLoader c  = TestClassLoader.class.getClassLoader();  //获取Number02类的类加载器 AppClassLoader

        System.out.println(c);

        ClassLoader c1 = c.getParent();  //获取c这个类加载器的父类加载器 ExtClassLoader

        System.out.println(c1);

        ClassLoader c2 = c1.getParent();//获取c1这个类加载器的父类加载器

        System.out.println(c2);

        //Bootstrap Loader ExtClassLoader的父类 但是Bootstrap Loader是用C++写的 所以依java的观点来看，
        // 逻辑上并不存在Bootstrap Loader的类实体，所以在java程序代码里试图打印出其内容时，我们就会看到输出为null
    }
}
