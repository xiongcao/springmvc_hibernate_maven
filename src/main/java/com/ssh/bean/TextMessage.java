package com.ssh.bean;

/**
 * 
* @Description: 文本消息 
* @author: 熊超
* @date: 2018年6月7日 上午10:53:42
 */
public class TextMessage extends BaseMessage{
	// 消息内容  
    private String Content;  
  
    public String getContent() {  
        return Content;  
    }  
  
    public void setContent(String content) {  
        Content = content;  
    }  
}
