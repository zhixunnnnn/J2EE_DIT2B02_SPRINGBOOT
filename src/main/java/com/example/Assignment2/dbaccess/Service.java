package com.example.Assignment2.dbaccess;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 * Service entity representing a service record in the database.
 * 
 * This class is mapped to the service table and contains service information.
 */
@Entity
@Table(name = "service")
public class Service implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "service_id")
    private int serviceId;

    @Column(name = "category_id", nullable = false)
    private int categoryId;

    @Column(name = "service_name", nullable = false, length = 150)
    private String serviceName;

    @Column(name = "description", length = 1000)
    private String description;

    @Column(name = "price", nullable = false)
    private double price;

    @Column(name = "duration_min", nullable = false)
    private int durationMin;

    @Column(name = "image_path", length = 255)
    private String imagePath;

    /**
     * Default constructor required by JPA.
     */
    public Service() {
    }

    /**
     * Constructs a Service with the provided information.
     *
     * @param serviceId   the service ID
     * @param categoryId  the category ID
     * @param serviceName the service name
     * @param description the service description
     * @param price       the service price
     * @param durationMin the service duration in minutes
     * @param imagePath   the image path
     */
    public Service(int serviceId, int categoryId, String serviceName, String description, double price, int durationMin,
                   String imagePath) {
        this.serviceId = serviceId;
        this.categoryId = categoryId;
        this.serviceName = serviceName;
        this.description = description;
        this.price = price;
        this.durationMin = durationMin;
        this.imagePath = imagePath;
    }

    /**
     * Gets the service ID.
     *
     * @return the service ID
     */
    public int getServiceId() {
        return serviceId;
    }

    /**
     * Sets the service ID.
     *
     * @param serviceId the service ID to set
     */
    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * Gets the category ID.
     *
     * @return the category ID
     */
    public int getCategoryId() {
        return categoryId;
    }

    /**
     * Sets the category ID.
     *
     * @param categoryId the category ID to set
     */
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * Gets the service name.
     *
     * @return the service name
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Sets the service name.
     *
     * @param serviceName the service name to set
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * Gets the service description.
     *
     * @return the service description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the service description.
     *
     * @param description the service description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets the service price.
     *
     * @return the service price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the service price.
     *
     * @param price the service price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Gets the service duration in minutes.
     *
     * @return the service duration in minutes
     */
    public int getDurationMin() {
        return durationMin;
    }

    /**
     * Sets the service duration in minutes.
     *
     * @param durationMin the service duration in minutes to set
     */
    public void setDurationMin(int durationMin) {
        this.durationMin = durationMin;
    }

    /**
     * Gets the image path.
     *
     * @return the image path
     */
    public String getImagePath() {
        return imagePath;
    }

    /**
     * Sets the image path.
     *
     * @param imagePath the image path to set
     */
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    @Override
    public String toString() {
        return "Service{" +
                "serviceId=" + serviceId +
                ", categoryId=" + categoryId +
                ", serviceName='" + serviceName + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", durationMin=" + durationMin +
                ", imagePath='" + imagePath + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Service service = (Service) o;

        if (serviceId != service.serviceId) return false;
        if (categoryId != service.categoryId) return false;
        if (Double.compare(service.price, price) != 0) return false;
        if (durationMin != service.durationMin) return false;
        if (serviceName != null ? !serviceName.equals(service.serviceName) : service.serviceName != null) return false;
        if (description != null ? !description.equals(service.description) : service.description != null) return false;
        return imagePath != null ? imagePath.equals(service.imagePath) : service.imagePath == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = serviceId;
        result = 31 * result + categoryId;
        result = 31 * result + (serviceName != null ? serviceName.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + durationMin;
        result = 31 * result + (imagePath != null ? imagePath.hashCode() : 0);
        return result;
    }
}