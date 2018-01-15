package mimaritasarimodev3;
public class WindowDecorator extends MyWindow
{
    private MyWindow _pencere;
    public WindowDecorator(MyWindow pencere)
    {
        _pencere=pencere;
    }
    @Override
    public void Draw() {
        _pencere.Draw();
    }
    
}
