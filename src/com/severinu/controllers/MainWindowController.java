package com.severinu.controllers;

import com.severinu.app.ApplicationManager;
import com.severinu.views.ViewFactory;

public class MainWindowController extends BaseController {
    public MainWindowController(ApplicationManager applicationManager, ViewFactory viewFactory, String fxmlFileName) {
        super(applicationManager, viewFactory, fxmlFileName);
    }
}
