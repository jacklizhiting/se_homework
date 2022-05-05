public class MyTest {

    public static void main(String[] args) {
        Hotpot factoryA = new ConcreateFactoryJiangXi();
        HotpotProduct product1 = factoryA.produce();
        product1.method();
    }
}
