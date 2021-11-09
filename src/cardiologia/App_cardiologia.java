package cardiologia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import pessoa.corPessoa;
import pessoa.paciente;

public class App_cardiologia {


	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		String m;
		String paciente;
		
		System.out.println("Qual opção te representa Médico(1) ou Paciente(2)?");
		int n = ler.nextInt();
		
		if(n <= 1 ) {
			String menu = "1. Médico"
						+ "\n2. Docente"
						+ "\n3. Residente";
	 
			System.out.println(menu);
			int opcao = ler.nextInt();
	 
			while(opcao != 3) {
				switch(opcao) {
				case 1:{ //Medico
 
					System.out.println("Digite o nome: ");
					String nome = ler.next();
 
					System.out.println("Digite o CRM: ");
					String cpf = ler.next();
					
					System.out.println("Qual exame deseja emitir? ");
					String e = ler.next();
					
					break;
					
				}
				case 2:{ // docente
					
					System.out.println("Digite sua área de serviço: ");
					String menu2 = "1. Doutor"
								+ "\n2. Assistente"
								+ "\n3. Livre-docente"
								+ "\n4. Titular";
				
						break;
				}
				case 3:{ // residente
					
					System.out.println("Digite seu ano de residência: ");
					int r = ler.nextInt();

					System.out.println("Qual exame será realizado? ");
					String e = ler.next();
					}
		
				  break;
				  }
			     }
				}
			
			else if(n > 1) {
				
			paciente vetorA[] = new paciente[10];
			int indice = 0; 
				
			String menu = "O que você deseja fazer?" +
						"\n1 - Cadastrar uma Pessoa." +
						"\n2 - Excluir uma Pessoa." +
						"\n3 - Visualizar uma Pessoa." +
						"\n4 - Visualizar a Agenda." +
						"\n5 - Sair.";
			
			System.out.println(menu);
			int opcao = ler.nextInt();
			
			while(opcao != 5) {
			
				switch(opcao){
				case 1:{
					System.out.println("Digite o nome: ");
					String nome = ler.next();
					
					System.out.println("Digite a idade: ");
					int idade = ler.nextInt();
					
					System.out.println("Digite o sexo: ");
					String sexo = ler.next();
					
					System.out.println("Digite a cor: ");
					String cor = ler.next();
					
					vetorA[indice] = new paciente(nome, idade, sexo, cor);
					indice++;

				break;
				}
				case 2:{
					System.out.println("Digite o nome que deseja remover: ");
					String buscaDelete = ler.next();
					int resultDelete = buscaPaciente(buscaDelete); 
					
					while (resultDelete == -1) {
						System.out.println("Não encontramos resultados para a busca. Informe outro nome ou digite 9 para voltar ao menu: ");
						buscaDelete = ler.next();
						
						if(buscaDelete.equalsIgnoreCase("9")) {
							resultDelete = indice;
					  } else {
						resultDelete = buscaPaciente(buscaDelete);
						}
						
					} 
					
					while (resultDelete >= 0 && resultDelete < indice) {
						
						String confirm = "N";
						System.out.println("Deseja realmente deletar o registro de " + vetorA[resultDelete].getNome() + "? 'S' ou 'N'");
						confirm = ler.next();
						
							switch(confirm) {
						
							case "S":{
								removePaciente(resultDelete);
								System.out.println("Registro removido com sucesso!");
								break;
							}
							case "N":{
								resultDelete = indice;
								break;
							}
							default:{
								System.out.println("Opção Inválida");
								break; 
							}
						}
							resultDelete = indice;
					}
					
				break;
				}
				case 3:{
					System.out.println("Digite o nome para busca: ");
					String busca = ler.next();
					int resultBusca = buscaPaciente(busca); 
					
					while (resultBusca == -1) {
						System.out.println("Não encontramos resultados para a busca. Informe outro nome ou digite 9 para voltar ao menu: ");
						busca = ler.next();
						
						if(busca.equalsIgnoreCase("9")) {
							resultBusca = indice;
						} else {
							resultBusca = buscaPaciente(busca);
						}
						
					} 
					
						if (resultBusca >= 0 && resultBusca < indice) {
						imprimePaciente(resultBusca);	
					}
					
						break;
				}
				case 4:{
					imprimePaciente(indice);
					
				break;
				}
				default :{
					System.out.println("Informe uma opção válida do menu!");
					
				break;
				}
			}
				
			System.out.println(menu);
			opcao = ler.nextInt();
			
			}
			
			if(opcao == 5) {
				System.out.println("Muito obrigado! Até a próxima!");	
			}
			
			ler.close();
			}
		}
		
		
		public static <invalid> void removePaciente(int index) {
			
			int i = index;
			int indexReplace = index;
			
			int indice = 0;
			while(i < indice - 1) {
				
				indexReplace = i + 1;

				invalid[] vetorA = null;
				if(indexReplace == indice) {
					vetorA[i] = null;
					i = indice;
				} else {
					vetorA[i] = vetorA[indexReplace];
					i++;
				}			
			}
			
			indice--;
			
		}
		
		public static int buscaPaciente(String nome){
			
			int numVetor = -1;
			String nomeVetor;
			String nomeBusca = nome.toUpperCase();
			Boolean found = false;
			
			int indice = 0;
			for(int i = 0; i < indice; i++) {
					
				Object[] vetorA = null;
				nomeVetor = ((paciente) vetorA[i]).getNome().toUpperCase();
//				found = Arrays.asList(nomeVetor.split(" ")).contains(nomeBusca);
				found = nomeBusca.contains(nomeVetor);
				
				if(found) {
					numVetor = i;
					i = indice;
				} else {
					numVetor = -1;
				}
				
			}
			
			return numVetor;
			
		}
		
		public static void imprimePaciente(int resultBusca){
			
			int indice = 0;
			for(int i = 0; i < indice; i++) {
				imprimePessoa(i);	
			}
			
		}
		
		public static void imprimePessoa(int index){
			
			Object[] vetorA = null;
			System.out.println("O nome da pessoa: " 
								+ ((paciente) vetorA[index]).getNome() 
								+
								"\nIdade: " 
								+ ((paciente) vetorA[index]).getIdade() 
								+ "\nSexo: " 
								+ ((paciente) vetorA[index]).getSexo() 
								+"\nCor: " 
								+ vetorA[index].getClass());
			
						}
					
				}
			
	
