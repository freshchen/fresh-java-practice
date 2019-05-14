# fresh-springboot-elasticsearch
elasticsearch  API 练习

## 环境准备

docker pull docker.elastic.co/elasticsearch/elasticsearch:6.3.2

docker run -d --name elasticsearch -p 9200:9200 -p 9300:9300 -e "discovery.type=single-node" docker.elastic.co/elasticsearch/elasticsearch:6.3.2

