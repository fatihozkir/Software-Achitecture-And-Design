package mimaritasarimodev3;
import javax.swing.JOptionPane;
/**
 *
 * @author FatihOzkir
 */
public class WindowBorderDecorator extends WindowDecorator 
{
    public WindowBorderDecorator(MyWindow pencere) {
        super(pencere);
    }
    @Override
    public void Draw()
    {
        super.Draw();
        System.out.println("Pencereye Çerçeve Eklendi !");
        JOptionPane.showMessageDialog
        (
         null,
         "Pencereye Çerçeve Eklendi !",
         "Başarılı",
         JOptionPane.INFORMATION_MESSAGE
        );
    }
}
