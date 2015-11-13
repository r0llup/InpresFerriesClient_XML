/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * DemandeInformations.java
 *
 * Created on 04-oct.-2011, 11:44:21
 */

package inpresferriesclient_xml;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.util.Calendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JCheckBox;
import utils.PropertiesLauncher;

/**
 *
 * @author Sh1fT
 */

public final class DemandeInformations extends javax.swing.JFrame {
    protected DefaultListModel coursMonetairejListModel;
    protected DefaultListModel meteojListModel;
    protected DOMCreator creationDOM;
    protected PropertiesLauncher propertiesLauncher;

    /**
     * Creates new form DemandeInformations
     */
    public DemandeInformations() {
        this.initComponents();
        this.setCoursMonetairejListModel(new DefaultListModel());
        this.setMeteojListModel(new DefaultListModel());
        this.coursMonetairejList.setModel(this.getCoursMonetairejListModel());
        this.meteojList.setModel(this.getMeteojListModel());
        this.setCreationDOM(null);
        this.setPropertiesLauncher(new PropertiesLauncher(
            System.getProperty("file.separator") + "properties" +
            System.getProperty("file.separator") + "InpresFerriesClient_XML.properties"));
    }

    public DefaultListModel getCoursMonetairejListModel() {
        return this.coursMonetairejListModel;
    }

    protected void setCoursMonetairejListModel(DefaultListModel coursMonetairejListModel) {
        this.coursMonetairejListModel = coursMonetairejListModel;
    }

    public DefaultListModel getMeteojListModel() {
        return this.meteojListModel;
    }

    protected void setMeteojListModel(DefaultListModel meteojListModel) {
        this.meteojListModel = meteojListModel;
    }

    public DOMCreator getCreationDOM() {
        return this.creationDOM;
    }

    protected void setCreationDOM(DOMCreator creationDOM) {
        this.creationDOM = creationDOM;
    }

    public PropertiesLauncher getPropertiesLauncher() {
        return this.propertiesLauncher;
    }

    protected void setPropertiesLauncher(PropertiesLauncher propertiesLauncher) {
        this.propertiesLauncher = propertiesLauncher;
    }

    /**
     * Return the value of 'NomFerry'
     * @return 
     */
    public String getNomFerry() {
        return this.nomFerryTextField.getText();
    }

    /**
     * Return the value of 'NomVoyageur'
     * @return 
     */
    public String getNomVoyageur() {
        return this.nomVoyageurTextField.getText();
    }

    /**
     * Return the value of 'coursMonetaireCheckBox'
     * @return 
     */
    public Boolean getCoursMonetaireCheckBox() {
        return this.coursMonetaireCheckBox.isSelected();
    }

    /**
     * Return the value of 'meteoCheckBox'
     * @return 
     */
    public Boolean getMeteoCheckBox() {
        return this.meteoCheckBox.isSelected();
    }

    /**
     * Return the value of 'freetaxCheckBox'
     * @return 
     */
    public Boolean getFreetaxCheckBox() {
        return this.freetaxCheckBox.isSelected();
    }

    /**
     * Return the value of the user's choice (stuff)
     * @return 
     */
    public String getStuff(JCheckBox cb) {
        if (cb.isSelected())
            return "yes";
        return "no";
    }

    /**
     * Return the value of the user's choice (alcools)
     * @return 
     */
    public String getAlcools() {
        return this.getStuff(this.alcoolsCheckBox);
    }

    /**
     * Return the value of the user's choice (parfums)
     * @return 
     */
    public String getParfums() {
        return this.getStuff(this.parfumsCheckBox);
    }

    /**
     * Return the value of the user's choice (tabacs)
     * @return 
     */
    public String getTabacs() {
        return this.getStuff(this.tabacsCheckBox);
    }

    /**
     * Return the XML Input Filename
     * @return 
     */
    public String getInputXMLFilename() {
        return this.getPropertiesLauncher().getProperties().getProperty("inputXMLFn");
    }

    /**
     * Return the DTD Input Filename
     * @return 
     */
    public String getInputDTDFilename() {
        return this.getPropertiesLauncher().getProperties().getProperty("inputDTDFn");
    }

    /**
     * Return the Server Address
     * @return 
     */
    public String getServerAddress() {
        return this.getPropertiesLauncher().getProperties().getProperty("serverAddress");
    }

    /**
     * Return the Server Port
     * @return 
     */
    public Integer getServerPort() {
        return Integer.parseInt(this.getPropertiesLauncher().getProperties().getProperty("serverPort"));
    }

