# 代理模式

前提摘要：要访问某个类时，直接访问可能会有麻烦。（例如：操作繁琐，安全控制）所以可以通过代理模式对访问类做控制。

代理模式主要分为：静态代理，jdk动态代理，cglib动态代理

## 静态代理

特点：在目标类上加中间层代理类，实现同一个抽象接口。目标类嵌入到代理类中，通过请求代理类访问目标类。

缺点：添加代理模式会降低请求速度。代理类和委托类都实现了相同的接口，一旦接口发生改变，所有实现该接口的类都需要改变。

核心代码：

抽象主题类

```java
public interface IOrderService {
    int saveOrder(Order order);

}
```

具体主题类

```java
public class OrderServiceImpl implements IOrderService{

    @Override
    public int saveOrder(Order order) {
		//实际目标操作
    }
}
```

代理类

```java
public class OrderServiceStaticProxy implements IOrderService{

    //代理实现类
    private IOrderService iOrderService;

    /**
     * 代理方法
     * @param order
     * @return
     */
    @Override
    public int saveOrder(Order order){
        //预处理
        beforeMethod(order);
        iOrderService = new OrderServiceImpl();
        //实际目标方法
        int result = iOrderService.saveOrder(order);
        //后处理
        afterMethod();
        return result;
    }

    /**
     * 预处理
     * @param order
     */
    private void beforeMethod(Order order){
        //预处理逻辑
    }

    /**
     * 后处理
     */
    private void afterMethod(){
        //后处理逻辑
    }
}

```

测试类

```java
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(2);

        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder(order);
    }
```

## jdk动态代理

特点：静态代理代理多个类会产生很多代理类。如果要通过一个代理类完成所有代理功能，就需要用到动态代理。代理类实现InvovationHandler接口，通过这个接口定义横切的逻辑，通过反射调用目标类的方法，使得业务逻辑和非业务逻辑拼接在一起。

缺点：动态代理有一定的局限性，只能基于接口。

核心代码：

代理类

```java
public class OrderServiceDynamicProxy implements InvocationHandler {

    private Object target;

    public OrderServiceDynamicProxy(Object target) {
        this.target = target;
    }

    public Object bind(){
        Class cls = target.getClass();
        return Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object argObject = args[0];
        beforeMethod(argObject);
        Object object = method.invoke(target, args);
        afterMethod();
        return object;
    }

    private void beforeMethod(Object obj){
        //方法前执行，选择服务器
    }

    private void afterMethod(){
        System.out.println("静态代理after code");
    }
}
```

测试类

```java
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(2);

        IOrderService orderServiceDynamicProxy = (IOrderService)new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();
        orderServiceDynamicProxy.saveOrder(order);
    }
```

[源码](..\SourceCode\defign_pattern\src\main\java\com\geely\design\pattern\structural\proxy)    

## cglib动态代理

特点：cglib动态代理通过继承来实现，借助asm，直接操控字节码给目标类创建一个子类。使用比较广泛且效率高。

缺点：无法处理final的情况。

### 源码解析

Spring -- ProxyFactoryBean的getObject()

Spring -- CglibAopProxy

Mybatis -- MapperProxyFactory的newInstance

MapperProxy -- invoke()