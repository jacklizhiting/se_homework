public class ConcreateFactoryChongQing implements Hotpot {

    @Override
    public HotpotProduct produce()
    {
        return new ChongQingHotpot();
    }
}