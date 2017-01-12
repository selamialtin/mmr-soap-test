/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soaptest;

import java.net.URL;

/**
 *
 * @author Selami
 */
public class WsTest {

    /**
     *
     * @return response
     */
    public static String testOpenMeter() {
        String result = "0";
        try {
            WorkOrderServiceService wsapi = new WorkOrderServiceService(new URL("http://localhost:7001/manas-mmr-server/services/WorkOrderService"));
            WorkOrderService ws = wsapi.getWorkOrderService();
            /**
             * girilen seri no ve issue li sayaca vana aç işemri olusuturur
             * @param username  ws kullanici adi
             * @param password ws kullanici sifre
             * @param serialNumber sayacin seri numarasi
             * @param issue  sayacin issuesi (Demo sayacinin issues "DS" fakat ISKI test icin yeni gelecek sayaclarin issuesi "IS" olacak)
             *
             *
             * @return fonksiyondan olusan isemri id doner
             * @return > 0 ise basarili bir sekilde isemri olsturuldu
             * @return 0 MeterNotFoundException
             * @return -1 InvalidLoginCredentialsException
             * @return -2 UnauthorizedMeterIssue
             * @return -3 InsufficientPrivilegesException
             * @return -4 UnknownExceIption
             *
             */
            result = ws.openValveBySerialNumber("iski", "6fc6f54d8ef2b54d886878f4c6832798", "20505896", "DS");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    /**
     *
     * @return response
     */
    public static String testCloseMeter() {
        String result = "0";
        try {
            WorkOrderServiceService wsapi = new WorkOrderServiceService(new URL("http://localhost:7001/manas-mmr-server/services/WorkOrderService"));
            WorkOrderService ws = wsapi.getWorkOrderService();
            /**
             * girilen seri no ve issue li sayaca vana kapat işemri olusuturur
             * @param username  ws kullanici adi
             * @param password ws kullanici sifre
             * @param serialNumber sayacin seri numarasi
             * @param issue  sayacin issuesi (Demo sayacinin issues "DS" fakat ISKI test icin yeni gelecek sayaclarin issuesi "IS" olacak)
             *
             *
             * @return fonksiyondan olusan isemri id doner
             * @return > 0 ise basarili bir sekilde isemri olsturuldu
             * @return 0 MeterNotFoundException
             * @return -1 InvalidLoginCredentialsException
             * @return -2 UnauthorizedMeterIssue
             * @return -3 InsufficientPrivilegesException
             * @return -4 UnknownExceIption
             *
             */
            result = ws.closeValveBySerialNumber("iski", "6fc6f54d8ef2b54d886878f4c6832798", "20505896", "DS");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
    
     /**
     *
     * @return response
     */
    public static String testLoadCredit() {
        String result = "0";
        try {
            WorkOrderServiceService wsapi = new WorkOrderServiceService(new URL("http://localhost:7001/manas-mmr-server/services/WorkOrderService"));
            WorkOrderService ws = wsapi.getWorkOrderService();
            /**
             * girilen seri no ve issue li sayaca vana kapat işemri olusuturur
             * 
             * @param username  ws kullanici adi
             * @param password ws kullanici sifre
             * @param serialNumber sayacin seri numarasi
             * @param issue  sayacin issuesi (Demo sayacinin issues "DS" fakat ISKI test icin yeni gelecek sayaclarin issuesi "IS" olacak)
             * @param credit yuklenecek kredi string olarak decimal seperator "." bin ayraci yok orn 1500.250
             *
             *
             * @return fonksiyondan olusan isemri id doner
             * @return > 0 ise basarili bir sekilde isemri olsturuldu
             * @return 0 MeterNotFoundException
             * @return -1 InvalidLoginCredentialsException
             * @return -2 UnauthorizedMeterIssue
             * @return -3 InsufficientPrivilegesException
             * @return -4 UnknownExceIption
             *
             */
            result = ws.loadCreditBySerialNumber("iski", "6fc6f54d8ef2b54d886878f4c6832798", "20505896", "DS", "10.15");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }   
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Vana ac isemri id: " + testOpenMeter());
        System.out.println("Vana kapat isemri id: " + testCloseMeter());
        System.out.println("Kredi yükle isemri id: " + testLoadCredit());
    }

}
