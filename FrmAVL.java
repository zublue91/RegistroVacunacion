/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyectovacunaslemus;

import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.tree.DefaultMutableTreeNode;

public class FrmAVL extends javax.swing.JFrame {

    private DefaultTableModel originalTableModel;

    /**
     * Creates new form FrmAVL
     */
    public FrmAVL() {
        initComponents();
        guardarTablaOriginal();
        tblAvl.getSelectionModel().addListSelectionListener(event -> {
            if (!event.getValueIsAdjusting()) {
                selectedRowIndex = tblAvl.getSelectedRow();
            }
        });
        setLocationRelativeTo(null);

    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAvl = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnPreOrden = new javax.swing.JButton();
        btnPostOrden = new javax.swing.JButton();
        btnInOrden = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnBorrarCargar = new javax.swing.JButton();
        btnrestaurarTablaOriginal = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtBusqueda = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDpi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDepartamento = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtMunicipio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtFechaPrimera = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtFechaSegunda = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtFechaTercera = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtLugarVacunacion = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnActualizarDatos = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnEncriptar = new javax.swing.JButton();
        btnDesencriptar = new javax.swing.JButton();
        btnGuardarTabla = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnGenerarArbol = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtTiempo = new javax.swing.JTextField();
        txtContador = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblAvl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Dpi", "Departamento", "Municipio", "Primera Fecha", "Segunda Fecha", "Tercera Fecha", "Lugar de Vacunacion"
            }
        ));
        tblAvl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAvlMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAvl);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Arbol AVL");

        btnPreOrden.setText("PreOrden");
        btnPreOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreOrdenActionPerformed(evt);
            }
        });

        btnPostOrden.setText("PostOrden");
        btnPostOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostOrdenActionPerformed(evt);
            }
        });

        btnInOrden.setText("InOrden");
        btnInOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInOrdenActionPerformed(evt);
            }
        });

        jButton4.setText("Regresar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        btnBorrarCargar.setText("Buscar otra tabla");

        btnrestaurarTablaOriginal.setText("Restaurar tabla");
        btnrestaurarTablaOriginal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrestaurarTablaOriginalActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 153));

        jLabel3.setText("DPI:");

        jLabel4.setText("Nombre:");

        jLabel5.setText("Departamento:");

        jLabel6.setText("Municipio:");

        jLabel7.setText("Primera Fecha:");

        jLabel8.setText("Segunda Fecha:");

        jLabel9.setText("Tercera Fecha:");

        jLabel10.setText("Lugar de Vacunacion");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnActualizarDatos.setText("Actualizar");
        btnActualizarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarDatosActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEncriptar.setText("Encriptar Archivo");
        btnEncriptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncriptarActionPerformed(evt);
            }
        });

        btnDesencriptar.setText("Desencriptar");
        btnDesencriptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesencriptarActionPerformed(evt);
            }
        });

        btnGuardarTabla.setText("Guardar Tabla");
        btnGuardarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarTablaActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnGenerarArbol.setText("Imprimir arbol");
        btnGenerarArbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarArbolActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDpi, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFechaPrimera, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFechaSegunda, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFechaTercera, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLugarVacunacion, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnEncriptar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDesencriptar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGuardarTabla))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnActualizarDatos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimpiar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminar))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnGenerarArbol))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(62, 62, 62)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtDpi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtFechaPrimera, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtFechaSegunda, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(txtFechaTercera, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(txtLugarVacunacion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnActualizarDatos)
                    .addComponent(btnLimpiar)
                    .addComponent(btnEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEncriptar)
                    .addComponent(btnDesencriptar)
                    .addComponent(btnGuardarTabla))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGenerarArbol)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jLabel11.setText("Tiempo:");

        jLabel12.setText("Cantidad:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnPreOrden)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnPostOrden)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtContador, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnInOrden)
                                        .addGap(34, 34, 34)))
                                .addComponent(btnBorrarCargar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnrestaurarTablaOriginal))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4)
                                .addGap(14, 14, 14))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPreOrden)
                    .addComponent(btnPostOrden)
                    .addComponent(btnInOrden)
                    .addComponent(btnBorrarCargar)
                    .addComponent(btnrestaurarTablaOriginal))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(txtContador, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
// Declaración del modelo de la tabla original

    // Método para cargar los datos en la tabla
    public void cargarDatos(List<Object[]> records) {
        DefaultTableModel model = (DefaultTableModel) tblAvl.getModel();
        model.setRowCount(0); // Limpiar la tabla

        for (Object[] record : records) {
            model.addRow(record);
        }

        guardarTablaOriginal(); // Guardar el modelo de la tabla después de cargar datos
    }

    // Método para contar y mostrar la cantidad de registros en la tabla
    public void contarYMostrarCantidadRegistros() {
        DefaultTableModel model = (DefaultTableModel) tblAvl.getModel();
        int rowCount = model.getRowCount();
        txtContador.setText(String.valueOf(rowCount));
    }

    // Método para establecer el tiempo transcurrido en milisegundos
    public void setTiempoTranscurrido(long elapsedTime) {
        txtTiempo.setText(elapsedTime + " ms");
    }

    private void guardarTablaOriginal() {
        // Crear una copia profunda del modelo de la tabla original
        DefaultTableModel currentModel = (DefaultTableModel) tblAvl.getModel();
        originalTableModel = new DefaultTableModel();
        for (int i = 0; i < currentModel.getColumnCount(); i++) {
            originalTableModel.addColumn(currentModel.getColumnName(i));
        }
        for (int i = 0; i < currentModel.getRowCount(); i++) {
            Object[] row = new Object[currentModel.getColumnCount()];
            for (int j = 0; j < currentModel.getColumnCount(); j++) {
                row[j] = currentModel.getValueAt(i, j);
            }
            originalTableModel.addRow(row);
        }
    }

    private void restaurarTablaOriginal() {
        tblAvl.setModel(originalTableModel);
        contarYMostrarCantidadRegistros(); // Actualizar el contador de registros
    }
    private void btnPreOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreOrdenActionPerformed
        recorrerArbol("preorden");

    }//GEN-LAST:event_btnPreOrdenActionPerformed

    private void btnPostOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostOrdenActionPerformed
        recorrerArbol("postorden");

    }//GEN-LAST:event_btnPostOrdenActionPerformed

    private void btnInOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInOrdenActionPerformed
        recorrerArbol("inorden");
    }//GEN-LAST:event_btnInOrdenActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String searchText = txtBusqueda.getText().trim().toLowerCase();

        if (searchText.isEmpty()) {
            // Mostrar mensaje de advertencia si el campo de búsqueda está vacío
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un término de búsqueda.", "Búsqueda Vacía", JOptionPane.WARNING_MESSAGE);
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblAvl.getModel();
        boolean encontrado = false;

        // Crear un nuevo modelo para almacenar los resultados de la búsqueda
        DefaultTableModel searchResultsModel = new DefaultTableModel();
        searchResultsModel.setColumnIdentifiers(new String[]{"Nombres", "DPI", "Departamento", "Municipio", "Primera Fecha", "Segunda Fecha", "Tercera Fecha", "Lugar de Vacunacion"});

        // Recorrer la tabla para buscar coincidencias
        for (int i = 0; i < model.getRowCount(); i++) {
            String nombre = model.getValueAt(i, 0) != null ? model.getValueAt(i, 0).toString().toLowerCase() : "";
            String dpi = model.getValueAt(i, 1) != null ? model.getValueAt(i, 1).toString().toLowerCase() : "";
            String departamento = model.getValueAt(i, 2) != null ? model.getValueAt(i, 2).toString().toLowerCase() : "";
            String municipio = model.getValueAt(i, 3) != null ? model.getValueAt(i, 3).toString().toLowerCase() : "";
            String fechaPrimera = model.getValueAt(i, 4) != null ? model.getValueAt(i, 4).toString().toLowerCase() : "";
            String fechaSegunda = model.getValueAt(i, 5) != null ? model.getValueAt(i, 5).toString().toLowerCase() : "";
            String fechaTercera = model.getValueAt(i, 6) != null ? model.getValueAt(i, 6).toString().toLowerCase() : "";
            String lugarVacunacion = model.getValueAt(i, 7) != null ? model.getValueAt(i, 7).toString().toLowerCase() : "";

            // Verificar si algún campo contiene el texto de búsqueda
            if (nombre.contains(searchText) || dpi.contains(searchText) || departamento.contains(searchText)
                    || municipio.contains(searchText) || fechaPrimera.contains(searchText) || fechaSegunda.contains(searchText)
                    || fechaTercera.contains(searchText) || lugarVacunacion.contains(searchText)) {

                // Agregar la fila que coincide con la búsqueda al nuevo modelo de resultados
                searchResultsModel.addRow(new Object[]{
                    model.getValueAt(i, 0), model.getValueAt(i, 1), model.getValueAt(i, 2),
                    model.getValueAt(i, 3), model.getValueAt(i, 4), model.getValueAt(i, 5),
                    model.getValueAt(i, 6), model.getValueAt(i, 7)
                });
                encontrado = true;
            }
        }

        if (encontrado) {
            // Limpiar la tabla y mostrar los resultados de la búsqueda
            tblAvl.setModel(searchResultsModel);
            contarYMostrarCantidadRegistros(); // Actualizar el contador de registros
        } else {
            // Mostrar mensaje de que no se encontraron resultados
            JOptionPane.showMessageDialog(this, "No se encontraron registros que coincidan con el término de búsqueda.", "Sin Resultados", JOptionPane.INFORMATION_MESSAGE);
        }

        // Limpiar el campo de búsqueda después de realizar la búsqueda
        txtBusqueda.setText("");

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnrestaurarTablaOriginalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrestaurarTablaOriginalActionPerformed
        restaurarTablaOriginal();


    }//GEN-LAST:event_btnrestaurarTablaOriginalActionPerformed

    private void tblAvlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAvlMouseClicked

        // Obtener el índice de la fila seleccionada
        int selectedRowIndex = tblAvl.getSelectedRow();

        // Verificar si se hizo clic con el botón izquierdo del ratón y si hay una fila seleccionada
        if (evt.getButton() == MouseEvent.BUTTON1 && selectedRowIndex != -1) {
            // Obtener el modelo de la tabla
            DefaultTableModel model = (DefaultTableModel) tblAvl.getModel();

            // Obtener los datos de la fila seleccionada
            String nombre = (String) model.getValueAt(selectedRowIndex, 0);
            String dpi = (String) model.getValueAt(selectedRowIndex, 1);
            String departamento = (String) model.getValueAt(selectedRowIndex, 2);
            String municipio = (String) model.getValueAt(selectedRowIndex, 3);
            String fechaPrimera = (String) model.getValueAt(selectedRowIndex, 4);
            String fechaSegunda = (String) model.getValueAt(selectedRowIndex, 5);
            String fechaTercera = (String) model.getValueAt(selectedRowIndex, 6);
            String lugarVacunacion = (String) model.getValueAt(selectedRowIndex, 7);

            // Mostrar los datos en los JTextField correspondientes
            txtNombre.setText(nombre);
            txtDpi.setText(dpi);
            txtDepartamento.setText(departamento);
            txtMunicipio.setText(municipio);
            txtFechaPrimera.setText(fechaPrimera);
            txtFechaSegunda.setText(fechaSegunda);
            txtFechaTercera.setText(fechaTercera);
            txtLugarVacunacion.setText(lugarVacunacion);
        }


    }//GEN-LAST:event_tblAvlMouseClicked

