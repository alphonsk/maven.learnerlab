package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    //given
    private void testConstructor(long id, String name) {
        Person person = new Person(id, name);

        // when
        String expectedName = person.getName();
        long expectedId = person.getId(id);

        // then
        Assert.assertEquals(name, expectedName);
        Assert.assertEquals(id, expectedId);
    }


    //given
    private void testSetName(long id, String name, String expectedName){
        Person person = new Person(id, name);

        // when
        person.setName(expectedName);
        String getNam = person.getName();

        // then
        Assert.assertEquals(getNam, expectedName);

    }

    @Test
    public void constructorTest() {
        testConstructor(1,"quan");
    }

    @Test
    public void constructorTest1() {
        testConstructor(1,"geog");
    }

    @Test
    public void nameSetTest() {
        testConstructor(1,"quan");
    }

    @Test
    public void nameSetTest1() {
        testConstructor(1,"geog");
    }




    /*

     */
}
