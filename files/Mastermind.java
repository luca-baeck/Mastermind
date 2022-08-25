import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;
import java.util.Hashtable;
import java.awt.font.TextAttribute;
import javax.swing.JFrame;


/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 17.01.2020
 * @author 
 */

public class Mastermind extends JFrame {
  // Anfang Attribute
  private JLabel lMastermind = new JLabel();
  private JButton bStart = new JButton();
  private JLabel lBitteklickensievierderfolgendenFarbenan = new JLabel();
  private JButton bSchwarz = new JButton();
  private JButton bWeiss = new JButton();
  private JButton bRot = new JButton();
  private JButton bBlau = new JButton();
  private JButton bGelb = new JButton();
  private JButton bGruen = new JButton();
  private JButton bWeiter = new JButton();
  private JLabel lAuswertung1 = new JLabel();
  private JLabel lSiehabenfolgendeFarbenausgewaehlt = new JLabel();
  private JLabel lEswurdenfolgendeFarbengezogen = new JLabel();
  private JLabel lSchwarz = new JLabel();
  private JLabel lWeiss = new JLabel();
  private JLabel lRot = new JLabel();
  private JLabel lBlau = new JLabel();
  private JLabel lGelb = new JLabel();
  private JLabel lGruen = new JLabel();
  private JButton bWeiter1 = new JButton();
  private JLabel lPunktezahl = new JLabel();
  private JLabel lDasSpielistvorbei1 = new JLabel();
  private JLabel lSiehaben = new JLabel();
  private JLabel lDiesesSpielwurdevonLucaBaeckprogrammiert = new JLabel();
  private JButton bHier = new JButton();
  private JLabel lUmdasSpielzubeendenklickensie = new JLabel();
  // Ende Attribute
  int Punktezahl=0;
  
