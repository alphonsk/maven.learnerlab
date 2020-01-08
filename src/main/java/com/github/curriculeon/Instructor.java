package com.github.curriculeon;

public class Instructor extends Person implements Teacher, Learner {

    public Instructor(long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
//        lean
  
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {

    }

    @Override
    public void learn(double numberOfHours) {

    }

    @Override
    public Double getTotalStudyTime() {
        return null;
    }

    /*

Instructor should have a concrete implementation of the teach method which invokes the learn method on the specified Learner object.
Instructor should have a concrete implementation of the lecture method which invokes the learn method on each of the elements in the specified array of Learner objects.
numberOfHours should be evenly split amongst the learners.
double numberOfHoursPerLearner = numberOfHours / learners.length;
     */




}
