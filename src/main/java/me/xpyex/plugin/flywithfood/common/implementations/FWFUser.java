package me.xpyex.plugin.flywithfood.common.implementations;

public interface FWFUser extends FWFSender {

    boolean hasSaturationEff();  //玩家是否拥有饱和Buff

    void cost(double value);  //扣除点数

    void disableFly();  //关闭其飞行

    <Player> Player getPlayer();  //此处泛型均为玩家

    FWFInfo getInfo();  //获取基本信息

    Number getNow();  //玩家当前的点数[能量]

    boolean inNoCost();  //玩家所在世界是否不消耗点数[能量]

    boolean inNoFunction();  //玩家所在世界是否不启用插件

    boolean needCheck();  //玩家是否需要被检测

    void protectFromFall();  //保护玩家免受掉落伤害

    boolean canFly();  //玩家能不能飞行

    void enableFly();  //启用飞行
}
