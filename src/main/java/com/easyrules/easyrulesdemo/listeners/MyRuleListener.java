package com.easyrules.easyrulesdemo.listeners;


import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rule;
import org.jeasy.rules.api.RuleListener;

public class MyRuleListener implements RuleListener {

    public boolean beforeEvaluate(Rule rule, Facts facts) {
        return true;
    }


    public void afterEvaluate(Rule rule, Facts facts, boolean evaluationResult) {
        System.out.println("afterEvaluate");
    }


    public void onEvaluationError(Rule rule, Facts facts, Exception exception) {
        System.out.println("onEvaluationError");
    }


    public void beforeExecute(Rule rule, Facts facts) {
        System.out.println("beforeExecute");
    }


    public void onSuccess(Rule rule, Facts facts) {
        System.out.println("onSuccess");
    }


    public void onFailure(Rule rule, Facts facts, Exception exception) {
        System.out.println("onFailure");
    }
}
