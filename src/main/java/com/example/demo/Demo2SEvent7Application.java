package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Demo2SEvent7Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo2SEvent7Application.class, args);
	//	PS C:\Users\IT CARE\Documents\myAPP1\demo2S-Event-7> docker build -t  docker-image:1.0 .
		//docker build -t springio/gs-spring-boot-docker .
		// docker build -t khajahamid/docker-image.jar
		//docker run -p 8080:8080 springio/gs-spring-boot-docker
		//docker image ls
		// docker run -p 9090:8080 demo2S-Marshaller-0.0.1-SNAPSHOT.jar
		// https://www.youtube.com/watch?v=xhxmExC9N1U minikube on windows run springBoot Application
		//https://www.youtube.com/watch?v=xhxmExC9N1U
		//https://github.com/Java-Techie-jt/springboot-k8s-example/blob/main/pom.xml
		//Build & Push Docker Image using Jenkins Pipeline | Devops Integration Live Example Step By Step
		//https://www.youtube.com/watch?v=PKcGy9oPVXg
		//Deploy Springboot Microservices to Kubernetes Cluster | Full Example
		//	https://www.youtube.com/watch?v=PKcGy9oPVXg
		
		//https://www.youtube.com/watch?v=VAmntTPebKE
		//Kubernetes Tutorial | Run & Deploy Spring Boot Application in K8s Cluster using yaml configuration
				//https://www.youtube.com/watch?v=7o7e8OAAWyg
		//SpringBoot - Build CI/CD Pipeline Using GitHub Actions | Build & Push Docker Image | JavaTechie
		//https://www.youtube.com/watch?v=NppkHKvnrqc
		//---------------------------------------------------
//		service.yaml
//		apiVersion: v1 # Kubernetes API version
//		kind: Service # Kubernetes resource kind we are creating
//		metadata: # Metadata of the resource kind we are creating
//		  name: springboot-k8s-svc
//		spec:
//		  selector:
//		    app: spring-boot-k8s
//		  ports:
//		    - protocol: "TCP"
//		      port: 8080 # The port that the service is running on in the cluster
//		      targetPort: 8080 # The port exposed by the service
//		  type: NodePort # type of the service.
		
		//deployment.yaml
//		apiVersion: apps/v1
//		kind: Deployment # Kubernetes resource kind we are creating
//		metadata:
//		  name: spring-boot-k8s
//		spec:
//		  selector:
//		    matchLabels:
//		      app: spring-boot-k8s
//		  replicas: 2 # Number of replicas that will be created for this deployment
//		  template:
//		    metadata:
//		      labels:
//		        app: spring-boot-k8s
//		    spec:
//		      containers:
//		        - name: spring-boot-k8s
//		          image: springboot-k8s-example:1.0 # Image that will be used to containers in the cluster
//		          imagePullPolicy: IfNotPresent
//		          ports:
//		            - containerPort: 8080 # The port that the container is running on in the cluster
		//Kubernetes Tutorial | Run & Deploy Spring Boot CRUD Application With MySQL on K8S | JavaTechie
		//https://www.youtube.com/watch?v=pIPji3_rYPY&t=114s
		//https://www.youtube.com/watch?v=pIPji3_rYPY&t=114s
//	
	// ---------------------------	
	//	pipeLineSyntax
	// -->	Checkout from version Control
		
//		Jenkins.file
//		pipeline {
//		    agent any
//		    tools{
//		        maven 'maven_3_5_0'
//		    }
//		    stages{
//		        stage('Build Maven'){
//		            steps{
//		                checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/Java-Techie-jt/devops-automation']]])
//		                sh 'mvn clean install'
//		            }
//		        }
//		        stage('Build docker image'){
//		            steps{
//		                script{
//		                    sh 'docker build -t javatechie/devops-integration .'
//		                }
//		            }
//		        }
//		        stage('Push image to Hub'){
//		            steps{
//		                script{
//		                   withCredentials([string(credentialsId: 'dockerhub-pwd', variable: 'dockerhubpwd')]) {
//		                   sh 'docker login -u javatechie -p ${dockerhubpwd}'
//
//		}
//		                   sh 'docker push javatechie/devops-integration'
//		                }
//		            }
//		        }
//		        stage('Deploy to k8s'){
//		            steps{
//		                script{
//		                    kubernetesDeploy (configs: 'deploymentservice.yaml',kubeconfigId: 'k8sconfigpwd')
//		                }
//		            }
//		        }
//		    }
//		}
	//	in pipeline Syntax
		
	//	fwith Credential bind Credentials with varibles
//		
		
	}

}
