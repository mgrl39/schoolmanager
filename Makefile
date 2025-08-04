all:
	cd backend/
	mvn clean install
run:
	cd backend/ && mvn spring-boot:run &