// Método para limpiar los JTextField
    private void limpiarTextField() {
        txtNombre.setText("");
        txtDpi.setText("");
        txtDepartamento.setText("");
        txtMunicipio.setText("");
        txtFechaPrimera.setText("");
        txtFechaSegunda.setText("");
        txtFechaTercera.setText("");
        txtLugarVacunacion.setText("");
    }

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        // Obtener datos de los JTextField
        String nombre = txtNombre.getText().trim();
        String dpi = txtDpi.getText().trim();
        String departamento = txtDepartamento.getText().trim();
        String municipio = txtMunicipio.getText().trim();
        String fechaPrimera = txtFechaPrimera.getText().trim();
        String fechaSegunda = txtFechaSegunda.getText().trim();
        String fechaTercera = txtFechaTercera.getText().trim();
        String lugarVacunacion = txtLugarVacunacion.getText().trim();

        // Validar que al menos el nombre y el DPI estén presentes
        if (nombre.isEmpty() || dpi.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El nombre y el DPI son campos obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Agregar una fila a la tabla
        DefaultTableModel model = (DefaultTableModel) tblAvl.getModel();
        model.addRow(new Object[]{nombre, dpi, departamento, municipio, fechaPrimera, fechaSegunda, fechaTercera, lugarVacunacion});

        // Limpiar los JTextField
        limpiarTextField();

        // Actualizar el contador de registros
        contarYMostrarCantidadRegistros();

    }//GEN-LAST:event_btnGuardarActionPerformed
    private int selectedRowIndex = -1;

    private void btnActualizarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarDatosActionPerformed
        System.out.println("Selected Row Index: " + selectedRowIndex);
        // Verificar si hay una fila seleccionada
        if (selectedRowIndex == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un registro para actualizar.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Obtener datos de los JTextField
        String nombre = txtNombre.getText().trim();
        String dpi = txtDpi.getText().trim();
        String departamento = txtDepartamento.getText().trim();
        String municipio = txtMunicipio.getText().trim();
        String fechaPrimera = txtFechaPrimera.getText().trim();
        String fechaSegunda = txtFechaSegunda.getText().trim();
        String fechaTercera = txtFechaTercera.getText().trim();
        String lugarVacunacion = txtLugarVacunacion.getText().trim();

        // Validar que al menos el nombre y el DPI estén presentes
        if (nombre.isEmpty() || dpi.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El nombre y el DPI son campos obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Obtener el modelo de la tabla
        DefaultTableModel model = (DefaultTableModel) tblAvl.getModel();

        // Actualizar la fila seleccionada con los nuevos datos
        model.setValueAt(nombre, selectedRowIndex, 0);
        model.setValueAt(dpi, selectedRowIndex, 1);
        model.setValueAt(departamento, selectedRowIndex, 2);
        model.setValueAt(municipio, selectedRowIndex, 3);
        model.setValueAt(fechaPrimera, selectedRowIndex, 4);
        model.setValueAt(fechaSegunda, selectedRowIndex, 5);
        model.setValueAt(fechaTercera, selectedRowIndex, 6);
        model.setValueAt(lugarVacunacion, selectedRowIndex, 7);

        // Limpiar los JTextField
        limpiarTextField();

        // Reiniciar el índice de la fila seleccionada
        selectedRowIndex = -1;

        // Actualizar el contador de registros
        contarYMostrarCantidadRegistros();

        // Mostrar mensaje de éxito
        JOptionPane.showMessageDialog(this, "Registro actualizado exitosamente.", "Actualización Exitosa", JOptionPane.INFORMATION_MESSAGE);

        // Guardar la tabla actualizada como la original
        originalTableModel = (DefaultTableModel) tblAvl.getModel();
    }//GEN-LAST:event_btnActualizarDatosActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

        limpiarTextField();


    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

// Verificar si hay una fila seleccionada
        if (selectedRowIndex == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un registro para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Obtener el modelo de la tabla
        DefaultTableModel model = (DefaultTableModel) tblAvl.getModel();

        // Eliminar la fila seleccionada
        model.removeRow(selectedRowIndex);

        // Limpiar los JTextField
        limpiarTextField();

        // Reiniciar el índice de la fila seleccionada
        selectedRowIndex = -1;

        // Actualizar el contador de registros
        contarYMostrarCantidadRegistros();

        // Mostrar mensaje de éxito
        JOptionPane.showMessageDialog(this, "Registro eliminado exitosamente.", "Eliminación Exitosa", JOptionPane.INFORMATION_MESSAGE);


    }//GEN-LAST:event_btnEliminarActionPerformed
// Método para permitir al usuario elegir la ruta de archivo donde guardar los datos encriptados

    private String obtenerRutaArchivo() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Guardar Datos Encriptados");

        // Mostrar el cuadro de diálogo para seleccionar la ruta de archivo
        int seleccion = fileChooser.showSaveDialog(this);

        // Verificar si se seleccionó una ruta de archivo
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            // Obtener la ruta de archivo seleccionada por el usuario
            File archivoSeleccionado = fileChooser.getSelectedFile();
            return archivoSeleccionado.getAbsolutePath();
        } else {
            return null; // El usuario canceló la operación
        }
    }

    private void btnEncriptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncriptarActionPerformed

        // Obtener la ruta de archivo deseada para guardar los datos encriptados
        String rutaArchivo = obtenerRutaArchivo();

        // Verificar si se seleccionó una ruta de archivo válida
        if (rutaArchivo != null) {
            // Agregar la extensión .txt si no está presente
            if (!rutaArchivo.toLowerCase().endsWith(".txt")) {
                rutaArchivo += ".txt";
            }

            // Obtener la clave de encriptación del usuario (puedes cambiar esto según tus necesidades)
            String clave = JOptionPane.showInputDialog(this, "Ingrese la clave de encriptación:", "Clave de Encriptación", JOptionPane.PLAIN_MESSAGE);

            // Verificar si se ingresó una clave
            if (clave != null && !clave.isEmpty()) {
                // Llamar al método para encriptar y guardar los datos de la tabla
                EncriptadorTabla.encriptarYGuardarTabla(tblAvl, rutaArchivo, clave);
            } else {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese una clave de encriptación válida.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_btnEncriptarActionPerformed

    private void btnDesencriptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesencriptarActionPerformed

        // Obtener la ruta de archivo deseada para desencriptar los datos
        String rutaArchivo = obtenerRutaArchivo();

        // Verificar si se seleccionó una ruta de archivo válida
        if (rutaArchivo != null) {
            // Obtener la clave de desencriptación del usuario
            String clave = obtenerClave("Ingrese la clave de desencriptación:");

            // Verificar si se ingresó una clave válida
            if (clave != null && !clave.isEmpty()) {
                // Desencriptar y mostrar los datos en la tabla
                desencriptarYMostrarTabla(tblAvl, rutaArchivo, clave);
            } else {
                mostrarMensajeError("Por favor, ingrese una clave de desencriptación válida.");
            }
        }
    }//GEN-LAST:event_btnDesencriptarActionPerformed

    private void btnGuardarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarTablaActionPerformed

        // Verifica que la tabla no sea nula
        if (tblAvl == null) {
            JOptionPane.showMessageDialog(null, "La tabla tblBinario no está inicializada.");
            return;
        }

        // Obtiene el modelo de la tabla
        TableModel model = tblAvl.getModel();

        // Verifica que el modelo de la tabla no sea nulo
        if (model == null) {
            JOptionPane.showMessageDialog(null, "El modelo de la tabla tblBinario no está inicializado.");
            return;
        }

        // Elige la ubicación y el nombre del archivo donde se guardará la tabla
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(file + ".txt"))) {
                // Escribe los nombres de las columnas
                for (int i = 0; i < model.getColumnCount(); i++) {
                    bw.write(model.getColumnName(i) + (i == model.getColumnCount() - 1 ? "" : ","));
                }
                bw.write("\n");

                // Itera sobre las filas
                for (int i = 0; i < model.getRowCount(); i++) {
                    // Itera sobre las columnas
                    for (int j = 0; j < model.getColumnCount(); j++) {
                        Object value = model.getValueAt(i, j);
                        bw.write((value != null ? value.toString() : "") + (j == model.getColumnCount() - 1 ? "" : ","));
                    }
                    bw.write("\n");
                }
                JOptionPane.showMessageDialog(null, "Tabla guardada correctamente.");
            } catch (IOException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al guardar la tabla.");
            }
        }
    }//GEN-LAST:event_btnGuardarTablaActionPerformed


    private void btnGenerarArbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarArbolActionPerformed

        // Crear un objeto AVLTree
        AVLTree avlTree = new AVLTree();

        // Obtener el modelo de la tabla
        DefaultTableModel model = (DefaultTableModel) tblAvl.getModel();

        // Insertar los datos de la tabla en el árbol AVL
        for (int i = 0; i < model.getRowCount(); i++) {
            String name = (String) model.getValueAt(i, 0);
            String dpi = (String) model.getValueAt(i, 1);
            String departamento = (String) model.getValueAt(i, 2);
            String municipio = (String) model.getValueAt(i, 3);
            String fechaPrimera = (String) model.getValueAt(i, 4);
            String fechaSegunda = (String) model.getValueAt(i, 5);
            String fechaTercera = (String) model.getValueAt(i, 6);
            String lugarVacunacion = (String) model.getValueAt(i, 7);
            avlTree.insert(name, dpi, departamento, municipio, fechaPrimera, fechaSegunda, fechaTercera, lugarVacunacion);
        }

        // Crear el modelo para el árbol visual
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        createTree(avlTree.getRoot(), root);
        JTree tree = new JTree(root);

        // Mostrar el árbol en un nuevo JFrame
        JFrame frame = new JFrame("Árbol AVL");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.add(new JScrollPane(tree));
        frame.pack();
        frame.setVisible(true);


    }//GEN-LAST:event_btnGenerarArbolActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        FrmPrincipal fp = new FrmPrincipal();
        fp.setVisible(true);
        this.dispose();


    }//GEN-LAST:event_jButton4ActionPerformed

    // Método para crear el árbol visual
    private void createTree(AVLTree.Node node, DefaultMutableTreeNode treeNode) {
        if (node != null) {
            DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(node.name + " (" + node.dpi + ")");
            treeNode.add(newNode);
            createTree(node.left, newNode);
            createTree(node.right, newNode);
        }
    }

    // Método para obtener la clave del usuario
    private String obtenerClave(String mensaje) {
        return JOptionPane.showInputDialog(this, mensaje, "Clave de Desencriptación", JOptionPane.PLAIN_MESSAGE);
    }

