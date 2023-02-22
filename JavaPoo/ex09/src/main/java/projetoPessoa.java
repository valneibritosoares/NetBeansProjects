public class projetoPessoa {
    public static void main(String[] args) {
      Pessoa p1 = new Pessoa();
      Aluno p2 = new Aluno();
      Professor p3 = new Professor();
      Fucionario p4= new Fucionario();
      
      p1.setNome("Pedro");
      p2.setNome("Maria");
      p3.setNome("Cladio");
      p4.setNome("Fabiana");
     
      p1.setSexo("M");
      p2.setMatricula(2587);
      
      System.out.println(p2.getMatricula());
      System.out.println(p1.toString());
    }
}
