package me.demo.designpattern.behavior.cor;

import me.demo.designpattern.behavior.cor.leader.Boss;
import me.demo.designpattern.behavior.cor.leader.Director;
import me.demo.designpattern.behavior.cor.leader.GroupLeader;
import me.demo.designpattern.behavior.cor.leader.Leader;
import me.demo.designpattern.behavior.cor.leader.Manager;

/**
 * Created by Think on 2016/10/23.
 */
public class Client {
    /**
     * 获取处理经费申请的领导人
     */
    public static Leader getLeaderChain() {
        //四个老大
        Leader groupLeader = new GroupLeader();
        Leader director = new Director();
        Leader manager = new Manager();
        Leader boss = new Boss();

        //设置职责链
        groupLeader.setSuperior(director);
        director.setSuperior(manager);
        manager.setSuperior(boss);

        return groupLeader;
    }
}
