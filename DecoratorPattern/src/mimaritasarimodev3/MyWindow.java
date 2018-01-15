package mimaritasarimodev3;
import javax.swing.JOptionPane;
/**
 *
 * @author FatihOzkir
 */
public class MyWindow extends Window
{
    @Override
    public void Draw() {
        System.out.println("Pencere Oluşturuluyor...");
        JOptionPane.showMessageDialog(null,"Pencere Oluşturuluyor...","Başarılı...",JOptionPane.INFORMATION_MESSAGE);
    }
    
}
