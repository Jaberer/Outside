/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MinesweeperPackage;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Panel;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.SwingUtilities;

/**
 *
 *  Joseph Zhong
 *  Minesweeper - Java (v2.85)
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

    private static final int MEDIUM_X = 700;
    private static final int MEDIUM_Y = 700;

    private static final int HARD_X = 1024;
    private static final int HARD_Y = 640;

    private static Dimension FrameSize;
    private static Dimension PanelSize;

    private static GameControl MainManager;
    private static MinesweeperButton[][] ButtonGrid;

    private static boolean isGridConstructed;

    /**
     * Creates new form MinesweeperGUI
     */
    public MinesweeperGUI()
    {
        isGridConstructed = false;
        initComponents();
        this.setTitle("Minesweeper");
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

        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel1KeyPressed(evt);
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    }//GEN-LAST:event_EasyButtonMouseReleased
*/
    private void EasyButtonMouseReleased(java.awt.event.MouseEvent evt)
    {
        if(isGridConstructed)
        {
            jPanel1.removeAll();
            constructMinesweeper("easy");
        }
        else
        {
            isGridConstructed = true;
            constructMinesweeper("easy");
        }
    }

    private void constructMinesweeper(String difficulty)
    {
        MainManager = new GameControl(difficulty);

        ButtonGrid = new MinesweeperButton[MainManager.getMainGrid().getLength(false)][MainManager.getMainGrid().getLength(true)];
       // produce a GUI grid

        for(int y = 0; y < MainManager.getMainGrid().getLength(false); y++)
        {
            for(int x = 0; x < MainManager.getMainGrid().getLength(true); x++)
            {
                ButtonGrid[y][x] = new MinesweeperButton(" ");
                ActionListener ButtonClick;
                MouseListener MouseClick;

                MouseClick =  new MouseListener()
                {
                    //boolean pressed;

                            @Override
                            public void mouseClicked(MouseEvent e)
                            {
//                                throw new UnsupportedOperationException("Not supported yet.");
                                System.out.println("Click Successful");
                            }

                            @Override
                            public void mousePressed(MouseEvent e)
                            {
                                AbstractButton abstractButton = (AbstractButton) e.getSource();
                                abstractButton.getModel().setArmed(true);
                                abstractButton.getModel().setPressed(true);

                            }

                            @Override
                            public void mouseReleased(MouseEvent e)
                            {
                                AbstractButton abstractButton = (AbstractButton) e.getSource();

                                int y = 0; int x = 0;
                                outerloop:
                                for(y = 0; y < ButtonGrid.length; y++)
                                {
                                    for(x = 0; x < ButtonGrid[1].length; x++)
                                    {
                                        if(abstractButton.equals(ButtonGrid[y][x]))
                                        {
                                            break outerloop;
                                        }
                                    }
                                }
                                System.out.println(y + " " + x);

                                // prepare special icons
                                ImageIcon FlagIcon;
                                FlagIcon = new ImageIcon("C://Users/Joseph/Downloads/GitHub/Outside/2013/Minesweeper/src/Images/FlagImage.png");
                                ImageIcon MineIcon;
                                MineIcon = new ImageIcon("C://Users/Joseph/Downloads/GitHub/Outside/2013/Minesweeper/src/Images/MineImage.png");

                                // prepare resize
                                Image MineImage = MineIcon.getImage(); // transform it
                                Image FlagImage = FlagIcon.getImage();

                                int maxSize = Math.max(abstractButton.getHeight(), abstractButton.getWidth()) / 2;

                                Image rescaledImage;
                                ImageIcon imageIcon;

                                // right click flag
                                if(SwingUtilities.isRightMouseButton(e) && !abstractButton.isSelected())
                                {
                                    /*
                                    if(abstractButton.isEnabled())
                                    {
                                        rescaledImage = FlagImage.getScaledInstance(maxSize, maxSize, Image.SCALE_SMOOTH);
                                        imageIcon = new ImageIcon(rescaledImage);
                                        JLabel iconLabel = new JLabel(imageIcon);
                                        abstractButton.add(iconLabel);

                                        abstractButton.setEnabled(false);
                                    }
                                    else if(!abstractButton.isEnabled())
                                    {
                                        abstractButton.setEnabled(true);
                                        abstractButton.removeAll();
                                    }
                                    * */
                                    rescaledImage = FlagImage.getScaledInstance(maxSize, maxSize, Image.SCALE_SMOOTH);
                                    imageIcon = new ImageIcon(rescaledImage);
                                    JLabel iconLabel = new JLabel(imageIcon);
                                    abstractButton.add(iconLabel);
                                }
                                else
                                {
                                    if(SwingUtilities.isLeftMouseButton(e) && abstractButton.isEnabled())
                                    {
                                        for(int r = 0; r < ButtonGrid.length; r++)
                                        {
                                            for(int c = 0; c < ButtonGrid[1].length; c++)
                                            {
                                                // select box internally and set number externally
                                                if(abstractButton.equals(ButtonGrid[r][c]))
                                                {
                                                    MainManager.getMainGrid().selectBox(r, c);
                                                    String displayText = MainManager.getMainGrid().getDisplay(r, c);
                                                    if(displayText.equals("9"))
                                                    {
                                                        rescaledImage = MineImage.getScaledInstance(maxSize, maxSize, Image.SCALE_SMOOTH); // scale it the smooth way
                                                        imageIcon = new ImageIcon(rescaledImage);  // transform it back

                                                        JLabel test1 = new JLabel(imageIcon);

                                                        ButtonGrid[r][c].setBackground(Color.red);
                                                        ButtonGrid[r][c].add(test1);
                                                    }
                                                    else
                                                    {
                                                         abstractButton.setText(displayText);

                                                         resetFont(displayText, r, c);

                                                         break; // apparently that made all the differnece lol
                                                    }
                                                }
                                            }
                                        }

                                        for(int r = 0; r < ButtonGrid.length; r++)
                                        {

                                            for(int c = 0; c < ButtonGrid[1].length; c++)
                                            {
                                                // check for zeros
                                                String displayText = MainManager.getMainGrid().getDisplay(r, c);
                                                if(!(displayText.equals("_"))
                                                        && !displayText.equals("9"))
                                                {
                                                    ButtonGrid[r][c].setSelected(true);
                                                    ButtonGrid[r][c].setText(displayText);

                                                    resetFont(displayText, r, c);
                                                }
                                            }
                                        }

                                        if(abstractButton.isSelected())
                                        {
                                            System.out.println("Selected");
                                        }
                                        else
                                        {
                                            System.out.println("Not Un-Selected");
                                            abstractButton.setSelected(true);
                                        }
                                    }
                                }
                            }

                            @Override
                            public void mouseEntered(MouseEvent e)
                            {
                                //throw new UnsupportedOperationException("Not supported yet.");
                                AbstractButton abstractButton = (AbstractButton) e.getSource();
                                abstractButton.getModel().setArmed(true);
                            }

                            @Override
                            public void mouseExited(MouseEvent e)
                            {
                                //throw new UnsupportedOperationException("Not supported yet.");
                                AbstractButton abstractButton = (AbstractButton) e.getSource();
                                abstractButton.getModel().setArmed(false);
                            }
                };

                ButtonClick = new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                    }
                };

//                ButtonGrid[y][x].addActionListener(ButtonClick);
                ButtonGrid[y][x].addMouseListener(MouseClick);
                jPanel1.add(ButtonGrid[y][x]);

                System.out.println(y + ", " + x); // debug
            }
        }

        this.setResizable(false); // MUST PUT THIS LINE BEFORE BOUNDS AND SIZES ARE SET

        FrameSize = new Dimension(EASY_X, EASY_Y);
        PanelSize = new Dimension(EASY_X, EASY_Y);

        this.setSize(FrameSize);
        this.setLocation(300, 100);

        jPanel1.setPreferredSize(PanelSize);

        jPanel1.setLayout(new GridLayout(MainManager.getMainGrid().getLength(true), MainManager.getMainGrid().getLength(false)));
        this.setVisible(true);

        this.pack();
    }

     private void resetFont(String displayNumber, int _r, int _c)
     {
         int height = ButtonGrid[_r][_c].getHeight() / 2;
         Font numberFont = (new Font("sansserif", Font.BOLD, height));

         ButtonGrid[_r][_c].setFont(numberFont);

         if(displayNumber.equals("9"))
         {
             ButtonGrid[_r][_c].setForeground(new Color(255, 0, 0)); // 0,130,200 is a pretty and solid cyan blue
         }
         else
         {
             ButtonGrid[_r][_c].setForeground(new Color(0, 130, 200)); // 0,130,200 is a pretty and solid cyan blue
         }


         ButtonGrid[_r][_c].repaint();
     }

    private void MediumButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MediumButtonMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_MediumButtonMouseReleased

    private void HardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HardButtonActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_HardButtonActionPerformed

    private void HardButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HardButtonMouseReleased
        // TODO add your handling code here:
        MainManager = new GameControl("hard");
    }//GEN-LAST:event_HardButtonMouseReleased

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
        checkF2Key(evt);
    }//GEN-LAST:event_formKeyPressed

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        // TODO add your handling code here:
        for(int r = 0; r < ButtonGrid.length; r++)
        {
            for(int c = 0; c < ButtonGrid[1].length; c++)
            {
                {
                    System.out.println(evt.getX() + " " + evt.getY());
                }
            }
        }


    }//GEN-LAST:event_formMouseReleased

    private void jPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyPressed
        // TODO add your handling code here:
        checkF2Key(evt);
        //checkTestCMD(evt);
    }//GEN-LAST:event_jPanel1KeyPressed

    private void checkF2Key(KeyEvent evt)
    {
        if(evt.getKeyCode() == 113)
        {
            System.out.println(evt.getKeyCode());
            EasyButtonMouseReleased(null);
        }
    }

    private void checkTestCMD(KeyEvent evt)
    {
        if(evt.getKeyCode() == 114)
        {
            System.out.println(evt.getKeyCode());
            jPanel1.removeAll();
            constructMinesweeper("test");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
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
