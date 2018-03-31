/*
 * Copyright (c) 2011-2025 PiChen.
 */

package cn.edu.hdu.tankbattle.resource;

import java.awt.Image;
import java.awt.Toolkit;

/**
 * TankGameImages...
 *
 * @author chenpi
 * @since 2011-02-10 19:29
 */
public class TankGameImages {
    /**
     * 我的坦克四个方向图像数组
     */
    public static Image myTankImg[] = {
            Toolkit.getDefaultToolkit().getImage(TankGameImages.class.getResource("/static/img/UTank_.gif")),
            Toolkit.getDefaultToolkit().getImage(TankGameImages.class.getResource("/static/img/DTank_.gif")),
            Toolkit.getDefaultToolkit().getImage(TankGameImages.class.getResource("/static/img/LTank_.gif")),
            Toolkit.getDefaultToolkit().getImage(TankGameImages.class.getResource("/static/img/RTank_.gif"))
    };
    /**
     * 敌人坦克四个方向图像数组
     */
    public static Image enemyTankImg[] = {
            Toolkit.getDefaultToolkit().getImage(TankGameImages.class.getResource("/static/img/UTank.gif")),
            Toolkit.getDefaultToolkit().getImage(TankGameImages.class.getResource("/static/img/DTank.gif")),
            Toolkit.getDefaultToolkit().getImage(TankGameImages.class.getResource("/static/img/LTank.gif")),
            Toolkit.getDefaultToolkit().getImage(TankGameImages.class.getResource("/static/img/RTank.gif"))};
    /**
     * 障碍物图像数组
     */
    public static Image stuffImg[] = {
            Toolkit.getDefaultToolkit().getImage(TankGameImages.class.getResource("/static/img/brick.gif")),
            Toolkit.getDefaultToolkit().getImage(TankGameImages.class.getResource("/static/img/iron.gif")),
            Toolkit.getDefaultToolkit().getImage(TankGameImages.class.getResource("/static/img/water.gif"))};
    /**
     * 游戏开始图像
     */
    public static Image startImage = Toolkit.getDefaultToolkit()
            .getImage(TankGameImages.class.getResource("/static/img/gameStart.png"));
    /**
     * 子弹图像
     */
    public static Image bullet = Toolkit.getDefaultToolkit()
            .getImage(TankGameImages.class.getResource("/static/img/bullet.gif"));
    /**
     * 爆炸图像
     */
    public static Image bomb[] = {
            Toolkit.getDefaultToolkit().getImage(TankGameImages.class.getResource("/static/img/bomb_1.png")),
            Toolkit.getDefaultToolkit().getImage(TankGameImages.class.getResource("/static/img/bomb_2.png")),
            Toolkit.getDefaultToolkit().getImage(TankGameImages.class.getResource("/static/img/bomb_3.png")),
            Toolkit.getDefaultToolkit().getImage(TankGameImages.class.getResource("/static/img/bomb_4.png")),
            Toolkit.getDefaultToolkit().getImage(TankGameImages.class.getResource("/static/img/bomb_5.png")),};
    /**
     * 游戏失败时图像
     */
    public static Image gameOver = Toolkit.getDefaultToolkit()
            .getImage(TankGameImages.class.getResource("/static/img/gameOver.gif"));
    /**
     * 胜利时的图像
     */
    public static Image gameWin = Toolkit.getDefaultToolkit()
            .getImage(TankGameImages.class.getResource("/static/img/gameWin.gif"));
    /**
     * 洋葱头 笑
     */
    public static Image yctSmile1 = Toolkit.getDefaultToolkit()
            .getImage(TankGameImages.class.getResource("/static/img/yct1.png"));
    public static Image yctSmile2 = Toolkit.getDefaultToolkit()
            .getImage(TankGameImages.class.getResource("/static/img/yct2.png"));
    public static Image font = Toolkit.getDefaultToolkit()
            .getImage(TankGameImages.class.getResource("/static/img/font.png"));
}