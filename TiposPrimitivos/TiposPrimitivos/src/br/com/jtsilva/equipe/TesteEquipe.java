package br.com.jtsilva.equipe;

public class TesteEquipe {
    public static void main(String[] args) {
        Membro membroPO = new ProductOwner("Carlos");
        Membro membroSM = new ScrumMaster("Carla");
        Membro membroDev = new Desenvolvedor("Arnaldo");

        membroPO.realizarTarefa();
        membroSM.realizarTarefa();
        membroDev.realizarTarefa();

        if (membroPO instanceof ProductOwner) {
            ProductOwner productOwner = (ProductOwner) membroPO;
            productOwner.priorizarBackLog();
        }

        if (membroSM instanceof ScrumMaster) {
            ScrumMaster scrumMaster = (ScrumMaster) membroSM;
            scrumMaster.facilitarReunioes();
        }

        if (membroDev instanceof Desenvolvedor) {
            Desenvolvedor desenvolvedor = (Desenvolvedor) membroDev;
            desenvolvedor.realizarTarefa();// Pode implementar ambos métodos.
            desenvolvedor.codificar();
        }
    }
}
