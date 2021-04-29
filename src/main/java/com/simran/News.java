package com.simran;

import java.util.UUID;

public class News
{
    String id;
    NewsType newsType;
    String headline;
    String description;

    public News(NewsType newsType, String headline, String description)
    {
        this.id = UUID.randomUUID().toString();
        this.newsType = newsType;
        this.headline = headline;
        this.description = description;
    }


    @Override
    public String toString() {
        return "News{" +
                "newsType=" + newsType +
                ", headline='" + headline + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

}
