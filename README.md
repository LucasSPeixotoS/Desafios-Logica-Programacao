# Desafios-Logica-Programacao

Desafios para exercitar a lógica e programação Orientada a Objeto.


# Perguntas
# 1 - Número Reverso:
      Faça um programa que leia um valor inteiro(este número deverá conter 4 dígitos). 
      A saída deverá ser o reverso de um número inteiro informado.
      Exemplo: Digamos que a entrada foi 3257. A resposta deve ser 7523.
      
      Regras:
      a) A entrada deverá estar entre 1000 e 9999.
      
      b) Se o usuário digitar 3 dígitos ou menos, o programa deve avisar que o número precisa conter
         4 dígitos e continua a programação até a resposta final.
      
# 2 - Classe Macaco:
      Faça um programa e teste interativamente uma classe que modele um macaco com os 
      atributos "nome" e "bucho" (estômago), os métodos "comer", "verBucho" e "digerir".
      
      Regras:
      a) Criar 2 Macacos.
      
      b) Considere que a quantidade máxima de alimentos é 3. Com isso, lembre-se de verificar o 
         conteúdo do estômago a cada refeição (método "comer").
         Por fim o método digerir deve esvaziar o "bucho" do Macaco.
         
      c) Alimentos "digeríveis" devem ser do tipo String, garanta isso em seu código para que 
         não haja nenhum Macaco canibal.
      
# 3 - Funcionário:
      Considerando o exemplo abaixo feito por um empresa de vendas utilize o conceito de herança.
      
                         Vendedor                               Consultor
               ----------------------------           ----------------------------
               + nome : String                        + nome : String
               + cpf : long                           + cpf : long
               + comissao : double                    + valorHora : double
               + numeroVendas : long                  + horasTrabalhadas : long
               ----------------------------           ----------------------------
               + calcularSalario() : double           + calcularSalario() : double
               
      Regras:
      a) Crie uma classe mãe chamada funcionário com os atributos nome, cpf(passados no construtor),
      uma constante para armazenar o valor do salário mínimo e um método abstrato "calcularSalario".
      
      b) Vendedores ganham 1 salário mínimo, mais uma comissão por vendas.
      
      c) Consultores ganham somente pelas horas que trabalharam.
      
      
