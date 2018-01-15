package mimaritasarimodev3;
/**
 *
 * @author FatihOzkir
 */
public class MimariTasarimOdev3
{
    public static void main(String[] args)
    {
        // TODO code application logic here
       Window window=new WindowHorizontalScroolDecorator
        (new WindowVerticalScroolDecorator
        (new WindowBackgroundColorDecorator
        (new WindowBackgroundImageDecorator
        (new WindowBorderDecorator
        (new WindowShadowDecorator
        (new WindowTextDecorator(new MyWindow(), "Fatih Özkır Penceresi")))))));
       window.Draw();
    }
    
}
