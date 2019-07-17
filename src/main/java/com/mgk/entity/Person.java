package com.mgk.entity;

import com.mgk.event.Even;
import com.mgk.listener.PersonListener;

public class Person {

    private PersonListener personListener;
    public void registerListener(PersonListener personListener){
        this.personListener = personListener;
    }
    //工作
    public void work () {
        if(personListener != null){
            Even even = new Even(this);
            personListener.work(even);
        }
    }
    //唱歌
    public void sing(){
        if(personListener != null){
            Even even = new Even(this);
            personListener.sing(even);
        }
    }
    //运动
    public void exercise(){
        if(personListener != null){
            Even even = new Even(this);
            personListener.exercise(even);
        }
    }


}
