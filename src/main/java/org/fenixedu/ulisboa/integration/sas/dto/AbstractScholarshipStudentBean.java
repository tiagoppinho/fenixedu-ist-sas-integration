package org.fenixedu.ulisboa.integration.sas.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import org.joda.time.LocalDate;

@SuppressWarnings("serial")
public abstract class AbstractScholarshipStudentBean implements Serializable {

    private String institutionCode;
    private String institutionName;
    private String candidacyNumber;
    private Integer studentNumber;
    private String studentName;
    private String documentTypeName;
    private String documentNumber;
    private String degreeCode;
    private String degreeName;
    private String degreeTypeName;
    private String code;
    private Boolean registered = false;
    private LocalDate registrationDate;
    private BigDecimal gratuityAmount;
    private Integer numberOfMonthsExecutionYear;
    private String firstMonthExecutionYear;
    private Boolean cetQualificationOwner;
    private Boolean ctspQualificationOwner;
    private Boolean degreeQualificationOwner;
    private Boolean masterQualificationOwner;
    private Boolean phdQualificationOwner;
    private Boolean higherQualificationOwner;
    private String observations;
    private String regime;
    private Integer numberOfDegreeCurricularYears;
    private Integer cycleNumberOfEnrolmentYears;
    private BigDecimal numberOfEnrolledECTS;
    private String fiscalCode;
    private String documentBINumber;
    private String ingressionRegimeCode;
    private String ingressionRegimeCodeWithDescription;

    public String getInstitutionCode() {
        return institutionCode;
    }

    public void setInstitutionCode(String institutionCode) {
        this.institutionCode = institutionCode;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public String getCandidacyNumber() {
        return candidacyNumber;
    }

    public void setCandidacyNumber(String candidacyNumber) {
        this.candidacyNumber = candidacyNumber;
    }

    public Integer getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(Integer studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getDocumentTypeName() {
        return documentTypeName;
    }

    public void setDocumentTypeName(String documentTypeName) {
        this.documentTypeName = documentTypeName;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getDegreeCode() {
        return degreeCode;
    }

    public void setDegreeCode(String degreeCode) {
        this.degreeCode = degreeCode;
    }

    public String getDegreeName() {
        return degreeName;
    }

    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;
    }

    public String getDegreeTypeName() {
        return degreeTypeName;
    }

    public void setDegreeTypeName(String degreeTypeName) {
        this.degreeTypeName = degreeTypeName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Boolean getRegistered() {
        return registered;
    }

    public void setRegistered(Boolean registered) {
        this.registered = registered;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public BigDecimal getGratuityAmount() {
        return gratuityAmount;
    }

    public void setGratuityAmount(BigDecimal bigDecimal) {
        this.gratuityAmount = bigDecimal;
    }

    public Integer getNumberOfMonthsExecutionYear() {
        return numberOfMonthsExecutionYear;
    }

    public void setNumberOfMonthsExecutionYear(Integer numberOfMonthsExecutionYear) {
        this.numberOfMonthsExecutionYear = numberOfMonthsExecutionYear;
    }

    public String getFirstMonthExecutionYear() {
        return firstMonthExecutionYear;
    }

    public void setFirstMonthExecutionYear(String firstMonthExecutionYear) {
        this.firstMonthExecutionYear = firstMonthExecutionYear;
    }

    public Boolean getCetQualificationOwner() {
        return cetQualificationOwner;
    }

    public void setCetQualificationOwner(Boolean cetQualificationOwner) {
        this.cetQualificationOwner = cetQualificationOwner;
    }

    public Boolean getCtspQualificationOwner() {
        return ctspQualificationOwner;
    }

    public void setCtspQualificationOwner(Boolean ctspQualificationOwner) {
        this.ctspQualificationOwner = ctspQualificationOwner;
    }

    public Boolean getDegreeQualificationOwner() {
        return degreeQualificationOwner;
    }

    public void setDegreeQualificationOwner(Boolean degreeQualificationOwner) {
        this.degreeQualificationOwner = degreeQualificationOwner;
    }

    public Boolean getMasterQualificationOwner() {
        return masterQualificationOwner;
    }

    public void setMasterQualificationOwner(Boolean masterQualificationOwner) {
        this.masterQualificationOwner = masterQualificationOwner;
    }

    public Boolean getPhdQualificationOwner() {
        return phdQualificationOwner;
    }

    public void setPhdQualificationOwner(Boolean phdQualificationOwner) {
        this.phdQualificationOwner = phdQualificationOwner;
    }

    public Boolean getHigherQualificationOwner() {
        return higherQualificationOwner;
    }

    public void setHigherQualificationOwner(Boolean higherQualificationOwner) {
        this.higherQualificationOwner = higherQualificationOwner;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public String getRegime() {
        return regime;
    }

    public void setRegime(String regime) {
        this.regime = regime;
    }

    public Integer getNumberOfDegreeCurricularYears() {
        return numberOfDegreeCurricularYears;
    }

    public void setNumberOfDegreeCurricularYears(Integer numberOfDegreeCurricularYears) {
        this.numberOfDegreeCurricularYears = numberOfDegreeCurricularYears;
    }

    public Integer getCycleNumberOfEnrolmentYears() {
        return cycleNumberOfEnrolmentYears;
    }

    public void setCycleNumberOfEnrolmentYears(Integer numberOfEnrolmentYearsOnInstitution) {
        this.cycleNumberOfEnrolmentYears = numberOfEnrolmentYearsOnInstitution;
    }

    public BigDecimal getNumberOfEnrolledECTS() {
        return numberOfEnrolledECTS;
    }

    public void setNumberOfEnrolledECTS(BigDecimal numberOfEnrolledECTS) {
        this.numberOfEnrolledECTS = numberOfEnrolledECTS;
    }

    public String getFiscalCode() {
        return fiscalCode;
    }

    public void setFiscalCode(String fiscalCode) {
        this.fiscalCode = fiscalCode;
    }

    public String getDocumentBINumber() {
        return documentBINumber;
    }

    public void setDocumentBINumber(String documentBINumber) {
        this.documentBINumber = documentBINumber;
    }

    public String getIngressionRegimeCode() {
        return ingressionRegimeCode;
    }

    public void setIngressionRegimeCode(String ingressionRegimeCode) {
        this.ingressionRegimeCode = ingressionRegimeCode;
    }

    public String getIngressionRegimeCodeWithDescription() {
        return ingressionRegimeCodeWithDescription;
    }

    public void setIngressionRegimeCodeWithDescription(String ingressionRegimeCodeWithDescription) {
        this.ingressionRegimeCodeWithDescription = ingressionRegimeCodeWithDescription;
    }

}
