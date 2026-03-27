# Funcionalidades Planejadas

## 1. Busca de consultas por filtros [INSERIDA NO CÓDIGO]

Aqui você pode implementar uma busca mais avançada nas consultas, permitindo filtrar por especialidade, médico ou data. A lógica envolve percorrer o ArrayList<Consulta> e aplicar condições (if) para cada critério. Isso melhora a usabilidade do sistema quando há muitas consultas registradas.

--- 

## 2. Fila de espera automática [TO DO]

Essa funcionalidade cria uma lista de espera para horários já ocupados. Você pode usar uma estrutura Queue<Paciente> para armazenar pacientes aguardando. Quando uma consulta é cancelada, o primeiro da fila pode ser automaticamente agendado. Isso simula sistemas reais de hospitais.

---

## 3. Classificação de prioridade [TO DO]

Permite definir prioridades para pacientes, como idosos ou casos urgentes. Um novo atributo prioridade na classe Paciente pode ser usado. Na lógica de agendamento, pacientes com prioridade maior são atendidos primeiro ou têm preferência na fila de espera, usando ordenação ou filas com prioridade.

---

## 4. Relatórios do sistema [TO DO]

Essa funcionalidade gera relatórios como número de consultas por médico ou por especialidade. A lógica envolve percorrer a lista de consultas e usar contadores (HashMap) para agrupar dados. Isso ajuda na análise do funcionamento do sistema.

---

## 5. Lembretes automáticos [TO DO]

Essa funcionalidade envia lembretes de consulta para pacientes. Você pode simular isso imprimindo mensagens no console ou armazenando notificações em uma lista. Em versões mais avançadas, poderia integrar e-mail ou WhatsApp.

---

## 6. Cadastro de médicos [INSERIDA NO CÓDIGO]

Permite cadastrar médicos no sistema, criando uma nova classe Medico com atributos como nome, CRM e especialidade. As consultas passariam a referenciar objetos Medico, garantindo mais organização e evitando digitação manual de nomes.
