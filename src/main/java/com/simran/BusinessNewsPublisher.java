package com.simran;

import java.util.LinkedList;
import java.util.List;

public class BusinessNewsPublisher implements IPublisher
{
    private News news;
    private List<ISubscriber> subscribers;

    public BusinessNewsPublisher() {
        this.subscribers = new LinkedList<>();
    }

    @Override
    public void register(ISubscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    @Override
    public void unregister(ISubscriber subscriber) {
        this.subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for (ISubscriber subscriber: subscribers) {
            subscriber.update(news);
        }
    }

    public void setNews(News latestNews)
    {
        this.news = latestNews;
        notifySubscribers();
    }
}
