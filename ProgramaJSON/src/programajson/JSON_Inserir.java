/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programajson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONObject;

/**
 *
 * @author Eduardo
 */
public class JSON_Inserir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileWriter writeFile = null;        
        JSONObject objetoJson = new JSONObject();
        
        objetoJson.put("usuario", "Jorge");
        objetoJson.put("senha", "abacaxi");
        objetoJson.put("cargo", "Administrador");
        objetoJson.put("salario", "1500");
        objetoJson.put("contato", "(47)3548-9854");
        
        try {
            writeFile = new FileWriter("Funcionarios.json");
            writeFile.write(objetoJson.toJSONString());
            writeFile.close();
        } catch (IOException ex) {
            Logger.getLogger(JSON_Inserir.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println(objetoJson.toJSONString());
    }
    
}
