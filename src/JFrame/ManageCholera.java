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
public class ManageCholera extends javax.swing.JFrame {

    /**
     * Creates new form ManageCholera
     * 
     */
    
    //Variables
    String Full_name,Gender,District,Region,Status;
    int patient_id;
    DefaultTableModel model;
    public ManageCholera() {
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
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Backbutton = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Patient_ID = new app.bolivia.swing.JCTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        DeletePatientButton = new rojerusan.RSMaterialButtonCircle();
        AddPantientButton = new rojerusan.RSMaterialButtonCircle();
        UpdateButton = new rojerusan.RSMaterialButtonCircle();
        Gender_txt = new javax.swing.JComboBox<>();
        District_txt = new javax.swing.JComboBox<>();
        Region_txt = new javax.swing.JComboBox<>();
        Status_txt = new javax.swing.JComboBox<>();
        Enter_Patient_Name = new app.bolivia.swing.JCTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Cholera_details = new rojeru_san.complementos.RSTableMetro();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Backbutton.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        Backbutton.setForeground(new java.awt.Color(255, 255, 255));
        Backbutton.setText("Back");
        Backbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackbuttonMouseClicked(evt);
            }
        });
        jPanel2.add(Backbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Username");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("District");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 90, -1));

        Patient_ID.setBackground(new java.awt.Color(51, 51, 255));
        Patient_ID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        Patient_ID.setPlaceholder("Enter Patient ID");
        Patient_ID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Patient_IDFocusLost(evt);
            }
        });
        Patient_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Patient_IDActionPerformed(evt);
            }
        });
        jPanel1.add(Patient_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 350, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Patient ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 110, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Status");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, 90, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Gender");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 90, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Region");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 90, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Enter Cholera Pantient Details");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 290, 40));

        DeletePatientButton.setBackground(new java.awt.Color(255, 102, 102));
        DeletePatientButton.setText("Delete");
        DeletePatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletePatientButtonActionPerformed(evt);
            }
        });
        jPanel1.add(DeletePatientButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 620, 120, 50));

        AddPantientButton.setBackground(new java.awt.Color(255, 102, 102));
        AddPantientButton.setText("Add");
        AddPantientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddPantientButtonActionPerformed(evt);
            }
        });
        jPanel1.add(AddPantientButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 620, 120, 50));

        UpdateButton.setBackground(new java.awt.Color(255, 102, 102));
        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });
        jPanel1.add(UpdateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 620, 130, 50));

        Gender_txt.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        Gender_txt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jPanel1.add(Gender_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 350, 30));

        District_txt.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        District_txt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Balaka", "Blantyre", "Chikwawa", "Chiladzulu", "Chitipa", "Dedza", "Dowa", "Karonga", "Likoma", "Lilongwe", "Machinga", "Mangochi", "Mchinji", "Mulanje", "Mwadza", "Mzimba", "Neno", "Nkhata-bay", "Nkhotakota", "Nsanje", "Ntcheu", "Ntchisi", "Phalombe", "Rumphi", "Salima", "Thyolo", "Zomba", " " }));
        District_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                District_txtActionPerformed(evt);
            }
        });
        jPanel1.add(District_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 350, 30));

        Region_txt.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        Region_txt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "North Region", "Central Region", "Southern Region" }));
        Region_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Region_txtActionPerformed(evt);
            }
        });
        jPanel1.add(Region_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, 350, 30));

        Status_txt.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        Status_txt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Death", "Admitted" }));
        jPanel1.add(Status_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 560, 350, 30));

        Enter_Patient_Name.setBackground(new java.awt.Color(51, 51, 255));
        Enter_Patient_Name.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        Enter_Patient_Name.setPlaceholder("Enter Full Name");
        Enter_Patient_Name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Enter_Patient_NameFocusLost(evt);
            }
        });
        Enter_Patient_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Enter_Patient_NameActionPerformed(evt);
            }
        });
        jPanel1.add(Enter_Patient_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 350, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Enter Name");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 110, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("x");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 70, 20, -1));

        jPanel3.setBackground(new java.awt.Color(102, 102, 255));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("X");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 23, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 60, 30));

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

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 850, 590));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 255));
        jLabel8.setText("Manage Cholera Patients ");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 390, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1359, 724));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackbuttonMouseClicked
       HomePage homepage = new HomePage();
       homepage.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_BackbuttonMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
          System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void Patient_IDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Patient_IDFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_Patient_IDFocusLost

    private void Patient_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Patient_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Patient_IDActionPerformed

    private void AddPantientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddPantientButtonActionPerformed
        if(addPatient() == true){
            JOptionPane.showMessageDialog(this,"Patient added successfully");
            clearTable();
            setPantientDetails();
            
        }else{
            JOptionPane.showMessageDialog(this,"Patient Addition Failed");
        }
    }//GEN-LAST:event_AddPantientButtonActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel9MouseClicked
    
    //add cholera patient
    public boolean addPatient(){
        boolean isAdded = false;
        patient_id = Integer.parseInt(Patient_ID.getText());
        Full_name = Enter_Patient_Name.getText();
        Gender = Gender_txt.getSelectedItem().toString();
        District = District_txt.getSelectedItem().toString();
        Region = Region_txt.getSelectedItem().toString();
        Status = Status_txt.getSelectedItem().toString();
        
        try{
        Connection conn = DBConnection.getConnection();
        String insertSt = "insert into cholera_patient values(?,?,?,?,?,?)";
        
        PreparedStatement pst = conn.prepareStatement(insertSt);
        pst.setInt(1, patient_id);
        pst.setString(2,Full_name);
        pst.setString(3,Gender);
        pst.setString(4,District);
        pst.setString(5,Region);
        pst.setString(6, Status);
        
        int rowCount = pst.executeUpdate();
        if(rowCount > 0){
            isAdded = true;
        }else{
            isAdded = false;
        }
        
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return isAdded;
        
   
    }
    // the function is for patient update
    public boolean upDatePantient(){
        boolean isUpdated = false;
        patient_id = Integer.parseInt(Patient_ID.getText());
        Full_name = Enter_Patient_Name.getText();
        Gender = Gender_txt.getSelectedItem().toString();
        District = District_txt.getSelectedItem().toString();
        Region = Region_txt.getSelectedItem().toString();
        Status = Status_txt.getSelectedItem().toString();
        
        try{
            Connection con = DBConnection.getConnection();
            String updateSt = "update cholera_patient set Full_name = ?, Gender = ?, District = ?, Region = ?, Status = ? where patient_id = ?";
            PreparedStatement pst = con.prepareStatement(updateSt);
            
            pst.setString(1,Full_name);
            pst.setString(2, Gender);
            pst.setString(3,District);
            pst.setString(4,Region);
            pst.setString(5,Status);
            pst.setInt(6, patient_id);
            
            
            int rowCount = pst.executeUpdate();
            if(rowCount > 0){
                isUpdated = true;
            }else{
                isUpdated = false;
            }
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return isUpdated;
    }
    
    //deleting a book
    
    public boolean deletePatient(){
        boolean isDeleted = false;
        Full_name = String.format(Patient_ID.getText());
        
        try{
            Connection con = DBConnection.getConnection();
            String sql = "delete from cholera_patient where patient_id = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, Full_name);
            
            
            int rowCount = st.executeUpdate();
            if(rowCount > 0){
                isDeleted = true;
            }else{
                isDeleted = false;
            }
            
        }catch(Exception e){
            e.printStackTrace();
            
        }
        return isDeleted;
    }
    
    
    public void clearTable(){
        DefaultTableModel model = (DefaultTableModel) Cholera_details.getModel();
        model.setRowCount(0);
        
        
    }
    

    
    private void Cholera_detailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cholera_detailsMouseClicked
        int rowNo = Cholera_details.getSelectedRow();
        TableModel model = Cholera_details.getModel();
        
        
        Patient_ID.setText(model.getValueAt(rowNo,0).toString());
        Enter_Patient_Name.setText(model.getValueAt(rowNo, 1).toString());
        Gender_txt.setSelectedItem(model.getValueAt(rowNo,2).toString());
        District_txt.setSelectedItem(model.getValueAt(rowNo, 3).toString());
        Region_txt.setSelectedItem(model.getValueAt(rowNo, 4).toString());
        Status_txt.setSelectedItem(model.getValueAt(rowNo, 5).toString());
        
        

        
         
        
    }//GEN-LAST:event_Cholera_detailsMouseClicked

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        if(upDatePantient() == true){
            JOptionPane.showMessageDialog(this,"Patient Updated successfully");
            clearTable();
            setPantientDetails();
        }else{
            JOptionPane.showMessageDialog(this, "Patient Updation failed");
        }
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void DeletePatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletePatientButtonActionPerformed
        if(deletePatient() == true){
            JOptionPane.showMessageDialog(this,"Patient deleted successfully");
            clearTable();
            setPantientDetails();
        }else{
            JOptionPane.showMessageDialog(this,"Patient deletion failed");
        }
    }//GEN-LAST:event_DeletePatientButtonActionPerformed

    private void District_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_District_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_District_txtActionPerformed

    private void Region_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Region_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Region_txtActionPerformed

    private void Enter_Patient_NameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Enter_Patient_NameFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_Enter_Patient_NameFocusLost

    private void Enter_Patient_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Enter_Patient_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Enter_Patient_NameActionPerformed

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
            java.util.logging.Logger.getLogger(ManageCholera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageCholera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageCholera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageCholera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageCholera().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonCircle AddPantientButton;
    private javax.swing.JLabel Backbutton;
    private rojeru_san.complementos.RSTableMetro Cholera_details;
    private rojerusan.RSMaterialButtonCircle DeletePatientButton;
    private javax.swing.JComboBox<String> District_txt;
    private app.bolivia.swing.JCTextField Enter_Patient_Name;
    private javax.swing.JComboBox<String> Gender_txt;
    private app.bolivia.swing.JCTextField Patient_ID;
    private javax.swing.JComboBox<String> Region_txt;
    private javax.swing.JComboBox<String> Status_txt;
    private rojerusan.RSMaterialButtonCircle UpdateButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}