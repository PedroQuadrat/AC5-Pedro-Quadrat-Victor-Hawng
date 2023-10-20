//FEITO POR Pedro Quadrat(202202640522) e Victor Alvarenga Hwang(202208766005)
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        Map<String,String,String> alunos = new HashMap<String,String,String>();
    
    alunos.put("Vitao", new String ("ADS"), new String ("1246146"));
    System.out.println(alunos);

    alunos.add("Hudfilho", new String("AZL"), new String("653626"));
    System.out.println(alunos);

    alunos.remove("12346146");
    System.out.println(alunos);
    }

    public static void atualizarCurso(Map<String, Map<String, String>> alunos, String matricula, String novoCurso) {
        if (alunos.containsKey(matricula)) {
            Map<String, String> aluno = alunos.get(matricula);
            aluno.put("Curso", novoCurso);
        } else {
            System.out.println("Aluno com matrícula " + matricula + " não encontrado.");
        }
    }


    public static void listarInformacoesAluno(Map<String, Map<String, String>> alunos, String matricula) {
        if (alunos.containsKey(matricula)) {
            Map<String, String> aluno = alunos.get(matricula);
            String nome = alunos.entrySet().stream()
                    .filter(entry -> entry.getValue() == aluno)
                    .map(Map.Entry::getKey)
                    .findFirst()
                    .orElse("Aluno não encontrado");

            System.out.println("Nome: " + nome);
            System.out.println("Matrícula: " + matricula);
            System.out.println("Curso: " + aluno.get("Curso"));
        } else {
            System.out.println("Aluno com matrícula " + matricula + " não encontrado.");
        }
    }

    public static void listarTodosAlunos(Map<String, Map<String, String>> alunos) {
        for (Map.Entry<String, Map<String, String>> entry : alunos.entrySet()) {
            String nome = entry.getKey();
            Map<String, String> aluno = entry.getValue();

            System.out.println("Nome: " + nome);
            System.out.println("Matrícula: " + aluno.get("Matricula"));
            System.out.println("Curso: " + aluno.get("Curso"));
            System.out.println();
        }
    }

}