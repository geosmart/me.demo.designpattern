package me.demo.designpattern.behavior.cor.leader;

import me.demo.designpattern.behavior.cor.ape.ProgramApe;

/**
 * 小组领导
 * Created by Think on 2016/10/23.
 */
public class GroupLeader extends Leader {

    public GroupLeader() {
        super(1000);
    }

    @Override
    protected void reply(ProgramApe ape) {
        System.out.println(ape.getApply());
        System.out.println(String.format("%s:%s", this.getClass().getSimpleName(), "Of Cource Yes!"));
    }
}
