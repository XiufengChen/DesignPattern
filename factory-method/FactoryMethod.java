/**
 * 工厂方法所创建的接口
 */
public interface Product {
  // 可以定义Product的属性和方法
}

/**
 * 具体的Product对象
 */
public class ConcreteProduct implements Product {
  // 实现Product的方法
}

/**
 * 创建器，声明工厂方法
 */
public abstract class Creator {
  /**
   * 创建Product的工厂方法
   * @return Product对象
   */
  protected abstract Product factoryMethod();

  /**
   * 示意方法，实现某些功能的方法
   */
  public void someOperation() {
    // 通常在这些方法实现中需要调用工厂方法来获取Product对象
    Product product = factoryMethod();
  }
}

/**
 * 具体的创建器实现对象
 */
public class ConcreteCreator extends Creator {
  protected Product factoryMethod() {
    // 重定义工厂方法，返回一个具体的Product对象
    return new ConcreteProduct();
  }
}
