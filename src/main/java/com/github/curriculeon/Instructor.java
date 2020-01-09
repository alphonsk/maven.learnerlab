package com.github.curriculeon;

public class Instructor extends Person implements Teacher {

    public Instructor(long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours){
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        for (int i = 0; i < learners.length; i++) {
            Learner learner = learners[i];
            learner.learn(numberOfHours);
        }
    }








}
