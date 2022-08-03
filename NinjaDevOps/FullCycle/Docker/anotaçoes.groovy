//tipos de network:
- Bridge - quando vc cria uma network no docker e nao informa nenhum parametro vc cria uma 
bridge, ela e usada para comunicar-se entre containers;

- Host - mescla a network do docker com o host do docker, 

- Overlay - quando voces tem varios containers em diferentes redes, ele faz um "crosschain/crossnetwork"

- Maclan - o mac address é setado no container e pode ser considerado como redes


comando para ver ip do container 'docker network inspect'

Criar e Conectar o container na rede'docker run -dit --name ubuntu1 --network minharede bash',  'docker network connect rede [containername]' 
Criar uma rede 'docker network create --driver [tipo da rede] [nome da rede]'


Como fazer comque o container acesse o localhost da sua maquina?

utilizar o comando 'curl http://host.docker.internal:8080'


//docker rmi $(docker images -a -q) -f apaga todas as imagens
//docker rmi $(docker images -a -q) -f apaga todos os containers


Criando aplicação node sem node.js

imagem do alpine é bem enxuta então fica bem pequena.


Para usar um dockerfile com nomenclatura diferentes é necessário utilizar -f como no seguinte exemplo:
'docker build -t pedrohedro/laravel:prod laravel -f laravel/Dockerfile.prod'

Docker compose serve para automatizar os comandos do docker, baseado em um arquivo de manifesto com todos os containers que vc quer subir. 

Como trabalhar com bancos de dados com docker
