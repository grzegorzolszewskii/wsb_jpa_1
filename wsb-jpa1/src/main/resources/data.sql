insert into address (id, address_line1, address_line2, city, postal_code)
            values (1, 'xx', 'yy', 'city', '62-030');
insert into address (id, address_line1, address_line2, city, postal_code)
            values (2, 'Dzialkowa 1234', '74/2', 'Wroclaw', '50-001');
insert into address (id, address_line1, address_line2, city, postal_code)
            values (3, 'ul. Kwiatowa 7', '8A', 'Warszawa', '00-001');
insert into address (id, address_line1, address_line2, city, postal_code)
            values (4, 'ul. Słoneczna 10', '5', 'Kraków', '30-002');
insert into address (id, address_line1, address_line2, city, postal_code)
            values (5, 'ul. Leśna 3', '1B', 'Gdańsk', '80-003');
insert into address (id, address_line1, address_line2, city, postal_code)
            values (6, 'ul. Ogrodowa 15', '3/5', 'Poznań', '60-004');
insert into address (id, address_line1, address_line2, city, postal_code)
            values (7, 'ul. Polna 20', '6', 'Łódź', '90-005');
insert into address (id, address_line1, address_line2, city, postal_code)
            values (8, 'ul. Wiejska 25', '9C', 'Szczecin', '70-006');
insert into address (id, address_line1, address_line2, city, postal_code)
            values (9, 'ul. Morska 30', '12', 'Katowice', '40-007');
insert into address (id, address_line1, address_line2, city, postal_code)
            values (10, 'ul. Polna 35', '15/2', 'Bydgoszcz', '85-008');
insert into address (id, address_line1, address_line2, city, postal_code)
            values (11, 'ul. Szkolna 40', '18', 'Gdynia', '95-009');
insert into address (id, address_line1, address_line2, city, postal_code)
            values (12, 'ul. Podgórna 45', '21A', 'Olsztyn', '20-010');


insert into doctor (id, first_name, last_name, telephone_number, email, doctor_number, specialization, address_id)
            values (1, 'Jan', 'Doktorski', '123456789', 'jdo@mail.com', '352', 'dermatolog', 1);
insert into doctor (id, first_name, last_name, telephone_number, email, doctor_number, specialization, address_id)
            values (2, 'Janusz', 'Doktorowicz', '321621', 'jdoct@mail.com', '353', 'kardiolog', 2);
insert into doctor (id, first_name, last_name, telephone_number, email, doctor_number, specialization, address_id)
            values (3, 'Anna', 'Lekarska', '987654321', 'alek@mail.com', '354', 'pediatra', 3);
insert into doctor (id, first_name, last_name, telephone_number, email, doctor_number, specialization, address_id)
            values (4, 'Barbara', 'Medyczna', '654987321', 'bmed@mail.com', '355', 'neurolog', 4);
insert into doctor (id, first_name, last_name, telephone_number, email, doctor_number, specialization, address_id)
            values (5, 'Celina', 'Zdrowia', '159753468', 'czdrowia@mail.com', '356', 'okulista', 5);
insert into doctor (id, first_name, last_name, telephone_number, email, doctor_number, specialization, address_id)
            values (6, 'Dominik', 'Zdrowotny', '753951864', 'd.zdrowotny@mail.com', '357', 'ortopeda', 6);
insert into doctor (id, first_name, last_name, telephone_number, email, doctor_number, specialization, address_id)
            values (7, 'Eliza', 'Chirurgiczna', '369852147', 'echirurg@mail.com', '358', 'chirurg', 7);
insert into doctor (id, first_name, last_name, telephone_number, email, doctor_number, specialization, address_id)
            values (8, 'Franciszek', 'Kardiolog', '258147369', 'fkardio@mail.com', '359', 'kardiolog', 8);
insert into doctor (id, first_name, last_name, telephone_number, email, doctor_number, specialization, address_id)
            values (9, 'Gabriel', 'Dentysta', '852369741', 'gabdent@mail.com', '360', 'dentysta', 9);
insert into doctor (id, first_name, last_name, telephone_number, email, doctor_number, specialization, address_id)
            values (10, 'Hanna', 'Rehabilitacyjna', '147258369', 'hrehab@mail.com', '361', 'rehabilitant', 10);
insert into doctor (id, first_name, last_name, telephone_number, email, doctor_number, specialization, address_id)
            values (11, 'Igor', 'Psychiatra', '369852147', 'ipsychiatr@mail.com', '362', 'psychiatra', 11);
insert into doctor (id, first_name, last_name, telephone_number, email, doctor_number, specialization, address_id)
            values (12, 'Jolanta', 'Ginekolog', '258147369', 'jol.gin@mail.com', '363', 'ginekolog', 12);


insert into patient (id, first_name, last_name, telephone_number, email, patient_number, date_of_birth, address_id, is_employed)
            values (1, 'Adam', 'Pacjentowicz', '5555555', 'pacjent@mail.com', '101', '1995-01-01', 1, FALSE);
insert into patient (id, first_name, last_name, telephone_number, email, patient_number, date_of_birth, address_id, is_employed)
            values (2, 'Bartosz', 'Pacjencki', '111111', 'bartpac@mail.com', '102', '2000-05-05', 2, TRUE);
insert into patient (id, first_name, last_name, telephone_number, email, patient_number, date_of_birth, address_id, is_employed)
            values (3, 'Cezary', 'Zdrowieńczy', '777777', 'cz@zdrowy.com', '103', '1980-03-15', 3, TRUE);
insert into patient (id, first_name, last_name, telephone_number, email, patient_number, date_of_birth, address_id, is_employed)
            values (4, 'Dariusz', 'Chory', '888888', 'dariusz@chory.com', '104', '1975-06-20', 4, FALSE);
