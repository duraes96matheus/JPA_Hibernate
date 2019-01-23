package view;

import javax.swing.JFrame;

import controller.ClienteJpaDAO;
import model.Cliente;

public class App
{
    public static void main( String[] args )
    {
    	 Cliente cliente1 = new Cliente();
         cliente1.setCpf("372.468.423-53");
         cliente1.setId(1);
         cliente1.setNome("matheus");
         cliente1.setRg("52.563.456-2");
         ClienteJpaDAO.getInstance().merge(cliente1);
         System.out.println("Objetos salvo com sucesso!!!");  
         
    
         
         
    }
    
}