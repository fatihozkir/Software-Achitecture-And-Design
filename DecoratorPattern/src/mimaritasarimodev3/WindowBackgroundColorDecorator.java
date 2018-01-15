package mimaritasarimodev3;
import javax.swing.JOptionPane;
/**
 *
 * @author FatihOzkir
 */
public class WindowBackgroundColorDecorator extends WindowDecorator
{
    public WindowBackgroundColorDecorator(MyWindow pencere) 
    {
        super(pencere);
    }
    @Override
    public void Draw()
    {
        super.Draw();
        System.out.println("Pencere Arka Planına Renk Verildi !");
        JOptionPane.showMessageDialog
        (
         null, 
         "Pencere Arka Planına Renk Verildi !",
         "Başarılı",
         JOptionPane.INFORMATION_MESSAGE
        );
    }
}
