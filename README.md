# Hopital Management System
Small scale hospital management system with patient vital signs, doctor diagnosis and hospital locations



### Description
---------------------------------------------------------------------------------------------------------------
This project consists of following modules:
1. Location & Hospital Registration
2. Person Registration
3. Doctor Diagnosis
4. User roles - Patient, Doctor, Hospital Admin, System Admin, Community Admin

The application is built on Java swing GUI with collections(ArrayList) as data storage medium. Data is stored in-memory without any persistent data(database).


### Functional Workflow
---------------------------------------------------------------------------------------------------------------
1. System Admin needs to crate location (City, Community and House) entries in to the system. Then create a Hospital associating it to a particular City and Community.

![Login Page](https://user-images.githubusercontent.com/26890694/199061081-812b4556-cb22-468e-a042-bdd4e8af2fe5.png)

![Location & Hospital](https://user-images.githubusercontent.com/26890694/199061457-d27c0a4a-f394-4765-9af8-b9510adf27e5.png)

2. Once the addresses are entered in the system. Person registration needs to be done. Doctors, Patients, Hospital Admin and Community Admin should register themselves with the system.

![Registration](https://user-images.githubusercontent.com/26890694/199063278-c206af12-5073-44ae-8543-35e7ce530069.png)

3. Hospital Admin then associates Doctors to their respective Hospitals. 

![Hospital Association](https://user-images.githubusercontent.com/26890694/199063538-a8bd0e0d-3b2b-449e-b203-bba76cf4726b.png)

4. Patients can now login and look for hospitals falling in their same community while trying to book an appointment. Patient will get the list of doctors associated with the hospital selected nearby. Hospital list is populated based on Patient's community and Hospital's community.

![Booking Appointment](https://user-images.githubusercontent.com/26890694/199072801-19d3035d-7767-4c40-a5aa-09f48f1bd44b.png)

5. When doctors login to the system they can view their own list of appointments with patients. The ones for which diagnosis is pending and also the ones completed.

![Encounter Diagnosis](https://user-images.githubusercontent.com/26890694/199073062-ddedab6d-86f0-43c7-bfc0-327ac46e73bd.png)


### UML Diagrams
---------------------------------------------------------------------------------------------------------------

[Class Diagram](https://lucid.app/lucidchart/84ca4d2d-8fd3-4a22-9dc6-3794fbb6997d/edit?invitationId=inv_2b18e346-844e-45f9-905f-ee151a4536b6)
[Sequence Diagram](https://lucid.app/lucidchart/5e0cf293-35c4-4b36-bd05-9cbde65fa481/edit?invitationId=inv_69fb0818-a4f6-4f20-b2d1-b1426eb4f791)


**Future Scope: This model can be extended to include more modules**
