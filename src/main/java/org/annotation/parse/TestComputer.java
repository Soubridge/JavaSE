package org.annotation.parse;

@Computer(value = "戴尔G3", price = 5123.0D, factories = {"华东","华南"})
@Phone("华为手机")
public class TestComputer {
    @Computer(value = "戴尔G7", price = 6123.0D, factories = {"华东","华北"})
    public String name;

    @Computer(value = "神州", price = 7123.0D, factories = {"华北","华南"})
    public TestComputer(){}

    @Computer(value = "飞行堡垒", price = 5123.0D, factories = {"华南"})
    public void print(){}
}
