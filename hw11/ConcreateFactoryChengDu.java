public class ConcreateFactoryChengDu implements Hotpot {

    @Override
    public HotpotProduct produce()
    {
        return new ChengDuHotpot();
    }
}
