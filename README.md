# Sistema Escolar

# Sobre o Sistema
    Simular o sistema de uma escola para o uso dos alunos, professores e coordenadores
    Implementação de validação de dados
    Com funcionalidades de:
      Login e cadastro de novos alunos, professores e coordenadores
      Consulta de dados como notas e relatorios
      Agregação de novos dados

# Entidades
    1 - Aluno
    2 - Professor
    3 - Coordenador  
    4 - Materia
    5 - Nota
  

# Banco de Dados
  MySql
  

# IDE
  Apache NetBeans


# Linguagem de Programação
  Java
  

# Ato 1
  Estrutura do sistema com separação de classes com pastas
  
    src
    ├── main
    │     └── main
    │
    ├── obj
    │     ├── aluno
    │     ├── Professor
    │     ├── Cordenador
    │     ├── Materia
    │     └── Nota
    │
    └── db
        ├── dbNota
        ├── dbMateria
        ├── dbAluno
        ├── dbProfessor
        └── dbCoordenador
      

  Armazenamento de dados nas classes db.* com o uso de arraylist, com metodos de get e set
  Gerador de IDs em long com o Random
  Formatação dos IDs para serem formatados no formato de 8 caracteres e em String
  
