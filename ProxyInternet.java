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
public class ProxyInternet implements Connection{
    private String sender;
    private  String recevier;
    private Internet internet;

    public ProxyInternet(String sender, String recevier) {
        this.sender = sender;
        this.recevier = recevier;
    }

    @Override
    public void CreateConnection() {
        if(internet == null){
            internet = new Internet(sender, recevier);
        }
        internet.CreateConnection();
    }
    
    
    
}
