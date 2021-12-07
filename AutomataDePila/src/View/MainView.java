package View;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.table.DefaultTableModel;

public class MainView extends javax.swing.JFrame implements ActionListener {

    String palabraProbar = "";

    public MainView() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) Tabla.getModel();
        btnProbar.addActionListener(this);

        //Seteamos el estatus de la cadena como desconocido
        EstatusCadena.setText("Desconocida");
        EstatusCadena.setForeground(Color.gray);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        pnlTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        diagramaAP = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCadena = new javax.swing.JTextField();
        btnProbar = new javax.swing.JButton();
        EstatusCadena = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        alertas_palabra = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Autómata de Pila");

        pnlTabla.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Estado", "Por leer", "Pila"
            }
        ));
        Tabla.setEnabled(false);
        jScrollPane1.setViewportView(Tabla);

        javax.swing.GroupLayout pnlTablaLayout = new javax.swing.GroupLayout(pnlTabla);
        pnlTabla.setLayout(pnlTablaLayout);
        pnlTablaLayout.setHorizontalGroup(
            pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTablaLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlTablaLayout.setVerticalGroup(
            pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
        );

        diagramaAP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Captura.PNG"))); // NOI18N
        diagramaAP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Diagrama");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Tabla");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Cadena:");

        txtCadena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCadenaActionPerformed(evt);
            }
        });

        btnProbar.setText("Probar");
        btnProbar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProbarActionPerformed(evt);
            }
        });

        EstatusCadena.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        EstatusCadena.setForeground(new java.awt.Color(102, 189, 119));
        EstatusCadena.setText("Aceptada");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel7.setText("Cadena:");

        alertas_palabra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        alertas_palabra.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(504, 504, 504)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(pnlTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EstatusCadena, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(diagramaAP)
                            .addComponent(alertas_palabra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addComponent(jLabel3)
                        .addGap(547, 547, 547)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(383, 383, 383)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCadena, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnProbar)))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCadena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProbar))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(diagramaAP)
                        .addGap(29, 29, 29)
                        .addComponent(alertas_palabra, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EstatusCadena, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(pnlTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCadenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCadenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCadenaActionPerformed

    private void btnProbarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProbarActionPerformed

    }//GEN-LAST:event_btnProbarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EstatusCadena;
    private javax.swing.JTable Tabla;
    private javax.swing.JLabel alertas_palabra;
    private javax.swing.JButton btnProbar;
    private javax.swing.JLabel diagramaAP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlTabla;
    private javax.swing.JTextField txtCadena;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        DefaultTableModel modelo = (DefaultTableModel) Tabla.getModel();
        
        Object evt = e.getSource();

        if (modelo.getRowCount() > 0) {
            modelo.setRowCount(0);
        }

        if (evt.equals(btnProbar)) {
             palabraProbar = txtCadena.getText().toLowerCase();

            //Verificamos las 2 condiciones antes de llamar a la funcion AutomataDePila
            if (comprobarCadenaPar(palabraProbar) && comprobarCaracteres(palabraProbar)) {
                alertas_palabra.setText("");
                if (automataDePila(palabraProbar)){
                    EstatusCadena.setText("Aceptada");
                    EstatusCadena.setForeground(Color.green);
                } else {
                    EstatusCadena.setText("No aceptada");
                    EstatusCadena.setForeground(Color.red);
                }
            } else {
                if (!comprobarCadenaPar(palabraProbar) && !comprobarCaracteres(palabraProbar)) {
                    alertas_palabra.setText("La palabra no es par y contiene caracter fuera del lenguaje a,b");
                    EstatusCadena.setText("No aceptada");
                    EstatusCadena.setForeground(Color.red);
                    
                } else if (!comprobarCaracteres(palabraProbar)) {
                    alertas_palabra.setText("La palabra no contiene el lenguaje a,b");
                    EstatusCadena.setText("No aceptada");
                    EstatusCadena.setForeground(Color.red);
                } else if (!comprobarCadenaPar(palabraProbar) ){
                    alertas_palabra.setText("La cadena no es par");
                    EstatusCadena.setText("No aceptada");
                    EstatusCadena.setForeground(Color.red);
                }
                
            }
        }

    }

    public boolean automataDePila(String palabraIngresada) {
        DefaultTableModel modelo = (DefaultTableModel) Tabla.getModel();
        //modelo.addRow(new Object[]{"s", "abba", '\u0190'});
        
        int i;
        String estadoActual = "s";

        Stack pila = new Stack();
        
        //porLeer se va a estar sobreescribiendo en cada ciclo
        String porLeer = palabraIngresada;
        
        //Comprobamos la primera mitad de la palabra
        for (i = 0; i < palabraIngresada.length() / 2; i++) {
            //Imprimir la fila antes de agregar caracteres a la pila
            modelo.addRow(new Object[]{estadoActual, porLeer, imprimirPila(pila)});
            char caracter = palabraIngresada.charAt(i);
            porLeer = porLeer.substring(1);
//            if (i == 0) {
//                modelo.addRow(new Object[]{estadoActual, palabraIngresada, '\u0190'});
//            }
            //System.out.println("Palabra "+ tempPalabra.substring(i));
            
            pila.push(caracter);
           // modelo.addRow(new Object[]{estadoActual, porLeer, imprimirPila(pila)});
        }

        String palabrabakup = palabraIngresada.substring(palabraIngresada.length() / 2);
        String pilabakup = imprimirPila(pila);

        if (palabrabakup.equals(pilabakup)) {
            modelo.addRow(new Object[]{estadoActual, palabrabakup, palabrabakup});
            // System.out.println(palabraIngresada.substring(palabraIngresada.length()/2) + imprimirPila(pila));
        }
        

        //cambiamos de estado
        estadoActual = "f";

        //Comprobamos la segunda mitad de la palabra
        if(porLeer.isEmpty()){
            modelo.addRow(new Object[]{estadoActual, porLeer, imprimirPila(pila)});
        }
        
        for (i = palabraIngresada.length() / 2; i < palabraIngresada.length(); i++) {
            modelo.addRow(new Object[]{estadoActual, porLeer, imprimirPila(pila)});
            char caracter = palabraIngresada.charAt(i);
            porLeer = porLeer.substring(1);
            
            if (caracter == (Character) pila.peek()) {
                pila.pop();
            }else{
                return false;
            }
            //Permite imprimir la última fila con los espacios vacíos
            if(porLeer.isEmpty()){
                modelo.addRow(new Object[] {estadoActual, "" ,imprimirPila(pila)});
                
            }
            
        }

        //Comprobacion final para determinar si es palindroma
        if (porLeer.isEmpty() && pila.empty()) {
            return true;
        } else {
            return false;
        }

    }

    public boolean comprobarCadenaPar(String palabraIngresada) {
        return palabraIngresada.length() % 2 == 0;
    }

    public boolean comprobarCaracteres(String palabraIngresada) {

        Pattern letras = Pattern.compile("([a|b])*");
        Matcher cadenaValida = letras.matcher(palabraIngresada);
        if (cadenaValida.matches()) {
            return true;
        } else {
            return false;
        }
    }

    public String imprimirPila(Stack<Character> stack) {
        Stack pilabakup = stack;
        // Si esta vacio
        if (pilabakup.empty()) {
            return "";
        }
        // Extraemos el item de arriba
        String x = String.valueOf(pilabakup.peek());
        //Borramos el ultimo elemento
        pilabakup.pop();
        //usamos recursividad para imprimir el resto del stack
        String recursividad = imprimirPila(pilabakup);
        pilabakup.push(x.charAt(0));
        return x + recursividad;

    }

}
