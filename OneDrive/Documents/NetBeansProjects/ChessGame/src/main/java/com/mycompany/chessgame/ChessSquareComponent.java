package com.mycompany.chessgame;

/**
 *
 * @author n2swa
 */
import javax.swing.*;
import java.awt.*;

public class ChessSquareComponent extends JButton {
  private int row;
  private int col;

  public ChessSquareComponent(int row, int col) {
      this.row = row;
      this.col = col;
      initButton();
  }

  private void initButton() {
      setPreferredSize(new Dimension(64, 64));

      if ((row + col) % 2 == 0) {
          setBackground(Color.LIGHT_GRAY);
      } else {
          setBackground(new Color(205, 133, 63));
      }
      
//      GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
//      String[] fontNames = ge.getAvailableFontFamilyNames();
//      for (String fontName : fontNames) {
//          System.out.println(fontName);
//      }

      setHorizontalAlignment(SwingConstants.CENTER);
      setVerticalAlignment(SwingConstants.CENTER);
      setFont(new Font("serif", Font.PLAIN, 29));
  }
  


  public void setPieceSymbol(String symbol, Color color) {
      this.setText(symbol);
      this.setForeground(color);
  }

  public void clearPieceSymbol() {
      this.setText("");
  }
}