insert into patient (id, first_name, last_name, telephone_number, email, patient_number, date_of_birth, address_id, is_employed)
            values (5, 'Ewa', 'Biegająca', '999999', 'ewa@biegajaca.com', '105', '1992-11-25', 5, TRUE);
insert into patient (id, first_name, last_name, telephone_number, email, patient_number, date_of_birth, address_id, is_employed)
            values (6, 'Filip', 'Pływający', '101010', 'filip@plywajacy.com', '106', '1988-08-10', 6, TRUE);
insert into patient (id, first_name, last_name, telephone_number, email, patient_number, date_of_birth, address_id, is_employed)
            values (7, 'Grażyna', 'Wędrująca', '202020', 'grazyna@wedrujaca.com', '107', '1970-04-05', 7, FALSE);
insert into patient (id, first_name, last_name, telephone_number, email, patient_number, date_of_birth, address_id, is_employed)
            values (8, 'Henryk', 'Pracujący', '303030', 'henryk@pracujacy.com', '108', '1965-09-30', 8, TRUE);
insert into patient (id, first_name, last_name, telephone_number, email, patient_number, date_of_birth, address_id, is_employed)
            values (9, 'Irena', 'Bezrobotna', '404040', 'irena@bezrobotna.com', '109', '1985-12-12', 9, FALSE);
insert into patient (id, first_name, last_name, telephone_number, email, patient_number, date_of_birth, address_id, is_employed)
            values (10, 'Janusz', 'Zdolny', '505050', 'janusz@zdolny.com', '110', '1978-07-18', 10, TRUE);
insert into patient (id, first_name, last_name, telephone_number, email, patient_number, date_of_birth, address_id, is_employed)
            values (11, 'Katarzyna', 'Biegaczka', '606060', 'katarzyna@biegaczka.com', '111', '1990-02-28', 11, TRUE);
insert into patient (id, first_name, last_name, telephone_number, email, patient_number, date_of_birth, address_id, is_employed)
            values (12, 'Leszek', 'Spacerujący', '707070', 'leszek@spacerujacy.com', '112', '1960-10-10', 12, FALSE);

insert into visit (id, description, time, doctor_id, patient_id)
            values (1, 'Konsultacja dermatologiczna', '2024-05-13 09:00:00', 1, 1);
insert into visit (id, description, time, doctor_id, patient_id)
            values (2, 'Wizyta kontrolna', '2024-05-14 14:00:00', 2, 2);
insert into visit (id, description, time, doctor_id, patient_id)
            values (3, 'Wizyta kontrolna', '2024-05-15 11:00:00', 3, 3);
insert into visit (id, description, time, doctor_id, patient_id)
            values (4, 'Badanie neurologiczne', '2024-05-16 16:30:00', 4, 4);
insert into visit (id, description, time, doctor_id, patient_id)
            values (5, 'Konsultacja okulistyczna', '2024-05-17 10:45:00', 5, 5);
insert into visit (id, description, time, doctor_id, patient_id)
            values (6, 'Konsultacja ortopedyczna', '2024-05-18 14:15:00', 6, 6);
insert into visit (id, description, time, doctor_id, patient_id)
            values (7, 'Zabieg chirurgiczny', '2024-05-19 08:30:00', 7, 7);
insert into visit (id, description, time, doctor_id, patient_id)
            values (8, 'Badanie kardiologiczne', '2024-05-20 13:00:00', 8, 8);
insert into visit (id, description, time, doctor_id, patient_id)
            values (9, 'Konsultacja stomatologiczna', '2024-05-21 09:30:00', 9, 9);
insert into visit (id, description, time, doctor_id, patient_id)
            values (10, 'Zajęcia rehabilitacyjne', '2024-05-22 12:45:00', 10, 10);
insert into visit (id, description, time, doctor_id, patient_id)
            values (11, 'Konsultacja psychiatryczna', '2024-05-23 15:20:00', 11, 11);
insert into visit (id, description, time, doctor_id, patient_id)
            values (12, 'Badanie ginekologiczne', '2024-05-24 10:00:00', 12, 12);
insert into visit (id, description, time, doctor_id, patient_id)
            values (13, 'Badanie ginekologiczne', '2024-05-24 10:00:00', 12, 1);

insert into medical_treatment (id, description, type, visit_id)
            values (1, 'gripex', 'przeziebienie', 1);
insert into medical_treatment (id, description, type, visit_id)
            values (2, 'alergix', 'alergia', 2);
insert into medical_treatment (id, description, type, visit_id)
            values (3, 'ibuprom', 'ból głowy', 3);
insert into medical_treatment (id, description, type, visit_id)
            values (4, 'apap', 'gorączka', 4);
insert into medical_treatment (id, description, type, visit_id)
            values (5, 'krople do oczu', 'podrażnienie oka', 5);
insert into medical_treatment (id, description, type, visit_id)
            values (6, 'opatrunek', 'uraz', 6);
insert into medical_treatment (id, description, type, visit_id)
            values (7, 'zastrzyk', 'operacja', 7);
insert into medical_treatment (id, description, type, visit_id)
            values (8, 'EKG', 'badanie serca', 8);
insert into medical_treatment (id, description, type, visit_id)
            values (9, 'plombowanie', 'leczenie zęba', 9);
insert into medical_treatment (id, description, type, visit_id)
            values (10, 'ćwiczenia fizyczne', 'rehabilitacja', 10);
insert into medical_treatment (id, description, type, visit_id)
            values (11, 'terapia', 'leczenie psychiczne', 11);
insert into medical_treatment (id, description, type, visit_id)
            values (12, 'badanie cytologiczne', 'profilaktyka', 12);

