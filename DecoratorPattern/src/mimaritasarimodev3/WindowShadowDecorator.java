package mimaritasarimodev3;
import javax.swing.JOptionPane;
/**
 *
 * @author FatihOzkir
 */
public class WindowShadowDecorator extends WindowDecorator
{
    public WindowShadowDecorator(MyWindow pencere) {
        super(pencere);
    }
    @Override
    public void Draw()
    {
        super.Draw();
        System.out.println("Pencereye Gölge Efekti Verildi !");
        JOptionPane.showMessageDialog
        (
          null, 
          "Pencereye Gölge Efekti Verildi !",
          "Başarılı",
          JOptionPane.INFORMATION_MESSAGE
        );
        
    }
}
