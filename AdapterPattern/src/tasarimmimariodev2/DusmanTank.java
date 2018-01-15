package tasarimmimariodev2;
/**
 *
 * @author FatihOzkir
 */
public class DusmanTank implements IDusman
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
    @Override
    public void SilahKullan() {
        System.out.println("Tank Silahını Kullandı...");
    }

    @Override
    public void Hizlan() {
        System.out.println("Tank Hızlandı...");
    }

    @Override
    public void DusmanAdi() {
        System.out.println("Düşman Adı:"+getAd()+"...");
    }
    
}
