/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import Clases.Summary;
import EstructurasDeDatos.HashTable;
import EstructurasDeDatos.Lista;
import EstructurasDeDatos.Nodo;
import javax.swing.JOptionPane;

/**
 *
 * @author fabriziospiotta
 */
public class InterfazAnalizarResumen extends javax.swing.JFrame {
    
    static HashTable summaryHashTable;
    static HashTable autoresHashTable;
    static HashTable palabrasClaveHashTable;
    
    /**
     * Creates new form InterfazAnalizarResumen
     */
    public InterfazAnalizarResumen(HashTable summaryHashTable, HashTable autoresHashTable, HashTable palabrasClaveHashTable) {
        this.summaryHashTable = summaryHashTable;
        this.autoresHashTable = autoresHashTable;
        this.palabrasClaveHashTable = palabrasClaveHashTable;
        initComponents();
    }
    
    public String imprimirResumen(Summary summary) {
        String cadena = "";
        cadena += summary.getTitulo() + "\n" + "\n";
        cadena += "Autores" + "\n";
        Nodo aux = summary.getAutores().getpFirst();
        for (int i = 0; i < summary.getAutores().getSize(); i++) {
           cadena += aux.getElemento() + "\n";
           aux = aux.getpNext();
        }
        cadena += "\n";
        cadena += "Resumen" + "\n";
        cadena += summary.getCuerpoResumen() + "\n" + "\n";
        cadena += "Palabras Claves: ";
        Nodo aux1 = summary.getKeyWords().getpFirst();
        for (int i = 0; i < summary.getKeyWords().getSize()- 1; i++) {
           cadena += aux1.getElemento() + ", ";
           aux1 = aux1.getpNext();
        }
        cadena += summary.getKeyWords().getpLast().getElemento() + ".";
        return cadena;
    }
    
