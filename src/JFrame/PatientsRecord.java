/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JFrame;

/**
 *
 * @author Joseph Mkonda
 */
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
public class PatientsRecord extends javax.swing.JFrame {

    /**
     * Creates new form ManageCholera
     * 
     */
    
    //Variables
    String Full_name,Gender,District,Region,Status;
    int patient_id;
    String Search_bar;
    DefaultTableModel model;
    public PatientsRecord() {
        initComponents();
        setPantientDetails();
    }

    public void setPantientDetails(){
        try{
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet result = st.executeQuery("select * from cholera_patient");
        
        while(result.next()){
            String PatientID = result.getString("patient_id");
            String Fullname = result.getString("Full_name");
            String Gender = result.getString("Gender");
            String District = result.getString("District");
            String Region = result.getString("Region");
            String Status = result.getString("Status");
            
            Object [] obj = {PatientID,Fullname,Gender,District,Region,Status};
            model = (DefaultTableModel)Cholera_details.getModel();
            model.addRow(obj);
            
            
        }
        
            
        }catch(Exception e){
            e.printStackTrace();
            
        }
        
    }
    
      public void clearTable(){
        DefaultTableModel model = (DefaultTableModel) Cholera_details.getModel();
        model.setRowCount(0);
        
        
    }
    
    public void search(){
        Search_bar = Search.getText();
        try{
            
        Connection conn = DBConnection.getConnection();
        String sqlSearch = "select * from cholera_patient where Full_name = ?";
        PreparedStatement pst = conn.prepareStatement(sqlSearch);
        
        pst.setString(1,Search_bar);
        
        ResultSet result = pst.executeQuery();
        
        
        if(result.next() == false){
            JOptionPane.showMessageDialog(this,"No Record Found");
        }else{
            
        while(result.next()){
            
            String PatientID = result.getString("patient_id");
            String Fullname = result.getString("Full_name");
            String Gender = result.getString("Gender");
            String District = result.getString("District");
            String Region = result.getString("Region");
            String Status = result.getString("Status");
            
            Object [] obj = {PatientID,Fullname,Gender,District,Region,Status};
            model = (DefaultTableModel)Cholera_details.getModel();
            model.addRow(obj);
            
        }
            
        }
        

            
        }catch(Exception e){
            e.printStackTrace();
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

        rSButtonIconDBeanInfo1 = new rojerusan.RSButtonIconDBeanInfo();
        rSButtonIconDBeanInfo2 = new rojerusan.RSButtonIconDBeanInfo();
        rSButtonMetroBeanInfo1 = new rojerusan.RSButtonMetroBeanInfo();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        BackButton = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Search = new app.bolivia.swing.JCTextField();
        All = new rojerusan.RSMaterialButtonCircle();
        SearchButton1 = new rojerusan.RSMaterialButtonCircle();
        jScrollPane1 = new javax.swing.JScrollPane();
        Cholera_details = new rojeru_san.complementos.RSTableMetro();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(51, 51, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackButton.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        BackButton.setForeground(new java.awt.Color(255, 255, 255));
        BackButton.setText("   << Back");
        BackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackButtonMouseClicked(evt);
            }
        });
        jPanel1.add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 30));

        jPanel5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 30));

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        close.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        close.setForeground(new java.awt.Color(255, 255, 255));
        close.setText("    X");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        jPanel2.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, 30));

        jPanel5.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 0, 60, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("                             Cholera Patient Records");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 650, 50));

        Search.setBackground(new java.awt.Color(255, 255, 255));
        Search.setMargin(new java.awt.Insets(0, 6, 3, 6));
        Search.setPlaceholder("Search.....");
        jPanel5.add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 390, 40));

        All.setBackground(new java.awt.Color(255, 51, 51));
        All.setText("all");
        All.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllActionPerformed(evt);
            }
        });
        jPanel5.add(All, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 120, 130, 40));

        SearchButton1.setBackground(new java.awt.Color(255, 51, 51));
        SearchButton1.setText("Search");
        SearchButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(SearchButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 120, 140, 40));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 210));

        Cholera_details.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient ID", "Name", "Gender", "District", "Region", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Cholera_details.setColorBackgoundHead(new java.awt.Color(102, 102, 225));
        Cholera_details.setColorBordeFilas(new java.awt.Color(102, 102, 225));
        Cholera_details.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        Cholera_details.setColorFilasForeground1(new java.awt.Color(51, 51, 255));
        Cholera_details.setColorFilasForeground2(new java.awt.Color(51, 51, 255));
        Cholera_details.setColorSelBackgound(new java.awt.Color(255, 51, 51));
        Cholera_details.setFont(new java.awt.Font("Yu Gothic Light", 0, 25)); // NOI18N
        Cholera_details.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cholera_detailsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Cholera_details);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 1360, 510));

        setSize(new java.awt.Dimension(1359, 724));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void BackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseClicked
        HomePage homepage = new HomePage();
        homepage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButtonMouseClicked

    private void Cholera_detailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cholera_detailsMouseClicked
       

    }//GEN-LAST:event_Cholera_detailsMouseClicked

   
   
   public boolean validateSearch(){
        Search_bar = Search.getText();
        
        if(Search_bar.equals("")){
            JOptionPane.showMessageDialog(this,"Enter name on searcg box");
            return false;
        }
        return true;
    }
    
    private void AllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllActionPerformed
    
         clearTable();
         setPantientDetails();
    }//GEN-LAST:event_AllActionPerformed

    private void SearchButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButton1ActionPerformed
         if(validateSearch() == true){
         
          
        clearTable();  
        search();   
     }
    }//GEN-LAST:event_SearchButton1ActionPerformed
  
    // the function is for patient update
  
    //deleting a book
    
   
    
    
 
    

    
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
            java.util.logging.Logger.getLogger(PatientsRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientsRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientsRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientsRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientsRecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonCircle All;
    private javax.swing.JLabel BackButton;
    private rojeru_san.complementos.RSTableMetro Cholera_details;
    private app.bolivia.swing.JCTextField Search;
    private rojerusan.RSMaterialButtonCircle SearchButton1;
    private javax.swing.JLabel close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private rojerusan.RSButtonIconDBeanInfo rSButtonIconDBeanInfo1;
    private rojerusan.RSButtonIconDBeanInfo rSButtonIconDBeanInfo2;
    private rojerusan.RSButtonMetroBeanInfo rSButtonMetroBeanInfo1;
    // End of variables declaration//GEN-END:variables
}
