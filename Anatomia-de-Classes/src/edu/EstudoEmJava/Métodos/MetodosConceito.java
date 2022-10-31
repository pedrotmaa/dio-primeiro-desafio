package edu.EstudoEmJava.Métodos;

public class MetodosConceito {
    
        /*
        **Critérios de nomeação de Métodos
         * Deve ser Nomeado Como Verbo ex.:Acelerar, Frear, Processar... etc.;
         * Seguir o padrão camelCase;
        
        *** Não existe em Java o conceito de métodos globais. Todos os métodos devem SEMPRE ser definidos dentro de uma classe.

        **Para uma melhor elaborção dos métodos:
        * Qual a proposta principal do método? Você deve se perguntar constantemente até compreender a real finalidade do mesmo;
        * Qual o tipo de retorno esperado após executar o método? Você deve  analisar se o método será responsável  por retornar algum valor ou não.

        *** Caso o método não retorne nenhum valor, ele será representado pela palavra-chave void.

        1- Quais os parâmetros serão necessários para a execução do método? Os métodos as vezes precisão de argumentos como critérios para a execução.
        2- O método possui o risco de apresentar alguma exceção? Exceções são comuns na execução de métodos, as vezes é necessário prever e tratar a possível existência de uma exceção.
        3- Qual a visibilidade do método? Será necessário que o método seja visível a toda aplicação, somente em pacotes, através de herança ou somente a nível a própria classe.

        
        public double somar(int num1, int num2){
            //LOGICA - FINALIDADE DO MÉTODO
            return ... ;
        }
        
        public void imprimir(String texto){
            //LOGICA - FINALIDADE DO MÉTODO
            //AQUI NÃO PRECISA DO RETURN
            //POIS NÃO SERÁ RETORNADO NENHUM RESULTADO
        }
        // throws Exception : indica que o método ao ser utilizado
        // poderá gerar uma exceção
        public double dividir(int dividendo, int divisor) throws Exception{}
        
        // este método não pode ser visto por outras classes no projeto
        private void metodoPrivado(){}
        
        //alguns equívocos estruturais
        public void validar(){
            //este método deveria retornar algum valor
            //no caso boolean (true ou false)
        }
        public void calcularEnviar(){
            //um método deve representar uma única responsabilidade
        }
        public void gravarCliente(String nome, String cpf, Integer telefone, ....){
            //este método tem a finalidade de gravar
            //informações de um cliente, por que não criar
            //um objeto cliente e passar como parâmetro ?
            //veja abaixo
        }
        public void gravarCliente(Cliente cliente){}
        //ou
        public void gravar(Cliente cliente){}
        */

}
