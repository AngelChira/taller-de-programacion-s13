package semana13;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class FrmTriangulo extends javax.swing.JFrame {

    public FrmTriangulo() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgOption = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        taResult = new javax.swing.JTextArea();
        btnCalcular = new javax.swing.JButton();
        rdbAreaBaseAltura = new javax.swing.JRadioButton();
        rdbPerimetro = new javax.swing.JRadioButton();
        rdbAreaSemiperimetro = new javax.swing.JRadioButton();
        txtAltura = new javax.swing.JTextField();
        txtBase = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rdbSemiperimetro = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtA = new javax.swing.JTextField();
        txtB = new javax.swing.JTextField();
        txtC = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        taResult.setColumns(20);
        taResult.setRows(5);
        jScrollPane1.setViewportView(taResult);

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        bgOption.add(rdbAreaBaseAltura);
        rdbAreaBaseAltura.setText("Area (base y altura)");
        rdbAreaBaseAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbAreaBaseAlturaActionPerformed(evt);
            }
        });

        bgOption.add(rdbPerimetro);
        rdbPerimetro.setText("Perimetro (a , b ,c)");

        bgOption.add(rdbAreaSemiperimetro);
        rdbAreaSemiperimetro.setText("Area ( semiperimetro )");

        txtAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlturaActionPerformed(evt);
            }
        });

        jLabel1.setText("Ingrese la altura: ");

        jLabel2.setText("Ingrese la base");

        bgOption.add(rdbSemiperimetro);
        rdbSemiperimetro.setText("Semiperimetro");

        jLabel3.setText("Ingrese el valor de a:");

        jLabel4.setText("Ingrese el valor de b:");

        jLabel5.setText("Ingrese el valor de c:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(btnCalcular))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtAltura, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                    .addComponent(txtBase))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtA, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                                    .addComponent(txtB)
                                    .addComponent(txtC)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rdbAreaBaseAltura)
                                    .addComponent(rdbPerimetro))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rdbSemiperimetro)
                                    .addComponent(rdbAreaSemiperimetro)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbAreaBaseAltura)
                    .addComponent(rdbAreaSemiperimetro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdbSemiperimetro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCalcular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rdbAreaBaseAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbAreaBaseAlturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbAreaBaseAlturaActionPerformed

    private void txtAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlturaActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        taResult.setText("");
        DecimalFormat df = new DecimalFormat("###.##");
        if (rdbAreaBaseAltura.isSelected()){ 
            txtA.setText("");
            txtB.setText("");
            txtC.setText("");
            if("".equalsIgnoreCase(txtAltura.getText())){
                JOptionPane.showMessageDialog(
                        null,
                        "Advertencia, la altura ingresada debe ser mayor a 0.",
                        "Advertencia",
                        JOptionPane.WARNING_MESSAGE);
                txtAltura.requestFocus();
                return;
            }
            if("".equalsIgnoreCase(txtBase.getText())){
                JOptionPane.showMessageDialog(
                        null,
                        "Advertencia, la base ingresada debe ser mayor a 0.",
                        "Advertencia",
                        JOptionPane.WARNING_MESSAGE);
                txtBase.requestFocus();
                return;
            }
            byte altura = Byte.parseByte(txtAltura.getText());
            byte base = Byte.parseByte(txtBase.getText());
            Triangulo triangulo = new Triangulo(base, altura);
            taResult.setText("El area del triangulo por su base y altura es "
                    +triangulo.AreaBaseAltura()+" u²");
            
        } else if (rdbPerimetro.isSelected() || rdbAreaSemiperimetro.isSelected() || rdbSemiperimetro.isSelected()) {
            if("".equalsIgnoreCase(txtA.getText())){
                JOptionPane.showMessageDialog(
                        null,
                        "Advertencia, el valor de a debe ser mayor a 0.",
                        "Advertencia",
                        JOptionPane.WARNING_MESSAGE);
                txtAltura.requestFocus();
                return;
            }
            if("".equalsIgnoreCase(txtB.getText())){
                JOptionPane.showMessageDialog(
                        null,
                        "Advertencia, el valor de b debe ser mayor a 0.",
                        "Advertencia",
                        JOptionPane.WARNING_MESSAGE);
                txtAltura.requestFocus();
                return;
            }
            if("".equalsIgnoreCase(txtC.getText())){
                JOptionPane.showMessageDialog(
                        null,
                        "Advertencia, el valor de c debe ser mayor a 0.",
                        "Advertencia",
                        JOptionPane.WARNING_MESSAGE);
                txtAltura.requestFocus();
                return;
            }
            byte a = Byte.parseByte(txtA.getText());
            byte b = Byte.parseByte(txtB.getText());
            byte c = Byte.parseByte(txtC.getText()); 
            Triangulo triangulo = new Triangulo(a, b, c);
            
            if (rdbPerimetro.isSelected()) {
                taResult.setText("El perimetro de el triangulo es "+triangulo.perimetro());                
            }
            else if (rdbAreaSemiperimetro.isSelected()) {
                float raiz = triangulo.AreaSemiperimetro();
                if (raiz > 0){                    
                    taResult.setText("El area del semiperimetro del triangulo es "+df.format(raiz)+
                    " u²");
                } else {
                    JOptionPane.showMessageDialog(
                            null,
                            "Advertencia, lo valores de a, b, c debe ser mayores",
                            "Advertencia",
                            JOptionPane.WARNING_MESSAGE);
                    txtA.requestFocus();
                    return;
                }
            } else if (rdbSemiperimetro.isSelected()){                                   
                taResult.setText("El semiperimetro del triangulo es "+df.format(triangulo.semiperimetro()));                
            }
        } else {
            JOptionPane.showMessageDialog(
                    null, 
                    "Error, debe seleccionar una opcion",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        txtBase.setText("");
        txtAltura.setText("");
        bgOption.clearSelection();
        txtA.setText("");
        txtB.setText("");
        txtC.setText("");
    }//GEN-LAST:event_btnCalcularActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmTriangulo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgOption;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdbAreaBaseAltura;
    private javax.swing.JRadioButton rdbAreaSemiperimetro;
    private javax.swing.JRadioButton rdbPerimetro;
    private javax.swing.JRadioButton rdbSemiperimetro;
    private javax.swing.JTextArea taResult;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtB;
    private javax.swing.JTextField txtBase;
    private javax.swing.JTextField txtC;
    // End of variables declaration//GEN-END:variables
}
