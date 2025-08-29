import { StyleSheet, Text, View } from 'react-native';

export default function App() {
  return (
    <View style={styles.container}>
      <Text style={styles.nome}>João Pedro Matias da Silva</Text>

      <View style={styles.bloco}>
        <Text style={styles.titulo}>Contato</Text>
        <Text>Telefone: (11) 94975-1907</Text>
        <Text>Email: joaoopedroo@gmail.com</Text>
      </View>

      <View style={styles.bloco}>
        <Text style={styles.titulo}>Resumo</Text>
        <Text>
          Estudante de Desenvolvimento de Sistemas na ETEC, interessado em
          programação e tecnologia. Busco aprender e aplicar meus conhecimentos.
        </Text>
      </View>

      <View style={styles.bloco}>
        <Text style={styles.titulo}>Formação</Text>
        <Text>Ensino Médio + Técnico em Desenvolvimento de Sistemas – ETEC</Text>
      </View>

      <View style={styles.bloco}>
        <Text style={styles.titulo}>Habilidades</Text>
        <Text>- Lógica de Programação</Text>
        <Text>- HTML, CSS, JavaScript</Text>
        <Text>- Java e SQL básico</Text>
        <Text>- Design</Text>
      </View>

      <View style={styles.bloco}>
        <Text style={styles.titulo}>Experiência</Text>
        <Text>Ainda sem experiência profissional.</Text>
      </View>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    backgroundColor: '#f5f5f5',
    flex: 1,
    padding: 20,
    alignItems: 'center',
  },
  nome: {
    fontSize: 20,
    fontWeight: 'bold',
    marginBottom: 20,
  },
  bloco: {
    backgroundColor: '#fff',
    width: '100%',
    padding: 10,
    marginBottom: 15,
    borderRadius: 8,
  },
  titulo: {
    fontSize: 16,
    fontWeight: 'bold',
    marginBottom: 5,
  },
});