// Método para mostrar mensajes de error
    private void mostrarMensajeError(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }

// Método para desencriptar los datos de un archivo y mostrarlos en una tabla
    private void desencriptarYMostrarTabla(JTable tabla, String rutaArchivo, String clave) {
        try {
            // Crear el lector para el archivo
            BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo));

            // Crear un modelo de tabla vacío
            DefaultTableModel model = new DefaultTableModel();

            // Leer la primera línea del archivo para determinar el número de columnas
            String primeraLinea = reader.readLine();
            String[] columnas = primeraLinea.split(";"); // Suponiendo que usaste punto y coma como separador
            // Agregar las columnas al modelo de la tabla
            for (String columna : columnas) {
                model.addColumn(columna);
            }

            // Leer el resto de las líneas para obtener los datos
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datosEncriptados = linea.split(";");
                String[] datosDesencriptados = new String[datosEncriptados.length];

                // Desencriptar cada dato
                for (int i = 0; i < datosEncriptados.length; i++) {
                    datosDesencriptados[i] = desencriptarVigenere(datosEncriptados[i], clave);
                }

                // Agregar la fila al modelo de la tabla
                model.addRow(datosDesencriptados);
            }

            // Asignar el modelo de tabla creado a la tabla proporcionada
            tabla.setModel(model);

            // Cerrar el lector
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al leer el archivo encriptado.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

