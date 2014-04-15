/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MinesweeperPackage;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToggleButton;

/**
 * 
 *  Joseph Zhong
 *  Minesweeper - Java (v2.5)
 *  This program is the GUI Object for my overall Minesweeper Project
 *  Minesweeper - GUI Object 
 *  1 April 2014
 * 
 */


public class MinesweeperGUI extends javax.swing.JFrame 
{
    // visual stuff
    private static final int EASY_X = 500;
    private static final int EASY_Y = 500;
    
    private static final int MEDIUM_X = 500;
    private static final int MEDIUM_Y = 500;
    
    private static final int HARD_X = 1024;
    private static final int HARD_Y = 640;
    
    private static Dimension FrameSize;
    private static Dimension PanelSize;
    
    private static GameControl MainManager;
    private static JToggleButton[][] ButtonGrid;
//    private static Container test;
    
    /**
     * Creates new form MinesweeperGUI
     */
    public MinesweeperGUI()
    {
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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        jPopupMenu4 = new javax.swing.JPopupMenu();
        jPopupMenu5 = new javax.swing.JPopupMenu();
        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        javax.swing.JMenu FileMenu = new javax.swing.JMenu();
        NewGameMenu = new javax.swing.JMenu();
        EasyButton = new javax.swing.JMenuItem();
        MediumButton = new javax.swing.JMenuItem();
        HardButton = new javax.swing.JMenuItem();
        QuitButton = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 438, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 331, Short.MAX_VALUE)
        );

        FileMenu.setText("File");

        NewGameMenu.setText("New Game");

        EasyButton.setText("Easy");
        EasyButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                EasyButtonMouseReleased(evt);
            }
        });
        NewGameMenu.add(EasyButton);

        MediumButton.setText("Medium");
        MediumButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                MediumButtonMouseReleased(evt);
            }
        });
        NewGameMenu.add(MediumButton);

        HardButton.setText("Hard");
        HardButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                HardButtonMouseReleased(evt);
            }
        });
        HardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HardButtonActionPerformed(evt);
            }
        });
        NewGameMenu.add(HardButton);

        FileMenu.add(NewGameMenu);

        QuitButton.setText("Quit");
        QuitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                QuitButtonMouseReleased(evt);
            }
        });
        FileMenu.add(QuitButton);

        jMenuBar1.add(FileMenu);

        jMenu2.setText("Help");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 137, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 133, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Exit method. 
     *  Exits the program as does Alt+F4 or Clicking the Red X in the upper right 
     *  corner. 
     * @param evt User Mouse Click release.
     */
    private void QuitButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuitButtonMouseReleased
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_QuitButtonMouseReleased

    /**
     * Constructor Method.
     * Constructs the easy grid.
     * @param evt 
     */
    /*
    private void EasyButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EasyButtonMouseReleased
        // TODO add your handling code here:
        this.setSize(EASY_X, EASY_Y);
        //this.add(new JFrame());
        
        MainManager.constructGrid("easy");
        ButtonGrid = new JToggleButton[MainManager.getMainGrid().getLength(false)][MainManager.getMainGrid().getLength(true)];
        // produce a GUI grid
        for(int y = 0; y < MainManager.getMainGrid().getLength(false); y++)
        {
            for(int x = 0; x < MainManager.getMainGrid().getLength(true); x++)
            {
                ButtonGrid[y][x] = new javax.swing.JToggleButton();
                jFrame1.add(ButtonGrid[y][x]);
                jFrame1.setLayout(new FlowLayout());
                ButtonGrid[y][x].setLocation(EASY_X / (x+1), EASY_Y / (y+1));
                //ButtonGrid[y][x].setVisible(true);
                jFrame1.setVisible(true);
                //jPanel1.add(ButtonGrid[y][x]);
                System.out.println(y + ", " + x);
            }
        }
    }//GEN-LAST:event_EasyButtonMouseReleased
*/
    /*
    private void EasyButtonMouseReleased(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        //this.setSize(EASY_X, EASY_Y);
        //jFrame1.setSize(EASY_X, EASY_Y);
        
        FrameSize = new Dimension(EASY_X, EASY_Y);
        jFrame1.setPreferredSize(FrameSize);
        jFrame1.setSize(FrameSize);
        jPanel1.setSize(EASY_X, EASY_Y - jMenuBar1.getHeight());
        jPanel1.setLocation(0, jMenuBar1.getHeight());
        
        //this.add(new JFrame());
        
        MainManager.constructGrid("easy");
        ButtonGrid = new JToggleButton[MainManager.getMainGrid().getLength(false)][MainManager.getMainGrid().getLength(true)];
        // produce a GUI grid
        for(int y = 0; y < MainManager.getMainGrid().getLength(false); y++)
        {
            for(int x = 0; x < MainManager.getMainGrid().getLength(true); x++)
            {
                ButtonGrid[y][x] = new javax.swing.JToggleButton();
                jPanel1.add(ButtonGrid[y][x]);
                
                //ButtonGrid[y][x].setLocation(EASY_X / (x+1), EASY_Y / (y+1));
                //ButtonGrid[y][x].setVisible(true);
                
                jPanel1.setVisible(true);
                //this.setVisible(true);
                //jPanel1.add(ButtonGrid[y][x]);
                System.out.println(y + ", " + x); // debug
            }
        }
        //this.setSize(EASY_X, EASY_Y);
        
        //jFrame1.setSize(EASY_X, EASY_Y - jMenuBar1.getHeight());
        
        jPanel1.setPreferredSize(FrameSize);
        jPanel1.setBounds(0, jMenuBar1.getHeight(), EASY_X, EASY_Y - jMenuBar1.getHeight());
        
        jPanel1.setLayout(new GridLayout(9, 9));
        jFrame1.pack();
    }
    */
    
       private void EasyButtonMouseReleased(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        //this.setSize(EASY_X, EASY_Y);
        //jFrame1.setSize(EASY_X, EASY_Y);
        /*
        FrameSize = new Dimension(EASY_X, EASY_Y);
        jFrame1.setPreferredSize(FrameSize);
        jFrame1.setSize(FrameSize);
        jPanel1.setSize(EASY_X, EASY_Y - jMenuBar1.getHeight());
        jPanel1.setLocation(0, jMenuBar1.getHeight());
        */
        //this.add(new JFrame());
        
        MainManager.constructGrid("easy");
        ButtonGrid = new JToggleButton[MainManager.getMainGrid().getLength(false)][MainManager.getMainGrid().getLength(true)];
        // produce a GUI grid
        
        for(int y = 0; y < MainManager.getMainGrid().getLength(false); y++)
        {
            for(int x = 0; x < MainManager.getMainGrid().getLength(true); x++)
            {
        /*
        for(int y = 0; y < 2; y++)
        {
            for(int x = 0; x < 2; x++)
            {
        */
                
                ButtonGrid[y][x] = new JToggleButton(" ");
                ActionListener ButtonClick = new ActionListener() 
                {
                   @Override
                   public void actionPerformed(ActionEvent e) 
                   {
                       AbstractButton abstractButton = (AbstractButton) e.getSource();
                       /*
                       boolean selected = abstractButton.getModel().isSelected();
                       System.out.println("Action - selected=" + selected);
                       * */
                       for(int y = 0; y < ButtonGrid.length; y++)
                       {
                           for(int x = 0; x < ButtonGrid[1].length; x++)
                           {
                               if(abstractButton == ButtonGrid[y][x] && ButtonGrid[y][x].isSelected())
                               {
                                   String text = MainManager.getMainGrid().getBombs(y, x);
                                   ButtonGrid[y][x].setText(text);
                                   int height = ButtonGrid[y][x].getHeight() / 2;
                                   Font test = (new Font("sansserif", Font.BOLD, height));
                                   ButtonGrid[y][x].setFont(test);
                                   ButtonGrid[y][x].setForeground(Color.red);
                                   System.out.println("success");
                                   
                                   ButtonGrid[y][x].repaint();
                                   
                                   
                               }
                               else if(abstractButton == ButtonGrid[y][x] && !ButtonGrid[y][x].isSelected())
                               {
                                   System.out.println("ASDFASDF");
                               }
                           }
                       }
                       //ButtonGrid[y][x].setText(null);
                       //abstractButton.setText("_");
                       //toggleButton1.setSelected(selected);
                   }
                };
                ButtonGrid[y][x].addActionListener(ButtonClick);
                jPanel1.add(ButtonGrid[y][x]);
                
                
                //ButtonGrid[y][x].setBounds(x, y, 10000, 1000);
                
                
                
                //ButtonGrid[y][x].setLocation(EASY_X / (x+1), EASY_Y / (y+1));
                //ButtonGrid[y][x].setVisible(true);
                
                //jPanel1.setVisible(true);
                //this.setVisible(true);
                //jPanel1.add(ButtonGrid[y][x]);
                System.out.println(y + ", " + x); // debug
            }
        }
        //this.setSize(EASY_X, EASY_Y);
        
        //jFrame1.setSize(EASY_X, EASY_Y - jMenuBar1.getHeight());
        /*
        jPanel1.setPreferredSize(FrameSize);
        jPanel1.setBounds(0, jMenuBar1.getHeight(), EASY_X, EASY_Y - jMenuBar1.getHeight());
        */
        
         
        
        FrameSize = new Dimension(EASY_X, EASY_Y);
        PanelSize = new Dimension(EASY_X, EASY_Y - jMenuBar1.getHeight());
//        jFrame1.setPreferredSize(FrameSize);
//        jFrame1.setSize(FrameSize);
        
        this.setSize(FrameSize);
        this.setLocation(300, 200);
        
        jPanel1.setPreferredSize(PanelSize);
        jPanel1.setSize(EASY_X, EASY_Y - jMenuBar1.getHeight());
        jPanel1.setLocation(0, jMenuBar1.getHeight());
        
        
        
        jPanel1.setLayout(new GridLayout(9, 9));
        this.setVisible(true);
        //jFrame1.setVisible(true);
        //jFrame1.pack();
        this.pack();
    }
    
    private void MediumButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MediumButtonMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_MediumButtonMouseReleased

    private void HardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HardButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HardButtonActionPerformed

    private void HardButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HardButtonMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_HardButtonMouseReleased

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == 113)
        {
            System.out.println(evt.getKeyCode());
            EasyButtonMouseReleased(null);
        }
    }//GEN-LAST:event_formKeyPressed

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        // TODO add your handling code here:
        for(int r = 0; r < ButtonGrid.length; r++)
        {
            for(int c = 0; c < ButtonGrid[1].length; c++)
            {
                //if(evt.getX() > ButtonGrid[r][c].getX() && evt.getX() < ButtongGrid[r][c].getX() +  )
                
                {
                    System.out.println(evt.getX() + " " + evt.getY());
                }
            }
        }
        
        
    }//GEN-LAST:event_formMouseReleased
/**/
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
        MainManager = new GameControl();
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try 
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) 
            {
                if ("Nimbus".equals(info.getName())) 
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } 
        catch (ClassNotFoundException ex) 
        {
            java.util.logging.Logger.getLogger(MinesweeperGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex) 
        {
            java.util.logging.Logger.getLogger(MinesweeperGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex) 
        {
            java.util.logging.Logger.getLogger(MinesweeperGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex) 
        {
            java.util.logging.Logger.getLogger(MinesweeperGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            @Override
            public void run() 
            {
                new MinesweeperGUI().setVisible(true);
                //System.out.println("test");
            }
        });
        
        
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem EasyButton;
    private javax.swing.JMenuItem HardButton;
    private javax.swing.JMenuItem MediumButton;
    private javax.swing.JMenu NewGameMenu;
    private javax.swing.JMenuItem QuitButton;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JPopupMenu jPopupMenu4;
    private javax.swing.JPopupMenu jPopupMenu5;
    // End of variables declaration//GEN-END:variables
}
