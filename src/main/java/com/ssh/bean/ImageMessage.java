package com.ssh.bean;

/**
 * 
* @Description: 图片消息
* @author: 熊超
* @date: 2018年6月7日 上午10:54:22
 */
public class ImageMessage extends BaseMessage {
	// 图片链接  
    private String PicUrl;  
  
    public String getPicUrl() {  
        return PicUrl;  
    }  
  
    public void setPicUrl(String picUrl) {  
        PicUrl = picUrl;  
    }  
}
