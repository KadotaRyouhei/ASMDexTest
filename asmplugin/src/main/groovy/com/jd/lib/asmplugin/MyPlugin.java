package com.jd.lib.asmplugin;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

/**
 * Created by shanliang on 2018/10/31.
 */

public class MyPlugin implements Plugin<Project> {

    public void apply(Project project) {
        System.out.println("========================");
        System.out.println("hello gradle plugin!");
        System.out.println("========================");
    }

}
