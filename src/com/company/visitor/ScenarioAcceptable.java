package com.company.visitor;

/**
 * Описывает поведение класса который способен принимать
 * классы исполняющие какие либо сценарии или алгоритмы
 * состоящие из отдельных атомарных методов
 */
public interface ScenarioAcceptable {

    void accept(ScenarioExecutable executable);

}
