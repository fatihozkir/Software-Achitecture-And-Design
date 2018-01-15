package mimaritasarimodev3;
import javax.swing.JOptionPane;
/**
 *
 * @author FatihOzkir
 */
public class WindowHorizontalScroolDecorator extends WindowDecorator
{
    public WindowHorizontalScroolDecorator(MyWindow pencere) 
    {
        super(pencere);
    }
    @Override
    public void Draw()
    {
        super.Draw();
        System.out.println("Yatay Scrool Bar Oluşturuldu...");
        JOptionPane.showMessageDialog
        (
          null,
          "Yatay Scrool Bar Oluşturuldu...",
          "Başarılı",
          JOptionPane.INFORMATION_MESSAGE
        );
    }
}
