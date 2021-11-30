/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxypattern;

/**
 *
 * @author MIHAN
 */
public class Internet implements Connection{

    private String sender;
    private  String receiver;

    public Internet(String sender, String receiver) {
        this.sender = sender;
        this.receiver = receiver;
        connectingWithReceiver(sender,receiver);
    }
    
    
    
    @Override
    public void CreateConnection() {
        System.out.println("connected with "+ receiver);
    }

    private void connectingWithReceiver(String sender,String recevier) {
        System.out.println("connecting "+ sender + " to "+ receiver);
    }
    
}
