/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119051.latihan49.biayaemaskawin;

/**
 *
 * @author RYP
 */
class EmasKawin {
    private double berat, hargaPerGram;

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public void setHargaPerGram(double hargaPerGram) {
        this.hargaPerGram = hargaPerGram;
    }
    
    public double hitungTotalHarga() {
        return berat * hargaPerGram;
    }
}
