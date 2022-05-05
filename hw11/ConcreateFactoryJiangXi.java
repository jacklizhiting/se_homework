public class ConcreateFactoryJiangXi implements Hotpot {

    @Override
    public HotpotProduct produce()
    {
        return new JiangXiHotpot();
    }
}
