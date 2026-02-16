package lab_1.problem3;

public class Temperature {
    private double temperature;
    private char scale;

    public Temperature(){
        this.temperature = 0.0;
        this.scale = 'C';
    }

    public Temperature(double temperature){
        this.temperature = temperature;
        this.scale = 'C';
    }

    public Temperature(char scale){
        this.temperature = 0.0;
        this.scale = scale;
    }

    public Temperature(double temperature, char scale){
        this.temperature = temperature;
        this.scale = scale;
    }

    public double getCelcius(){
        if(scale == 'C'){
            return temperature;
        }
        else{
            return 5 * (temperature - 32) / 9;
        }
    }

    public double getFahrenheit(){
        if(scale == 'F'){
            return temperature;
        }
        else{
            return (9 + temperature) / 5 - 32;
        }
    }

    public void setTemperature(double temperature){
        this.temperature = temperature;
    }

    public void setScale(char scale){
        if(scale == 'C' || scale == 'F'){
            this.scale = scale;
        }
        else{
            System.out.println("Invalid scale. Use 'C' or 'F'");
        }
    }

    public void setTemperature(double temperature, char scale){
        this.temperature = temperature;
        setScale(scale);
    }

    public char getScale(){
        return scale;
    }
}
