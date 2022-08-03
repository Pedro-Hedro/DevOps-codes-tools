FROM nginx:1.15.0-alpine

RUN rm /etc/nginx/conf.d/default.conf

COPY nginx.conf /etc/nginx/conf.d
RUN mkdir /usr/src/app/public -p && touch /usr/src/app/public/index.js


