package com.company.visitor;

/**
 * Допустим какой-то класс который описывает различные
 * возможные шаги исполнения алгоритма
 */
public class ScenarioTemplate implements ScenarioAcceptable {

    public void step1() {
        System.out.println("Step 1");
    }

    public void step2() {
        System.out.println("Step 2");
    }

    public void step3() {
        System.out.println("Step 3");
    }

    @Override
    public void accept(ScenarioExecutable executable) {
        executable.execute(this);
    }
}
