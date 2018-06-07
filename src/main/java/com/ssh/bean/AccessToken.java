package com.ssh.bean;

/**
* @Description:  微信通用接口凭证
* @author: 熊超
* @date: 2018年6月6日 下午7:02:35
 */
public class AccessToken {
	// 获取到的凭证
    private String token;
    // 凭证有效时间，单位：秒
    private int expiresIn;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(int expiresIn) {
        this.expiresIn = expiresIn;
    }
}	
