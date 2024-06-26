package Metodos_sql;

import Metodos_sql.Metodos_sql;

import Metodos_sql.ConexionBD;
import static Metodos_sql.Metodos_sql.conexion;
import static Metodos_sql.Metodos_sql.resultado;
import static Metodos_sql.Metodos_sql.sentencia_preparada;
import com.sun.tools.javac.util.Convert;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class AgregarProductos extends javax.swing.JFrame {
 DefaultTableModel modelo;
 
 
 private TableRowSorter trsfiltro;
 String filtro;
    /**
     * Creates new form AgregarProductos
     */
       
 
    public AgregarProductos() {
        initComponents();
     
        tabla.getTableHeader().setBackground(Color.red);
        tabla.getTableHeader().setFont(new Font("arial",Font.BOLD,16));
        
       modelo=new DefaultTableModel();
       modelo.addColumn("Codigo");
       modelo.addColumn("Nombre");
       modelo.addColumn("Precio X bolsa");
       modelo.addColumn("Piezas");
       modelo.addColumn("Precio Pieza");
       
       this.tabla.setModel(modelo);
       

    }
Metodos_sql metodos=new Metodos_sql();
    /**
     * 
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pbolsa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pnombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        buscar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        precio_pz = new javax.swing.JTextField();
        btn_editar = new javax.swing.JButton();
        btn_agregar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        pz = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cod = new javax.swing.JTextField();
        cargar = new javax.swing.JButton();

        jButton2.setBackground(new java.awt.Color(153, 204, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Agregar Producto");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 102));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Precio X bolsa", "Piezas", "Precio Pieza"
            }
        ));
        tabla.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabla.setFocusable(false);
        tabla.setGridColor(new java.awt.Color(0, 0, 0));
        tabla.setSelectionBackground(new java.awt.Color(153, 204, 255));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 252, 764, 230));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Agregar Producto");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 12, 169, 31));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Precio de la bolsa o caja:  $");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 180, -1));

        pbolsa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pbolsaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pbolsaKeyTyped(evt);
            }
        });
        jPanel1.add(pbolsa, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 103, 187, 29));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nombre:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 65, -1, -1));

        pnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pnombreKeyTyped(evt);
            }
        });
        jPanel1.add(pnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 63, 290, 25));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Piezas que trae la bolsa o caja:  ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 150, -1, -1));

        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                buscarKeyTyped(evt);
            }
        });
        jPanel1.add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 260, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Piezas  ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 154, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Precio por pieza (sin ganancia): $");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 194, -1, -1));

        precio_pz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                precio_pzMouseClicked(evt);
            }
        });
        precio_pz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precio_pzActionPerformed(evt);
            }
        });
        jPanel1.add(precio_pz, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 146, 29));

        btn_editar.setBackground(new java.awt.Color(153, 204, 255));
        btn_editar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_editar.setText("Editar Producto");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 156, 33));

        btn_agregar.setBackground(new java.awt.Color(153, 204, 255));
        btn_agregar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_agregar.setText("Agregar Producto");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 30, 180, 33));

        btn_eliminar.setBackground(new java.awt.Color(153, 204, 255));
        btn_eliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_eliminar.setText("Eliminar Producto");
        btn_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_eliminarMousePressed(evt);
            }
        });
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, 170, 33));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Buscar por nombre");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, -1, -1));

        pz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pzActionPerformed(evt);
            }
        });
        pz.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pzKeyTyped(evt);
            }
        });
        jPanel1.add(pz, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 150, 99, 29));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buscar (1).png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 30, 30));

        cod.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                codMouseClicked(evt);
            }
        });
        cod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codActionPerformed(evt);
            }
        });
        jPanel1.add(cod, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 22, 110, 30));

        cargar.setBackground(new java.awt.Color(204, 255, 204));
        cargar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cargar.setText("Cargar");
        cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarActionPerformed(evt);
            }
        });
        jPanel1.add(cargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 120, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
int filas;
    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        // TODO add your handling code here:
        int fila=tabla.getSelectedRow();
        
      
           
       
        Connection conexion=null;
        try{
            conexion=ConexionBD.conectar();
           
      sentencia_preparada=conexion.prepareStatement("UPDATE productos SET Codigo=?,Nombre=?,bolsa=?,Piezas=?,pieza=? WHERE Codigo=?");
      sentencia_preparada.setString(1, cod.getText());
      sentencia_preparada.setString(2, pnombre.getText());
      sentencia_preparada.setString(3, pbolsa.getText());
      sentencia_preparada.setString(4,  pz.getText());
      sentencia_preparada.setString(5, precio_pz.getText());
      sentencia_preparada.setString(6, cod.getText());
      
      
      int resultado=sentencia_preparada.executeUpdate();
      
      if(resultado>0){
          JOptionPane.showMessageDialog(null, "Producto modificado");
          
          cod.setEnabled(true);
          
           String[]inf=new String[5];
           inf[0]=cod.getText();
            inf[1]=pnombre.getText();
            inf[2]=pbolsa.getText();
            inf[3]=pz.getText();
           inf[4]=precio_pz.getText();
            modelo.removeRow(fila);
          tabla.clearSelection();
        
               modelo.addRow(inf);
              
       
          limpiar();
  
      }else{
          JOptionPane.showMessageDialog(null, "No se modificado");
      }
      conexion.close();
        } catch (SQLException ex) {
         System.out.print(ex);
     }
        
    }//GEN-LAST:event_btn_editarActionPerformed
public void limpiartabla(){
    for(int i=0;i<modelo.getRowCount();i++){
        modelo.removeRow(i);
        i=i-1;
    }
}
    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
       Metodos_sql metodos=new Metodos_sql();
      // metodos.eliminap(cod);
       if(!"".equals(cod.getText())){
           int pregunta=JOptionPane.showConfirmDialog(null, "¿Esta seguro de eliminar?");
          if(pregunta==0){
              int id=Integer.parseInt(cod.getText());
              metodos.eliminap(id);
              int fila=tabla.getSelectedRow();
              modelo.removeRow(fila);
              
              
              
             limpiar();
             
        
              
              
              
              
          }
           
       }
       
    }//GEN-LAST:event_btn_eliminarActionPerformed
 public void limpiar(){
     pnombre.setText(" ");
              pbolsa.setText(" ");
              pz.setText(" ");
              precio_pz.setText(" ");
              cod.setText("");
 }
              
    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
      if(precio_pz.getText().isEmpty()||pnombre.getText().isEmpty()||pbolsa.getText().isEmpty()||pz.getText().isEmpty()){
         JOptionPane.showMessageDialog(null,"Existe un campo vacio");
      }else{
       String[]info=new String[5];
       info[0]=cod.getText();
       info[1]=pnombre.getText();
       info[2]=pbolsa.getText();
       info[3]=pz.getText();
       info[4]=precio_pz.getText();
       modelo.addRow(info);
       
       
     
       //Agregarlo a sql
 
        int i=metodos.guardarProduct(cod.getText(),pnombre.getText(), pbolsa.getText(), pz.getText(),precio_pz.getText());
        
        if(i>0){
            JOptionPane.showMessageDialog(this,"Se registro exitosamente");
            
        }else{
            JOptionPane.showMessageDialog(this,"Producto no registrados");
        }
       
      limpiar();
       
       
       
      }
        
       
       
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void precio_pzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precio_pzActionPerformed
   
    
    }//GEN-LAST:event_precio_pzActionPerformed

    private void precio_pzMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_precio_pzMouseClicked
   if(pbolsa.getText().isEmpty()||pz.getText().isEmpty()){
       JOptionPane.showMessageDialog(null, "Favor de rellenar los campos anteriores");
   }  else{
       Double a=Double.parseDouble(pbolsa.getText());
    Double b=Double.parseDouble(pz.getText());
    
    Double res=a/b;
    String ress=res+"";
    
   
         precio_pz.setText(ress);  
         precio_pz.setEditable(false);
   }  
    
  
   
     
    }//GEN-LAST:event_precio_pzMouseClicked

    private void pbolsaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pbolsaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_pbolsaKeyReleased

    private void pbolsaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pbolsaKeyTyped
        char car = evt.getKeyChar();
        if((car<'0' || car>'9') && (car<',' || car>'.')) evt.consume();
    }//GEN-LAST:event_pbolsaKeyTyped

    private void pzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pzActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pzActionPerformed

    private void pnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pnombreKeyTyped
     
    }//GEN-LAST:event_pnombreKeyTyped

    private void pzKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pzKeyTyped
        char car = evt.getKeyChar();
        if((car<'0' || car>'9') && (car<',' || car>'.')) evt.consume();
    }//GEN-LAST:event_pzKeyTyped

    private void codActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codActionPerformed

    private void codMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_codMouseClicked
      
        
        int fila=tabla.getSelectedRow();
        if(fila>0){
            cod.setEnabled(false);
        }else{
            Metodos_sql metodos=new Metodos_sql();
       int id= metodos.id_auto();
     
       cod.setText(id+"");   
       cod.setEditable(false);
        }
        
       
    }//GEN-LAST:event_codMouseClicked

    private void btn_eliminarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_eliminarMousePressed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        int fila=tabla.rowAtPoint(evt.getPoint());
        cod.setText(tabla.getValueAt(fila, 0).toString());
        pnombre.setText(tabla.getValueAt(fila, 1).toString());
        pbolsa.setText(tabla.getValueAt(fila, 2).toString());
        pz.setText(tabla.getValueAt(fila, 3).toString());
        precio_pz.setText(tabla.getValueAt(fila, 4).toString());
        
    }//GEN-LAST:event_tablaMouseClicked

    private void cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarActionPerformed
    String busqueda_nombre=null;
        Connection conexion=null;
        String[]datos=new String[5];
        try{
            conexion=ConexionBD.conectar();
            String sen=("SELECT * FROM productos");
            sentencia_preparada=conexion.prepareStatement(sen);
            resultado=sentencia_preparada.executeQuery();
            while(resultado.next()){
               datos[0]=resultado.getString(1);
               datos[1]=resultado.getString(2);
               datos[2]=resultado.getString(3);
               datos[3]=resultado.getString(4);
               datos[4]=resultado.getString(5);
               modelo.addRow(datos);
            }
            conexion.close();
            
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_cargarActionPerformed

    private void buscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarKeyTyped
        trsfiltro=new TableRowSorter(tabla.getModel());
        tabla.setRowSorter(trsfiltro);
        filtro=buscar.getText();
        trsfiltro.setRowFilter(RowFilter.regexFilter(buscar.getText(),1));
    }//GEN-LAST:event_buscarKeyTyped

      
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
            java.util.logging.Logger.getLogger(AgregarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JTextField buscar;
    private javax.swing.JButton cargar;
    private javax.swing.JTextField cod;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pbolsa;
    private javax.swing.JTextField pnombre;
    private javax.swing.JTextField precio_pz;
    private javax.swing.JTextField pz;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
