/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.makesystecnologia.businessmgntsys;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane; // import javax packages

/**
 *
 * @author tulio
 */
public class MainWindow extends javax.swing.JFrame {

    // declare objects
    DataModule dm;
    List<Clients> clientList;
    List<Employees> employeeList;
    List<Products> productList;
    List<Operators> operatorList;
    
    // global vars
    // clientes
    int listIndexClient = 0;
    int curIdClient = 0;
    int lastIdClient = 0;
    int totalIndexClient = 0;
    
    // funcionarios
    int listIndexEmployee = 0;
    int curIdEmployee = 0;
    int lastIdEmployee = 0;
    int totalIndexEmployee = 0;
    
    // produtos
    int listIndexProduct = 0;
    int curIdProduct = 0;
    int lastIdProduct = 0;
    int totalIndexProduct = 0;
    
    // operadores/usuarios
    int listIndexOperator = 0;
    int curIdOperator = 0;
    int lastIdOperator = 0;
    int totalIndexOperator = 0;
    
    /**
     * Creates new form MainWindows
     */
    public MainWindow() {
        initComponents();
        dm = new DataModule();
        clientList = new ArrayList<Clients>();
        employeeList = new ArrayList<Employees>();
        productList = new ArrayList<Products>();
        operatorList = new ArrayList<Operators>();
        
        loadClientList();
    }
    
    private void loadClientList()
    {
        dm.selectClients(clientList);
        for (Clients client: clientList) {
            totalIndexClient++;
        }
    }
    
    private void loadEmployeeList()
    {
        dm.selectEmployees(employeeList);
        for (Employees employee: employeeList) {
            totalIndexEmployee++;
        }
    }
    
    private void loadProductList()
    {
        dm.selectProducts(productList);
        for (Products product: productList) {
            totalIndexProduct++;
        }
    }
    
    private void loadOperatorList()
    {
        dm.selectOperators(operatorList);
        for (Operators operator: operatorList) {
            totalIndexOperator++;
        }
    }
    
    private void reloadClientList()
    {
        clientList.clear();
        totalIndexClient = 0;
        loadClientList();
    }
    
    private void reloadEmployeeList()
    {
        employeeList.clear();
        totalIndexEmployee = 0;
        loadEmployeeList();
    }
    
    private void reloadProductList()
    {
        productList.clear();
        totalIndexProduct = 0;
        loadProductList();
    }
    
    private void reloadOperatorList()
    {
        operatorList.clear();
        totalIndexOperator = 0;
        loadOperatorList();
    }
    
    private void showClientList()
    {
        txtIdClient.setText(String.valueOf(clientList.get(listIndexClient).getId()));
        txtNameClient.setText(clientList.get(listIndexClient).getName());
        txtAgeClient.setText(String.valueOf(clientList.get(listIndexClient).getAge()));
        txtAddrClient.setText(clientList.get(listIndexClient).getAddress());
        txtRgClient.setText(String.valueOf(clientList.get(listIndexClient).getRg()));
        txtCpfClient.setText(String.valueOf(clientList.get(listIndexClient).getCpf()));
        if (clientList.get(listIndexClient).getStatus()) cboxStatusClient.setSelectedIndex(1);
        else cboxStatusClient.setSelectedIndex(0);
        txtWalletId.setText(String.valueOf(clientList.get(listIndexClient).getWalletId()));
        txtWallBallance.setText(String.valueOf(clientList.get(listIndexClient).getWalletBallance()));
    }
    
    private void showEmployeeList()
    {
        txtIdFunc.setText(String.valueOf(employeeList.get(listIndexEmployee).getId()));
        txtNameFunc.setText(employeeList.get(listIndexEmployee).getName());
        txtAgeFunc.setText(String.valueOf(employeeList.get(listIndexEmployee).getAge()));
        txtAddrFunc.setText(employeeList.get(listIndexEmployee).getAddress());
        txtRgFunc.setText(String.valueOf(employeeList.get(listIndexEmployee).getRg()));
        txtCpfFunc.setText(String.valueOf(employeeList.get(listIndexEmployee).getCpf()));
        if (employeeList.get(listIndexEmployee).getStatus()) cboxStatusFunc.setSelectedIndex(1);
        else cboxStatusFunc.setSelectedIndex(0);
        //
    }
    
    private void showProductList()
    {
        //
    }
    
