package Colourful;
public class Colour /////////////////////// #Colour //////////////////////////
{
    public int R;
    public int G;
    public int B;
    public int alpha;
    public Colour(int R, int G, int B)
    {
      this.R=R;
      this.G=G;
      this.B=B;
      this.alpha=255;
    }
    public Colour(int R, int G, int B, int alpha)
    {
      this.R=R;
      this.G=G;
      this.B=B;
      this.alpha=alpha;
    }
    public Colour(int rgb)
    {
      this.R=rgb/(256*256);
      this.G=(rgb/(256))%(256);
      this.B=rgb%(256);
      this.alpha=255;
    }
    public Colour(String s)
    {
      this.alpha=255;
      if(s=="black")
      {
        this.R=0;
        this.G=0;
        this.B=0;
        return;
      }
      if(s=="white")
      {
        this.R=255;
        this.G=255;
        this.B=255;
        return;
      }
      if(s=="red")
      {
        this.R=255;
        this.G=0;
        this.B=0;
        return;
      }
      if(s=="green")
      {
        this.R=0;
        this.G=255;
        this.B=0;
        return;
      }
      if(s=="blue")
      {
        this.R=0;
        this.G=0;
        this.B=255;
        return;
      }
      if(s=="yellow")
      {
        this.R=255;
        this.G=255;
        this.B=0;
        return;
      }
      if(s=="cyan")
      {
        this.R=0;
        this.G=255;
        this.B=255;
        return;
      }
      if(s=="magenta")
      {
        this.R=255;
        this.G=0;
        this.B=255;
        return;
      }
      float r=s.charAt(0)-'0';
      float g=s.charAt(2)-'0';
      float b=s.charAt(4)-'0';
      float sum=r+g+b;
      this.R=(int)(((r/sum)*255)+.5f);
      this.G=(int)(((g/sum)*255)+.5f);
      this.B=(int)(((b/sum)*255)+.5f);
      float mx = this.R;
      if(this.G>mx)mx=this.G;
      if(this.B>mx)mx=this.B;
      float scale = 255f/mx;
      this.R*=scale;
      this.G*=scale;
      this.B*=scale;
    }
}
