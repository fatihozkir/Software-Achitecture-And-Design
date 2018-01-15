package mimaritasarimodev3;
import javax.swing.JOptionPane;
/**
 *
 * @author FatihOzkir
 */
public class WindowBackgroundImageDecorator extends WindowDecorator
{
    public WindowBackgroundImageDecorator(MyWindow pencere) 
    {
        super(pencere);
    }
    @Override
    public void Draw()
    {
        super.Draw();
        System.out.println("Pencere Arka Planına Resim Eklendi !");
        JOptionPane.showMessageDialog
        (
         null,
         "Pencere Arka Planına Resim Eklendi !",
         "Başarılı",
         JOptionPane.INFORMATION_MESSAGE
        );
    }
}
