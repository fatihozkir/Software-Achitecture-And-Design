package tasarimmimariodev2;
/**
 *
 * @author FatihOzkir
 */
public class DusmanRobot 
{
    private String Ad;
    public void setAd(String Ad)
    {
        this.Ad=Ad;
    }
    public String getAd()
    {
        return this.Ad;
    }
    public void YumrukAt()
    {
        System.out.println("Yumruk Atıldı...");
    }
    public void Yuru()
    {
        System.out.println("Yürüdüm...");
    }
    public void RobotIsim()
    {
        System.out.println("Robot Adı:"+getAd()+"...");
    }
}
