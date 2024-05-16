/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DucThang
 */
public class CASIO {
    double a,b;
    public CASIO(double a, double b) {
        this.a = a;
        this.b = b;
    }
    

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
    double add(){
        return a+b;
    }
    double minus(){
        return a-b;
    }
    double nhan(){
        return a*b;
    }
    double chia(){
        return a/b;
    }
}
