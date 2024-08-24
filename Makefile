
.PHONY: deploy

build-image:
	docker build -t spring-k8s:latest .


setup:
	docker compose up -d


deploy:
	kubectl apply -f ./build/k8s/api.yaml