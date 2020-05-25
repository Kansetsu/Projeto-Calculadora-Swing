package Kansetsu.Visao;

import javax.swing.*;
import java.awt.*;

public class Botao extends JButton {

    public Botao(String texto, Color cor) {
        setText(texto);
        setOpaque(true);
        setBackground(cor);
        setFont(new Font("courier", Font.ITALIC, 30));
        setForeground(Color.WHITE);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }
}
