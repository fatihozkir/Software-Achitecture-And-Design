package mimaritasarimodev3;
import javax.swing.JOptionPane;
/**
 *
 * @author FatihOzkir
 */
public class WindowTextDecorator extends WindowDecorator
{
    private String CerceveAdi;
    public WindowTextDecorator(MyWindow pencere,String CerceveAdi) {
        super(pencere);
        this.CerceveAdi=CerceveAdi;
    }
    @Override
    public void Draw()
    {
        super.Draw();
        System.out.println("Pencereye Yazı Yazıldı:"+this.CerceveAdi);
        JOptionPane.showMessageDialog
        (
         null,
         "Pencereye Yazı Yazıldı:"+this.CerceveAdi,this.CerceveAdi,
         JOptionPane.INFORMATION_MESSAGE
        );
    }
}
