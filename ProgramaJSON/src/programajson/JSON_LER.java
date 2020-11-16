/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programajson;

import com.sun.xml.internal.ws.client.ContentNegotiation;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Eduardo
 */
public class JSON_LER {
    public static void main(String[] args) {
        JSONObject objetoJson;
        JSONParser parser = new JSONParser();
        
        Funcionario funcionario = new Funcionario();
        
        try{
            objetoJson = (JSONObject) parser.parse(new FileReader("Funcionarios.json"));
            
            funcionario.setUsuario((String) objetoJson.get("usuario"));
            funcionario.setSenha((String) objetoJson.get("senha"));
            funcionario.setCargo((String) objetoJson.get("cargo"));
            funcionario.setSalario((Double) Double.parseDouble((String) objetoJson.get("salario")));
            funcionario.setContato((String) objetoJson.get("contato"));
            
            System.out.println("FUNCIONÁRIO RECUPERADO DO JSON = " + funcionario.toString());

        } catch (ParseException ex) {
            Logger.getLogger(JSON_LER.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JSON_LER.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JSON_LER.class.getName()).log(Level.SEVERE, null, ex);
        }
}
}
