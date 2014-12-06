/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.RFID;
import com.thingmagic.*;

/**
 *
 * @author Travis Gibbons
 */
public class RFID_UI extends javax.swing.JFrame {

    /**
     * Creates new form RFID_UI
     */
    public RFID_UI() {
        initComponents();
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
        ReservedField = new javax.swing.JTextField();
        EPCField = new javax.swing.JTextField();
        TIDField = new javax.swing.JTextField();
        UserField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        WriteButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        WriteField = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        COMButton = new javax.swing.JButton();
        BaudButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();
        COMField = new javax.swing.JTextField();
        BaudField = new javax.swing.JTextField();
        DisconnectButton = new javax.swing.JButton();
        ReadButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        EPCNumField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Memory Banks"));

        EPCField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EPCFieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Reserved");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("EPC");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("TID");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("User");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(EPCField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TIDField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UserField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ReservedField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ReservedField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EPCField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Write EPC"));

        WriteButton.setText("Write");
        WriteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WriteButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Enter the data you would like writen to the tag.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(WriteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(WriteField)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WriteButton)
                    .addComponent(WriteField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Settings"));

        COMButton.setText("Detect COM Port");
        COMButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                COMButtonActionPerformed(evt);
            }
        });

        BaudButton.setText("Set Baud Rate");
        BaudButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BaudButtonActionPerformed(evt);
            }
        });

        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        ClearButton.setText("Clear Fields");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        COMField.setText("Enter COM Number");

        DisconnectButton.setText("Disconnect");
        DisconnectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisconnectButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BaudButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(COMButton, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(COMField, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(BaudField))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DisconnectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(12, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(COMButton)
                    .addComponent(COMField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BaudButton)
                    .addComponent(BaudField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(ClearButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DisconnectButton))
                    .addComponent(ExitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        ReadButton.setText("Read");
        ReadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReadButtonActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("EPC Number"));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("EPC Num");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EPCNumField)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EPCNumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Detect COM Port Before Reading.");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("A successful detection will connect the reader.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ReadButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ReadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Declare private variables for COM Port a reader
    private static String COMPort = "tmr:///COM6";
    private static Reader r = null;
    
    //Name: getReader
    //Author: Travis Gibbons
    //Parameters: none
    //Purpose: return the reader in use to the program
    //Returns: connected reader of type Reader
    public static Reader getReader() 
    {
        return r;
    }
    
    //Name: setReader
    //Author: Travis Gibbons
    //Parameters: newreader -- the reader to be assigned globaly
    //Purpose: after a reader is identified, set it globally
    //Returns: none
    public void setReader(Reader newreader)
    {
        r = newreader;
    }
    
    //Name: getCOMPort
    //Author: Travis Gibbons
    //Parameters: none
    //Purpose: return the identified COMPort for use to the program
    //Returns: COM Port as a string
    public static String getCOMPort() 
    {
        return COMPort;
    }
    
    //Name: setCOMPort
    //Author: Travis Gibbons
    //Parameters: newvalue -- the COM port to be assigned globaly
    //Purpose: after a COM port is identified, set it globally
    //Returns: none
    public void setCOMPort(String newvalue)
    {
        COMPort = newvalue.toString();
    }
   
    //Name: TagReadListener, tagRead
    //Author: sourced from mercury api examples
    //Parameters: r -- the reader currently in use
    //            t -- tag read data currently in use
    //Purpose: detect tag read events
    //Returns: none
    static class TagReadListener implements ReadListener
    {
         public void tagRead(Reader r, TagReadData t) {
             System.out.println("Tag Read " + t);
         }
    }
    
    //WORK IN PROGRESS
    //Name: WriteButtonActionPerformed (swingGUI generated)
    //Author: Travis Gibbons
    //Parameters: none
    //PreReq: user input 24 bytes long, a tag, connected reader
    //Purpose: write the user entered EPC ot a tag
    //Returns: none    
    private void WriteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WriteButtonActionPerformed
        //Declare variable to hold the EPC
        //byte[] EPCtext;
        String EPCtext;
//WORK IN PROGRESS     
//        EPCtext = WriteField.getText();
//        
//    TagFilter target;
//    Gen2.TagData t;
//
//    t = (Gen2.TagData)parseValue("asdfadsf");
//
//    try
//    {
//      Gen2.WriteTag writeTag = new Gen2.WriteTag(t);
//      r.executeTagOp(writeTag, target);
//    }
//    catch (ReaderException re)
//    {
//      System.out.printf("Error writing tag ID: %s\n",
//                        re.getMessage());
//    }
    }//GEN-LAST:event_WriteButtonActionPerformed

    private void EPCFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EPCFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EPCFieldActionPerformed

    //Name: ClearButtonActionPerformed (swingGUI generated)
    //Author: Travis Gibbons
    //Parameters: none
    //Purpose: clear all text fields on gui when button is pressed
    //Returns: none
    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        //Clear all display or entry fields
        EPCField.setText("");
        ReservedField.setText("");
        TIDField.setText("");
        UserField.setText("");
        WriteField.setText("");
        COMField.setText("");
        BaudField.setText("");
        EPCNumField.setText("");
    }//GEN-LAST:event_ClearButtonActionPerformed

    //Name: ReadButtonActionPerformed (swingGUI generated)
    //Author: Travis Gibbons
    //Parameters: none
    //PreReq: Reader has to be connected for this to function
    //Purpose: read memory banks and EPC number from a tag on button press
    //Returns: none
    private void ReadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReadButtonActionPerformed
        //Program Setup
        boolean trace = false;

        // Create Reader object, connecting to physical device
        try
        { 
            //Establish array for tags
            TagReadData[] tagReads;
            
            //Initiate tag listener
            getReader().addReadListener(new TagReadListener() );
          
            // Read tags
            tagReads = getReader().read(500);
          
            // Print tag reads
            for (TagReadData tr : tagReads)
            {
                ReservedField.setText(tr.getEPCMemData().toString());
                EPCField.setText(tr.getEPCMemData().toString());
                TIDField.setText(tr.getTIDMemData().toString());
                UserField.setText(tr.getUserMemData().toString());
                EPCNumField.setText(tr.getTag().toString().replaceAll(".*:", ""));
            }
        } 
        catch (Exception re)
        {
            System.out.println("Exception : " + re.getMessage());
        }
    }//GEN-LAST:event_ReadButtonActionPerformed
    
    //WORK IN PROGRESS
    //Name: COMButtonActionPerformed (swingGUI generated)
    //Author: Travis Gibbons
    //Parameters: none
    //PreReq: currently, user input of com port
    //        goal is to just need a reader plugged in to a USB port
    //Purpose: establish a connection to a reader plugged in to a USB port
    //         shold automatically detect which com port the reader is in
    //Returns: none
    private void COMButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COMButtonActionPerformed

        //Declare variable to hold the EPC
        int EnteredCOM;
        
        //Get user value from text field and place it in a variable
        EnteredCOM = Integer.parseInt(COMField.getText());
        
        //Populate global variable
        setCOMPort("tmr:///COM" + EnteredCOM);
        
        try
        {
            //Set the reader based on user input
            setReader(Reader.create(getCOMPort()));
            
            //Connect the reader
            getReader().connect();
            
            //Print message indicating a connection
            COMField.setText("Connected to COM" + EnteredCOM);
        }
        catch(Exception notCOM)
        {
            COMField.setText("Incorrect, try again");
        }
    }//GEN-LAST:event_COMButtonActionPerformed

    //Name: ExitButtonActionPerformed (swingGUI generated)
    //Author: Travis Gibbons
    //Parameters: none
    //Purpose: safely exit the program; attemps a reader disconnect
    //Returns: none
    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        //Disconnect reader
        getReader().destroy();
        
        //Exit the application
        System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed

    //Name: BaudButtonActionPerformed (swingGUI generated)
    //Author: Travis Gibbons
    //Parameters: none
    //PreReq: user input of new baud rate, a connected reader
    //Purpose: change baud rate to reader to that of user input
    //Returns: none
    private void BaudButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BaudButtonActionPerformed
        
        //Declare variable to hold the EPC
        int BaudRate;
        
        //Get user value from text field and place it in a variable
        BaudRate = Integer.parseInt(BaudField.getText());
        
        try
        {
            //getReader().paramSet("/reader/baudRate", BaudRate);
            getReader().paramSet("/reader/baudRate",BaudRate);
        }
        catch (Exception BaudError)
        {
            System.out.println("Setting Error :" + BaudError.getMessage());
        }
        
    }//GEN-LAST:event_BaudButtonActionPerformed

    //Name: DisconnectButtonActionPerformed (swingGUI generated)
    //Author: Travis Gibbons
    //Parameters: none
    //PreReq: a connected reader
    //Purpose: disconnect a connected reader
    //Returns: none
    private void DisconnectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisconnectButtonActionPerformed
        //Disconnect Connected Reader
        getReader().destroy();
        
        //Display Message
        COMField.setText("Disconnected");
    }//GEN-LAST:event_DisconnectButtonActionPerformed

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
            java.util.logging.Logger.getLogger(RFID_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RFID_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RFID_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RFID_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RFID_UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BaudButton;
    private javax.swing.JTextField BaudField;
    private javax.swing.JButton COMButton;
    private javax.swing.JTextField COMField;
    private javax.swing.JButton ClearButton;
    private javax.swing.JButton DisconnectButton;
    private javax.swing.JTextField EPCField;
    private javax.swing.JTextField EPCNumField;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton ReadButton;
    private javax.swing.JTextField ReservedField;
    private javax.swing.JTextField TIDField;
    private javax.swing.JTextField UserField;
    private javax.swing.JButton WriteButton;
    private javax.swing.JTextField WriteField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