    private void showOpertorList()
    {
        txtIdUser.setText(String.valueOf(operatorList.get(listIndexOperator).getId()));
        txtNameUser.setText(operatorList.get(listIndexOperator).getName());
        txtAgeUser.setText(String.valueOf(operatorList.get(listIndexOperator).getAge()));
        txtAddrUser.setText(operatorList.get(listIndexOperator).getAddress());
        txtRgUser.setText(String.valueOf(operatorList.get(listIndexOperator).getRg()));
        txtCpfUser.setText(String.valueOf(operatorList.get(listIndexOperator).getCpf()));
        if (operatorList.get(listIndexOperator).getStatus()) cboxStatusUser.setSelectedIndex(1);
        else cboxStatusUser.setSelectedIndex(0);
        //
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frameInter = new javax.swing.JInternalFrame();
        pnlLogin = new javax.swing.JPanel();
        lblUserLogin = new javax.swing.JLabel();
        txtUserLogin = new javax.swing.JTextField();
        lblPassLogin = new javax.swing.JLabel();
        txtPassLogin = new javax.swing.JPasswordField();
        btnCancelLogin = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        tabs = new javax.swing.JTabbedPane();
        pnlRegisterClients = new javax.swing.JPanel();
        lblIdClient = new javax.swing.JLabel();
        lblNameClient = new javax.swing.JLabel();
        lblAgeClient = new javax.swing.JLabel();
        lblAddrClient = new javax.swing.JLabel();
        lblRgClient = new javax.swing.JLabel();
        lblCpfClient = new javax.swing.JLabel();
        lblStatusClient = new javax.swing.JLabel();
        lblWalletId = new javax.swing.JLabel();
        lblWalBal = new javax.swing.JLabel();
        txtIdClient = new javax.swing.JTextField();
        txtNameClient = new javax.swing.JTextField();
        txtAgeClient = new javax.swing.JTextField();
        txtAddrClient = new javax.swing.JTextField();
        txtRgClient = new javax.swing.JTextField();
        txtCpfClient = new javax.swing.JTextField();
        cboxStatusClient = new javax.swing.JComboBox<>();
        txtWalletId = new javax.swing.JTextField();
        txtWallBallance = new javax.swing.JTextField();
        btnPrevClient = new javax.swing.JButton();
        btnNextClient = new javax.swing.JButton();
        btnGoToHomeClient = new javax.swing.JButton();
        btnGoToEndClient = new javax.swing.JButton();
        btnNewClient = new javax.swing.JButton();
        btnChangeClient = new javax.swing.JButton();
        btnCancelClient = new javax.swing.JButton();
        btnSaveClient = new javax.swing.JButton();
        pnlRegisterFuncs = new javax.swing.JPanel();
        lblIdFunc = new javax.swing.JLabel();
        lblNameFunc = new javax.swing.JLabel();
        lblAgeFunc = new javax.swing.JLabel();
        lblAddrFunc = new javax.swing.JLabel();
        lblRgFunc = new javax.swing.JLabel();
        lblCpfFunc = new javax.swing.JLabel();
        lblStatusFunc = new javax.swing.JLabel();
        txtIdFunc = new javax.swing.JTextField();
        txtNameFunc = new javax.swing.JTextField();
        txtAgeFunc = new javax.swing.JTextField();
        txtAddrFunc = new javax.swing.JTextField();
        txtRgFunc = new javax.swing.JTextField();
        txtCpfFunc = new javax.swing.JTextField();
        cboxStatusFunc = new javax.swing.JComboBox<>();
        btnPrevFunc = new javax.swing.JButton();
        btnNextFunc = new javax.swing.JButton();
        btnGoToHomeFunc = new javax.swing.JButton();
        btnGoToEndFunc = new javax.swing.JButton();
        btnNewFunc = new javax.swing.JButton();
        btnChangeFunc = new javax.swing.JButton();
        btnCancelFunc = new javax.swing.JButton();
        btnSaveFunc = new javax.swing.JButton();
        lblOffice = new javax.swing.JLabel();
        txtOffice = new javax.swing.JTextField();
        lblEmployeeDesc = new javax.swing.JLabel();
        txtEmployeeDesc = new javax.swing.JTextField();
        lblSalary = new javax.swing.JLabel();
        txtSalary = new javax.swing.JTextField();
        pnlRegisterProduts = new javax.swing.JPanel();
        cboxStatusUser1 = new javax.swing.JComboBox<>();
        btnPrevProduct = new javax.swing.JButton();
        btnNextProduct = new javax.swing.JButton();
        btnGoToHomeProduct = new javax.swing.JButton();
        btnGoToEndProduct = new javax.swing.JButton();
        btnNewProduct = new javax.swing.JButton();
        btnChangeProduct = new javax.swing.JButton();
        btnCancelProduct = new javax.swing.JButton();
        btnSaveProduct = new javax.swing.JButton();
        lblIdProduct = new javax.swing.JLabel();
        txtIdProduct = new javax.swing.JTextField();
        lblNameProduct = new javax.swing.JLabel();
        txtNameProduct = new javax.swing.JTextField();
        lblDescProduct = new javax.swing.JLabel();
        txtDescProduct = new javax.swing.JTextField();
        lblAmoutProduct = new javax.swing.JLabel();
        txtAmoutProduct = new javax.swing.JTextField();
        lblPriceProduct = new javax.swing.JLabel();
        txtPriceProduct = new javax.swing.JTextField();
        lblHeightProduct = new javax.swing.JLabel();
        txtHeightProduct = new javax.swing.JTextField();
        lblWidthProduct = new javax.swing.JLabel();
        txtWidthProduct = new javax.swing.JTextField();
        lblWeightProduct = new javax.swing.JLabel();
        txtWeightProduct = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        pnlRegisterUsers = new javax.swing.JPanel();
        lblIdUser = new javax.swing.JLabel();
        lblNameUser = new javax.swing.JLabel();
        lblAgeUser = new javax.swing.JLabel();
        lblAddrUser = new javax.swing.JLabel();
        lblRgUser = new javax.swing.JLabel();
        lblCpfUser = new javax.swing.JLabel();
        lblStatusUser = new javax.swing.JLabel();
        txtIdUser = new javax.swing.JTextField();
        txtNameUser = new javax.swing.JTextField();
        txtAgeUser = new javax.swing.JTextField();
        txtAddrUser = new javax.swing.JTextField();
        txtRgUser = new javax.swing.JTextField();
        txtCpfUser = new javax.swing.JTextField();
        cboxStatusUser = new javax.swing.JComboBox<>();
        btnPrevUser = new javax.swing.JButton();
        btnNextUser = new javax.swing.JButton();
        btnGoToHomeUser = new javax.swing.JButton();
        btnGoToEndUser = new javax.swing.JButton();
        btnNewUser = new javax.swing.JButton();
        btnChangeUser = new javax.swing.JButton();
        btnCancelUser = new javax.swing.JButton();
        btnSaveUser = new javax.swing.JButton();
        lblOperUser = new javax.swing.JLabel();
        txtOperUser = new javax.swing.JTextField();
        lbcOperPass = new javax.swing.JLabel();
        txtOperPass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Gestão Empresarial by Tulio Adriano Muniz (Makesys Tecnologia)");
        setSize(new java.awt.Dimension(800, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new java.awt.CardLayout());

        frameInter.setVisible(true);
        frameInter.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUserLogin.setText("Usuário:");
        pnlLogin.add(lblUserLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 14, -1, -1));
        pnlLogin.add(txtUserLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 12, 160, -1));

