package tasarimmimariodev2;
/**
 *
 * @author FatihOzkir
 */
public class TasarimMimariOdev2 
{
    public static void main(String[] args) 
    {
        DusmanTank tank=new DusmanTank();
        tank.setAd("Fırtına Tank");
        tank.SilahKullan();
        tank.Hizlan();
        tank.DusmanAdi();
        
        DusmanRobot dR=new DusmanRobot();
        dR.setAd("Dalek");
        AdapterDusman adapterDusman=new AdapterDusman(dR);
        adapterDusman.DusmanAdi();
        adapterDusman.Hizlan();
        adapterDusman.SilahKullan();
    }
    
}
