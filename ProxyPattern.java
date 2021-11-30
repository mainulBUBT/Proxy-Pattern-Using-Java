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
public class ProxyPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection net = new ProxyInternet("10.16.100.244", "10.16.100.245");
        System.out.println("New Connection:");
        net.CreateConnection();
        System.out.println("");
        
        System.out.println("Already Connected:");
        net.CreateConnection();
    }
    
}
