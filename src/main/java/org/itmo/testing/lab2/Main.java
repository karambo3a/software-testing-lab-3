package org.itmo.testing.lab2;

import io.javalin.Javalin;
import org.itmo.testing.lab2.controller.UserAnalyticsController;

public class Main {

    public static void main(String[] args) {
        Javalin app = UserAnalyticsController.createApp();
        app.start(7000);
    }
}
