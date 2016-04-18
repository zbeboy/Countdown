package com.countdown;

import com.countdown.config.TemplateApplication;
import ro.pippo.core.Pippo;
import ro.pippo.velocity.VelocityTemplateEngine;

/**
 * Created by Administrator on 2016/4/18.
 */
public class Application {
    public static void main(String[] args) {
        // .vm is the default file extension
        Pippo pippo = new Pippo(new TemplateApplication(new VelocityTemplateEngine(), "velocity/index"));
        pippo.start();
    }
}
