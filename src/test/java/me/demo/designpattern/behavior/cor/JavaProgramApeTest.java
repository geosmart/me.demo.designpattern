package me.demo.designpattern.behavior.cor;

import org.junit.Test;

import me.demo.designpattern.behavior.cor.ape.JavaProgramApe;
import me.demo.designpattern.behavior.cor.ape.ProgramApe;

/**
 * CORClient(Chain of Responsibility)责任链模式
 * Created by Think on 2016/10/23.
 */
public class JavaProgramApeTest {

    @Test
    public void testApply() {
        //定义猿
        ProgramApe ape = new JavaProgramApe((int) (Math.random() * 30000));

        //处理申请
        Client.getLeaderChain().handleRequest(ape);
    }
}