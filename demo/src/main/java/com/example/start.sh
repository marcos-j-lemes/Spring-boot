
URL_BASE=http://localhost:8080/api/v1/estudo

#simples hello
#curl $URL_BASE/hello

#requisição com simples/ param
#curl $URL_BASE/hello/MARCOS

#curl $URL_BASE/somar?a=2&b=30

#curl $URL_BASE/saudar?nome=Ana

#curl $URL_BASE/filter?tag=java&tag=spring&tag=mysql

#echo "requisição com múltiplos parâmetros sem aspas: "
#curl $URL_BASE/filter?tag=java&tag=spring&tag=mysql
#ele só volta java


echo "requisição com múltiplos parâmetros com aspas: "
curl "$URL_BASE/filter?tag=java&tag=spring&tag=mysql"

#echo "requisição com múltiplos parâmetros codificado por causa dos parâmetro: "
#curl -G "$URL_BASE/filter" --data-urlencode "tag=java" --data-urlencode "tag=spring" --data-urlencode "tag=mysql"

#  essas duas requisições funcionou corretamento.







