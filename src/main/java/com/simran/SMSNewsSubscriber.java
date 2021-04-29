package com.simran;

public class SMSNewsSubscriber implements ISubscriber
{
    private News news;
    private IPublisher publisher;

    public SMSNewsSubscriber(IPublisher publisher) {
        this.publisher = publisher;
        this.publisher.register(this);
    }

    @Override
    public void update(News news) {
        this.news = news;
        smsNews();
    }

    private void smsNews()
    {
        System.out.println("Sending news via SMS: "+news);
    }
}