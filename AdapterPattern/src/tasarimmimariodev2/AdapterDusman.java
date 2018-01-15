package tasarimmimariodev2;
/**
 *
 * @author FatihOzkir
 */
public class AdapterDusman implements IDusman
{
    private DusmanRobot _dr;
    public AdapterDusman(DusmanRobot dr)
    {
       this._dr=dr;
    }
    @Override
    public void SilahKullan() {
        _dr.YumrukAt();
    }

    @Override
    public void Hizlan() {
        _dr.Yuru();
    }

    @Override
    public void DusmanAdi() {
        _dr.RobotIsim();
    }
    
}
