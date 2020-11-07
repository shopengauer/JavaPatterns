package com.company;

import com.company.visitor.ScenarioExecuter;
import com.company.visitor.ScenarioTemplate;

public class Main {

    public static void main(String[] args) {

        ScenarioExecuter scenarioExecuter = new ScenarioExecuter();
        ScenarioTemplate scenarioTemplate = new ScenarioTemplate();
        scenarioTemplate.accept(scenarioExecuter);


    }
}
