package cn.enjoy.model;

import java.util.Date;

public class Student {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.sno
     *
     * @mbggenerated
     */
    private String sno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.age
     *
     * @mbggenerated
     */
    private Integer age;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.gender
     *
     * @mbggenerated
     */
    private String gender;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.clazz
     *
     * @mbggenerated
     */
    private String clazz;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.createdate
     *
     * @mbggenerated
     */
    private Date createdate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.id
     *
     * @return the value of student.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.id
     *
     * @param id the value for student.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.name
     *
     * @return the value of student.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.name
     *
     * @param name the value for student.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.sno
     *
     * @return the value of student.sno
     *
     * @mbggenerated
     */
    public String getSno() {
        return sno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.sno
     *
     * @param sno the value for student.sno
     *
     * @mbggenerated
     */
    public void setSno(String sno) {
        this.sno = sno == null ? null : sno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.age
     *
     * @return the value of student.age
     *
     * @mbggenerated
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.age
     *
     * @param age the value for student.age
     *
     * @mbggenerated
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.gender
     *
     * @return the value of student.gender
     *
     * @mbggenerated
     */
    public String getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.gender
     *
     * @param gender the value for student.gender
     *
     * @mbggenerated
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.clazz
     *
     * @return the value of student.clazz
     *
     * @mbggenerated
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.clazz
     *
     * @param clazz the value for student.clazz
     *
     * @mbggenerated
     */
    public void setClazz(String clazz) {
        this.clazz = clazz == null ? null : clazz.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.createdate
     *
     * @return the value of student.createdate
     *
     * @mbggenerated
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.createdate
     *
     * @param createdate the value for student.createdate
     *
     * @mbggenerated
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}