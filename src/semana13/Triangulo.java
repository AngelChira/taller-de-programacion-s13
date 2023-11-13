package semana13;

public class Triangulo {
    private byte base;
    private byte altura;
    private byte a;
    private byte b;
    private byte c;

    public Triangulo() {
        
    }

    public Triangulo(byte base, byte altura) {
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(byte a, byte b, byte c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public byte getBase() {
        return base;
    }

    public void setBase(byte base) {
        this.base = base;
    }

    public byte getAltura() {
        return altura;
    }

    public void setAltura(byte altura) {
        this.altura = altura;
    }

    public byte getA() {
        return a;
    }

    public void setA(byte a) {
        this.a = a;
    }

    public byte getB() {
        return b;
    }

    public void setB(byte b) {
        this.b = b;
    }

    public byte getC() {
        return c;
    }

    public void setC(byte c) {
        this.c = c;
    }
    
    public float AreaBaseAltura (){
       return (float) (base*altura)/2.0f;        
    }
    
    public byte perimetro (){
        return (byte) (a+b+c);
    }
    
    public float semiperimetro(){
        return (float) (perimetro()/2.0f);        
    }
    
    public float AreaSemiperimetro(){
        return (float) (Math.sqrt(semiperimetro()*(semiperimetro()-a)*(semiperimetro()- b)*(semiperimetro()- c)));
    }
    
}
