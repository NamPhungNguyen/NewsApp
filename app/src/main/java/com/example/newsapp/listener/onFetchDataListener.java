package com.example.newsapp.listener;

import com.example.newsapp.Model.NewsHeadlines;

import java.util.List;

public interface onFetchDataListener<NewsApiResponse> {
    void onFetchData(List<NewsHeadlines> list, String message);
    void onError(String message);
}