// Método para desencriptar un texto utilizando el cifrado Vigenère
    private String desencriptarVigenere(String textoEncriptado, String clave) {
        StringBuilder textoDesencriptado = new StringBuilder();

        // Repetir la clave hasta que tenga la misma longitud que el texto encriptado
        while (clave.length() < textoEncriptado.length()) {
            clave += clave;
        }

        // Recorrer cada carácter del texto encriptado
        for (int i = 0; i < textoEncriptado.length(); i++) {
            char caracter = textoEncriptado.charAt(i);
            // Obtener el desplazamiento para este carácter según la clave
            int desplazamiento = clave.charAt(i) - 'A';
            // Restar el desplazamiento al carácter para deshacer la encriptación y agregarlo al texto desencriptado
            textoDesencriptado.append((char) ((caracter - desplazamiento + 256) % 256));
        }

        return textoDesencriptado.toString();

    }

    public class AVLTree {

        private Node root;

        public AVLTree() {
            root = null;
        }

        private class Node {

            String name, dpi, departamento, municipio, fechaPrimera, fechaSegunda, fechaTercera, lugarVacunacion;
            Node left, right;
            int height;

            Node(String name, String dpi, String departamento, String municipio, String fechaPrimera, String fechaSegunda, String fechaTercera, String lugarVacunacion) {
                this.name = name;
                this.dpi = dpi;
                this.departamento = departamento;
                this.municipio = municipio;
                this.fechaPrimera = fechaPrimera;
                this.fechaSegunda = fechaSegunda;
                this.fechaTercera = fechaTercera;
                this.lugarVacunacion = lugarVacunacion;
                this.height = 1;
            }
        }

        private int height(Node N) {
            if (N == null) {
                return 0;
            }
            return N.height;
        }

        private Node rightRotate(Node y) {
            Node x = y.left;
            Node T2 = x.right;

            x.right = y;
            y.left = T2;

            y.height = Math.max(height(y.left), height(y.right)) + 1;
            x.height = Math.max(height(x.left), height(x.right)) + 1;

            return x;
        }

        private Node leftRotate(Node x) {
            Node y = x.right;
            Node T2 = y.left;

            y.left = x;
            x.right = T2;

            x.height = Math.max(height(x.left), height(x.right)) + 1;
            y.height = Math.max(height(y.left), height(y.right)) + 1;

            return y;
        }

        private int getBalance(Node N) {
            if (N == null) {
                return 0;
            }
            return height(N.left) - height(N.right);
        }

        public void insert(String name, String dpi, String departamento, String municipio, String fechaPrimera, String fechaSegunda, String fechaTercera, String lugarVacunacion) {
            root = insertRec(root, name, dpi, departamento, municipio, fechaPrimera, fechaSegunda, fechaTercera, lugarVacunacion);
        }

        private Node insertRec(Node node, String name, String dpi, String departamento, String municipio, String fechaPrimera, String fechaSegunda, String fechaTercera, String lugarVacunacion) {
            if (node == null) {
                return new Node(name, dpi, departamento, municipio, fechaPrimera, fechaSegunda, fechaTercera, lugarVacunacion);
            }

            if (dpi.compareTo(node.dpi) < 0) {
                node.left = insertRec(node.left, name, dpi, departamento, municipio, fechaPrimera, fechaSegunda, fechaTercera, lugarVacunacion);
            } else if (dpi.compareTo(node.dpi) > 0) {
                node.right = insertRec(node.right, name, dpi, departamento, municipio, fechaPrimera, fechaSegunda, fechaTercera, lugarVacunacion);
            } else {
                return node;
            }

            node.height = 1 + Math.max(height(node.left), height(node.right));
            int balance = getBalance(node);

            if (balance > 1 && dpi.compareTo(node.left.dpi) < 0) {
                return rightRotate(node);
            }

            if (balance < -1 && dpi.compareTo(node.right.dpi) > 0) {
                return leftRotate(node);
            }

            if (balance > 1 && dpi.compareTo(node.left.dpi) > 0) {
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }

            if (balance < -1 && dpi.compareTo(node.right.dpi) < 0) {
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }

            return node;
        }

        public void preorden(Node node, DefaultTableModel model) {
            if (node != null) {
                model.addRow(new Object[]{node.name, node.dpi, node.departamento, node.municipio, node.fechaPrimera, node.fechaSegunda, node.fechaTercera, node.lugarVacunacion});
                preorden(node.left, model);
                preorden(node.right, model);
            }
        }

        public void inorden(Node node, DefaultTableModel model) {
            if (node != null) {
                inorden(node.left, model);
                model.addRow(new Object[]{node.name, node.dpi, node.departamento, node.municipio, node.fechaPrimera, node.fechaSegunda, node.fechaTercera, node.lugarVacunacion});
                inorden(node.right, model);
            }
        }

        public void postorden(Node node, DefaultTableModel model) {
            if (node != null) {
                postorden(node.left, model);
                postorden(node.right, model);
                model.addRow(new Object[]{node.name, node.dpi, node.departamento, node.municipio, node.fechaPrimera, node.fechaSegunda, node.fechaTercera, node.lugarVacunacion});
            }
        }

        public Node getRoot() {
            return root;
        }
    }

