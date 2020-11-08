package com.company.visitor;

public class ScenarioExecuter implements ScenarioExecutable {

        @Override
        public void execute(ScenarioSource scenarioSource) {
            scenarioSource.step2();
            scenarioSource.step1();
            scenarioSource.step3();
            scenarioSource.step3();
        }

}
