# m4u1
M4U test 1

Exercicio para avaliacao tecnica na M4U. O aplicativo simula um portal de vendas de fotos tematicas onde o usuario realiza :

- login de cliente via media social
- buscas por tema
- cadastro de suas fotos
- compra via PayPal

o sistema conta ainda com acesso para manutencao :

- login admin para busca, atualizacao e remocao de registro de pagamentos

o aplicativo , batizado de Photoi , roda em dispositivos moveis Android com as seguintes especificacoes minimas recomendadas :

- Android API 16+ 
- Banda de trafego de dados em torno de 2Mbps / 512kbps

o Aplicativo estah disponivel para download na Google Store e sua distribuicao eh gratuita.

PARA DESENVOLVIMENTO

para instalacao do ambiente de desenvolvimento, a recomendacao minima de infraestrutura eh :

- 700 MHz processor (Intel Celeron ou melhor)
- 512 MiB RAM (system memory)
- 5 GB of hard-drive space 
- Linux system (Ubuntu 14.04 up recommended) admin user account access
- internet access with Download Speed around 2Mbps / 512kbps
- Docker.io installed

de uma conta com permissao de administrador (sudo group) :

# apt-get install docker
# docker run --publish=8080 -i -t --name photoi-service-apigateway desavera/photoi-service-container:latest /bin/bash

o projeto estah em /photoi e o devop deve abrir os projetos em dev/server com o Eclipse e os projetos em dev/mobile com o Android Studio ambos jah instalados no container.

para execucao da ultima versao em desenvolvimento :

# docker run --publish=8080 -i -t --name photoi-service-apigateway desavera/photoi-service-container:latest /photoi/run.sh

agora verifique a instalacao do sistema completa e teste abrindo , a partir de um browser compativel , o linke http://localhost:8080/photoi.html

para maiores detalhes sobre a implementacao : desavera@gmail.com



