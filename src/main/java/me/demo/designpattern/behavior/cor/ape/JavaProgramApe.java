package me.demo.designpattern.behavior.cor.ape;

/**
 * Java程序猿
 * Created by Think on 2016/10/23.
 */
public class JavaProgramApe implements ProgramApe {
    private int expenses;
    private String apply = "爹要点钱出差";

    public JavaProgramApe(int expenses) {
        this.expenses = expenses;
        System.out.println(String.format("%s:%s", apply, getExpenses()));
    }

    public int getExpenses() {
        return expenses;
    }

    public String getApply() {
        return String.format("申请费用:%s", getExpenses());
    }
}
