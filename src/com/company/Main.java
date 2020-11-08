package com.company;

import com.company.visitor.ScenarioExecuter;
import com.company.visitor.ScenarioSource;

public class Main {

    public static void main(String[] args) {

        ScenarioExecuter scenarioExecuter = new ScenarioExecuter();
        ScenarioSource scenarioSource = new ScenarioSource();
        scenarioSource.accept(scenarioExecuter);


    }
}
