package com.ssh.bean;

/**
 * 
* @Description: 菜单按钮基类
* @author: 熊超
* @date: 2018年6月6日 下午6:54:13
 */
public class Button {
	private String name;//所有一级菜单、二级菜单都共有一个相同的属性，那就是name

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
