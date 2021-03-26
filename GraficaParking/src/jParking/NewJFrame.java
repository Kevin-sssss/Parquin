package jParking;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import com.sun.speech.freetts.VoiceManager;
import com.sun.speech.freetts.Voice;


public class NewJFrame extends javax.swing.JFrame {

    int[][] matrix;
    int rowval;
    int colval;
    JLabel[] jlRow;
    JLabel[] jlCol;

    int count = 0;

    int nMax[];
    JButton[][] jb;
    Color[] color;
    int contador = 0;
    final int Fmax = 8, Cmax = 10;

    public NewJFrame() {
        initComponents();
        initConfig();
        initConfigScreen();
    }

    private void initConfigScreen() {
        this.setLocationRelativeTo(this);
        this.getContentPane().setBackground(Color.gray);

        //  StyledDocument doc = jParqui.getStyledDocument();
        SimpleAttributeSet center = new SimpleAttributeSet();
        StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);

    }

    private void initConfig() {

        jlRow = new JLabel[]{
            jLabelR1, jLabelR2, jLabelR3, jLabelR4, jLabelR5, jLabelR6, jLabelR7, jLabelR8,};
        jlCol = new JLabel[]{
            jLabelC1, jLabelC2, jLabelC3, jLabelC4, jLabelC5, jLabelC6, jLabelC7, jLabelC8, jLabelC9, jLabelC10
        };

        color = new Color[]{Color.BLUE, Color.RED, Color.YELLOW};

        jb = new JButton[][]{
            {b1, b2, b3, b4, b5, b6, b7, b8, b9, b10},
            {b11, b12, b13, b14, b15, b16, b17, b18, b19, b20},
            {b21, b22, b23, b24, b25, b26, b27, b28, b29, b30},
            {b31, b32, b33, b34, b35, b36, b37, b38, b39, b40},
            {b41, b42, b43, b44, b45, b46, b47, b48, b49, b50},
            {b51, b52, b53, b54, b55, b56, b57, b58, b59, b60},
            {b61, b62, b63, b64, b65, b66, b67, b68, b69, b70},
            {b71, b72, b73, b74, b75, b76, b77, b78, b79, b80}
        };

        matrix = new int[Fmax + 1][Cmax + 1];
        for (int f = 0; f < Fmax; f++) {
            for (int c = 0; c < Cmax; c++) {
                jb[f][c].setName(f + "" + c);
                jb[f][c].setBackground(color[0]);
            }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        butonainfo = new javax.swing.JButton();
        b51 = new javax.swing.JButton();
        b31 = new javax.swing.JButton();
        b21 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b11 = new javax.swing.JButton();
        b71 = new javax.swing.JButton();
        b41 = new javax.swing.JButton();
        b61 = new javax.swing.JButton();
        b52 = new javax.swing.JButton();
        b32 = new javax.swing.JButton();
        b22 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b12 = new javax.swing.JButton();
        b72 = new javax.swing.JButton();
        b42 = new javax.swing.JButton();
        b62 = new javax.swing.JButton();
        b53 = new javax.swing.JButton();
        b33 = new javax.swing.JButton();
        b23 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b13 = new javax.swing.JButton();
        b73 = new javax.swing.JButton();
        b43 = new javax.swing.JButton();
        b63 = new javax.swing.JButton();
        b54 = new javax.swing.JButton();
        b34 = new javax.swing.JButton();
        b24 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b14 = new javax.swing.JButton();
        b74 = new javax.swing.JButton();
        b44 = new javax.swing.JButton();
        b64 = new javax.swing.JButton();
        b55 = new javax.swing.JButton();
        b35 = new javax.swing.JButton();
        b25 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b15 = new javax.swing.JButton();
        b75 = new javax.swing.JButton();
        b45 = new javax.swing.JButton();
        b65 = new javax.swing.JButton();
        b56 = new javax.swing.JButton();
        b36 = new javax.swing.JButton();
        b26 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b16 = new javax.swing.JButton();
        b76 = new javax.swing.JButton();
        b46 = new javax.swing.JButton();
        b66 = new javax.swing.JButton();
        b57 = new javax.swing.JButton();
        b37 = new javax.swing.JButton();
        b27 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b17 = new javax.swing.JButton();
        b77 = new javax.swing.JButton();
        b47 = new javax.swing.JButton();
        b67 = new javax.swing.JButton();
        b58 = new javax.swing.JButton();
        b38 = new javax.swing.JButton();
        b28 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b18 = new javax.swing.JButton();
        b78 = new javax.swing.JButton();
        b48 = new javax.swing.JButton();
        b68 = new javax.swing.JButton();
        b59 = new javax.swing.JButton();
        b39 = new javax.swing.JButton();
        b29 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b19 = new javax.swing.JButton();
        b79 = new javax.swing.JButton();
        b49 = new javax.swing.JButton();
        b69 = new javax.swing.JButton();
        b60 = new javax.swing.JButton();
        b40 = new javax.swing.JButton();
        b30 = new javax.swing.JButton();
        b10 = new javax.swing.JButton();
        b20 = new javax.swing.JButton();
        b80 = new javax.swing.JButton();
        b50 = new javax.swing.JButton();
        b70 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Info = new javax.swing.JLabel();
        InfoD = new javax.swing.JLabel();
        InfoT = new javax.swing.JLabel();
        InfoC = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelR1 = new javax.swing.JLabel();
        jLabelR2 = new javax.swing.JLabel();
        jLabelR3 = new javax.swing.JLabel();
        jLabelR4 = new javax.swing.JLabel();
        jLabelR5 = new javax.swing.JLabel();
        jLabelR6 = new javax.swing.JLabel();
        jLabelR7 = new javax.swing.JLabel();
        jLabelR8 = new javax.swing.JLabel();
        jLabelC1 = new javax.swing.JLabel();
        jLabelC2 = new javax.swing.JLabel();
        jLabelC3 = new javax.swing.JLabel();
        jLabelC4 = new javax.swing.JLabel();
        jLabelC5 = new javax.swing.JLabel();
        jLabelC6 = new javax.swing.JLabel();
        jLabelC7 = new javax.swing.JLabel();
        jLabelC8 = new javax.swing.JLabel();
        jLabelC9 = new javax.swing.JLabel();
        jLabelC10 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PARKING");

        butonainfo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        butonainfo.setText("Info");
        butonainfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonainfoActionPerformed(evt);
            }
        });

        b51.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b51.setText("0");
        b51.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b31.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b31.setText("0");
        b31.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b21.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b21.setText("0");
        b21.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b1.setText("0");
        b1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b11.setText("0");
        b11.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b71.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b71.setText("0");
        b71.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b71.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b41.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b41.setText("0");
        b41.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b61.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b61.setText("0");
        b61.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b61.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b52.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b52.setText("0");
        b52.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b32.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b32.setText("0");
        b32.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b22.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b22.setText("0");
        b22.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b2.setText("0");
        b2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b12.setText("0");
        b12.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b72.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b72.setText("0");
        b72.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b72.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b42.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b42.setText("0");
        b42.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b62.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b62.setText("0");
        b62.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b62.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b53.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b53.setText("0");
        b53.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b33.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b33.setText("0");
        b33.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b23.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b23.setText("0");
        b23.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b3.setText("0");
        b3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b13.setText("0");
        b13.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b73.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b73.setText("0");
        b73.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b73.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b43.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b43.setText("0");
        b43.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b63.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b63.setText("0");
        b63.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b63.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b54.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b54.setText("0");
        b54.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b34.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b34.setText("0");
        b34.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b24.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b24.setText("0");
        b24.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b4.setText("0");
        b4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b14.setText("0");
        b14.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b74.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b74.setText("0");
        b74.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b74.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b44.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b44.setText("0");
        b44.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b64.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b64.setText("0");
        b64.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b64.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b55.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b55.setText("0");
        b55.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b35.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b35.setText("0");
        b35.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b25.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b25.setText("0");
        b25.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b5.setText("0");
        b5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b15.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b15.setText("0");
        b15.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b75.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b75.setText("0");
        b75.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b75.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b45.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b45.setText("0");
        b45.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b65.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b65.setText("0");
        b65.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b65.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b56.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b56.setText("0");
        b56.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b56.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b36.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b36.setText("0");
        b36.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b26.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b26.setText("0");
        b26.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b6.setText("0");
        b6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b16.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b16.setText("0");
        b16.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b76.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b76.setText("0");
        b76.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b76.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b46.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b46.setText("0");
        b46.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b66.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b66.setText("0");
        b66.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b66.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b57.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b57.setText("0");
        b57.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b57.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b37.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b37.setText("0");
        b37.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b27.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b27.setText("0");
        b27.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b7.setText("0");
        b7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b17.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b17.setText("0");
        b17.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b77.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b77.setText("0");
        b77.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b77.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b47.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b47.setText("0");
        b47.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b67.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b67.setText("0");
        b67.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b67.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b58.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b58.setText("0");
        b58.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b58.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b38.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b38.setText("0");
        b38.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b28.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b28.setText("0");
        b28.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b8.setText("0");
        b8.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b18.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b18.setText("0");
        b18.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b78.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b78.setText("0");
        b78.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b78.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b48.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b48.setText("0");
        b48.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b68.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b68.setText("0");
        b68.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b68.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b59.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b59.setText("0");
        b59.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b59.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b39.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b39.setText("0");
        b39.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b29.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b29.setText("0");
        b29.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b9.setText("0");
        b9.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b19.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b19.setText("0");
        b19.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b79.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b79.setText("0");
        b79.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b79.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b49.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b49.setText("0");
        b49.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b69.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b69.setText("0");
        b69.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b69.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b60.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b60.setText("0");
        b60.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b60.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b40.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b40.setText("0");
        b40.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b30.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b30.setText("0");
        b30.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b10.setText("0");
        b10.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b20.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b20.setText("0");
        b20.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b80.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b80.setText("0");
        b80.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b80.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b50.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b50.setText("0");
        b50.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b70.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        b70.setText("0");
        b70.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                b1MouseMoved(evt);
            }
        });
        b70.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("About Autor");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Info.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        Info.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Info.setText("?");

        InfoD.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        InfoD.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        InfoD.setText("?");

        InfoT.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        InfoT.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        InfoT.setText("?");

        InfoC.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        InfoC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        InfoC.setText("?");

        jLabel1.setBackground(new java.awt.Color(204, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("The total number of cars?");

        jLabel2.setBackground(new java.awt.Color(204, 0, 0));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Places availables?");

        jLabel4.setBackground(new java.awt.Color(204, 0, 0));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Percentage of ocupation?");

        jLabel5.setBackground(new java.awt.Color(204, 0, 0));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Total of number cars entered?");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Info, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(InfoC)
                    .addComponent(InfoT)
                    .addComponent(InfoD))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(Info)
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addGap(52, 52, 52)
                .addComponent(InfoD)
                .addGap(38, 38, 38)
                .addComponent(jLabel4)
                .addGap(48, 48, 48)
                .addComponent(InfoT)
                .addGap(54, 54, 54)
                .addComponent(jLabel5)
                .addGap(40, 40, 40)
                .addComponent(InfoC)
                .addGap(35, 35, 35))
        );

        jLabelR1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelR1.setText("10");

        jLabelR2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelR2.setText("10");

        jLabelR3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelR3.setText("10");

        jLabelR4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelR4.setText("10");

        jLabelR5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelR5.setText("10");

        jLabelR6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelR6.setText("10");

        jLabelR7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelR7.setText("10");

        jLabelR8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelR8.setText("10");

        jLabelC1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelC1.setText("8");

        jLabelC2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelC2.setText("8");

        jLabelC3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelC3.setText("8");

        jLabelC4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelC4.setText("8");

        jLabelC5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelC5.setText("8");

        jLabelC6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelC6.setText("8");

        jLabelC7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelC7.setText("8");

        jLabelC8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelC8.setText("8");

        jLabelC9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelC9.setText("8");

        jLabelC10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelC10.setText("8");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(589, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b61, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(b41, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(b51, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(b31, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(b71, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(b11)
                            .addComponent(b1)
                            .addComponent(b21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelC1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(b62, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(b42, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(b52, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(b32, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(b72, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(b12)
                                .addComponent(b22, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(b2))
                            .addComponent(jLabelC2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelC3)
                                .addGap(38, 38, 38)
                                .addComponent(jLabelC4)
                                .addGap(26, 26, 26))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(b63, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(b43, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(b53, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(b33, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(b73, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(b13)
                                    .addComponent(b23, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(b3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(b64, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(b44, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(b54, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(b34, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(b74, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(b14)
                                    .addComponent(b24, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(b4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b65, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(b45, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(b55, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(b35, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(b75, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(b15)
                            .addComponent(b25, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(b5)
                            .addComponent(jLabelC5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(b66, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(b46, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(b56, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(b36, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(b76, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(b16)
                                    .addComponent(b6)
                                    .addComponent(b26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(b67, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(b47, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(b57, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(b37, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(b77, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(b17)
                                        .addComponent(b27, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(b7))
                                    .addComponent(jLabelC7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(b68, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(b48, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(b58, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(b38, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(b78, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(b18)
                                        .addComponent(b28, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(b8))
                                    .addComponent(jLabelC8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(b69, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(b49, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(b59, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(b39, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(b79, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(b19)
                                        .addComponent(b29, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(b9))
                                    .addComponent(jLabelC9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelC10)
                                            .addComponent(b70)
                                            .addComponent(b80)
                                            .addComponent(b60)
                                            .addComponent(b50)
                                            .addComponent(b40))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(b30)
                                            .addComponent(b20)
                                            .addComponent(b10))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelC6)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(butonainfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelR1)
                    .addComponent(jLabelR2)
                    .addComponent(jLabelR3)
                    .addComponent(jLabelR4)
                    .addComponent(jLabelR5)
                    .addComponent(jLabelR6)
                    .addComponent(jLabelR8)
                    .addComponent(jLabelR7))
                .addGap(86, 86, 86)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(butonainfo)
                        .addGap(31, 31, 31)
                        .addComponent(jButton1)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b11)
                                .addGap(52, 52, 52)
                                .addComponent(b31))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(b22)
                                    .addComponent(b21))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b32))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b33))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b34))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b35))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b36))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b37))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b38))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(b9)
                                    .addComponent(b10)
                                    .addComponent(jLabelR1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(b19)
                                    .addComponent(b20)
                                    .addComponent(jLabelR2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(b29)
                                    .addComponent(b30)
                                    .addComponent(jLabelR3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(b39)
                                    .addComponent(b40)
                                    .addComponent(jLabelR4))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b41)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b51)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b61)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b71))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b42)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b52)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b62)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b72))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b43)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b53)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b63)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b73))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b44)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b54)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b64)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b74))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b45)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b55)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b65)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b75))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b46)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b56)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b66)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b76))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b47)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b57)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b67)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b77))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b48)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b58)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b68)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b78))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(b50, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(b49)
                                    .addComponent(jLabelR5, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(b59)
                                    .addComponent(b60)
                                    .addComponent(jLabelR6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(b70)
                                        .addComponent(b69))
                                    .addComponent(jLabelR7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(b79)
                                    .addComponent(b80)
                                    .addComponent(jLabelR8)))))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelC1)
                    .addComponent(jLabelC2)
                    .addComponent(jLabelC3)
                    .addComponent(jLabelC4)
                    .addComponent(jLabelC5)
                    .addComponent(jLabelC6)
                    .addComponent(jLabelC7)
                    .addComponent(jLabelC8)
                    .addComponent(jLabelC9)
                    .addComponent(jLabelC10))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butonainfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonainfoActionPerformed
        Info.setText("The total number of places is " + 80);
        int formula = count;
        int ocupa = 80 - count;
        int f2 = (ocupa * 100) / 80;
        InfoD.setText("Places availables: " + formula);
        InfoT.setText("The percentage of ocupation is " + f2 + "%");
        InfoC.setText("The total number of cars entered is " + ocupa);

       
        
        VoiceManager manager = VoiceManager.getInstance();
        Voice voz = manager.getVoice("kevin16");
        voz.allocate();
        voz.speak("" + Info.getText());
        voz.speak("" + InfoD.getText());
        voz.speak("" + InfoT.getText());
        voz.speak("" + InfoC.getText());
        voz.deallocate();
    }//GEN-LAST:event_butonainfoActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        JButton jbt = (JButton) evt.getSource();
        String name = jbt.getName();
        int c = Integer.parseInt(name.charAt(1) + "");
        int f = name.charAt(0) - '0';
        System.out.println(f + ":" + c);

        matrix[f][c] = 1 - matrix[f][c];

        jb[f][c].setBackground(color[matrix[f][c]]);
        CalculateRowsFree();
        CalculateColFree();
    }//GEN-LAST:event_b1ActionPerformed

    private void b1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseMoved

        JButton jbt = (JButton) evt.getSource();
        String name = jbt.getName();
        int c = Integer.parseInt(name.charAt(1) + "");
        int f = name.charAt(0) - '0';

        jb[f][c].setBackground(color[2]);
    }//GEN-LAST:event_b1MouseMoved

    private void b1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseExited
        JButton jbt = (JButton) evt.getSource();
        String name = jbt.getName();
        int c = Integer.parseInt(name.charAt(1) + "");
        int f = name.charAt(0) - '0';

        jb[f][c].setBackground(color[matrix[f][c]]);
    }//GEN-LAST:event_b1MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Autor v2 = new Autor(this, true);
        v2.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

    }//GEN-LAST:event_jButton1MouseClicked

    private void CalculateRowsFree() {
        count = 0;

        for (int f = 0; f < Fmax; f++) {//recorrer filas
            matrix[f][Cmax] = 0;
            for (int c = 0; c < Cmax; c++) {//recorriendo columnas
                if (matrix[f][c] == 0) {
                    matrix[f][Cmax]++;
                    count++;
                }
            }
            jlRow[f].setText(String.valueOf(matrix[f][Cmax]));
        }
    }

    private void CalculateColFree() {
        count = 0;
        for (int c = 0; c < Cmax; c++) {
            matrix[Fmax][c] = 0;
            for (int f = 0; f < Fmax; f++) {//recorriendo columnas
                if (matrix[f][c] == 0) {
                    matrix[Fmax][c]++;
                    count++;
                }
            }

            jlCol[c].setText(String.valueOf(matrix[Fmax][c]));
        }
    }

    /**
     *
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Info;
    private javax.swing.JLabel InfoC;
    private javax.swing.JLabel InfoD;
    private javax.swing.JLabel InfoT;
    private javax.swing.JButton b1;
    private javax.swing.JButton b10;
    private javax.swing.JButton b11;
    private javax.swing.JButton b12;
    private javax.swing.JButton b13;
    private javax.swing.JButton b14;
    private javax.swing.JButton b15;
    private javax.swing.JButton b16;
    private javax.swing.JButton b17;
    private javax.swing.JButton b18;
    private javax.swing.JButton b19;
    private javax.swing.JButton b2;
    private javax.swing.JButton b20;
    private javax.swing.JButton b21;
    private javax.swing.JButton b22;
    private javax.swing.JButton b23;
    private javax.swing.JButton b24;
    private javax.swing.JButton b25;
    private javax.swing.JButton b26;
    private javax.swing.JButton b27;
    private javax.swing.JButton b28;
    private javax.swing.JButton b29;
    private javax.swing.JButton b3;
    private javax.swing.JButton b30;
    private javax.swing.JButton b31;
    private javax.swing.JButton b32;
    private javax.swing.JButton b33;
    private javax.swing.JButton b34;
    private javax.swing.JButton b35;
    private javax.swing.JButton b36;
    private javax.swing.JButton b37;
    private javax.swing.JButton b38;
    private javax.swing.JButton b39;
    private javax.swing.JButton b4;
    private javax.swing.JButton b40;
    private javax.swing.JButton b41;
    private javax.swing.JButton b42;
    private javax.swing.JButton b43;
    private javax.swing.JButton b44;
    private javax.swing.JButton b45;
    private javax.swing.JButton b46;
    private javax.swing.JButton b47;
    private javax.swing.JButton b48;
    private javax.swing.JButton b49;
    private javax.swing.JButton b5;
    private javax.swing.JButton b50;
    private javax.swing.JButton b51;
    private javax.swing.JButton b52;
    private javax.swing.JButton b53;
    private javax.swing.JButton b54;
    private javax.swing.JButton b55;
    private javax.swing.JButton b56;
    private javax.swing.JButton b57;
    private javax.swing.JButton b58;
    private javax.swing.JButton b59;
    private javax.swing.JButton b6;
    private javax.swing.JButton b60;
    private javax.swing.JButton b61;
    private javax.swing.JButton b62;
    private javax.swing.JButton b63;
    private javax.swing.JButton b64;
    private javax.swing.JButton b65;
    private javax.swing.JButton b66;
    private javax.swing.JButton b67;
    private javax.swing.JButton b68;
    private javax.swing.JButton b69;
    private javax.swing.JButton b7;
    private javax.swing.JButton b70;
    private javax.swing.JButton b71;
    private javax.swing.JButton b72;
    private javax.swing.JButton b73;
    private javax.swing.JButton b74;
    private javax.swing.JButton b75;
    private javax.swing.JButton b76;
    private javax.swing.JButton b77;
    private javax.swing.JButton b78;
    private javax.swing.JButton b79;
    private javax.swing.JButton b8;
    private javax.swing.JButton b80;
    private javax.swing.JButton b9;
    private javax.swing.JButton butonainfo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelC1;
    private javax.swing.JLabel jLabelC10;
    private javax.swing.JLabel jLabelC2;
    private javax.swing.JLabel jLabelC3;
    private javax.swing.JLabel jLabelC4;
    private javax.swing.JLabel jLabelC5;
    private javax.swing.JLabel jLabelC6;
    private javax.swing.JLabel jLabelC7;
    private javax.swing.JLabel jLabelC8;
    private javax.swing.JLabel jLabelC9;
    private javax.swing.JLabel jLabelR1;
    private javax.swing.JLabel jLabelR2;
    private javax.swing.JLabel jLabelR3;
    private javax.swing.JLabel jLabelR4;
    private javax.swing.JLabel jLabelR5;
    private javax.swing.JLabel jLabelR6;
    private javax.swing.JLabel jLabelR7;
    private javax.swing.JLabel jLabelR8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
