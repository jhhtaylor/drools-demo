package com.example;

import org.kie.api.io.ResourceType;
import org.kie.api.runtime.KieSession;
import org.kie.internal.io.ResourceFactory;
import org.kie.internal.utils.KieHelper;

public class App {
    public static void main(String[] args) {
        KieHelper helper = new KieHelper();
        helper.addResource(ResourceFactory.newClassPathResource("com/example/rules.drl"), ResourceType.DRL);

        KieSession kSession = helper.build().newKieSession();
        kSession.insert("World");
        kSession.fireAllRules();
        kSession.dispose();
    }
}
