/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto.de.venta.acciones;

import static punto.de.venta.gestionbd.ServiceBebidas.*;
import static punto.de.venta.gestionbd.ServiceCafes.*;
import static punto.de.venta.gestionbd.ServiceComplimentos.*;
import static punto.de.venta.gestionbd.ServiceEntrantes.*;
import static punto.de.venta.gestionbd.ServiceHamburguesas.*;
import static punto.de.venta.gestionbd.ServicePostres.*;
import punto.de.venta.pantallas.PanelConfigBotones;

/**
 *
 * @author Usuario1
 */
public class AccionesConfigBotones{
    
    private PanelConfigBotones panel;
    

    

    public AccionesConfigBotones(PanelConfigBotones panel) {
        this.panel = panel;
    }
    
    public void muestraSentencias(){
        
        //Complimentos
        panel.getTxtSentencia().setText(SQLBotonPatatasAsadas);
        panel.getTxtSentencia1().setText(SQLBotonPatatasFritas );
        panel.getTxtSentencia2().setText(SQLBotonArosDeCebolla);
        panel.getTxtSentencia3().setText("");
        panel.getTxtSentencia4().setText("");
        panel.getTxtSentencia5().setText("");       
        
        //Bebidas
        panel.getTxtSentencia6().setText(SQLBotonAgua);
        panel.getTxtSentencia7().setText(SQLBotonZumos);
        panel.getTxtSentencia8().setText(SQLBotonCervezas);
        panel.getTxtSentencia9().setText(SQLBotonCervezasSin);
        panel.getTxtSentencia10().setText(SQLBotonRefrescos);
        panel.getTxtSentencia11().setText(SQLBotonCubatas);
        
        //Entrantes
        panel.getTxtSentencia12().setText(SQLBotonEnsaladaCesar);
        panel.getTxtSentencia13().setText(SQLBotonEnsaladaMediterranea);
        panel.getTxtSentencia14().setText(SQLBotonEnsaladillaRusa);
        panel.getTxtSentencia15().setText(SQLBotonMontaditos);
        panel.getTxtSentencia16().setText(SQLBotonNachos);
        panel.getTxtSentencia17().setText("");
        
        //Postres
        panel.getTxtSentencia18().setText(SQLBotonTartaChocolate);
        panel.getTxtSentencia19().setText(SQLBotonTartaArandanos);
        panel.getTxtSentencia20().setText(SQLBotonMacedonia);
        panel.getTxtSentencia21().setText(SQLBotonHeladoChocolate);        
        panel.getTxtSentencia22().setText(SQLBotonHeladoFresas);
        panel.getTxtSentencia23().setText(SQLBotonCremaCatalana);
        
        //Hamburguesas
        panel.getTxtSentencia24().setText(SQLBotonHamburguesaNormal);
        panel.getTxtSentencia25().setText(SQLBotonHamburguesaDoble);
        panel.getTxtSentencia26().setText(SQLBotonHamburguesaPollo);
        panel.getTxtSentencia27().setText(SQLBotonHamburguesaDoblePollo);        
        panel.getTxtSentencia28().setText(SQLBotonHamburguesaTernera);
        panel.getTxtSentencia29().setText(SQLBotonHamburguesaTernera200g);
        
        //Cafes
        panel.getTxtSentencia30().setText(SQLBotonCafeSolo);
        panel.getTxtSentencia31().setText(SQLBotonCafeCortado);        
        panel.getTxtSentencia32().setText(SQLBotonTe);
        panel.getTxtSentencia33().setText(SQLBotonManzanilla);        
        panel.getTxtSentencia34().setText(SQLBotonCarajillos);
        panel.getTxtSentencia35().setText(SQLBotonCafeConLeche);
        
        
    }
    public void guardaCambios(){      
                
        String patatasasadas=panel.getTxtSentencia().getText();
        //String cambiar=SQLBotonPatatasAsadas;
        
        String resultado=SQLBotonPatatasAsadas.replaceAll(SQLBotonPatatasAsadas,patatasasadas);
        
        //boolean matches = SQLBotonPatatasAsadas.matches(resultado);
        //if(matches == false){
            
            SQLBotonPatatasAsadas=resultado;
       // }
        
        System.out.print(resultado);
    }
    
}
