package com.example;

import org.kie.api.io.ResourceType;
import org.kie.api.runtime.KieSession;
import org.kie.internal.io.ResourceFactory;
import org.kie.internal.utils.KieHelper;

import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class App implements QuarkusApplication {
    @Override
    public int run(String... args) throws Exception {
        KieHelper helper = new KieHelper();
        helper.addResource(ResourceFactory.newClassPathResource("com/example/rules.drl"), ResourceType.DRL);

        KieSession kSession = helper.build().newKieSession();
        kSession.insert("World");
        kSession.fireAllRules();
        kSession.dispose();
        return 0;
    }
}
