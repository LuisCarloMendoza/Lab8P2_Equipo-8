/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lab8p2_equipo.pkg8;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luiscarlomendoza
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        
        adminUniversos ap = new adminUniversos("./Universos.cbm");
        ap.cargarArchivo();
        universos = ap.getUniversos();
        
        for (int i = 0; i < universos.size(); i++) {
            cb_universos.addItem(universos.get(i));
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_addSerVivo = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jt_nombre = new javax.swing.JTextField();
        jt_ID = new javax.swing.JTextField();
        jt_anios = new javax.swing.JTextField();
        jt_raza = new javax.swing.JTextField();
        jt_poder = new javax.swing.JTextField();
        jt_universo = new javax.swing.JTextField();
        cb_universoAddSer = new javax.swing.JComboBox<>();
        jb_guardarSerVivo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jd_modSerVivo = new javax.swing.JDialog();
        cb_universoMod = new javax.swing.JComboBox<>();
        cb_serMod = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jt_nombreMod = new javax.swing.JTextField();
        jt_IDmod = new javax.swing.JTextField();
        jt_poderMod = new javax.swing.JTextField();
        jt_aniosMod = new javax.swing.JTextField();
        jt_razaMod = new javax.swing.JTextField();
        jt_universoMod = new javax.swing.JTextField();
        jb_guardarMod = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jta_datosSerVivo = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jb_crearUniverso = new javax.swing.JButton();
        jb_agregarSerVivo = new javax.swing.JButton();
        jb_modificarUniverso = new javax.swing.JButton();
        jb_eliminarUniverso = new javax.swing.JButton();
        cb_universos = new javax.swing.JComboBox<>();
        jb_modificarSerVivo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabLab8 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        jd_addSerVivo.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Zapfino", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Años");
        jd_addSerVivo.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 70, -1));

        jLabel5.setFont(new java.awt.Font("Zapfino", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombre");
        jd_addSerVivo.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 70, -1));

        jLabel9.setFont(new java.awt.Font("Zapfino", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Poder");
        jd_addSerVivo.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 70, -1));

        jLabel8.setFont(new java.awt.Font("Zapfino", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Raza");
        jd_addSerVivo.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 70, -1));

        jLabel6.setFont(new java.awt.Font("Zapfino", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Universo");
        jd_addSerVivo.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, 70, -1));

        jLabel7.setFont(new java.awt.Font("Zapfino", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ID");
        jd_addSerVivo.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 70, -1));
        jd_addSerVivo.getContentPane().add(jt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 140, -1));
        jd_addSerVivo.getContentPane().add(jt_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 140, -1));
        jd_addSerVivo.getContentPane().add(jt_anios, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 140, -1));
        jd_addSerVivo.getContentPane().add(jt_raza, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 140, -1));
        jd_addSerVivo.getContentPane().add(jt_poder, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, 140, -1));
        jd_addSerVivo.getContentPane().add(jt_universo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 470, 140, -1));

        jd_addSerVivo.getContentPane().add(cb_universoAddSer, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 210, -1));

        jb_guardarSerVivo.setFont(new java.awt.Font("Zapfino", 1, 13)); // NOI18N
        jb_guardarSerVivo.setText("Guardar");
        jb_guardarSerVivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_guardarSerVivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_guardarSerVivoMouseClicked(evt);
            }
        });
        jd_addSerVivo.getContentPane().add(jb_guardarSerVivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 530, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab8p2_equipo/pkg8/Shinsengumi_group.png"))); // NOI18N
        jd_addSerVivo.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, -1, 650));

        jd_modSerVivo.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cb_universoMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_universoModActionPerformed(evt);
            }
        });
        jd_modSerVivo.getContentPane().add(cb_universoMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 47, 237, -1));

        cb_serMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_serModActionPerformed(evt);
            }
        });
        jd_modSerVivo.getContentPane().add(cb_serMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 90, 237, -1));

        jLabel10.setFont(new java.awt.Font("Zapfino", 0, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Nombre ");
        jd_modSerVivo.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 183, -1, -1));

        jLabel11.setFont(new java.awt.Font("Zapfino", 0, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("ID");
        jd_modSerVivo.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 240, -1, -1));

        jLabel12.setFont(new java.awt.Font("Zapfino", 0, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Años");
        jd_modSerVivo.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 354, 49, -1));

        jLabel13.setFont(new java.awt.Font("Zapfino", 0, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Poder");
        jd_modSerVivo.getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 303, 55, -1));

        jLabel14.setFont(new java.awt.Font("Zapfino", 0, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Raza");
        jd_modSerVivo.getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 405, 55, -1));

        jLabel15.setFont(new java.awt.Font("Zapfino", 0, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Universo");
        jd_modSerVivo.getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 456, 77, -1));
        jd_modSerVivo.getContentPane().add(jt_nombreMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 192, 142, -1));
        jd_modSerVivo.getContentPane().add(jt_IDmod, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 240, 142, -1));
        jd_modSerVivo.getContentPane().add(jt_poderMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 303, 142, -1));
        jd_modSerVivo.getContentPane().add(jt_aniosMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 363, 142, -1));
        jd_modSerVivo.getContentPane().add(jt_razaMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 414, 142, -1));
        jd_modSerVivo.getContentPane().add(jt_universoMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 465, 142, -1));

        jb_guardarMod.setFont(new java.awt.Font("Zapfino", 1, 13)); // NOI18N
        jb_guardarMod.setText("Guardar");
        jb_guardarMod.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_guardarMod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_guardarModMouseClicked(evt);
            }
        });
        jd_modSerVivo.getContentPane().add(jb_guardarMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(531, 515, -1, -1));

        jta_datosSerVivo.setColumns(20);
        jta_datosSerVivo.setRows(5);
        jScrollPane1.setViewportView(jta_datosSerVivo);

        jd_modSerVivo.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(669, 172, -1, 306));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab8p2_equipo/pkg8/Shinsengumi_group.png"))); // NOI18N
        jd_modSerVivo.getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel2.setText("Shinsengumi");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 290, 60));

        jb_crearUniverso.setFont(new java.awt.Font("Wawati SC", 0, 13)); // NOI18N
        jb_crearUniverso.setText("Crear Universo");
        jb_crearUniverso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_crearUniverso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_crearUniversoMouseClicked(evt);
            }
        });
        getContentPane().add(jb_crearUniverso, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, -1, -1));

        jb_agregarSerVivo.setFont(new java.awt.Font("Wawati TC", 0, 13)); // NOI18N
        jb_agregarSerVivo.setText("Agregar Ser Vivo");
        jb_agregarSerVivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_agregarSerVivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_agregarSerVivoMouseClicked(evt);
            }
        });
        getContentPane().add(jb_agregarSerVivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 140, -1, -1));

        jb_modificarUniverso.setFont(new java.awt.Font("Wawati TC", 0, 13)); // NOI18N
        jb_modificarUniverso.setText("Modificar Universo");
        jb_modificarUniverso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_modificarUniverso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_modificarUniversoMouseClicked(evt);
            }
        });
        getContentPane().add(jb_modificarUniverso, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, -1, -1));

        jb_eliminarUniverso.setFont(new java.awt.Font("Wawati TC", 0, 13)); // NOI18N
        jb_eliminarUniverso.setText("Eliminar Universo");
        jb_eliminarUniverso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_eliminarUniverso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_eliminarUniversoMouseClicked(evt);
            }
        });
        getContentPane().add(jb_eliminarUniverso, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, -1, -1));

        getContentPane().add(cb_universos, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 200, -1));

        jb_modificarSerVivo.setFont(new java.awt.Font("Wawati TC", 0, 13)); // NOI18N
        jb_modificarSerVivo.setText("Modificar Ser Vivo");
        jb_modificarSerVivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_modificarSerVivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_modificarSerVivoMouseClicked(evt);
            }
        });
        getContentPane().add(jb_modificarSerVivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 140, -1, -1));

        jButton1.setFont(new java.awt.Font("Wawati TC", 0, 13)); // NOI18N
        jButton1.setText("Cargar Datos");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 620, -1, -1));
        getContentPane().add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 430, -1, -1));

        tabLab8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tabLab8);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 610, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab8p2_equipo/pkg8/1200px-Flag_of_Shinsengumi.svg.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_crearUniversoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_crearUniversoMouseClicked
        // TODO add your handling code here:

        cb_universos.removeAllItems();

        String nombreUniverso = JOptionPane.showInputDialog(this, "Ingrese el nombre del Universo:");
        Universo universe = new Universo(nombreUniverso);
        universe.setId(NumeroRandom());

        universos.add(universe);

        for (int i = 0; i < universos.size(); i++) {
            cb_universos.addItem(universos.get(i));
        }
        
        adminUniversos ap = new adminUniversos("./Universos.cbm");
        ap.setUniversos(universos);
        ap.escribirArchivo();


    }//GEN-LAST:event_jb_crearUniversoMouseClicked

    private void jb_agregarSerVivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_agregarSerVivoMouseClicked
        // TODO add your handling code here:
        if (universos.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Aun no hay Universos");
        } else {
            cb_universoAddSer.removeAllItems();

            for (int i = 0; i < universos.size(); i++) {
                cb_universoAddSer.addItem(universos.get(i));
            }

            jd_addSerVivo.setModal(true);
            jd_addSerVivo.pack();
            jd_addSerVivo.setLocationRelativeTo(this);
            jd_addSerVivo.setVisible(true);
        }

    }//GEN-LAST:event_jb_agregarSerVivoMouseClicked

    private void jb_modificarUniversoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_modificarUniversoMouseClicked
        // TODO add your handling code here:
        cb_universos.removeAllItems();

        String nombreUniverso = JOptionPane.showInputDialog(this, "Ingrese el nombre del Universo:");

        for (int i = 0; i < universos.size(); i++) {
            if (universos.get(i).equals(cb_universos.getSelectedItem())) {
                universos.get(i).setNombre(nombreUniverso);
            }
        }

        for (int i = 0; i < universos.size(); i++) {
            cb_universoAddSer.addItem(universos.get(i));
        }
        
        adminUniversos ap = new adminUniversos("./Universos.cbm");
        ap.setUniversos(universos);
        ap.escribirArchivo();

    }//GEN-LAST:event_jb_modificarUniversoMouseClicked

    private void jb_guardarSerVivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_guardarSerVivoMouseClicked
        // TODO add your handling code here:
        String nombre = jt_nombre.getText();
        int ID = Integer.parseInt(jt_ID.getText());
        int poder = Integer.parseInt(jt_poder.getText());
        int anios = Integer.parseInt(jt_anios.getText());
        String raza = jt_raza.getText();
        String universoProcedencia = jt_universo.getText();

        SerVivo ser = new SerVivo(nombre, ID, poder, anios, raza, universoProcedencia);

        for (int i = 0; i < universos.size(); i++) {
            if (universos.get(i).equals(cb_universoAddSer.getSelectedItem())) {

                universos.get(i).getSeresVivos().add(ser);
                System.out.println(universos.get(i).getSeresVivos());
            }
        }

        JOptionPane.showMessageDialog(jd_addSerVivo, "Se Agrego con éxito");
        jt_nombre.setText("");
        jt_ID.setText("");
        jt_poder.setText("");
        jt_anios.setText("");
        jt_raza.setText("");
        jt_universo.setText("");
        
        adminUniversos ap = new adminUniversos("./Universos.cbm");
        ap.setUniversos(universos);
        ap.escribirArchivo();


    }//GEN-LAST:event_jb_guardarSerVivoMouseClicked

    private void jb_modificarSerVivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_modificarSerVivoMouseClicked
        // TODO add your handling code here:

        if (universos.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Aun no hay Universos");
        } else {
            cb_universoMod.removeAllItems();
            for (int i = 0; i < universos.size(); i++) {
                cb_universoMod.addItem(universos.get(i));
            }
            jd_modSerVivo.setModal(true);
            jd_modSerVivo.pack();
            jd_modSerVivo.setLocationRelativeTo(this);
            jd_modSerVivo.setVisible(true);
        }


    }//GEN-LAST:event_jb_modificarSerVivoMouseClicked

    private void jb_guardarModMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_guardarModMouseClicked
        // TODO add your handling code here:

        for (int i = 0; i < universos.size(); i++) {
            if (universos.get(i).equals(cb_universoMod.getSelectedItem())) {
                for (int j = 0; j < universos.get(i).getSeresVivos().size(); j++) {
                    if (universos.get(i).getSeresVivos().get(j).equals(cb_serMod.getSelectedItem())) {

                        if (jt_nombreMod.getText().equals("") == false) {
                            String nombre = jt_nombreMod.getText();
                            universos.get(i).getSeresVivos().get(j).setNombre(nombre);
                        }

                        if (jt_IDmod.getText().equals("") == false) {
                            int ID = Integer.parseInt(jt_IDmod.getText());
                            universos.get(i).getSeresVivos().get(j).setID(ID);
                        }

                        if (jt_poderMod.getText().equals("") == false) {
                            int poder = Integer.parseInt(jt_poderMod.getText());
                            universos.get(i).getSeresVivos().get(j).setPoder(poder);
                        }

                        if (jt_aniosMod.getText().equals("") == false) {
                            int anios = Integer.parseInt(jt_aniosMod.getText());
                            universos.get(i).getSeresVivos().get(j).setAnios(anios);
                        }

                        if (jt_razaMod.getText().equals("") == false) {
                            String raza = jt_razaMod.getText();
                            universos.get(i).getSeresVivos().get(j).setRaza(raza);
                        }

                        if (jt_universoMod.getText().equals("") == false) {
                            String universoProcedencia = jt_universoMod.getText();
                            universos.get(i).getSeresVivos().get(j).setUniversoProcedencia(universoProcedencia);
                        }
                    }
                }

            }

        }

        JOptionPane.showMessageDialog(jd_modSerVivo, "Se modifico con éxito");
        jt_nombreMod.setText("");
        jt_IDmod.setText("");
        jt_poderMod.setText("");
        jt_aniosMod.setText("");
        jt_razaMod.setText("");
        jt_universoMod.setText("");
        
        adminUniversos ap = new adminUniversos("./Universos.cbm");
        ap.setUniversos(universos);
        ap.escribirArchivo();


    }//GEN-LAST:event_jb_guardarModMouseClicked

    private void cb_universoModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_universoModActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < universos.size(); i++) {
            if (universos.get(i).equals(cb_universoMod.getSelectedItem())) {
                for (int j = 0; j < universos.get(i).getSeresVivos().size(); j++) {
                    cb_serMod.addItem(universos.get(i).getSeresVivos().get(j));
                }
            }
        }

    }//GEN-LAST:event_cb_universoModActionPerformed

    private void cb_serModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_serModActionPerformed
        // TODO add your handling code here:
        String sv = ((SerVivo) cb_serMod.getSelectedItem()).toString2();
        jta_datosSerVivo.setText(sv);

    }//GEN-LAST:event_cb_serModActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        tabla();

    }//GEN-LAST:event_jButton1MouseClicked

    private void jb_eliminarUniversoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_eliminarUniversoMouseClicked
        // TODO add your handling code here:
        int enteroRespuesta= JOptionPane.showConfirmDialog(this, "Está seguro que desea eliminar este Universo?");
        numeroFila= tabLab8.getSelectedRow();
        
        if(enteroRespuesta==0){
            universos.remove(numeroFila);
        }
        
        cb_universos.removeAllItems();
        
        for (int i = 0; i < universos.size(); i++) {
            cb_universos.addItem(universos.get(i));
        }
        
        adminUniversos ap = new adminUniversos("./Universos.cbm");
        ap.setUniversos(universos);
        ap.escribirArchivo();
        
        adminBarra barra = new adminBarra(jProgressBar1);
        Thread proceso = new Thread(barra);
        proceso.start();
       
        tabla();
        
    }//GEN-LAST:event_jb_eliminarUniversoMouseClicked

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
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<SerVivo> cb_serMod;
    private javax.swing.JComboBox<Universo> cb_universoAddSer;
    private javax.swing.JComboBox<Universo> cb_universoMod;
    private javax.swing.JComboBox<Universo> cb_universos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jb_agregarSerVivo;
    private javax.swing.JButton jb_crearUniverso;
    private javax.swing.JButton jb_eliminarUniverso;
    private javax.swing.JButton jb_guardarMod;
    private javax.swing.JButton jb_guardarSerVivo;
    private javax.swing.JButton jb_modificarSerVivo;
    private javax.swing.JButton jb_modificarUniverso;
    private javax.swing.JDialog jd_addSerVivo;
    private javax.swing.JDialog jd_modSerVivo;
    private javax.swing.JTextField jt_ID;
    private javax.swing.JTextField jt_IDmod;
    private javax.swing.JTextField jt_anios;
    private javax.swing.JTextField jt_aniosMod;
    private javax.swing.JTextField jt_nombre;
    private javax.swing.JTextField jt_nombreMod;
    private javax.swing.JTextField jt_poder;
    private javax.swing.JTextField jt_poderMod;
    private javax.swing.JTextField jt_raza;
    private javax.swing.JTextField jt_razaMod;
    private javax.swing.JTextField jt_universo;
    private javax.swing.JTextField jt_universoMod;
    private javax.swing.JTextArea jta_datosSerVivo;
    private javax.swing.JTable tabLab8;
    // End of variables declaration//GEN-END:variables

    private ArrayList<Universo> universos = new ArrayList();
    private int numeroFilaEliminar;
    private int numeroFila;

    public void tablaPuntosExtra() {

        DefaultTableModel tablaPersonajesUniversos = new DefaultTableModel();
        tablaPersonajesUniversos.addColumn("Nombre");
        tablaPersonajesUniversos.addColumn("ID");
        tablaPersonajesUniversos.addColumn("Poder");
        tablaPersonajesUniversos.addColumn("Años");
        tablaPersonajesUniversos.addColumn("Raza");
        tablaPersonajesUniversos.addColumn("Universo");

        for (int i = 0; i < universos.size(); i++) {
            for (int j = 0; j < universos.get(i).getSeresVivos().size(); j++) {
                tablaPersonajesUniversos.addRow(new Object[]{
                    universos.get(i).getSeresVivos().get(j).getNombre(),
                    universos.get(i).getSeresVivos().get(j).getID(),
                    universos.get(i).getSeresVivos().get(j).getPoder(),
                    universos.get(i).getSeresVivos().get(j).getAnios(),
                    universos.get(i).getSeresVivos().get(j).getRaza(),
                    universos.get(i).getSeresVivos().get(j).getUniversoProcedencia()
                });
            }
        }
//        tabLab8puntosextra.setModel(tablaPersonajesUniversos);
    }

    public void tabla() {

        DefaultTableModel tablaUniversos = new DefaultTableModel();
        tablaUniversos.addColumn("Nombre");
        tablaUniversos.addColumn("Seres");

        for (int i = 0; i < universos.size(); i++) {

            tablaUniversos.addRow(new Object[]{
                universos.get(i).getNombre(),
                universos.get(i).getSeresVivos().size()
            });

            dba db = new dba("./Shinsengumi.accdb");
            db.conectar();
            try {
                int id = NumeroRandom();
                int c;
                String n;
                c = universos.get(i).getSeresVivos().size();
                n = universos.get(i).getNombre();
                db.query.execute("INSERT INTO TablaUniversos"
                        + " (Nombre,Personajes)"
                        + " VALUES ('" + n + "', '" + c + "')");
                db.commit();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            db.desconectar();
        }
        tabLab8.setModel(tablaUniversos);

    }
    
    public int NumeroRandom() {
        int n = 0;

        Random random = new Random();
        int w = random.nextInt(10);
        int x = random.nextInt(50);
        int y = random.nextInt(100);
        int z = random.nextInt(1000);
        int z2 = random.nextInt(1000);
        int z3 = random.nextInt(100);

        n = w + x + y + z + z + z2 + z3;
        return n;
    }

}
