package com.tungnui.mychatbot

/**
 * Created by thanh on 21/09/2017.
 */
class ChatMessage(){
    var msgText:String=""
    var msgUser:String=""
    constructor(msgText:String, msgUser:String) : this() {
        this.msgText = msgText;
        this.msgUser=msgUser;
    }
}