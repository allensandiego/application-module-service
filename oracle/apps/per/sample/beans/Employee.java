package oracle.apps.per.sample.beans;

import java.sql.Date;


public class Employee {

    private int personId;
    private Date effectiveStartdate;
    private Date effectiveEndDate;
    private String employeeNumber;
    private String maritalStatus;
    private Date dateOfBirth;
    
    public Employee() {
    }


    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public Number getPersonId() {
        return personId;
    }

    public void setEffectiveStartdate(Date effectiveStartdate) {
        this.effectiveStartdate = effectiveStartdate;
    }

    public Date getEffectiveStartdate() {
        return effectiveStartdate;
    }

    public void setEffectiveEndDate(Date effectiveEndDate) {
        this.effectiveEndDate = effectiveEndDate;
    }

    public Date getEffectiveEndDate() {
        return effectiveEndDate;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    
}
