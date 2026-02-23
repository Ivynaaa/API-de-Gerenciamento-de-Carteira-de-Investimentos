CREATE USER "pg-investiments" WITH PASSWORD 'investiments-password';

CREATE DATABASE "investiments";
ALTER DATABASE "investiments" OWNER TO "pg-investiments";