    public Lista transformToAlphabeticList() {
        Lista newList = new Lista();
        for (int i = 0; i < this.summaryHashTable.getArrayHash().length; i++) {
            if (summaryHashTable.getArrayHash()[i] != null) {
                Lista listaAux = summaryHashTable.getArrayHash()[i];
                Nodo aux = listaAux.getpFirst();
                while (aux != null) {
                    newList.AppendOrdenadoStrings(aux.getElemento());
                    aux = aux.getpNext();
                }
            }
        }
        return newList;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        MenuButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        VisualizarTextArea = new javax.swing.JTextArea();
        VisualizarButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        SeleccionTextArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        SeleccionarInvButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        MostrarAnalisisTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, -1, -1));

        MenuButton.setText("VOLVER AL MENU");
        MenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuButtonActionPerformed(evt);
            }
        });
        getContentPane().add(MenuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 490, -1, -1));

        VisualizarTextArea.setEditable(false);
        VisualizarTextArea.setBackground(new java.awt.Color(255, 255, 255));
        VisualizarTextArea.setColumns(20);
        VisualizarTextArea.setForeground(new java.awt.Color(0, 0, 0));
        VisualizarTextArea.setRows(5);
        jScrollPane1.setViewportView(VisualizarTextArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 470, 410));

        VisualizarButton.setText("VISUALIZAR INVESTIGACIONES REALIZADAS");
        VisualizarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisualizarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(VisualizarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        SeleccionTextArea.setBackground(new java.awt.Color(255, 255, 255));
        SeleccionTextArea.setColumns(20);
        SeleccionTextArea.setForeground(new java.awt.Color(0, 0, 0));
        SeleccionTextArea.setRows(5);
        jScrollPane2.setViewportView(SeleccionTextArea);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 350, 50));

        jLabel1.setText("seleccionar. (Titulo completo como aparece en el registro)");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, -1, -1));

        jLabel2.setText("Escriba aqui, el nombre de la investigacion que desea");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, -1, -1));

        SeleccionarInvButton.setText("SELECCIONAR INVESTIGACION Y ANALIZAR");
        SeleccionarInvButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionarInvButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SeleccionarInvButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, -1, -1));

        MostrarAnalisisTextArea.setEditable(false);
        MostrarAnalisisTextArea.setBackground(new java.awt.Color(255, 255, 255));
        MostrarAnalisisTextArea.setColumns(20);
        MostrarAnalisisTextArea.setForeground(new java.awt.Color(0, 0, 0));
        MostrarAnalisisTextArea.setRows(5);
        jScrollPane3.setViewportView(MostrarAnalisisTextArea);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 350, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        InterfazMenu menu = new InterfazMenu(summaryHashTable, autoresHashTable, palabrasClaveHashTable);
        menu.setVisible(true);
    }//GEN-LAST:event_MenuButtonActionPerformed

    private void VisualizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisualizarButtonActionPerformed
        // TODO add your handling code here:
        Lista summaryList = transformToAlphabeticList();
            Nodo aux = summaryList.getpFirst();
            String cadena = "";
            for (int i = 1; i < summaryList.getSize() + 1; i++) {
                cadena += "INVESTIGACION #" + Integer.toString(i) +"--> " + "\n";
                cadena += imprimirResumen((Summary) aux.getElemento());
                cadena += "\n" + "\n" + "\n";
                aux = aux.getpNext();
            }
        if (cadena.equals("")) {
            JOptionPane.showMessageDialog(null, "No hay ninguna investigacion cargada en el sistema");
        } else {
            VisualizarTextArea.setLineWrap(true);
            VisualizarTextArea.setWrapStyleWord(true);
            VisualizarTextArea.setText(cadena);
        }
    }//GEN-LAST:event_VisualizarButtonActionPerformed

    private void SeleccionarInvButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionarInvButtonActionPerformed
        // TODO add your handling code here:
        if (SeleccionTextArea.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "El campo esta vacio, porfavor escriba el nombre de la investigación a seleccionar");
        } else {
            String cadenaForPrint = "";
            String Nombre = SeleccionTextArea.getText();
            if (!Nombre.contains(".")) {
                Nombre += ".";
            }
            Summary resumenEncontrado = (Summary) this.summaryHashTable.obtener(Nombre);
            if (resumenEncontrado == null) {
                JOptionPane.showMessageDialog(null, "La investigacion seleccionada no se ha encontrado en el registro. (Asegurese de haber colocado los acentos, en caso de que el titulo los tenga)");
            } else {
                String [] cuerpoResumenSeparado = resumenEncontrado.getCuerpoResumen().replaceAll("\\p{Punct}", "").split(" ");
                
                cadenaForPrint += resumenEncontrado.getTitulo() + "\n" + "\n";
                cadenaForPrint += "Autores: ";
                Nodo auxiliar = resumenEncontrado.getAutores().getpFirst();
                for (int i = 0; i < resumenEncontrado.getAutores().getSize() - 1; i++) {
                    cadenaForPrint += auxiliar.getElemento() + ", ";
                    auxiliar = auxiliar.getpNext();
                }
                cadenaForPrint += resumenEncontrado.getAutores().getpLast().getElemento() + "\n" + "\n";
                cadenaForPrint += "Palabras claves son sus respectivas cantidades de repeticion en la investigacion:" + "\n" + "\n";
                Nodo aux = resumenEncontrado.getKeyWords().getpFirst();
                for (int i = 0; i < resumenEncontrado.getKeyWords().getSize(); i++) {
                    int cont = 0;
                    for (int j = 0; j < cuerpoResumenSeparado.length; j++) {
                        String [] auxDesplazado = String.class.cast(aux.getElemento()).split(" ");
                        if (auxDesplazado.length == 1) {
                            if (cuerpoResumenSeparado[j].equalsIgnoreCase((String) aux.getElemento())) {
                                cont += 1;
                            }
                        } else {
                            int contadorCheckin = 0;
                            if (cuerpoResumenSeparado[j].equalsIgnoreCase(auxDesplazado[0])) {
                                contadorCheckin +=1;
                                for (int k = 1; k < auxDesplazado.length; k++) {
                                    if (cuerpoResumenSeparado[j + k].equalsIgnoreCase(auxDesplazado[k])) {
                                        contadorCheckin +=1;
                                    }
                                }
                            }
                            if (contadorCheckin == auxDesplazado.length) {
                                cont += 1;
                            }
                        }
                    }
                    cadenaForPrint += aux.getElemento() + " --> " + Integer.toString(cont);
                    cadenaForPrint += "\n";
                    aux = aux.getpNext();
                }
                MostrarAnalisisTextArea.setLineWrap(true);
                MostrarAnalisisTextArea.setWrapStyleWord(true);
                MostrarAnalisisTextArea.setText(cadenaForPrint);
            }
        }
    }//GEN-LAST:event_SeleccionarInvButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazAnalizarResumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazAnalizarResumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazAnalizarResumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazAnalizarResumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazAnalizarResumen(summaryHashTable, autoresHashTable, palabrasClaveHashTable).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MenuButton;
    private javax.swing.JTextArea MostrarAnalisisTextArea;
    private javax.swing.JTextArea SeleccionTextArea;
    private javax.swing.JButton SeleccionarInvButton;
    private javax.swing.JButton VisualizarButton;
    private javax.swing.JTextArea VisualizarTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