    /**
     * Return the Server URI
     * @return 
     */
    public String getServerURI() {
        return this.getPropertiesLauncher().getProperties().getProperty("serverURI");
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomFerryTextField = new javax.swing.JTextField();
        nomVoyageurTextField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        coursMonetaireCheckBox = new javax.swing.JCheckBox();
        coursMonetaireComboBox = new javax.swing.JComboBox();
        coursMonetaireAddButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        coursMonetairejList = new javax.swing.JList();
        coursMonetaireDelButton = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        validerButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        meteoCheckBox = new javax.swing.JCheckBox();
        meteoComboBox = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        meteojList = new javax.swing.JList();
        meteoAddButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        meteoDelButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        freetaxCheckBox = new javax.swing.JCheckBox();
        alcoolsCheckBox = new javax.swing.JCheckBox();
        parfumsCheckBox = new javax.swing.JCheckBox();
        tabacsCheckBox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Demande d'informations");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("")));

        jLabel1.setText("Nom du ferry :");

        jLabel2.setText("Nom du voyageur :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nomVoyageurTextField)
                    .addComponent(nomFerryTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE))
                .addContainerGap(218, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nomFerryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomVoyageurTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        coursMonetaireCheckBox.setText("Cours monétaire :");

        coursMonetaireComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "France", "Belgique", "Royaume-Uni", "Irlande"}));

        coursMonetaireAddButton.setText("Ajouter");
        coursMonetaireAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coursMonetaireAddButtonActionPerformed(evt);
            }
        });

        coursMonetairejList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(coursMonetairejList);

        coursMonetaireDelButton.setText("Retirer");
        coursMonetaireDelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coursMonetaireDelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(coursMonetaireCheckBox)
                .addGap(18, 18, 18)
                .addComponent(coursMonetaireComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(coursMonetaireAddButton)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(coursMonetaireDelButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                    .addComponent(coursMonetaireDelButton)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(coursMonetaireCheckBox)
                        .addComponent(coursMonetaireComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(coursMonetaireAddButton)))
                .addContainerGap())
        );

        validerButton.setText("Valider");
        validerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addComponent(validerButton)
                .addContainerGap(280, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(validerButton))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        meteoCheckBox.setText("Météo :");

        DefaultComboBoxModel meteoComboBoxModel = new DefaultComboBoxModel();
        for (int i=0 ; i < Calendar.getInstance().getActualMaximum(Calendar.DAY_OF_MONTH) ; i++)
        meteoComboBoxModel.addElement(i+1);
        meteoComboBox.setModel(meteoComboBoxModel);

        meteojList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(meteojList);

        meteoAddButton.setText("Ajouter");
        meteoAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meteoAddButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Jour");

        meteoDelButton.setText("Retirer");
        meteoDelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meteoDelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(meteoCheckBox)
                .addGap(18, 18, 18)
                .addComponent(meteoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(meteoAddButton)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(meteoDelButton)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(meteoDelButton)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(meteoAddButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(meteoCheckBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                        .addComponent(meteoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        freetaxCheckBox.setText("Free Tax :");

        alcoolsCheckBox.setText("Alcools");

        parfumsCheckBox.setText("Parfums");

        tabacsCheckBox.setText("Tabacs");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(freetaxCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alcoolsCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(parfumsCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabacsCheckBox)
                .addContainerGap(337, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(freetaxCheckBox)
                    .addComponent(alcoolsCheckBox)
                    .addComponent(parfumsCheckBox)
                    .addComponent(tabacsCheckBox)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void validerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validerButtonActionPerformed
        try {
            this.setCreationDOM(new DOMCreator(this.getInputXMLFilename(), this));
            Socket socket = new Socket(this.getServerAddress(), this.getServerPort());
            PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
            BufferedReader br = new BufferedReader(new FileReader(this.getInputXMLFilename()));
            String ligne = null;
            while ((ligne = br.readLine()) != null)
                pw.println(ligne);
            br.close();
            pw.close();
            socket.close();
            Desktop.getDesktop().browse(new URI(this.getServerURI()));
        } catch (UnknownHostException ex) {
            ex.printStackTrace(System.out);
            System.exit(1);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
            System.exit(1);
        } catch (URISyntaxException ex) {
            ex.printStackTrace(System.out);
            System.exit(1);
        }
    }//GEN-LAST:event_validerButtonActionPerformed

    private void coursMonetaireAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coursMonetaireAddButtonActionPerformed
        if (!this.getCoursMonetairejListModel().contains(this.coursMonetaireComboBox.getSelectedItem().toString()))
            this.getCoursMonetairejListModel().addElement(this.coursMonetaireComboBox.getSelectedItem().toString());
    }//GEN-LAST:event_coursMonetaireAddButtonActionPerformed

    private void meteoAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meteoAddButtonActionPerformed
        if (!this.getMeteojListModel().contains(this.meteoComboBox.getSelectedItem().toString()))
            this.getMeteojListModel().addElement(this.meteoComboBox.getSelectedItem().toString());
    }//GEN-LAST:event_meteoAddButtonActionPerformed

    private void coursMonetaireDelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coursMonetaireDelButtonActionPerformed
        if (this.coursMonetairejList.getSelectedValue() != null)
            this.getCoursMonetairejListModel().removeElement(this.coursMonetairejList.getSelectedValue().toString());
    }//GEN-LAST:event_coursMonetaireDelButtonActionPerformed

    private void meteoDelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meteoDelButtonActionPerformed
        if (this.meteojList.getSelectedValue() != null)
            this.getMeteojListModel().removeElement(this.meteojList.getSelectedValue().toString());
    }//GEN-LAST:event_meteoDelButtonActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DemandeInformations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DemandeInformations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DemandeInformations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DemandeInformations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                DemandeInformations dialog = new DemandeInformations();
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox alcoolsCheckBox;
    private javax.swing.JButton coursMonetaireAddButton;
    private javax.swing.JCheckBox coursMonetaireCheckBox;
    private javax.swing.JComboBox coursMonetaireComboBox;
    private javax.swing.JButton coursMonetaireDelButton;
    private javax.swing.JList coursMonetairejList;
    private javax.swing.JCheckBox freetaxCheckBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton meteoAddButton;
    private javax.swing.JCheckBox meteoCheckBox;
    private javax.swing.JComboBox meteoComboBox;
    private javax.swing.JButton meteoDelButton;
    private javax.swing.JList meteojList;
    private javax.swing.JTextField nomFerryTextField;
    private javax.swing.JTextField nomVoyageurTextField;
    private javax.swing.JCheckBox parfumsCheckBox;
    private javax.swing.JCheckBox tabacsCheckBox;
    private javax.swing.JButton validerButton;
    // End of variables declaration//GEN-END:variables

}