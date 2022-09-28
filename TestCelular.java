package com.kaisercohen.celular;

/**
 *
 * @author Cesar Oliveira Cohen
 */

 public class TestCelular{
    public static void main(String[] args){
        Celular celularRodrigo = new Celular(2021, 2017,"Kaiser", "Moto E7 Power");
        Celular celularMatheus = new Celular(2018, 2015, "", "");
        
        //CelularRodrigo
        System.out.println("Informacoes Celular:\n\n____________________________________\n\n"
            +"Nome proprietario - " + celularRodrigo.getNomeProprietario()
            + "\nModelo - " + celularRodrigo.getModeloCelular()
            + "\nData de Fabricacao - " + celularRodrigo.getAnoFabricacao()
            + "\nData de Compra - " + celularRodrigo.getAnoCompra());

        //CelularMatheus
        celularMatheus.setInfoCelular(2020, 2014, "Matheus", "LG K10");
        celularMatheus.getInfoCelular();
        
        System.out.println("Tempo de Fabricação do Celular - " + celularMatheus.tempoDeFabricacao());
    }
}