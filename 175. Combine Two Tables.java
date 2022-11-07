Select P.firstName,P.lastName,A.city,A.state from Person as P LEFT JOIN Address as A on P.personId=A.personId;
