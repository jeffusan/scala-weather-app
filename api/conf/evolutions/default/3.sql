# --- !Ups

CREATE  TABLE "USERS_CITIES"
(
    "USER_ID"  INTEGER  REFERENCES USERS(ID),
    "CITY_ID"  INTEGER  REFERENCES CITIES(ID),
    "CREATED"  DATETIME         NOT NULL,
    "UPDATED"  DATETIME
);

# --- !Downs

drop table "USERS_CITIES" if exists;
