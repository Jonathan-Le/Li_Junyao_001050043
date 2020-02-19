/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface_customer;

/**
 *
 * @author zhanghaojie
 */


import Business.Customer;
import Business.MapStore;
import java.util.Map;
import javax.swing.JPanel;


public class CustomerInfoJPanel extends javax.swing.JFrame {

    /**
     * Creates new form CustomerInfo
     */
 private JPanel XJpanel;
 private Map<Integer, Customer> customerMap;
    public CustomerInfoJPanel(JPanel funcJpanel, MapStore mapstore) {
        initComponents();
        this.XJpanel = XJpanel;
        this.customerMap = customerMap;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
