
package Component;

public class Chat_file extends javax.swing.JPanel {

 
    public Chat_file() {
        initComponents();
        setOpaque(false );
    }
    public void setFile(String fileName, String size){
        IdFileName.setText(fileName);
        IdFileSize.setText(size);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        progress1 = new swing.Progress();
        jPanel1 = new javax.swing.JPanel();
        IdFileName = new javax.swing.JLabel();
        IdFileSize = new javax.swing.JLabel();

        progress1.setProgresType(swing.Progress.ProgresType.FILE);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridLayout(2, 1));

        IdFileName.setText("My File.file");
        jPanel1.add(IdFileName);

        IdFileSize.setForeground(new java.awt.Color(104, 227, 142));
        IdFileSize.setText("5 mb");
        jPanel1.add(IdFileSize);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(progress1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(progress1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(3, 3, 3))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IdFileName;
    private javax.swing.JLabel IdFileSize;
    private javax.swing.JPanel jPanel1;
    private swing.Progress progress1;
    // End of variables declaration//GEN-END:variables
}
