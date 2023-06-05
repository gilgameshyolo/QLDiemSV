/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import DAO.DiemDAO;
import DAO.LoaiDiemDAO;
import DAO.LopDAO;
import DAO.MonhocDAO;
import DAO.SinhVienDAO;
import Model.DSDiem;
import Model.LoaiDiem;
import Model.Lop;
import Model.MonHoc;
import Model.SinhVien;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class ChitietDialog extends javax.swing.JDialog {

    LopDAO lopDAO =new LopDAO();
    SinhVienDAO svDAO = new SinhVienDAO();
    MonhocDAO monDAO = new MonhocDAO();
    DiemDAO diemDAO = new DiemDAO();
    LoaiDiemDAO ldDAO = new LoaiDiemDAO();
    float x = 0,y = 0,z = 0,a =0,b=0,c=0;
    /**
     * Creates new form ChitietDialog
     */
    public ChitietDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        loadDSSV();
        loadDSmon();
        loadDSlop();
        
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
        jLabel2 = new javax.swing.JLabel();
        btnSV = new javax.swing.JButton();
        btnMon = new javax.swing.JButton();
        pnlDS = new javax.swing.JPanel();
        pnlSV = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblSV = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblDiemSV = new javax.swing.JTable();
        pnlLop = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblLop = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblDiemLop = new javax.swing.JTable();
        pnlMon = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMon = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDiemMon = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Chi tiết");

        btnSV.setText("Sinh viên");
        btnSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSVActionPerformed(evt);
            }
        });

        btnMon.setText("Môn học");
        btnMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(399, 399, 399)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSV)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMon)))
                .addContainerGap(338, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSV)
                    .addComponent(btnMon))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        pnlDS.setLayout(new java.awt.CardLayout());

        tblSV.setAutoCreateRowSorter(true);
        tblSV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSVMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblSV);

        tblDiemSV.setAutoCreateRowSorter(true);
        tblDiemSV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tblDiemSV);

        javax.swing.GroupLayout pnlSVLayout = new javax.swing.GroupLayout(pnlSV);
        pnlSV.setLayout(pnlSVLayout);
        pnlSVLayout.setHorizontalGroup(
            pnlSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSVLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlSVLayout.setVerticalGroup(
            pnlSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSVLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlDS.add(pnlSV, "cardSV");

        tblLop.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(tblLop);

        tblDiemLop.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(tblDiemLop);

        javax.swing.GroupLayout pnlLopLayout = new javax.swing.GroupLayout(pnlLop);
        pnlLop.setLayout(pnlLopLayout);
        pnlLopLayout.setHorizontalGroup(
            pnlLopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLopLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlLopLayout.setVerticalGroup(
            pnlLopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLopLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlLopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlDS.add(pnlLop, "cardLop");

        tblMon.setAutoCreateRowSorter(true);
        tblMon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblMon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMon);

        tblDiemMon.setAutoCreateRowSorter(true);
        tblDiemMon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblDiemMon);

        javax.swing.GroupLayout pnlMonLayout = new javax.swing.GroupLayout(pnlMon);
        pnlMon.setLayout(pnlMonLayout);
        pnlMonLayout.setHorizontalGroup(
            pnlMonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMonLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlMonLayout.setVerticalGroup(
            pnlMonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlMonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlDS.add(pnlMon, "cardMon");

        getContentPane().add(pnlDS, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void loadDSlop(){
    JTable table = new JTable();
    DefaultTableModel tbl = new DefaultTableModel();
    Object rows[] = new Object[2];
    Object cols[] = new Object[2];
    cols[0] = "Mã lớp";
    cols[1] = "Tên Lớp";

    tbl.setColumnIdentifiers(cols);

    List<Lop> listlop = lopDAO.getAll();

    for (int i = 0; i < listlop.size(); i++) {
        Lop l = listlop.get(i);
        rows[0] = l.getMaLop();
        rows[1] = l.getTenLop();

        tbl.addRow(rows);
    }
    //table.setModel(tbl);
    //TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tblDSLop.getModel());
    //tblDSLop.setRowSorter(sorter);

    //List<RowSorter.SortKey> sortKeys = new ArrayList<>(25);
    //sortKeys.add(new RowSorter.SortKey(0, SortOrder.ASCENDING));
    //sortKeys.add(new RowSorter.SortKey(1, SortOrder.ASCENDING));
    //sorter.setSortKeys(sortKeys);
    //JScrollPane pane =new JScrollPane(table);
    tblLop.setModel(tbl);
}

    public void loadDSSV(){
    JTable table = new JTable();
    DefaultTableModel tbl = new DefaultTableModel();
    Object rows[] = new Object[6];
    Object cols[] = new Object[6];
    cols[0] = "Mã sinh viên";
    cols[1] = "Tên sinh viên";
    cols[2] = "Ngày sinh";
    cols[3] = "Giới tính";
    cols[4] = "Địa chỉ";
    cols[5] = "Lớp";

    tbl.setColumnIdentifiers(cols);

    List<SinhVien> listSV = svDAO.getAll();
    List<Lop> listLop = lopDAO.getAll();
    for (int i = 0; i < listSV.size(); i++) {
        SinhVien sv = listSV.get(i);
        rows[0] = sv.getMaSV();
        rows[1] = sv.getTenSV();
        rows[2] = sv.getNgaysinh();
        if(sv.getGioitinh()==false)
            rows[3] = "Nam";
        else
            rows[3] = "Nữ";
        rows[4] = sv.getDiachi();
        for (int j = 0; j < listLop.size(); j++) {
            Lop l = listLop.get(j);
            if(sv.getMaLop()==l.getMaLop())
            rows[5] = l.getTenLop();
        }


        tbl.addRow(rows);
    }
    tblSV.setModel(tbl);
}

    public void loadDSmon(){
    JTable table = new JTable();
    DefaultTableModel tbl = new DefaultTableModel();
    Object rows[] = new Object[2];
    Object cols[] = new Object[2];
    cols[0] = "Mã môn học";
    cols[1] = "Tên môn học";

    tbl.setColumnIdentifiers(cols);

    List<MonHoc> listmon = monDAO.getAll();

    for (int i = 0; i < listmon.size(); i++) {
        MonHoc m = listmon.get(i);
        rows[0] = m.getMaMH();
        rows[1] = m.getTenMH();

        tbl.addRow(rows);
    }
    tblMon.setModel(tbl);
}
    
    

        
    private void btnSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSVActionPerformed
        CardLayout cardLayout = (CardLayout)pnlDS.getLayout();
        cardLayout.show(pnlDS, "cardSV");
    }//GEN-LAST:event_btnSVActionPerformed

    private void btnMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMonActionPerformed
        CardLayout cardLayout = (CardLayout)pnlDS.getLayout();
        cardLayout.show(pnlDS, "cardMon");
    }//GEN-LAST:event_btnMonActionPerformed

    private void tblSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSVMouseClicked
        int r = tblSV.getSelectedRow();
        String ma = tblSV.getValueAt(r, 0).toString();
        JTable table = new JTable();
        DefaultTableModel tbl = new DefaultTableModel();
        Object rows[] = new Object[5];
        Object cols[] = new Object[5];
        cols[0] = "Tên môn học";
        cols[1] = "Chuyên cần";
        cols[2] = "Giữa kì";
        cols[3] = "Thi";
        cols[4] = "ĐTB";

        tbl.setColumnIdentifiers(cols);

        List<DSDiem> listdsd = diemDAO.getDiemSV(ma);
        List<MonHoc> listmh = monDAO.getAll();
        List<LoaiDiem> listld = ldDAO.getAll();
        for (int i = 0; i < listmh.size(); i++) {
        MonHoc mh = listmh.get(i);
        rows[0] = mh.getTenMH();
            for (int j = 0; j < listdsd.size(); j++) {
                DSDiem dsd = listdsd.get(j);
                
                    if(mh.getMaMH()==dsd.getMaMH()){
                    
                    if(dsd.getMaLoai()==1){
                        rows[1] = dsd.getDiem();
                        x = (float) rows[1];}
                    if(dsd.getMaLoai()==2){
                        rows[2] = dsd.getDiem();
                        y = (float) rows[2];}
                    if(dsd.getMaLoai()==3){
                        rows[3] = dsd.getDiem();
                        z = (float) rows[3];}
                    rows[4] = x*0.1 + y*0.2 + z*0.7;
                    }
                    
                
            }
        
        tbl.addRow(rows);
        }
        tblDiemSV.setModel(tbl);
    }//GEN-LAST:event_tblSVMouseClicked

    private void tblMonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMonMouseClicked
        int r = tblMon.getSelectedRow();
        int ma = (int) tblMon.getValueAt(r, 0);
        JTable table = new JTable();
        DefaultTableModel tbl = new DefaultTableModel();
        Object rows[] = new Object[6];
        Object cols[] = new Object[6];
        cols[0] = "Mã sinh viên";
        cols[1] = "Tên sinh viên";
        cols[2] = "Chuyên cần";
        cols[3] = "Giữa kì";
        cols[4] = "Thi";
        cols[5] = "ĐTB";

        tbl.setColumnIdentifiers(cols);
        List<SinhVien> listSV = svDAO.getAll();
        List<DSDiem> listdsd = diemDAO.getDiemMon(ma);
        List<MonHoc> listmh = monDAO.getAll();
        List<LoaiDiem> listld = ldDAO.getAll();
        for (int i = 0; i < listSV.size(); i++) {
        SinhVien sv = listSV.get(i);
        rows[0] = sv.getMaSV();
        rows[1] = sv.getTenSV();
            for (int j = 0; j < listdsd.size(); j++) {
                DSDiem dsd = listdsd.get(j);
                
                    if(sv.getMaSV().equals(dsd.getMaSV())){
                    
                    if(dsd.getMaLoai()==1){
                        rows[2] = dsd.getDiem();
                        a = (float) rows[2];}
                    if(dsd.getMaLoai()==2){
                        rows[3] = dsd.getDiem();
                        b = (float) rows[3];}
                    if(dsd.getMaLoai()==3){
                        rows[4] = dsd.getDiem();
                        c = (float) rows[4];}
                    rows[5] = a*0.1 + b*0.2 + c*0.7;
                    }
                    else
                    {
                        rows[2]="";
                        rows[3]="";
                        rows[4]="";
                        rows[5]="";
                    }

            }
        
        tbl.addRow(rows);
        }
        tblDiemMon.setModel(tbl);
    }//GEN-LAST:event_tblMonMouseClicked

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMon;
    private javax.swing.JButton btnSV;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JPanel pnlDS;
    private javax.swing.JPanel pnlLop;
    private javax.swing.JPanel pnlMon;
    private javax.swing.JPanel pnlSV;
    private javax.swing.JTable tblDiemLop;
    private javax.swing.JTable tblDiemMon;
    private javax.swing.JTable tblDiemSV;
    private javax.swing.JTable tblLop;
    private javax.swing.JTable tblMon;
    private javax.swing.JTable tblSV;
    // End of variables declaration//GEN-END:variables
}
