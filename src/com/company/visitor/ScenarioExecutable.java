package com.company.visitor;

/**
 *  Описывает поведение класса который способен исполнить
 *  определенный сценарий из шагов(методов) взятых из
 *  мсточника атомарных операций
 */
public interface ScenarioExecutable {

    void  execute(ScenarioSource scenarioSource);

}
