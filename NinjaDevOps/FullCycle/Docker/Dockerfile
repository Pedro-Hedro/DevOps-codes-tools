FROM nginx:latest

COPY  hello /app

ENTRYPOINT [ "/docker-entrypoint.sh" ]
CMD [ "nginx", "-g", "daemon off;" ]


#docker rm $(docker ps -a -q) -f apaga todas as imagens