        lblPassLogin.setText("Senha:");
        pnlLogin.add(lblPassLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 53, -1, -1));

        txtPassLogin.setColumns(16);
        pnlLogin.add(txtPassLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 51, 161, -1));

        btnCancelLogin.setText("Cancelar");
        btnCancelLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelLoginActionPerformed(evt);
            }
        });
        pnlLogin.add(btnCancelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 90, -1, -1));

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        pnlLogin.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 90, -1, -1));

        frameInter.getContentPane().add(pnlLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 240, 130));

        getContentPane().add(frameInter, "card4");

        pnlRegisterClients.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIdClient.setText("Código:");
        pnlRegisterClients.add(lblIdClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 14, -1, -1));

        lblNameClient.setText("Nome:");
        pnlRegisterClients.add(lblNameClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 49, -1, -1));

        lblAgeClient.setText("Idade:");
        pnlRegisterClients.add(lblAgeClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 14, -1, -1));

        lblAddrClient.setText("Endereço:");
        pnlRegisterClients.add(lblAddrClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 74, -1, -1));

        lblRgClient.setText("RG:");
        pnlRegisterClients.add(lblRgClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 101, -1, -1));

        lblCpfClient.setText("CPF:");
        pnlRegisterClients.add(lblCpfClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 101, -1, -1));

        lblStatusClient.setText("Situação:");
        pnlRegisterClients.add(lblStatusClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 131, -1, -1));

        lblWalletId.setText("Carteira:");
        pnlRegisterClients.add(lblWalletId, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 131, -1, -1));

        lblWalBal.setText("Saldo da Carteira R$:");
        pnlRegisterClients.add(lblWalBal, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 160, -1, -1));

        txtIdClient.setEnabled(false);
        pnlRegisterClients.add(txtIdClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 12, 96, -1));

        txtNameClient.setEnabled(false);
        pnlRegisterClients.add(txtNameClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 45, 472, -1));

        txtAgeClient.setEnabled(false);
        pnlRegisterClients.add(txtAgeClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 12, 79, -1));

        txtAddrClient.setEnabled(false);
        pnlRegisterClients.add(txtAddrClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 72, 459, -1));

        txtRgClient.setEnabled(false);
        pnlRegisterClients.add(txtRgClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 99, 201, -1));

        txtCpfClient.setEnabled(false);
        pnlRegisterClients.add(txtCpfClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 99, 201, -1));

        cboxStatusClient.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bloqueado", "Ativo" }));
        cboxStatusClient.setEnabled(false);
        pnlRegisterClients.add(cboxStatusClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 126, 123, -1));

        txtWalletId.setEnabled(false);
        pnlRegisterClients.add(txtWalletId, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 129, 143, -1));

        txtWallBallance.setEnabled(false);
        pnlRegisterClients.add(txtWallBallance, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 158, 117, -1));

        btnPrevClient.setText("<");
        btnPrevClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevClientActionPerformed(evt);
            }
        });
        pnlRegisterClients.add(btnPrevClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        btnNextClient.setText(">");
        btnNextClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextClientActionPerformed(evt);
            }
        });
        pnlRegisterClients.add(btnNextClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        btnGoToHomeClient.setText("<<");
        btnGoToHomeClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoToHomeClientActionPerformed(evt);
            }
        });
        pnlRegisterClients.add(btnGoToHomeClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        btnGoToEndClient.setText(">>");
        btnGoToEndClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoToEndClientActionPerformed(evt);
            }
        });
        pnlRegisterClients.add(btnGoToEndClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));

        btnNewClient.setText("Novo");
        btnNewClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewClientActionPerformed(evt);
            }
        });
        pnlRegisterClients.add(btnNewClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, -1, -1));

        btnChangeClient.setText("Alterar");
        btnChangeClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeClientActionPerformed(evt);
            }
        });
        pnlRegisterClients.add(btnChangeClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, -1, -1));

        btnCancelClient.setText("Cancelar");
        btnCancelClient.setEnabled(false);
        btnCancelClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelClientActionPerformed(evt);
            }
        });
        pnlRegisterClients.add(btnCancelClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, -1, -1));

        btnSaveClient.setText("Salvar");
        btnSaveClient.setEnabled(false);
        btnSaveClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveClientActionPerformed(evt);
            }
        });
        pnlRegisterClients.add(btnSaveClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, -1, -1));

        tabs.addTab("Cadastros de clientes", pnlRegisterClients);

        pnlRegisterFuncs.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIdFunc.setText("Código:");
        pnlRegisterFuncs.add(lblIdFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 14, -1, -1));

        lblNameFunc.setText("Nome:");
        pnlRegisterFuncs.add(lblNameFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 49, -1, -1));

        lblAgeFunc.setText("Idade:");
        pnlRegisterFuncs.add(lblAgeFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 14, -1, -1));

        lblAddrFunc.setText("Endereço:");
        pnlRegisterFuncs.add(lblAddrFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 74, -1, -1));

        lblRgFunc.setText("RG:");
        pnlRegisterFuncs.add(lblRgFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 101, -1, -1));

        lblCpfFunc.setText("CPF:");
        pnlRegisterFuncs.add(lblCpfFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 101, -1, -1));

        lblStatusFunc.setText("Situação:");
        pnlRegisterFuncs.add(lblStatusFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 131, -1, -1));

        txtIdFunc.setEnabled(false);
        pnlRegisterFuncs.add(txtIdFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 12, 96, -1));

        txtNameFunc.setEnabled(false);
        pnlRegisterFuncs.add(txtNameFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 45, 472, -1));

        txtAgeFunc.setEnabled(false);
        pnlRegisterFuncs.add(txtAgeFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 12, 79, -1));

        txtAddrFunc.setEnabled(false);
        pnlRegisterFuncs.add(txtAddrFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 72, 459, -1));

        txtRgFunc.setEnabled(false);
        pnlRegisterFuncs.add(txtRgFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 99, 201, -1));

        txtCpfFunc.setEnabled(false);
        pnlRegisterFuncs.add(txtCpfFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 99, 201, -1));

        cboxStatusFunc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bloqueado", "Ativo" }));
        cboxStatusFunc.setEnabled(false);
        pnlRegisterFuncs.add(cboxStatusFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 126, 123, -1));

        btnPrevFunc.setText("<");
        btnPrevFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevFuncActionPerformed(evt);
            }
        });
        pnlRegisterFuncs.add(btnPrevFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        btnNextFunc.setText(">");
        btnNextFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextFuncActionPerformed(evt);
            }
        });
        pnlRegisterFuncs.add(btnNextFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        btnGoToHomeFunc.setText("<<");
        btnGoToHomeFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoToHomeFuncActionPerformed(evt);
            }
        });
        pnlRegisterFuncs.add(btnGoToHomeFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        btnGoToEndFunc.setText(">>");
        btnGoToEndFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoToEndFuncActionPerformed(evt);
            }
        });
        pnlRegisterFuncs.add(btnGoToEndFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));

        btnNewFunc.setText("Novo");
        btnNewFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewFuncActionPerformed(evt);
            }
        });
        pnlRegisterFuncs.add(btnNewFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, -1, -1));

        btnChangeFunc.setText("Alterar");
        btnChangeFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeFuncActionPerformed(evt);
            }
        });
        pnlRegisterFuncs.add(btnChangeFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, -1, -1));

        btnCancelFunc.setText("Cancelar");
        btnCancelFunc.setEnabled(false);
        btnCancelFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelFuncActionPerformed(evt);
            }
        });
        pnlRegisterFuncs.add(btnCancelFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, -1, -1));

        btnSaveFunc.setText("Salvar");
        btnSaveFunc.setEnabled(false);
        btnSaveFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveFuncActionPerformed(evt);
            }
        });
        pnlRegisterFuncs.add(btnSaveFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, -1, -1));

        lblOffice.setText("Ocupação:");
        pnlRegisterFuncs.add(lblOffice, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, -1));

        txtOffice.setEnabled(false);
        pnlRegisterFuncs.add(txtOffice, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 200, -1));

        lblEmployeeDesc.setText("Descrição:");
        pnlRegisterFuncs.add(lblEmployeeDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        txtEmployeeDesc.setEnabled(false);
        pnlRegisterFuncs.add(txtEmployeeDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 170, -1));

        lblSalary.setText("Salário:");
        pnlRegisterFuncs.add(lblSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, -1, -1));

        txtSalary.setEnabled(false);
        pnlRegisterFuncs.add(txtSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 200, -1));

        tabs.addTab("Cadastros de Funcionarios", pnlRegisterFuncs);

        pnlRegisterProduts.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cboxStatusUser1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bloqueado", "Ativo" }));
        cboxStatusUser1.setEnabled(false);
        pnlRegisterProduts.add(cboxStatusUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 123, -1));

        btnPrevProduct.setText("<");
        btnPrevProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevProductActionPerformed(evt);
            }
        });
        pnlRegisterProduts.add(btnPrevProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        btnNextProduct.setText(">");
        btnNextProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextProductActionPerformed(evt);
            }
        });
        pnlRegisterProduts.add(btnNextProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        btnGoToHomeProduct.setText("<<");
        btnGoToHomeProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoToHomeProductActionPerformed(evt);
            }
        });
        pnlRegisterProduts.add(btnGoToHomeProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        btnGoToEndProduct.setText(">>");
        btnGoToEndProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoToEndProductActionPerformed(evt);
            }
        });
        pnlRegisterProduts.add(btnGoToEndProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));

        btnNewProduct.setText("Novo");
        btnNewProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewProductActionPerformed(evt);
            }
        });
        pnlRegisterProduts.add(btnNewProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, -1, -1));

        btnChangeProduct.setText("Alterar");
        btnChangeProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeProductActionPerformed(evt);
            }
        });
        pnlRegisterProduts.add(btnChangeProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, -1, -1));

        btnCancelProduct.setText("Cancelar");
        btnCancelProduct.setEnabled(false);
        btnCancelProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelProductActionPerformed(evt);
            }
        });
        pnlRegisterProduts.add(btnCancelProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, -1, -1));

        btnSaveProduct.setText("Salvar");
        btnSaveProduct.setEnabled(false);
        btnSaveProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveProductActionPerformed(evt);
            }
        });
        pnlRegisterProduts.add(btnSaveProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, -1, -1));

        lblIdProduct.setText("Codigo:");
        pnlRegisterProduts.add(lblIdProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        txtIdProduct.setEnabled(false);
        pnlRegisterProduts.add(txtIdProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 70, -1));

        lblNameProduct.setText("Nome:");
        pnlRegisterProduts.add(lblNameProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        txtNameProduct.setEnabled(false);
        pnlRegisterProduts.add(txtNameProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 360, -1));

        lblDescProduct.setText("Descrição:");
        pnlRegisterProduts.add(lblDescProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        txtDescProduct.setEnabled(false);
        pnlRegisterProduts.add(txtDescProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 500, -1));

        lblAmoutProduct.setText("Quantidade:");
        pnlRegisterProduts.add(lblAmoutProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        txtAmoutProduct.setEnabled(false);
        pnlRegisterProduts.add(txtAmoutProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 90, -1));

        lblPriceProduct.setText("Preço:");
        pnlRegisterProduts.add(lblPriceProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, -1));

        txtPriceProduct.setEnabled(false);
        pnlRegisterProduts.add(txtPriceProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 90, -1));

        lblHeightProduct.setText("Altura:");
        pnlRegisterProduts.add(lblHeightProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, -1, -1));

        txtHeightProduct.setEnabled(false);
        pnlRegisterProduts.add(txtHeightProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 90, -1));

        lblWidthProduct.setText("Largura:");
        pnlRegisterProduts.add(lblWidthProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        txtWidthProduct.setEnabled(false);
        pnlRegisterProduts.add(txtWidthProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 100, -1));

        lblWeightProduct.setText("Peso:");
        pnlRegisterProduts.add(lblWeightProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, -1));

        txtWeightProduct.setEnabled(false);
        pnlRegisterProduts.add(txtWeightProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 80, -1));

        jLabel1.setText("Situação:");
        pnlRegisterProduts.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, -1, -1));

        tabs.addTab("Cadastros de Produtos", pnlRegisterProduts);

        pnlRegisterUsers.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIdUser.setText("Código:");
        pnlRegisterUsers.add(lblIdUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 14, -1, -1));

        lblNameUser.setText("Nome:");
        pnlRegisterUsers.add(lblNameUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 49, -1, -1));

        lblAgeUser.setText("Idade:");
        pnlRegisterUsers.add(lblAgeUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 14, -1, -1));

        lblAddrUser.setText("Endereço:");
        pnlRegisterUsers.add(lblAddrUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 74, -1, -1));

        lblRgUser.setText("RG:");
        pnlRegisterUsers.add(lblRgUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 101, -1, -1));

        lblCpfUser.setText("CPF:");
        pnlRegisterUsers.add(lblCpfUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 101, -1, -1));

        lblStatusUser.setText("Situação:");
        pnlRegisterUsers.add(lblStatusUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 131, -1, -1));

        txtIdUser.setEnabled(false);
        pnlRegisterUsers.add(txtIdUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 12, 96, -1));

        txtNameUser.setEnabled(false);
        pnlRegisterUsers.add(txtNameUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 45, 472, -1));

        txtAgeUser.setEnabled(false);
        pnlRegisterUsers.add(txtAgeUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 12, 79, -1));

        txtAddrUser.setEnabled(false);
        pnlRegisterUsers.add(txtAddrUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 72, 459, -1));

        txtRgUser.setEnabled(false);
        pnlRegisterUsers.add(txtRgUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 99, 201, -1));

        txtCpfUser.setEnabled(false);
        pnlRegisterUsers.add(txtCpfUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 99, 201, -1));

        cboxStatusUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bloqueado", "Ativo" }));
        cboxStatusUser.setEnabled(false);
        pnlRegisterUsers.add(cboxStatusUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 126, 123, -1));

        btnPrevUser.setText("<");
        btnPrevUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevUserActionPerformed(evt);
            }
        });
        pnlRegisterUsers.add(btnPrevUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        btnNextUser.setText(">");
        btnNextUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextUserActionPerformed(evt);
            }
        });
        pnlRegisterUsers.add(btnNextUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        btnGoToHomeUser.setText("<<");
        btnGoToHomeUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoToHomeUserActionPerformed(evt);
            }
        });
        pnlRegisterUsers.add(btnGoToHomeUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        btnGoToEndUser.setText(">>");
        btnGoToEndUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoToEndUserActionPerformed(evt);
            }
        });
        pnlRegisterUsers.add(btnGoToEndUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));

        btnNewUser.setText("Novo");
        btnNewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewUserActionPerformed(evt);
            }
        });
        pnlRegisterUsers.add(btnNewUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, -1, -1));

        btnChangeUser.setText("Alterar");
        btnChangeUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeUserActionPerformed(evt);
            }
        });
        pnlRegisterUsers.add(btnChangeUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, -1, -1));

        btnCancelUser.setText("Cancelar");
        btnCancelUser.setEnabled(false);
        btnCancelUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelUserActionPerformed(evt);
            }
        });
        pnlRegisterUsers.add(btnCancelUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, -1, -1));

        btnSaveUser.setText("Salvar");
        btnSaveUser.setEnabled(false);
        btnSaveUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveUserActionPerformed(evt);
            }
        });
        pnlRegisterUsers.add(btnSaveUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, -1, -1));

        lblOperUser.setText("Usuário:");
        pnlRegisterUsers.add(lblOperUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, -1, -1));

        txtOperUser.setEnabled(false);
        pnlRegisterUsers.add(txtOperUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 190, -1));

        lbcOperPass.setText("Senha:");
        pnlRegisterUsers.add(lbcOperPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        txtOperPass.setColumns(16);
        txtOperPass.setText("jPasswordField1");
        txtOperPass.setEnabled(false);
        pnlRegisterUsers.add(txtOperPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 120, -1));

        tabs.addTab("Logins", pnlRegisterUsers);

        getContentPane().add(tabs, "card4");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelLoginActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnCancelLoginActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        if ((txtUserLogin.getText().length() == 0) && (txtPassLogin.getPassword().length == 0)) {
            JOptionPane.showMessageDialog(null,"Digite seu usuário e sua senha.","Login",1);
        } else if ((txtUserLogin.getText().length() == 0) && (txtPassLogin.getPassword().length != 0)) {
            JOptionPane.showMessageDialog(null,"Digite seu usuário.","Login",1); 
        } else if ((txtUserLogin.getText().length() != 0) && (txtPassLogin.getPassword().length == 0)) {
            JOptionPane.showMessageDialog(null,"Digite sua senha.","Login",1);
        } else {
            if (dm.getLogin(txtUserLogin.getText(),txtPassLogin.getText())) {
                JOptionPane.showMessageDialog(null,"Logado com sucesso!","Login",1);
                frameInter.setEnabled(false);
                frameInter.setVisible(false);
                tabs.setEnabled(true);
                tabs.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null,"Usuário e senha inválido!","Login",1);
            }
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnPrevClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevClientActionPerformed
        // TODO add your handling code here:
        if (listIndexClient > 0) {
            listIndexClient--;
            curIdClient = clientList.get(listIndexClient).getId();
            showClientList();
        }
    }//GEN-LAST:event_btnPrevClientActionPerformed

    private void btnNextClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextClientActionPerformed
        // TODO add your handling code here:
        if ((listIndexClient >= 0) && (listIndexClient < (totalIndexClient-1))) {
            listIndexClient++;
            curIdClient = clientList.get(listIndexClient).getId();
            showClientList();
        }
    }//GEN-LAST:event_btnNextClientActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        curIdClient = clientList.get(listIndexClient).getId();
        txtIdClient.setText(String.valueOf(clientList.get(listIndexClient).getId()));
        showClientList();
    }//GEN-LAST:event_formWindowActivated

    private void btnGoToHomeClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoToHomeClientActionPerformed
        // TODO add your handling code here:
        listIndexClient = 0;
        curIdClient = clientList.get(listIndexClient).getId();
        showClientList();
    }//GEN-LAST:event_btnGoToHomeClientActionPerformed

    private void btnGoToEndClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoToEndClientActionPerformed
        // TODO add your handling code here:
        listIndexClient = totalIndexClient-1;
        curIdClient = clientList.get(listIndexClient).getId();
        showClientList();
    }//GEN-LAST:event_btnGoToEndClientActionPerformed

    private void btnNewClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewClientActionPerformed
        lastIdClient = curIdClient;
        curIdClient = totalIndexClient+1;
        txtIdClient.setText(String.valueOf(curIdClient));
        txtNameClient.setEnabled(true);
        txtNameClient.setText("");
        txtAgeClient.setEnabled(true);
        txtAgeClient.setText("");
        txtAddrClient.setEnabled(true);
        txtAddrClient.setText("");
        txtRgClient.setEnabled(true);
        txtRgClient.setText("");
        txtCpfClient.setEnabled(true);
        txtCpfClient.setText("");
        cboxStatusClient.setEnabled(true);
        cboxStatusClient.setSelectedIndex(1);
        txtWalletId.setEnabled(true);
        txtWalletId.setText("");
        txtWallBallance.setEnabled(true);
        txtWallBallance.setText("");
        btnPrevClient.setEnabled(false);
        btnNextClient.setEnabled(false);
        btnGoToHomeClient.setEnabled(false);
        btnGoToEndClient.setEnabled(false);
        btnNewClient.setEnabled(false);
        btnChangeClient.setEnabled(false);
        btnCancelClient.setEnabled(true);
        btnSaveClient.setEnabled(true);
    }//GEN-LAST:event_btnNewClientActionPerformed

    private void btnChangeClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeClientActionPerformed
        // TODO add your handling code here:
        lastIdClient = curIdClient;
        txtNameClient.setEnabled(true);
        txtAgeClient.setEnabled(true);
        txtAddrClient.setEnabled(true);
        txtRgClient.setEnabled(true);
        txtCpfClient.setEnabled(true);
        cboxStatusClient.setEnabled(true);
        txtWalletId.setEnabled(true);
        txtWallBallance.setEnabled(true);
        btnPrevClient.setEnabled(false);
        btnNextClient.setEnabled(false);
        btnGoToHomeClient.setEnabled(false);
        btnGoToEndClient.setEnabled(false);
        btnNewClient.setEnabled(false);
        btnChangeClient.setEnabled(false);
        btnCancelClient.setEnabled(true);
        btnSaveClient.setEnabled(true);
        
    }//GEN-LAST:event_btnChangeClientActionPerformed

    private void btnCancelClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelClientActionPerformed
        // TODO add your handling code here:
        curIdClient = lastIdClient;
        txtIdClient.setText(String.valueOf(curIdClient));
        txtNameClient.setEnabled(false);
        txtAgeClient.setEnabled(false);
        txtAddrClient.setEnabled(false);
        txtRgClient.setEnabled(false);
        txtCpfClient.setEnabled(false);
        cboxStatusClient.setEnabled(false);
        txtWalletId.setEnabled(false);
        txtWallBallance.setEnabled(false);
        btnPrevClient.setEnabled(true);
        btnNextClient.setEnabled(true);
        btnGoToHomeClient.setEnabled(true);
        btnGoToEndClient.setEnabled(true);
        btnNewClient.setEnabled(true);
        btnChangeClient.setEnabled(true);
        btnCancelClient.setEnabled(false);
        btnSaveClient.setEnabled(false);
        reloadClientList();
    }//GEN-LAST:event_btnCancelClientActionPerformed

    private void btnSaveClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveClientActionPerformed
        // TODO add your handling code here:
        Clients client = new Clients();
        client.setId(curIdClient);
        txtIdClient.setText(String.valueOf(curIdClient));
        client.setName(txtNameClient.getText());
        txtNameClient.setEnabled(false);
        client.setAge(Integer.parseInt(txtAgeClient.getText()));
        txtAgeClient.setEnabled(false);
        client.setAddress(txtAddrClient.getText());
        txtAddrClient.setEnabled(false);
        client.setRg(Integer.parseInt(txtRgClient.getText()));
        txtRgClient.setEnabled(false);
        client.setCpf(Integer.parseInt(txtCpfClient.getText()));
        txtCpfClient.setEnabled(false);
        if (cboxStatusClient.getSelectedItem() == "Ativo") {
            client.setStatus(true);
            cboxStatusClient.setSelectedIndex(1);
        }
        else {
            client.setStatus(false);
            cboxStatusClient.setSelectedIndex(0);
        }
        cboxStatusClient.setEnabled(false);
        client.setWalletId(Integer.parseInt(txtRgClient.getText()));
        txtWalletId.setEnabled(false);
        client.setWalletBallance(Double.parseDouble(txtRgClient.getText()));
        txtWallBallance.setEnabled(false);
        btnPrevClient.setEnabled(true);
        btnNextClient.setEnabled(true);
        btnGoToHomeClient.setEnabled(true);
        btnGoToEndClient.setEnabled(true);
        btnNewClient.setEnabled(true);
        btnChangeClient.setEnabled(true);
        btnCancelClient.setEnabled(false);
        btnSaveClient.setEnabled(false);
        if (curIdClient > lastIdClient) {
            lastIdClient = curIdClient;
            listIndexClient = lastIdClient-1;
            dm.insertClients(client);
        } else dm.updateClients(client);
        reloadClientList();
    }//GEN-LAST:event_btnSaveClientActionPerformed

    private void btnPrevFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrevFuncActionPerformed

    private void btnNextFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNextFuncActionPerformed

    private void btnGoToHomeFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoToHomeFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGoToHomeFuncActionPerformed

    private void btnGoToEndFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoToEndFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGoToEndFuncActionPerformed

    private void btnNewFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNewFuncActionPerformed

    private void btnChangeFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnChangeFuncActionPerformed

    private void btnCancelFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelFuncActionPerformed

    private void btnSaveFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveFuncActionPerformed

    private void btnPrevProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrevProductActionPerformed

    private void btnNextProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNextProductActionPerformed

    private void btnGoToHomeProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoToHomeProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGoToHomeProductActionPerformed

    private void btnGoToEndProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoToEndProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGoToEndProductActionPerformed

    private void btnNewProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNewProductActionPerformed

    private void btnChangeProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnChangeProductActionPerformed

    private void btnCancelProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelProductActionPerformed

    private void btnSaveProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveProductActionPerformed

    private void btnPrevUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrevUserActionPerformed

    private void btnNextUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNextUserActionPerformed

    private void btnGoToHomeUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoToHomeUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGoToHomeUserActionPerformed

    private void btnGoToEndUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoToEndUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGoToEndUserActionPerformed

    private void btnNewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNewUserActionPerformed

    private void btnChangeUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnChangeUserActionPerformed

    private void btnCancelUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelUserActionPerformed

    private void btnSaveUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveUserActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelClient;
    private javax.swing.JButton btnCancelFunc;
    private javax.swing.JButton btnCancelLogin;
    private javax.swing.JButton btnCancelProduct;
    private javax.swing.JButton btnCancelUser;
    private javax.swing.JButton btnChangeClient;
    private javax.swing.JButton btnChangeFunc;
    private javax.swing.JButton btnChangeProduct;
    private javax.swing.JButton btnChangeUser;
    private javax.swing.JButton btnGoToEndClient;
    private javax.swing.JButton btnGoToEndFunc;
    private javax.swing.JButton btnGoToEndProduct;
    private javax.swing.JButton btnGoToEndUser;
    private javax.swing.JButton btnGoToHomeClient;
    private javax.swing.JButton btnGoToHomeFunc;
    private javax.swing.JButton btnGoToHomeProduct;
    private javax.swing.JButton btnGoToHomeUser;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnNewClient;
    private javax.swing.JButton btnNewFunc;
    private javax.swing.JButton btnNewProduct;
    private javax.swing.JButton btnNewUser;
    private javax.swing.JButton btnNextClient;
    private javax.swing.JButton btnNextFunc;
    private javax.swing.JButton btnNextProduct;
    private javax.swing.JButton btnNextUser;
    private javax.swing.JButton btnPrevClient;
    private javax.swing.JButton btnPrevFunc;
    private javax.swing.JButton btnPrevProduct;
    private javax.swing.JButton btnPrevUser;
    private javax.swing.JButton btnSaveClient;
    private javax.swing.JButton btnSaveFunc;
    private javax.swing.JButton btnSaveProduct;
    private javax.swing.JButton btnSaveUser;
    private javax.swing.JComboBox<String> cboxStatusClient;
    private javax.swing.JComboBox<String> cboxStatusFunc;
    private javax.swing.JComboBox<String> cboxStatusUser;
    private javax.swing.JComboBox<String> cboxStatusUser1;
    private javax.swing.JInternalFrame frameInter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbcOperPass;
    private javax.swing.JLabel lblAddrClient;
    private javax.swing.JLabel lblAddrFunc;
    private javax.swing.JLabel lblAddrUser;
    private javax.swing.JLabel lblAgeClient;
    private javax.swing.JLabel lblAgeFunc;
    private javax.swing.JLabel lblAgeUser;
    private javax.swing.JLabel lblAmoutProduct;
    private javax.swing.JLabel lblCpfClient;
    private javax.swing.JLabel lblCpfFunc;
    private javax.swing.JLabel lblCpfUser;
    private javax.swing.JLabel lblDescProduct;
    private javax.swing.JLabel lblEmployeeDesc;
    private javax.swing.JLabel lblHeightProduct;
    private javax.swing.JLabel lblIdClient;
    private javax.swing.JLabel lblIdFunc;
    private javax.swing.JLabel lblIdProduct;
    private javax.swing.JLabel lblIdUser;
    private javax.swing.JLabel lblNameClient;
    private javax.swing.JLabel lblNameFunc;
    private javax.swing.JLabel lblNameProduct;
    private javax.swing.JLabel lblNameUser;
    private javax.swing.JLabel lblOffice;
    private javax.swing.JLabel lblOperUser;
    private javax.swing.JLabel lblPassLogin;
    private javax.swing.JLabel lblPriceProduct;
    private javax.swing.JLabel lblRgClient;
    private javax.swing.JLabel lblRgFunc;
    private javax.swing.JLabel lblRgUser;
    private javax.swing.JLabel lblSalary;
    private javax.swing.JLabel lblStatusClient;
    private javax.swing.JLabel lblStatusFunc;
    private javax.swing.JLabel lblStatusUser;
    private javax.swing.JLabel lblUserLogin;
    private javax.swing.JLabel lblWalBal;
    private javax.swing.JLabel lblWalletId;
    private javax.swing.JLabel lblWeightProduct;
    private javax.swing.JLabel lblWidthProduct;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPanel pnlRegisterClients;
    private javax.swing.JPanel pnlRegisterFuncs;
    private javax.swing.JPanel pnlRegisterProduts;
    private javax.swing.JPanel pnlRegisterUsers;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTextField txtAddrClient;
    private javax.swing.JTextField txtAddrFunc;
    private javax.swing.JTextField txtAddrUser;
    private javax.swing.JTextField txtAgeClient;
    private javax.swing.JTextField txtAgeFunc;
    private javax.swing.JTextField txtAgeUser;
    private javax.swing.JTextField txtAmoutProduct;
    private javax.swing.JTextField txtCpfClient;
    private javax.swing.JTextField txtCpfFunc;
    private javax.swing.JTextField txtCpfUser;
    private javax.swing.JTextField txtDescProduct;
    private javax.swing.JTextField txtEmployeeDesc;
    private javax.swing.JTextField txtHeightProduct;
    private javax.swing.JTextField txtIdClient;
    private javax.swing.JTextField txtIdFunc;
    private javax.swing.JTextField txtIdProduct;
    private javax.swing.JTextField txtIdUser;
    private javax.swing.JTextField txtNameClient;
    private javax.swing.JTextField txtNameFunc;
    private javax.swing.JTextField txtNameProduct;
    private javax.swing.JTextField txtNameUser;
    private javax.swing.JTextField txtOffice;
    private javax.swing.JPasswordField txtOperPass;
    private javax.swing.JTextField txtOperUser;
    private javax.swing.JPasswordField txtPassLogin;
    private javax.swing.JTextField txtPriceProduct;
    private javax.swing.JTextField txtRgClient;
    private javax.swing.JTextField txtRgFunc;
    private javax.swing.JTextField txtRgUser;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JTextField txtUserLogin;
    private javax.swing.JTextField txtWallBallance;
    private javax.swing.JTextField txtWalletId;
    private javax.swing.JTextField txtWeightProduct;
    private javax.swing.JTextField txtWidthProduct;
    // End of variables declaration//GEN-END:variables
}
