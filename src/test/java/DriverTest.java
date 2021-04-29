import com.simran.*;
import org.junit.Test;

public class DriverTest
{
    @Test
    public void defaultTest()
    {
        BusinessNewsPublisher businessNewsPublisher = new BusinessNewsPublisher();
        EmailNewsSubscriber emailNewsSubscriber = new EmailNewsSubscriber(businessNewsPublisher);
        SMSNewsSubscriber smsNewsSubscriber = new SMSNewsSubscriber(businessNewsPublisher);
        businessNewsPublisher.setNews(new News(NewsType.business,"A","AA"));
        businessNewsPublisher.setNews(new News(NewsType.business,"B","BB"));
        businessNewsPublisher.unregister(smsNewsSubscriber);
        businessNewsPublisher.setNews(new News(NewsType.business,"C","CC"));
    }
}
