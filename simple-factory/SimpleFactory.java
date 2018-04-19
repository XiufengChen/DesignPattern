/**
 * 接口的定义，该接口可以通过简单工厂来创建
 */
public interface Api {
  /**
   * 示意，具体功能方法的定义
   * @param s示意，需要的参数
   */
  public void operation(String s);
}

/**
 * 接口的具体实现对象A
 */
public class ImplA implements Api {
  public void operation(String s) {
    //实现功能的代码，示意一下
    System.out.println("ImplA s=="+s);
  }
}

/**
 * 接口的具体实现对象B
 */
public class ImplB implements Api {
  public void operation(String s) {
    //实现功能的代码，示意一下
    System.out.println("ImplB s=="+s);
  }
}

/**
 * 工厂类，用来创建Api对象
 */
public class Factory {
  /**
   * 具体创建Api对象的方法
   * @param condition示意，从外部传入的选择条件
   * @return 创建好的Api对象
   */
  public static Api createApi(int condition) {
    // 应该根据某些条件去选择创建哪一个具体的实现对象，
    // 这些条件可以从外部传入，也可以从其他途径来获取，
    // 如果只有一个实现，可以省略条件，因为没有选择的必要
    // 示意使用的条件
    Api api = null;
    if(condition == 1) {
      api = new ImplA();
    } else if (condition == 2) {
      api = new ImplB();
    }
    return api;
  }
}
