package com.ssh.bean;

/**
* @Description: 子菜单项 :没有子菜单的菜单项，有可能是二级菜单项，也有可能是不含二级菜单的一级菜单。
* @author: 熊超
* @date: 2018年6月6日 下午7:00:00
 */
public class CommonButton extends Button {
	
	private String type;
    private String key;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

}
