package com.simran;

public class EmailNewsSubscriber implements ISubscriber
{
    private News news;
    private IPublisher publisher;

    public EmailNewsSubscriber(IPublisher publisher) {
        this.publisher = publisher;
        this.publisher.register(this);
    }

    @Override
    public void update(News news) {
        this.news = news;
        emailNews();
    }

    private void emailNews()
    {
        System.out.println("Sending news via Email: "+news);
    }
}
