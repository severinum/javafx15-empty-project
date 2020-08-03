package com.severinu.controllers;

import com.severinu.app.ApplicationManager;
import com.severinu.views.ViewFactory;

public abstract class BaseController {
    protected ApplicationManager applicationManager;
    protected ViewFactory viewFactory;
    private String fxmlFileName;

    public BaseController(ApplicationManager applicationManager, ViewFactory viewFactory, String fxmlFileName) {
        this.applicationManager = applicationManager;
        this.viewFactory = viewFactory;
        this.fxmlFileName = fxmlFileName;
    }

    public ApplicationManager getApplicationManager() {
        return applicationManager;
    }

    public ViewFactory getViewFactory() {
        return viewFactory;
    }

    public String getFxmlFileName() {
        return fxmlFileName;
    }
}
