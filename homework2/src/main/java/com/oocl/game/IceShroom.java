package com.oocl.game;

/**
 * Created by chen on 2017/7/5.
 */
public class IceShroom extends Plant implements AttackInterface,AttackSlowDownInterface,SleepInterface,ExplosionInterface {
    public void sleep() {
        System.out.println("IceShroom will sleep in the Morning");
    }

    @Override
    public void price() {
        System.out.println("IceShroom price is 0 sunlight");
    }

    @Override
    public void durable() {
        System.out.println("IceShroom durable is 300");
    }

    @Override
    public void coolDownTime() {
        System.out.println("IceShroom coolDownTime is 50 second");
    }

    public void attack() {
        System.out.println("IceShroom attack is 20");
    }

    public void attackInterval() {
        System.out.println("IceShroom attackInterval is 50 second");
    }

    public void attackRange() {
        System.out.println("IceShroom attack is 全屏20伤害");
    }

    public void slowDown() {
        System.out.println("IceShroom 冻结所有可冻结目标动作4秒，之后持续冰减速15秒");
    }

    public void explosion() {
        System.out.println("IceShroom will explosion");
    }
}
