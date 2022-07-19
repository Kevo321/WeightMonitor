/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WeightMonitor;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**
 *
 * @author Kevon
 */
public class WeightMonitor extends JFrame {
    
    JMenuBar mainMenuBar = new JMenuBar();
    JMenu fileMenu = new JMenu("File");
    JMenuItem newMenuItem = new JMenuItem("New Weight File");
    JMenuItem openMenuItem = new JMenuItem("Open Weight File");
    JMenuItem saveMenuItem = new JMenuItem("Save Weight File");
    JMenuItem exitMenuItem = new JMenuItem("Exit");
    
    JTabbedPane weightTabbedPane = new JTabbedPane();
    JPanel editorPanel = new JPanel();
    WeightPlotPanel plotPanel = new WeightPlotPanel();
    
    
    
    public WeightMonitor()
    {

        // frame constructor 
       setTitle("WeightMonitor");
       setResizable(false);
       
      
       
       addWindowListener(new WindowAdapter()
       {
           public void windowClosing(WindowEvent evt)
           {
               exitForm(evt);
           }
       });
       
       getContentPane().setLayout(new GridBagLayout());
       GridBagConstraints gridConstraints;
       
         pack();
         Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
         setBounds((int)(0.5 * (screenSize.width - getWidth())), (int)(0.5 * (screenSize.height - getHeight())),
               getWidth(),getHeight()); 
       
      
       
       // Build menu structure
       setJMenuBar(mainMenuBar);
       mainMenuBar.add(fileMenu);
       fileMenu.add(newMenuItem);
       fileMenu.add(openMenuItem);
       fileMenu.add(saveMenuItem);
       fileMenu.addSeparator();
       fileMenu.add(exitMenuItem);
       
       newMenuItem.addActionListener(new ActionListener()
       {
          public void actionPerformed(ActionEvent e)
          {
              newMenuItemActionPerformed(e);
          }
       
       });
       
       openMenuItem.addActionListener(new ActionListener()
       {
           public void actionPerformed(ActionEvent e)
           {
              openMenuItemActionPerformed(e);
           }
       });
       
       saveMenuItem.addActionListener(new ActionListener()
       {
           public void actionPerformed(ActionEvent e)
           {
               saveMenuItemActionPerformed(e);
           }
       });
       
       exitMenuItem.addActionListener(new ActionListener()
       {
           public void actionPerformed(ActionEvent e)
           {
               exitMenuItemActionPerformed(e);
           }
       
       
       });
       
        weightTabbedPane.setPreferredSize(new Dimension(500,400));
        weightTabbedPane.addTab("Weight Editor", editorPanel);
        weightTabbedPane.addTab("Weight Plot", plotPanel);
       
       gridConstraints = new GridBagConstraints();
       gridConstraints.gridx = 0;
       gridConstraints.gridy = 0;
       getContentPane().add(weightTabbedPane,gridConstraints);
       editorPanel.setBackground(new Color(192,192,255));
       editorPanel.setLayout(new GridBagLayout());
       plotPanel.setBackground(new Color(255,192,192));
       
       
       
       
       
       
 }
    
   
    
    
    private void exitForm(WindowEvent evt)
    {
        System.exit(0);
    }
   
    private void newMenuItemActionPerformed(ActionEvent e)
    {
        
    }
    
    private void openMenuItemActionPerformed(ActionEvent e)
    {
    }
    
    private void saveMenuItemActionPerformed(ActionEvent e)
    {
    }
    
    private void exitMenuItemActionPerformed(ActionEvent e)
    {
    }
}

class WeightPlotPanel extends JPanel
{

    public void paintComponent(Graphics g)
    {
        Graphics2D g2D = (Graphics2D)g;
        super.paintComponent(g2D);
        g2D.dispose();
    }


}