// Ejemplo de integración en la interfaz gráfica
    private void recorrerArbol(String tipoRecorrido) {
        DefaultTableModel model = (DefaultTableModel) tblAvl.getModel();
        AVLTree avlTree = new AVLTree();

        for (int i = 0; i < model.getRowCount(); i++) {
            String name = (String) model.getValueAt(i, 0);
            String dpi = (String) model.getValueAt(i, 1);
            String departamento = (String) model.getValueAt(i, 2);
            String municipio = (String) model.getValueAt(i, 3);
            String fechaPrimera = (String) model.getValueAt(i, 4);
            String fechaSegunda = (String) model.getValueAt(i, 5);
            String fechaTercera = (String) model.getValueAt(i, 6);
            String lugarVacunacion = (String) model.getValueAt(i, 7);
            avlTree.insert(name, dpi, departamento, municipio, fechaPrimera, fechaSegunda, fechaTercera, lugarVacunacion);
        }

        model.setRowCount(0);

        switch (tipoRecorrido) {
            case "preorden":
                avlTree.preorden(avlTree.getRoot(), model);
                break;
            case "inorden":
                avlTree.inorden(avlTree.getRoot(), model);
                break;
            case "postorden":
                avlTree.postorden(avlTree.getRoot(), model);
                break;
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarDatos;
    private javax.swing.JButton btnBorrarCargar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnDesencriptar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEncriptar;
    private javax.swing.JButton btnGenerarArbol;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardarTabla;
    private javax.swing.JButton btnInOrden;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnPostOrden;
    private javax.swing.JButton btnPreOrden;
    private javax.swing.JButton btnrestaurarTablaOriginal;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAvl;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtContador;
    private javax.swing.JTextField txtDepartamento;
    private javax.swing.JTextField txtDpi;
    private javax.swing.JTextField txtFechaPrimera;
    private javax.swing.JTextField txtFechaSegunda;
    private javax.swing.JTextField txtFechaTercera;
    private javax.swing.JTextField txtLugarVacunacion;
    private javax.swing.JTextField txtMunicipio;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTiempo;
    // End of variables declaration//GEN-END:variables
}
