/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guisert;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.util.*;
import javax.swing.*;


public class GUISert extends JFrame
{
    
    ArrayList <InfoSert> SS = new ArrayList ();
    
    
    public GUISert() 
    {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextnumSS = new javax.swing.JTextField();
        jLabelnumSS = new javax.swing.JLabel();
        jLabelnumPro = new javax.swing.JLabel();
        jTextnamePro = new javax.swing.JTextField();
        jLabeldateExp = new javax.swing.JLabel();
        jSpinnerdateExp = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextListSS = new javax.swing.JTextArea();
        jButtonSaveSS = new javax.swing.JButton();
        jButtondelSS = new javax.swing.JButton();
        jButtonRefreshSS = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextnumSS.setText("Введите номер");

        jLabelnumSS.setText("Номер сертификата соответствия");

        jLabelnumPro.setText("Наименование продукта ");

        jTextnamePro.setText("Введите наименование продукта");

        jLabeldateExp.setText("Дата окончания действия сертификата");

        jSpinnerdateExp.setModel(new javax.swing.SpinnerDateModel());

        jTextListSS.setColumns(20);
        jTextListSS.setRows(5);
        jScrollPane1.setViewportView(jTextListSS);

        jButtonSaveSS.setText("Сохранить");

        jButtondelSS.setText("Удалить");

        jButtonRefreshSS.setText("Обновить");
        jButtonRefreshSS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshSSActionPerformed(evt);
            }
        });

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelnumSS)
                        .addGap(26, 26, 26)
                        .addComponent(jLabelnumPro)
                        .addGap(52, 52, 52)
                        .addComponent(jLabeldateExp))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonSaveSS, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(112, 112, 112)
                                        .addComponent(jButtonRefreshSS))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextnumSS, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jTextnamePro, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jSpinnerdateExp, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jButtondelSS, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelnumSS)
                    .addComponent(jLabelnumPro)
                    .addComponent(jLabeldateExp))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextnumSS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextnamePro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerdateExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonSaveSS)
                                    .addComponent(jButtondelSS)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButtonRefreshSS)))
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
                    
public void jButtonSaveSSActionPerformed(ActionEvent evt) {                                              
     //   Scanner sc = new Scanner (System.in);
        String scNS = jTextnumSS.getText();
        String scNP = jTextnamePro.getText();
        Date dateExp = (Date) jSpinnerdateExp.getValue();
        SS.add(new InfoSert (scNS, scNP, dateExp)); 
}
    
    private void jButtonRefreshSSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshSSActionPerformed
//for (int i=0; i<= SS.size(); i++ )
for ( InfoSert s : SS)
{
StringBuilder sb = new StringBuilder ();
sb.append(s);
}
        
    }//GEN-LAST:event_jButtonRefreshSSActionPerformed

    public static void main(String args[]) 
    {
  
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUISert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUISert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUISert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUISert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
            EventQueue.invokeLater(new Runnable()
        {
        public void run ()
        {
        JFrame frame = new GUISert();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);} });       
   //jButtonSaveSS.addActionListener (new ActionListener() {
   // public void actionPerformed (ActionEvent event){ }
   // });
        
   //jButtonSaveSS.addActionListener (new ActionListener() {
   // public void actionPerformed (ActionEvent event){ }
   // });
        
        
        
        
   
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRefreshSS;
    javax.swing.JButton jButtonSaveSS;
    private javax.swing.JButton jButtondelSS;
    private javax.swing.JLabel jLabeldateExp;
    private javax.swing.JLabel jLabelnumPro;
    private javax.swing.JLabel jLabelnumSS;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JSpinner jSpinnerdateExp;
    private javax.swing.JTextArea jTextListSS;
    public static javax.swing.JTextField jTextnamePro;
    public static javax.swing.JTextField jTextnumSS;
    // End of variables declaration//GEN-END:variables

    

}
