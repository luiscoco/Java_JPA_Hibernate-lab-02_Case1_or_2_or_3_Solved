# Java_JPA_Hibernate-lab-02_Case1_or_2_or_3_Solved

## Exercise

Identity of entity definition

Goal

Learn how to define simple and composite identity of entity in terms of Java Persistence API. 

Subject

There is a Department entity (with fields: companyName, name and description) and 3 cases to defined identity for it:

1.	Single identity

2.	Composite with identity as separate class (using @EmbeddedId)

3.	Composite with identity fields inside the entity class (using @IdClass)

You need to implement all three cases.

Description

Single identity

1.	Open module jpa-lab-02

2.	Open class edu.jpa.entity.Department_1

3.	Specify class-level annotation @Entity. This lets JPA runtime to know that this particular class should be treated as an entity.

4.	Specify field-level annotation @Id for id field. This lets JPA runtime to know that this fields is used as key

5.	Specify field-level annotation @GeneratedValue for id field. This applies particular identity generation strategy for this field (here the default one will be applied).

Composite with identity as separate class (using @EmbeddedId)

6.	Open class edu.jpa.entity.DepartmentKey. This class represents the entity identity (company name + department name).

7.	Define this class as implementing java.io.Serializable (composite-id class must implement Serializable)

8.	Open class edu.jpa.entity.Department_2

9.	Specify class-level annotation @Entity. This lets JPA runtime to know that this particular class should be treated as an entity.

10.	Specify field-level annotation @EmbeddedId for field id (of type DepartmentKey).

Composite with identity fields inside the entity class (using @IdClass)

11.	Open class edu.jpa.entity.DepartmentKey

12.	Specify class-level annotation @Embeddable. This lets JPA runtime to know that this class is embeddable one and can be a part of an entity.

13.	Open class edu.jpa.entity.Department_3

14.	Specify class-level annotation @Entity. This lets JPA runtime to know that this particular class should be treated as an entity.

15.	Specify class-level annotation @IdClass with identity class DepartmentKey. This lets JPA runtime to know that DepartmentKey should be used as identity foe this entity (and entity class should contain fields with the same names as in DepartmentKey class).

16.	Specify field-level annotation @Id for any of key fields (companyName or departmentName).

17.	Open the class edu.jpa.Launcher and analyze its content with help of trainer (since EntityManager is not known for you yet).

18.	Run the class edu.jpa.Launcher. There should be no errors if entity is defined correctly.

19.	Open database DB_LAB_02 using MySQL Workbench and look on the created database objects.

## Solution


