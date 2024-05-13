insert into address (id, address_line1, address_line2, city, postal_code)
            values (1, 'xx', 'yy', 'city', '62-030');
insert into address (id, address_line1, address_line2, city, postal_code)
            values (2, 'Dzialkowa 1234', '74/2', 'Wroclaw', '50-001');

insert into doctor (id, first_name, last_name, telephone_number, email, doctor_number, specialization, address_id)
            values (1, 'Jan', 'Doktorski', '123456789', 'jdo@mail.com', '352', 'dermatolog', 1);
insert into doctor (id, first_name, last_name, telephone_number, email, doctor_number, specialization, address_id)
            values (2, 'Janusz', 'Doktorowicz', '321621', 'jdoct@mail.com', '353', 'kardiolog', 2);

insert into patient (id, first_name, last_name, telephone_number, email, patient_number, date_of_birth, address_id)
            values (1, 'Adam', 'Pacjentowicz', '5555555', 'pacjent@mail.com', '101', '1995-01-01', 1);
insert into patient (id, first_name, last_name, telephone_number, email, patient_number, date_of_birth, address_id)
            values (2, 'Bartosz', 'Pacjencki', '111111', 'bartpac@mail.com', '102', '2000-05-05', 2);

insert into visit (id, description, time, doctor_id, patient_id)
            values (1, 'Wizyta codzienna', '2024-05-13 09:00:00', 1, 1);
insert into visit (id, description, time, doctor_id, patient_id)
            values (2, 'Wizyta formalna', '2024-05-14 14:00:00', 2, 2);

insert into medical_treatment (id, description, type, visit_id)
            values (1, 'gripex', 'przeziebienie', 1);
insert into medical_treatment (id, description, type, visit_id)
            values (2, 'alergix', 'alergia', 2);


