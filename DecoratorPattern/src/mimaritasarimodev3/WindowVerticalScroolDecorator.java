package mimaritasarimodev3;
import javax.swing.JOptionPane;
/**
 *
 * @author FatihOzkir
 */
public class WindowVerticalScroolDecorator extends WindowDecorator
{
    public WindowVerticalScroolDecorator(MyWindow pencere) 
    {
        super(pencere);
    }
    @Override
    public void Draw()
    {
        super.Draw();
        System.out.println("Dikey Scrool Bar Oluşturuldu...");
        JOptionPane.showMessageDialog
        (
         null, 
         "Dikey Scrool Bar Oluşturuldu...",
         "Başarılı",
         JOptionPane.INFORMATION_MESSAGE
        );
        
    }
}
