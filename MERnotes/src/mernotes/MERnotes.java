package mernotes;

public class MERnotes{
    
    public static void main(String[] args) {
        NuevaVentana(new MERFRAME());
    }

    public static void NuevaVentana(MERFRAME frm) {
        frm.setTitle("Sin titulo: MERnotes");
        frm.setBounds(350, 60, 700, 600);
        frm.setVisible(true);   
    }
}