  public Mastermind() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 1000; 
    int frameHeight = 650;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Mastermind");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    cp.setBackground(new Color(0xFFAFAF));
    lMastermind.setBounds(216, 10, 568, 100);
    lMastermind.setText("Mastermind");
    lMastermind.setBackground(Color.GREEN);
    lMastermind.setOpaque(true);
    lMastermind.setForeground(Color.YELLOW);
    lMastermind.setHorizontalAlignment(SwingConstants.CENTER);
    lMastermind.setFont(new Font("@Malgun Gothic", Font.BOLD, 72));
    cp.add(lMastermind);
    bStart.setBounds(425, 260, 150, 50);
    bStart.setText("Start");
    bStart.setMargin(new Insets(2, 2, 2, 2));
    bStart.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bStart_ActionPerformed(evt);
      }
    });
    bStart.setBackground(Color.RED);
    bStart.setFont(new Font("@Malgun Gothic", Font.BOLD, 48));
    bStart.setForeground(Color.BLUE);
    cp.add(bStart);
    lBitteklickensievierderfolgendenFarbenan.setBounds(0, 25, 1000, 70);
    lBitteklickensievierderfolgendenFarbenan.setText("Bitte klicken sie vier der folgenden Farben an:");
    lBitteklickensievierderfolgendenFarbenan.setBackground(Color.MAGENTA);
    lBitteklickensievierderfolgendenFarbenan.setOpaque(true);
    lBitteklickensievierderfolgendenFarbenan.setForeground(new Color(0x008000));
    lBitteklickensievierderfolgendenFarbenan.setHorizontalAlignment(SwingConstants.CENTER);
    lBitteklickensievierderfolgendenFarbenan.setHorizontalTextPosition(SwingConstants.LEFT);
    lBitteklickensievierderfolgendenFarbenan.setFont(new Font("@Malgun Gothic", Font.BOLD, 36));
    lBitteklickensievierderfolgendenFarbenan.setVisible(false);
    cp.add(lBitteklickensievierderfolgendenFarbenan);
    bSchwarz.setBounds(75, 200, 100, 60);
    bSchwarz.setText("Schwarz");
    bSchwarz.setMargin(new Insets(2, 2, 2, 2));
    bSchwarz.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bSchwarz_ActionPerformed(evt);
      }
    });
    bSchwarz.setBackground(Color.BLACK);
    bSchwarz.setFont(new Font("@Malgun Gothic", Font.BOLD, 12));
    bSchwarz.setForeground(Color.WHITE);
    bSchwarz.setVisible(false);
    cp.add(bSchwarz);
    bWeiss.setBounds(225, 200, 100, 60);
    bWeiss.setText("Weiß");
    bWeiss.setMargin(new Insets(2, 2, 2, 2));
    bWeiss.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bWeiss_ActionPerformed(evt);
      }
    });
    bWeiss.setBackground(Color.WHITE);
    bWeiss.setFont(new Font("@Malgun Gothic", Font.BOLD, 12));
    bWeiss.setForeground(Color.BLACK);
    bWeiss.setVisible(false);
    cp.add(bWeiss);
    bRot.setBounds(375, 200, 100, 60);
    bRot.setText("Rot");
    bRot.setMargin(new Insets(2, 2, 2, 2));
    bRot.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bRot_ActionPerformed(evt);
      }
    });
    bRot.setBackground(Color.RED);
    bRot.setFont(new Font("@Malgun Gothic", Font.BOLD, 12));
    bRot.setForeground(Color.BLUE);
    bRot.setVisible(false);
    cp.add(bRot);
    bBlau.setBounds(525, 200, 100, 60);
    bBlau.setText("Blau");
    bBlau.setMargin(new Insets(2, 2, 2, 2));
    bBlau.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bBlau_ActionPerformed(evt);
      }
    });
    bBlau.setBackground(Color.BLUE);
    bBlau.setFont(new Font("@Malgun Gothic", Font.BOLD, 12));
    bBlau.setForeground(Color.RED);
    bBlau.setVisible(false);
    cp.add(bBlau);
    bGelb.setBounds(675, 200, 100, 60);
    bGelb.setText("Gelb");
    bGelb.setMargin(new Insets(2, 2, 2, 2));
    bGelb.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bGelb_ActionPerformed(evt);
      }
    });
    bGelb.setBackground(Color.YELLOW);
    bGelb.setFont(new Font("@Malgun Gothic", Font.BOLD, 12));
    bGelb.setForeground(new Color(0x008000));
    bGelb.setVisible(false);
    cp.add(bGelb);
    bGruen.setBounds(825, 200, 100, 60);
    bGruen.setText("Grün");
    bGruen.setMargin(new Insets(2, 2, 2, 2));
    bGruen.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bGruen_ActionPerformed(evt);
      }
    });
    bGruen.setBackground(Color.GREEN);
    bGruen.setFont(new Font("@Malgun Gothic", Font.BOLD, 12));
    bGruen.setForeground(Color.YELLOW);
    bGruen.setVisible(false);
    cp.add(bGruen);
    bWeiter.setBounds(865, 280, 60, 40);
    bWeiter.setText("Weiter");
    bWeiter.setMargin(new Insets(2, 2, 2, 2));
    bWeiter.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bWeiter_ActionPerformed(evt);
      }
    });
    bWeiter.setBackground(Color.CYAN);
    bWeiter.setFont(new Font("@Malgun Gothic", Font.BOLD, 12));
    bWeiter.setForeground(new Color(0x800000));
    bWeiter.setVisible(false);
    cp.add(bWeiter);
    lAuswertung1.setBounds(350, 20, 300, 70);
    lAuswertung1.setText("Auswertung:");
    lAuswertung1.setBackground(Color.CYAN);
    lAuswertung1.setOpaque(true);
    lAuswertung1.setForeground(new Color(0x800000));
    lAuswertung1.setHorizontalAlignment(SwingConstants.CENTER);
    lAuswertung1.setFont(new Font("@Malgun Gothic", Font.BOLD, 48));
    lAuswertung1.setVisible(false);
    cp.add(lAuswertung1);
    lSiehabenfolgendeFarbenausgewaehlt.setBounds(75, 150, 457, 36);
    lSiehabenfolgendeFarbenausgewaehlt.setText("Sie haben folgende Farben ausgewählt:");
    lSiehabenfolgendeFarbenausgewaehlt.setBackground(new Color(0xFFC800));
    lSiehabenfolgendeFarbenausgewaehlt.setOpaque(true);
    lSiehabenfolgendeFarbenausgewaehlt.setFont(new Font("@Malgun Gothic", Font.BOLD, 24));
    lSiehabenfolgendeFarbenausgewaehlt.setForeground(new Color(0x800080));
    lSiehabenfolgendeFarbenausgewaehlt.setHorizontalAlignment(SwingConstants.CENTER);
    lSiehabenfolgendeFarbenausgewaehlt.setVisible(false);
    cp.add(lSiehabenfolgendeFarbenausgewaehlt);
    lEswurdenfolgendeFarbengezogen.setBounds(75, 300, 430, 36);
    lEswurdenfolgendeFarbengezogen.setText("Es wurden folgende Farben gezogen:");
    lEswurdenfolgendeFarbengezogen.setBackground(new Color(0xFFC800));
    lEswurdenfolgendeFarbengezogen.setOpaque(true);
    lEswurdenfolgendeFarbengezogen.setFont(new Font("@Malgun Gothic", Font.BOLD, 24));
    lEswurdenfolgendeFarbengezogen.setForeground(new Color(0x800080));
    lEswurdenfolgendeFarbengezogen.setVisible(false);
    cp.add(lEswurdenfolgendeFarbengezogen);
    lSchwarz.setBounds(75, 350, 100, 60);
    lSchwarz.setText("Schwarz");
    lSchwarz.setBackground(Color.BLACK);
    lSchwarz.setOpaque(true);
    lSchwarz.setFont(new Font("@Malgun Gothic", Font.BOLD, 12));
    lSchwarz.setForeground(Color.WHITE);
    lSchwarz.setVisible(false);
    lSchwarz.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(lSchwarz);
    lWeiss.setBounds(225, 350, 100, 60);
    lWeiss.setText("Weiß");
    lWeiss.setBackground(Color.WHITE);
    lWeiss.setOpaque(true);
    lWeiss.setFont(new Font("@Malgun Gothic", Font.BOLD, 12));
    lWeiss.setForeground(Color.BLACK);
    lWeiss.setHorizontalAlignment(SwingConstants.CENTER);
    lWeiss.setVisible(false);
    cp.add(lWeiss);
    lRot.setBounds(375, 350, 100, 60);
    lRot.setText("Rot");
    lRot.setBackground(Color.RED);
    lRot.setOpaque(true);
    lRot.setFont(new Font("@Malgun Gothic", Font.BOLD, 12));
    lRot.setForeground(Color.BLUE);
    lRot.setHorizontalAlignment(SwingConstants.CENTER);
    lRot.setVisible(false);
    cp.add(lRot);
    lBlau.setBounds(525, 350, 100, 60);
    lBlau.setText("Blau");
    lBlau.setBackground(Color.BLUE);
    lBlau.setOpaque(true);
    lBlau.setFont(new Font("@Malgun Gothic", Font.BOLD, 12));
    lBlau.setForeground(Color.RED);
    lBlau.setHorizontalAlignment(SwingConstants.CENTER);
    lBlau.setVisible(false);
    cp.add(lBlau);
    lGelb.setBounds(675, 350, 100, 60);
    lGelb.setText("Gelb");
    lGelb.setBackground(Color.YELLOW);
    lGelb.setOpaque(true);
    lGelb.setFont(new Font("@Malgun Gothic", Font.BOLD, 12));
    lGelb.setForeground(new Color(0x008000));
    lGelb.setHorizontalAlignment(SwingConstants.CENTER);
    lGelb.setVisible(false);
    cp.add(lGelb);
    lGruen.setBounds(825, 350, 100, 60);
    lGruen.setText("Grün");
    lGruen.setBackground(Color.GREEN);
    lGruen.setOpaque(true);
    lGruen.setFont(new Font("@Malgun Gothic", Font.BOLD, 12));
    lGruen.setForeground(Color.YELLOW);
    lGruen.setHorizontalAlignment(SwingConstants.CENTER);
    lGruen.setVisible(false);
    cp.add(lGruen);
    bWeiter1.setBounds(865, 430, 60, 40);
    bWeiter1.setText("Weiter");
    bWeiter1.setMargin(new Insets(2, 2, 2, 2));
    bWeiter1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bWeiter1_ActionPerformed(evt);
      }
    });
    bWeiter1.setBackground(Color.CYAN);
    bWeiter1.setFont(new Font("@Malgun Gothic", Font.BOLD, 12));
    bWeiter1.setForeground(new Color(0x800000));
    bWeiter1.setVisible(false);
    cp.add(bWeiter1);

    lPunktezahl.setBounds(75, 450, 80, 36);
    lPunktezahl.setText("Punktezahl: "+Punktezahl);
    lPunktezahl.setBackground(new Color(0xFFC800));
    lPunktezahl.setOpaque(true);
    lPunktezahl.setFont(new Font("@Malgun Gothic", Font.BOLD, 12));
    lPunktezahl.setForeground(new Color(0x800080));
    lPunktezahl.setVisible(false);
    cp.add(lPunktezahl);
    lDasSpielistvorbei1.setBounds(184, 250, 632, 70);
    lDasSpielistvorbei1.setText("Das Spiel ist vorbei!!!");
    lDasSpielistvorbei1.setBackground(new Color(0xFFC800));
    lDasSpielistvorbei1.setOpaque(true);
    lDasSpielistvorbei1.setFont(new Font("@Malgun Gothic", Font.BOLD, 48));
    lDasSpielistvorbei1.setForeground(new Color(0x800080));
    lDasSpielistvorbei1.setHorizontalAlignment(SwingConstants.CENTER);
    lDasSpielistvorbei1.setVisible(false);
    cp.add(lDasSpielistvorbei1);
    lSiehaben.setBounds(0, 350, 1000, 36);
    lSiehaben.setText("Sie haben");
    lSiehaben.setBackground(Color.MAGENTA);
    lSiehaben.setOpaque(true);
    lSiehaben.setForeground(new Color(0x808000));
    lSiehaben.setFont(new Font("@Malgun Gothic", Font.BOLD, 24));
    lSiehaben.setHorizontalAlignment(SwingConstants.CENTER);
    lSiehaben.setVisible(false);
    cp.add(lSiehaben);
    lDiesesSpielwurdevonLucaBaeckprogrammiert.setBounds(218, 500, 564, 49);
    lDiesesSpielwurdevonLucaBaeckprogrammiert.setText("Dieses Spiel wurde von Luca Bäck programmiert.");
    lDiesesSpielwurdevonLucaBaeckprogrammiert.setBackground(new Color(0x404040));
    lDiesesSpielwurdevonLucaBaeckprogrammiert.setOpaque(true);
    lDiesesSpielwurdevonLucaBaeckprogrammiert.setFont(new Font("@Malgun Gothic", Font.BOLD, 24));
    lDiesesSpielwurdevonLucaBaeckprogrammiert.setForeground(Color.WHITE);
    lDiesesSpielwurdevonLucaBaeckprogrammiert.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(lDiesesSpielwurdevonLucaBaeckprogrammiert);
    bHier.setBounds(470, 575, 60, 33);
    bHier.setText("hier!");
    bHier.setMargin(new Insets(2, 2, 2, 2));
    bHier.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bHier_ActionPerformed(evt);
      }
    });
    bHier.setForeground(Color.BLACK);
    Hashtable<TextAttribute, Object> bHier_map = new Hashtable<TextAttribute, Object>();
    bHier_map.put(TextAttribute.FAMILY, "@Malgun Gothic");
    bHier_map.put(TextAttribute.SIZE, new Integer(20));
    bHier_map.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
    bHier.setFont(new Font(bHier_map));
    bHier.setVisible(false);
    bHier.setBackground(Color.WHITE);
    cp.add(bHier);
    lUmdasSpielzubeendenklickensie.setBounds(324, 540, 352, 33);
    lUmdasSpielzubeendenklickensie.setText("Um das Spiel zu beenden klicken sie");
    lUmdasSpielzubeendenklickensie.setFont(new Font("@Malgun Gothic", Font.BOLD, 20));
    lUmdasSpielzubeendenklickensie.setForeground(Color.BLACK);
    lUmdasSpielzubeendenklickensie.setHorizontalAlignment(SwingConstants.CENTER);
    lUmdasSpielzubeendenklickensie.setVisible(false);
    lUmdasSpielzubeendenklickensie.setBackground(Color.WHITE);
    lUmdasSpielzubeendenklickensie.setOpaque(true);
    cp.add(lUmdasSpielzubeendenklickensie);
    
    Hashtable<TextAttribute, Object> jLabel1_map = new Hashtable<TextAttribute, Object>();
    jLabel1_map.put(TextAttribute.FAMILY, "@Malgun Gothic");
    jLabel1_map.put(TextAttribute.SIZE, new Integer(12));
    jLabel1_map.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public Mastermind
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new Mastermind();
     
  } // end of main
  
 
   int klick=0;
  boolean sg;
  boolean wg;
  boolean rg;
  boolean bg;
  boolean geg;
  boolean grg;
  boolean sgz;
  boolean wgz;
  boolean rgz;
  boolean bgz;
  boolean gegz;
  boolean grgz;
  int n;
   Random generator = new Random();
  public void bStart_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf�gen
     bStart.setVisible(false);
      lMastermind.setBounds(216, 10, 568, 100);
    lMastermind.setBounds(0, 540, 1000, 75);
    lBitteklickensievierderfolgendenFarbenan.setVisible(true);
    bGruen.setVisible(true);
    bGelb.setVisible(true);
    bBlau.setVisible(true);
    bRot.setVisible(true);
    bWeiss.setVisible(true);
    bSchwarz.setVisible(true);
    bWeiter.setVisible(true);
    lPunktezahl.setVisible(true);
    lDiesesSpielwurdevonLucaBaeckprogrammiert.setVisible(false); 
 
   
  } // end of bStart_ActionPerformed
    
  public void bSchwarz_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf�gen
    if (klick<4) {
      bSchwarz.setVisible(false);
      klick++;
      sg=true;
    } // end of if
  } // end of bSchwarz_ActionPerformed

  public void bWeiss_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf�gen
     if (klick<4) {
      bWeiss.setVisible(false);
      klick++;
      wg=true;
    } // end of if
  } // end of bWeiss_ActionPerformed

  public void bRot_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf�gen
     if (klick<4) {
      bRot.setVisible(false);
      klick++;
      rg=true;
    } // end of if
  } // end of bRot_ActionPerformed

  public void bBlau_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf�gen
     if (klick<4) {
      bBlau.setVisible(false);
      klick++;
      bg=true;
    } // end of if
  } // end of bBlau_ActionPerformed

  public void bGelb_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf�gen
     if (klick<4) {
      bGelb.setVisible(false);
      klick++;
      geg=true;
    } // end of if
  } // end of bGelb_ActionPerformed

  public void bGruen_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf�gen
     if (klick<4) {
      bGruen.setVisible(false);
     klick++;
      grg=true;
    } // end of if
  } // end of bGruen_ActionPerformed

  public void bWeiter_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf�gen
     if (klick==4) {
       bGruen.setVisible(false);
    bGelb.setVisible(false);
    bBlau.setVisible(false);
    bRot.setVisible(false);
    bWeiss.setVisible(false);
    bSchwarz.setVisible(false);
    bWeiter.setVisible(false);
    lBitteklickensievierderfolgendenFarbenan.setVisible(false);
    lAuswertung1.setVisible(true);
    lSiehabenfolgendeFarbenausgewaehlt.setVisible(true);
      if (sg==true) {
        bSchwarz.setVisible(true);
      } // end of if
      if (wg==true) {
        bWeiss.setVisible(true);
      } // end of if
      if (rg==true) {
        bRot.setVisible(true);
      } // end of if
      if (bg==true) {
        bBlau.setVisible(true);
      } // end of if
      if (geg==true) {
        bGelb.setVisible(true);
      } // end of if
      if (grg==true) {
        bGruen.setVisible(true);
      } // end of if
      try{

       Thread.sleep(1000);
      } catch(InterruptedException ex){
        //do stuff
        }
      lEswurdenfolgendeFarbengezogen.setVisible(true);
       for (int i=0;i<4 ; ) {
        n = generator.nextInt(6)+1;
        switch (n) {
          case 1  : 
            if (sgz==false) {
              sgz=true;
              lSchwarz.setVisible(true);
              i++;
            } // end of if
            break;
          case 2 : 
            if (wgz==false) {
              wgz=true;
              lWeiss.setVisible(true);
              i++;
            } // end of if
            break;
          case 3 : 
            if (rgz==false) {
              rgz=true;
              lRot.setVisible(true);
              i++;
            } // end of if
            break;
          case 4 : 
            if (bgz==false) {
              bgz=true;
              lBlau.setVisible(true);
              i++;
            } // end of if
            break;
          case 5 : 
            if (gegz==false) {
              gegz=true;
              lGelb.setVisible(true);
              i++;
            } // end of if
            break;
          case 6 : 
            if (grgz==false) {
              grgz=true;
              lGruen.setVisible(true);
              i++;
            } // end of if
            break;
           
            
        } // end of switch 
       } // end of for
       try{

       Thread.sleep(1000);
      } catch(InterruptedException ex){
        //do stuff
        }
      
      if (sg==true && sgz==true) {
        Punktezahl++;
        lPunktezahl.setText("Punktezahl: "+Punktezahl);
      } // end of if
      if (wg==true && wgz==true) {
        Punktezahl++;
        lPunktezahl.setText("Punktezahl: "+Punktezahl);
      } // end of if
      if (rg==true && rgz==true) {
        Punktezahl++;
        lPunktezahl.setText("Punktezahl: "+Punktezahl);
      } // end of if
      if (bg==true && bgz==true) {
        Punktezahl++;
        lPunktezahl.setText("Punktezahl: "+Punktezahl);
      } // end of if
      if (geg==true && gegz==true) {
        Punktezahl++;
        lPunktezahl.setText("Punktezahl: "+Punktezahl);
      } // end of if
      if (grg==true && grgz==true) {
        Punktezahl++;
        lPunktezahl.setText("Punktezahl: "+Punktezahl);
      } // end of if
      
      bWeiter1.setVisible(true);  
  } // end of if 
  } // end of bWeiter_ActionPerformed

  public void bWeiter1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf�gen
    bWeiter1.setVisible(false);
    lMastermind.setBounds(216, 10, 568, 100);
     lAuswertung1.setVisible(false);
     lSiehabenfolgendeFarbenausgewaehlt.setVisible(false);
     lEswurdenfolgendeFarbengezogen.setVisible(false);
     bGruen.setVisible(false);
     bGelb.setVisible(false);
     bBlau.setVisible(false);
     bRot.setVisible(false);
     bWeiss.setVisible(false);
     bSchwarz.setVisible(false);
    lSchwarz.setVisible(false);
    lWeiss.setVisible(false);
    lRot.setVisible(false); 
    lBlau.setVisible(false);
    lGelb.setVisible(false);
    lGruen.setVisible(false);
    lDasSpielistvorbei1.setVisible(true);
    lSiehaben.setText("Sie haben "+Punktezahl+" Punkte erreicht:)");
    lSiehaben.setVisible(true);
    lPunktezahl.setBounds(460, 400, 80, 36);
    try{

       Thread.sleep(1000);
      } catch(InterruptedException ex){
        //do stuff
        }
    lUmdasSpielzubeendenklickensie.setVisible(true);
    bHier.setVisible(true);
    
  } // end of bWeiter1_ActionPerformed
 
  public void bHier_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf�gen
    
    System.exit(0);

  } // end of bHier_ActionPerformed

  // Ende Methoden
} // end of class Mastermind

