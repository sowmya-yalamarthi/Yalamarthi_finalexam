
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sowmya Yalamarthi
 */
public class cars 
{

    /**
     * instance variable
     */
    public int carId;

    /**
     * instance variable
     */
    public String brand;

    /**
     * default constructor
     */
    public cars()
{
    
}

    /**
     * parameterized constructor which is used to assign objects
     * @param carId
     * @param brand
     */
    public cars(int carId, String brand) {
        this.carId = carId;
        this.brand = brand;
    }

    /**
     * to get car id
     * @return car id of type int 
     */
    public int getCarId() {
        return carId;
    }

    /**
     * to set value to the variable
     * @param carId
     */
    public void setCarId(int carId) {
        this.carId = carId;
    }

    /**
     * to get brand
     * @return brand of type string
     */
    public String getBrand() {
        return brand;
    }

    /**
     * to set value to the variable
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.carId;
        hash = 29 * hash + Objects.hashCode(this.brand);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final cars other = (cars) obj;
        if (this.carId != other.carId) {
            return false;
        }
        if (!Objects.equals(this.brand, other.brand)) {
            return false;
        }
        return true;
    }
    
    
    
}
