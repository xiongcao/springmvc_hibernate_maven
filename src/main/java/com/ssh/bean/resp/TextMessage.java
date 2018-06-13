package com.ssh.bean.resp;

/**
 * 
* @Description: 响应消息之文本型消息
* @author: 熊超
* @date: 2018年6月7日 上午10:59:54
 */
public class TextMessage extends BaseMessage{
	// 回复的消息内容  
    private String Content;  
  
    public String getContent() {  
        return Content;  
    }  
  
    public void setContent(String content) {  
        Content = content;  
    }  
}
