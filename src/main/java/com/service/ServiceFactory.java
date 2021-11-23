package com.service;

import com.service.impl.NewServiceImpl;

public class ServiceFactory {
    private static final NewService newsService = create();

    private static NewService create() {
        return new NewServiceImpl();
    }
    public static NewService getUserService() {
        return newsService;
    }
}
