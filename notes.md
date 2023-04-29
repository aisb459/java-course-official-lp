docker run --name hl-mysql-day06  -p3306:3306 -vC:\Users\aishwaryab\Documents\java-course\docker\msql-data-dump2:/var/lib/mysql   -e MYSQL_ROOT_PASSWORD=root mysql:latest




Dockerizing spring boot rest
>>>docker build -t my-api:0.0.1 .

>>>docker run --name my-api-1 -p8081:8080 my-api:0.0.1

>>>docker run --name my-api-1 -p8080:8080 -e WELCOME="Welcome to Spring" my-api:0.0.1

>>>docker run --name my-api-1 -p8080:8080 -e WELCOME="Welcome to Spring" -e VENUE="Offline" my-api:0.0.1
docker run --name word-play-api-1 -p8084:8084 -e HOST="localhost" -e PORT="8083" word-play-api:0.0.1
docker run --name wednesday-api-1 -p8081:8080 my-wednesday-api:0.0.1



kafka
org.apache.kafka.common.security.plain.PlainLoginModule required username="user" password="bitnami":

docker-compose -p "mykafka" -f docker-compose-kafka.yml up


k8s
kubectl config get-contexts
kubectl get pods

docker build -t my-wednesday-api:0.0.1 .
docker run --name wednesday-api-1 -p8081:8080 my-wednesday-api:0.0.1
kubectl run wednesday-pod --image=my-wednesday-api:0.0.1
kubectl delete pod wednesday-pod

kubectl create namespace training
kubectl run wednesday-pod --image=my-wednesday-api:0.0.1 --namespace=training

docker run -e KAFKA_HOST=host.docker.internal -e KAFKA_PORT=9093 consumer-app:0.0.1


kubectl apply -f wednesday-api.k8s.yml
kubectl delete -f wednesday-api.k8s.yml

FROM openjdk:17
COPY target/palindrome-api-0.0.1.jar app.jar
EXPOSE 8083
ENTRYPOINT ["java", "-jar","/app.jar"]





CREATE PROCEDURE `sp_sel_persons_with_age_gt` (in age_param int)
BEGIN
    select * from persons where age > age_param;
END

call sp_sel_persons_with_age_gt(20);



CREATE DEFINER=`root`@`%` PROCEDURE `sp_sel_persons_with_age_gt`(in age_param int)
    BEGIN
	    select * from persons where age > age_param;
    END
	
	
	concurrency
	packages in java
	multithreading
	parallel streams
	unit testing
	
	
	
	writing messages into kafka topic
	bringing 2 other fields
	docker yt video
	
	English, Mandarin, Japanese, Cantonese
	English, Turkish, Shanghainese, Portuguese, Japanese
	English, Mandarin, Japanese, Cantonese
	English, Turkish, Shanghainese, Portuguese, Japanese
	English, Turkish, Shanghainese, Portuguese, Japanese
	
	{"_id":{"$oid":"5ca4bbc7a2dd94ee5816238c"},"account_id":{"$numberInt":"371138"},"limit":{"$numberInt":"9000"},"products":["Derivatives","InvestmentStock"]}