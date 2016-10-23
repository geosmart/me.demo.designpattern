package me.demo.designpattern.behavior.cor.leader;

import me.demo.designpattern.behavior.cor.ape.ProgramApe;

/**
 * 领导人抽象类
 * Created by Think on 2016/10/23.
 */
public abstract class Leader {
    /**
     * 当前领导能批复的最大金额
     */
    private int expense;
    /**
     * 上级领导
     */
    private Leader superior;

    public Leader(int expense) {
        this.expense = expense;
    }

    /**
     * 设置上级领导
     *
     * @param superior 上级领导
     */
    public void setSuperior(Leader superior) {
        this.superior = superior;
    }

    /**
     * 回复程序员
     *
     * @param ape 具体的猿
     */
    protected abstract void reply(ProgramApe ape);

    /**
     * 处理请求
     */
    public void handleRequest(ProgramApe ape) {
        if (ape.getExpenses() <= expense) { //在权限范围内
            reply(ape);
        } else {//不在权限范围内
            if (null != superior) {//存在上级
                System.out.println(String.format("%s:MD,要这么多，我只能批%s,找%s去", this.getClass().getSimpleName(), this.expense, this.superior.getClass().getSimpleName()));
                superior.handleRequest(ape);
            } else {//没有上级领导，则无法批复
                System.out.println("Goodbye my money");
            }
        }
    }
}
