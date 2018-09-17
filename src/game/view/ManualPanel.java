package game.view;

import game.manager.ImageStores;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManualPanel extends  BaseContainer {
    private JLabel lbManual;
    private JButton btnBack;
    private OnBackMenuButtonClickListener onBackMenuButtonClickListener;

    public void setOnBackMenuButtonClickListener(OnBackMenuButtonClickListener onBackMenuButtonClickListener) {
        this.onBackMenuButtonClickListener = onBackMenuButtonClickListener;
    }

    @Override
    protected void initPanel() {
        setLayout(null);
        setBackground(Color.BLACK);
    }

    @Override
    protected void initComponent() {
        lbManual = new JLabel();
        lbManual.setIcon(new ImageIcon(ImageStores.IMG_HD));
        btnBack = new JButton("Back Menu");
        Font font =new Font("Arial",Font.BOLD,24);

        lbManual.setBounds(0,40,Gui.WIDTH_FRAME,Gui.HEIGHT_FRAME);
        btnBack.setBounds(0,0,200,50);
        btnBack.setFont(font);

        add(lbManual);
        add(btnBack);
    }

    @Override
    protected void initListener() {
        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onBackMenuButtonClickListener.onBackMenuButtonClicked();
            }
        });
    }

    public interface OnBackMenuButtonClickListener{
        void onBackMenuButtonClicked();
    }
}
