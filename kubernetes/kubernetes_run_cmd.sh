kubectl create secret generic mysql-root-pass --from-literal=password=ROOT
kubectl create secret generic mysql-user-pass --from-literal=username=user --from-literal=password=password
kubectl create secret generic mysql-db-url --from-literal=database=polls --from-literal=url='jdbc:mysql://polling-app-mysql:3306/polls?useSSL=false&serverTimezone=UTC&useLegacyDatetimeCode=false'

git clone https://github.com/romitsutariya/userservcie.git

cd userservcie/kubernetes
kubectl apply -f db_setup.yml
kubectl apply -f Spring_Boot_app.yml