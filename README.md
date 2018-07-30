# Exemplo básico de C10k com Spring + Webflux

# Referencia para montar o exemplo:

https://www.safaribooksonline.com/library/view/reactive-programming-with/9781491931646/ch05.html#Beating-the-C10k-problem

# Dependencia:
wrk - HTTP benchmarking tool
```
sudo apt-get install wrk
```
# Comparação:
```
$wrk -t6 -c10000 -d60s --timeout 10s --latency http://localhost:8080/common/30
$wrk -t6 -c10000 -d60s --timeout 10s --latency http://localhost:8080/reactive/30
```


